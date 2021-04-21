package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionFactory {

	//This method is getting value from the config properties file
	public static String getProperty(String key) throws IOException {
		InputStream input = new FileInputStream("configProperties");
		Properties prop = new Properties();
		prop.load(input);
		return prop.getProperty(key);
	}
	
	//This method clicks the given element using the given driver
	@SuppressWarnings("deprecation")
	public static void clickOnElement(WebDriver driver, By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			while (!element.isDisplayed()) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			}
			
			driver.findElement(by).click();

		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Error!! Could not find Clickable Element for the first time");
			throw e;
		}
	}
	
	//This method enters text into the given element using the given driver
	public static void enterTextIntoWebElement(WebDriver driver,  By elemData, String text) throws IOException {
		if (text != null) {
		WebElement elem = null;
		try {
			elem = driver.findElement(elemData);
			elem.clear();
			elem.sendKeys(text);
			
		} catch (NoSuchElementException e) {
			System.err.println(e.getMessage());
			System.err.println("No such element");
			throw e;
		} 
		}
	}
	
	//This method selects element from dropdown list using the given driver
	public static void selectFromDropDown(WebDriver driver, By element, String type) {

		try {
		Select dropdown = new Select(driver.findElement(element));

		dropdown.selectByValue(type);
		}catch (Exception e){
			System.err.println(e.getMessage());
			System.err.println("No element to select");
			throw e;
		}
	}
	
	//This method verify element existance using the given driver
	public static boolean VerifyWebElementExists(WebDriver driver, By elemData) {
		WebElement elem = null;
		try {
			elem = driver.findElement(elemData);
		} catch (Exception e) {
			return false;
		}
		if (elem != null) {
			return true;
		}
		return false;
	}
}
