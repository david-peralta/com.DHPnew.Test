package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver webDriver;
	public static Properties properties;

	public Base() {
		try {
			properties = new Properties();
			FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\configurations\\Configuration.properties");

			properties.load(fileInputStream);
		}
		catch (IOException e) {

		}
	}

	public static void initialization() {
		String strBrowser = properties.getProperty("browser");

		if (strBrowser.equals("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();

			chromeOptions.addArguments("--incognito");
			chromeOptions.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			chromeOptions.addArguments("--ignore-ssl-errors=yes");
			chromeOptions.addArguments("--ignore-certificate-errors");
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

			webDriver = new ChromeDriver(chromeOptions);
		}
		else if (strBrowser.equals("ie")) { // Need to put TabProcGrowth with value 0 in HKEY_CURRENT_USER\Software\Microsoft\Internet Explorer\Main in Registry.
			InternetExplorerOptions ieo = new InternetExplorerOptions();

			ieo.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
			ieo.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			ieo.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieo.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			System.setProperty("webdriver.ie.driver", "src\\main\\resources\\configurations\\drivers\\IEDriverServer.exe");

			webDriver = new InternetExplorerDriver(ieo);
		}

		webDriver.manage().window().maximize();
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Not recommended.
		webDriver.get(properties.getProperty("url"));

		if (strBrowser.equals("ie")) {
			webDriver.get("javascript:document.getElementById('overridelink').click();");
		}
	}

	// ================================================== Do Functions ==================================================
	public static void actionElementClick(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				Actions actions = new Actions(webDriver);

				actions.click(webElement).build().perform();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to click \"" + webElement + "\".");
		}
	}

	public static void actionSendKeys(String strKeys) throws Exception {
		try {
			Actions actions = new Actions(webDriver);

			actions.sendKeys(strKeys).build().perform();
		}
		catch (Exception e) {
			throw new Exception("Unable to send \"" + strKeys + "\".");
		}
	}

	public static void alertAccept() throws Exception {
		try {
			webDriver.switchTo().alert().accept();
		}
		catch (Exception e) {
			throw new Exception("Unable to accept the alert.");
		}
	}

	public static void alertDismiss() throws Exception {
		try {
			webDriver.switchTo().alert().dismiss();
		}
		catch (Exception e) {
			throw new Exception("Unable to dismiss the alert.");
		}
	}

	public static void alertSendKeys(String strKeys) throws Exception {
		try {
			webDriver.switchTo().alert().sendKeys(strKeys);
		}
		catch (Exception e) {
			throw new Exception("Unable to send \"" + strKeys + "\" to the alert.");
		}
	}

	public static void launchURL(String strURL) throws Exception {
		try {
			webDriver.get(strURL);
		}
		catch (Exception e) {
			throw new Exception("Unable to launch \"" + strURL + "\".");
		}
	}

	public static void navigateBack() throws Exception {
		try {
			webDriver.navigate().back();
		}
		catch (Exception e) {
			throw new Exception("Unable to navigate back.");
		}
	}

	public static void navigateForward() throws Exception {
		try {
			webDriver.navigate().forward();
		}
		catch (Exception e) {
			throw new Exception("Unable to navigate forward.");
		}
	}

	public static void navigateToUrl(String strURL) throws Exception {
		try {
			webDriver.navigate().to(strURL);
		}
		catch (Exception e) {
			throw new Exception("Unable to navigate to \"" + strURL + "\".");
		}
	}

	public static void refreshWebPage() throws Exception {
		try {
			webDriver.navigate().refresh();
		}
		catch (Exception e) {
			throw new Exception("Unable to refresh web page.");
		}
	}

	public static void scrollToBottom() throws Exception {
		try {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;

			javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
		catch (Exception e) {
			throw new Exception("Unable to scroll to bottom.");
		}
	}

	public static void scrollToCoordinates(int intWidth, int intHeight) throws Exception {
		try {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;

			javascriptExecutor.executeScript("window.scrollBy(" + intWidth + "," + intHeight + ")");
		}
		catch (Exception e) {
			throw new Exception("Unable to go to coordinates (" + intWidth + ", " + intHeight + ").");
		}
	}

	public static void scrollToWebElement(WebElement webElement) throws Exception {
		try {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;

			javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
		}
		catch (Exception e) {
			throw new Exception("Unable to scroll to \"" + webElement + "\".");
		}
	}

	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public static void switchFrameByWebElement(WebElement webElement) throws Exception {
		try {
			FluentWait wait = new FluentWait(webDriver);

			wait.withTimeout(60, TimeUnit.SECONDS);
			wait.pollingEvery(5, TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);

			Integer intNumberOfFrames = webDriver.findElements(By.tagName("iframe")).size();

			for (int i = 0; i <= intNumberOfFrames; i++) {
				webDriver.switchTo().frame(i);
				wait.until(ExpectedConditions.visibilityOf(webElement));

				if (isWebElementDisplayed(webElement)) {
					break;
				}
			}
		}
		catch (Exception e) {
			throw new Exception("No such frame.");
		}
	}

	public static void webElementClear(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				webElement.clear();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to clear the text in the \"" + webElement + "\".");
		}
	}

	public static void webElementClick(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				webElement.click();
			}
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" is not clickable.");
		}
	}

	public static void webElementDoubleClick(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				Actions actions = new Actions(webDriver);

				actions.doubleClick(webElement).build().perform();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to double click the \"" + webElement + "\".");
		}
	}

	public static void webElementDragAndDrop(WebElement sourceWebElement, WebElement targetWebElement) throws Exception {
		try {
			waitUntilWebElementVisible(sourceWebElement);
			waitUntilWebElementVisible(targetWebElement);

			if ((isWebElementDisplayed(sourceWebElement) && isWebElementEnabled(sourceWebElement)) && (isWebElementDisplayed(targetWebElement) && isWebElementEnabled(targetWebElement))) {
				Actions actions = new Actions(webDriver);

				actions.dragAndDrop(sourceWebElement, targetWebElement).build().perform();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to drag from \"" + sourceWebElement + "\" and drop to the \"" + targetWebElement + "\".");
		}
	}

	public static void webElementDropdownSelect(WebElement webElement, String strOption, String strValue) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				Select select = new Select(webElement);

				if (strOption.equals("value")) {
					select.selectByValue(strValue);
				}
				else if (strOption.equals("index")) {
					select.selectByIndex(Integer.parseInt(strValue));
				}
				else if (strOption.equals("visibletext")) {
					select.selectByVisibleText(strValue);
				}
			}
		}
		catch (NumberFormatException e) {
			throw new Exception("Unable to select from \"" + webElement + "\".");
		}
	}

	public static void webElementMouseHover(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				Actions actions = new Actions(webDriver);

				actions.moveToElement(webElement).build().perform();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to hover on the \"" + webElement + "\".");
		}
	}

	public static void webElementRightClick(WebElement webElement) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				Actions actions = new Actions(webDriver);

				actions.contextClick(webElement).build().perform();
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to right click the \"" + webElement + "\".");
		}
	}

	public static void webElementSendKeys(WebElement webElement, String strKeys) throws Exception {
		try {
			waitUntilWebElementVisible(webElement);

			if (isWebElementDisplayed(webElement) && isWebElementEnabled(webElement)) {
				// webElement.sendKeys(strKeys);

				for (int i = 0; i < strKeys.length(); i++) {
					webElement.sendKeys(strKeys.substring(i, i + 1));
					// wait(50, false);
				}
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to send \"" + strKeys + "\" to the \"" + webElement + "\".");
		}
	}

	public static String takeScreenshot(String strFileName) throws Exception {
		try {
			String strFilePath = "";
			TakesScreenshot screenshot = (TakesScreenshot) webDriver;
			File file = screenshot.getScreenshotAs(OutputType.FILE);
			strFilePath = "reports\\screenshots\\" + strFileName + ".png";

			FileUtils.copyFile(file, new File(strFilePath));

			return strFilePath;
		}
		catch (Exception e) {
			throw new Exception("Unable to take screenshot.");
		}
	}

	public static void writeToExcel(int intRowNumber, int intCellNumber, String value, String strFilePath, String strSheetName) throws Throwable {
		try {
			File file = new File(strFilePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(strSheetName);
			Row row = sheet.createRow(intRowNumber);
			Cell cell = sheet.getRow(intRowNumber).getCell(intCellNumber);

			if (cell == null) {
				cell = row.createCell(intCellNumber);

				cell.setCellValue(value);
			}
			else {
				cell.setCellValue(value);
			}

			FileOutputStream fileOutputStream = new FileOutputStream(file);

			workbook.write(fileOutputStream);
			fileOutputStream.close();
			workbook.close();
		}
		catch (Exception e) {
			throw new Exception("Unable to write the data to the excel sheet.");
		}
	}

	// ================================================= See Functions =================================================
	public static void verifyLinks() throws Exception {
		try {
			List<WebElement> webElements = webDriver.findElements(By.tagName("a"));

			for (int i = 0; i < webElements.size(); i++) {
				WebElement webElement = webElements.get(i);
				String strLink = webElement.getAttribute("href");
				URL url = new URL(strLink);
				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

				httpURLConnect.setConnectTimeout(3000);
				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() == 200) {
					System.out.println(strLink + " - " + httpURLConnect.getResponseMessage());
				}
				if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(strLink + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
				}
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to verify links.");
		}
	}

	public static boolean checkWebElementDropdownOptions(WebElement webElement, String[] expectedOptions) throws Exception { // expectedOptions should be like this -> {"Select", "Test1", "Test2",
		try {
			int optionsFound = 0;
			Select select = new Select(webElement);
			List<WebElement> options = select.getOptions();

			for (WebElement we: options) {
				for (int i = 0; i < expectedOptions.length; i++) {
					if (we.getText().equals(expectedOptions[i])) {
						optionsFound++;
					}
				}
			}
			if (optionsFound == expectedOptions.length) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			throw new Exception("Unable to check \"" + webElement + "\" options.");
		}
	}

	public static boolean isAlertPresent() {
		try {
			webDriver.switchTo().alert();

			return true;
		}
		catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static boolean isWebElementDisplayed(WebElement webElement) throws Exception {
		try {
			return webElement.isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}

	public static boolean isWebElementEnabled(WebElement webElement) throws Exception {
		try {
			return webElement.isEnabled();
		}
		catch (Exception e) {
			return false;
		}
	}

	public static boolean isWebElementSelected(WebElement webElement) throws Exception {
		try {
			return webElement.isSelected();
		}
		catch (Exception e) {
			return false;
		}
	}

	public static String getCurrentUrl() throws Exception {
		try {
			return webDriver.getCurrentUrl();
		}
		catch (Exception e) {
			throw new Exception("Unable to get current URL.");
		}
	}

	public static String getPageTitle() throws Exception {
		try {
			return webDriver.getTitle();
		}
		catch (Exception e) {
			throw new Exception("Unable to get page title.");
		}
	}

	public static String getStringDateTimeNow(String strFormat) throws Exception { // Example is "_MMddyy_HHmm".
		try {
			String strFormattedDateTimeNow = "";
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strFormat);
			strFormattedDateTimeNow = simpleDateFormat.format(calendar.getTime());

			return strFormattedDateTimeNow;
		}
		catch (Exception e) {
			throw new Exception("Unable to get current date time.");
		}
	}

	public static String getWebElementAttributeValue(WebElement webElement, String strAttribute) throws Exception {
		try {
			return webElement.getAttribute(strAttribute).toString();
		}
		catch (Exception e) {
			throw new Exception("Unable to get the \"" + strAttribute + "\" value from the \"" + webElement + "\".");
		}
	}

	public static String getWebElementCssValue(WebElement webElement, String strCSS) throws Exception {
		try {
			return webElement.getCssValue(strCSS).toString();
		}
		catch (Exception e) {
			throw new Exception("Unable to get the \"" + strCSS + "\" value from the \"" + webElement + "\".");
		}
	}

	public static String getWebElementDropdownSelectedValue(WebElement webElement) throws Exception {
		try {
			Select select = new Select(webElement);
			WebElement webElementSelectedValue = select.getFirstSelectedOption();

			return webElementSelectedValue.getText();
		}
		catch (Exception e) {
			throw new Exception("Unable to get the dropdown selected value from the \"" + webElement + "\".");
		}
	}

	public static String getWebElementText(WebElement webElement) throws Exception {
		try {
			return webElement.getText();
		}
		catch (Exception e) {
			throw new Exception("Unable to get the text from \"" + webElement + "\".");
		}
	}

	public static String readFromExcel(int intRowNumber, int intCellNumber, String strFilePath, String strSheetName) throws Throwable {
		try {
			File file = new File(strFilePath);
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(strSheetName);
			Cell cell = sheet.getRow(intRowNumber).getCell(intCellNumber);
			String strValue = null;

			if (cell.getCellType().equals(CellType.NUMERIC)) {
				double dblNumericCellValue = cell.getNumericCellValue();
				strValue = String.valueOf(dblNumericCellValue);
			}
			else if (cell.getCellType().equals(CellType.STRING)) {
				strValue = cell.getStringCellValue();
			}

			workbook.close();

			return strValue;
		}
		catch (Exception e) {
			throw new Exception("Unable to read the data from the excel sheet.");
		}
	}

	public static String readFromMySQL(String strOption, Integer strKey) throws ClassNotFoundException, SQLException {
		Map<Integer, String> x = new HashMap<Integer, String>();
		Class.forName("com.mysql.jdbc.Driver");
		String query = "SELECT * FROM testschema.data";

		// Provide the server details, user name and password to access the DB in the below statement.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:", "", "");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		int count = 0;

		while (resultSet.next()) {
			count++;

			if (strOption.equals("username")) {
				String data = resultSet.getString(1);

				x.put(count, data);
			}
			else if (strOption.equals("password")) {
				String data = resultSet.getString(2);

				x.put(count, data);
			}
		}

		String string = x.get(strKey);

		return string;
	}

	public static boolean isXPathNotExisting(String strXPath) throws Exception {
		try {
			boolean blnIsNotExisting = false;
			List<WebElement> webElements = webDriver.findElements(By.xpath(strXPath));

			if (webElements.size() == 0) {
				blnIsNotExisting = true;
			}

			return blnIsNotExisting;
		}
		catch (Exception exception) {
			exception.printStackTrace();
			throw new Exception("\"" + strXPath + "\" is existing.");
		}
	}

	// ================================================= Wait Functions =================================================
	public static void wait(Integer intDuration, Boolean blnIsMinutes) throws Exception {
		try {
			if (blnIsMinutes) {
				intDuration = intDuration * 60000;
			}

			Thread.sleep(intDuration);
		}
		catch (Exception e) {
			throw new Exception("Cannot wait.");
		}
	}

	public static void waitUntilAlertPresent() throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.alertIsPresent());
		}
		catch (Exception e) {
			throw new Exception("Alert is not present.");
		}
	}

	public static void waitUntilWebBrowserTitleContains(String strTitle) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.titleContains(strTitle));
		}
		catch (Exception e) {
			throw new Exception("Alert is not present.");
		}
	}

	public static void waitUntilTextPresentInWebElement(WebElement webElement, String strText) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.textToBePresentInElement(webElement, strText));
		}
		catch (Exception e) {
			throw new Exception("\"" + strText + "\" is not present on \"" + webElement + "\".");
		}
	}

	public static void waitUntilWebElementAttributeContains(WebElement webElement, String strAttribute, String strValue) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.attributeContains(webElement, strAttribute, strValue));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" does not have the attribute \"" + strAttribute + "\" that contains the value \"" + strValue + "\".");
		}
	}

	public static void waitUntilWebElementAttributeDoesNotContains(WebElement webElement, String strAttribute, String strValue) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(webElement, strAttribute, strValue)));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" does not have the attribute \"" + strAttribute + "\" that contains the value \"" + strValue + "\".");
		}
	}

	public static void waitUntilWebElementClickable(WebElement webElement) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" is not clickable.");
		}
	}

	public static void waitUntilWebElementInvisible(WebElement webElement) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" is visible.");
		}
	}

	public static void waitUntilWebElementSelectionStateToBe(WebElement webElement, Boolean blnIsSelected) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(webElement, blnIsSelected));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" selection state is not " + blnIsSelected + ".");
		}
	}

	public static void waitUntilWebElementVisible(WebElement webElement) throws Exception {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(webDriver, 60);

			webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
		}
		catch (Exception e) {
			throw new Exception("\"" + webElement + "\" is not visible.");
		}
	}
}