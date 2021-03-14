package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Constants;

public class SeleniumHelper {

	/*
	 * Find the WebElement using its ID, Class Name, CSS, XPath, LinkText and
	 * Partial LinkText.
	 */
	public static WebElement findElementByLocatorType(WebDriver driver, String locatorType, String locatorValue) {

		WebElement webElement = null;

		if (locatorType.equalsIgnoreCase("id")) {
			webElement = driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("class")) {
			webElement = driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			webElement = driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			webElement = driver.findElement(By.xpath(locatorValue));
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			webElement = driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("partiallinktext")) {
			webElement = driver.findElement(By.partialLinkText(locatorValue));
		}

		return webElement;
	}

	/*
	 * Click on the Element using its XPath.
	 */
	public static void clickElement(WebDriver driver, String element) {
		try {
			driver.findElement(By.xpath(element)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
		}
	}

	/*
	 * Wait for Element is Clickable on the Page.
	 */
	public static void synchroniseUntilTheElementIsDisplayedEnabledAndClickable(WebDriver driver, String element) {
		WebDriverWait wait = new WebDriverWait(driver, Constants.GLOBAL_SYNCHRONISATION_TIMEOUT);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}

	/*
	 * JavaScript Click on the Element using its XPath.
	 */
	public static void javaScriptClickElement(WebDriver driver, String element) {
		try {
			WebElement webelement = driver.findElement(By.xpath(element));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", webelement);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
		}
	}

	/*
	 * Enter Text to an Element using its XPath.
	 */
	public static void enterText(WebDriver driver, String element, String textToEnter) {
		try {
			driver.findElement(By.xpath(element)).sendKeys(textToEnter);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
		}
	}

	/*
	 * JavaScript Click on the Element using its XPath.
	 */
	public static void selectDropDownByVisibleText(WebDriver driver, String element, String valueToSelect) {
		try {
			Select select = new Select(driver.findElement(By.xpath(element)));
			select.selectByVisibleText(valueToSelect);
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
		}
	}

	/*
	 * Verify Element Existence using its XPath.
	 */
	public static boolean isElementExists(WebDriver driver, String element) {
		boolean elementPresence = false;
		try {
			driver.findElement(By.xpath(element)).isDisplayed();
			elementPresence = true;
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
			elementPresence = false;
		}
		return elementPresence;
	}

	/*
	 * JavaScript Scroll to the Element using its XPath.
	 */
	public static void scrollToElement(WebDriver driver, String element) {
		try {
			WebElement webelement = driver.findElement(By.xpath(element));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollTo(0," + webelement.getLocation().y + ")");
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed.");
		}
	}
}