package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.ActionFactory;

public class AutomationPractice_RegisterationPage {

	//////////////////////Registeration page elements////////////////////////
	By titleRadioBtn = By.xpath("//input[@id='id_gender1']");
	By firstNameTextField = By.xpath("//input[@id='customer_firstname']");
	By lastNameTextField = By.xpath("//input[@id='customer_lastname']");
	By passwordTextField = By.xpath("//input[@id='passwd']");
	By daysDropDown = By.xpath("//select[@id='days']");
	By monthsDropDown = By.xpath("//select[@id='months']");
	By yearsDropDown = By.xpath("//select[@id='years']");
	By firstNameAddressTextField = By.xpath("//input[@id='firstname']");
	By lastNameAddressTextField = By.xpath("//input[@id='lastname']");
	By companyTextField = By.xpath("//input[@id='company']");
	By addressTextField = By.xpath("//input[@id='address1']");
	By cityTextField = By.xpath("//input[@id='city']");
	By stateDropDown = By.xpath("//select[@id='id_state']");
	By postCodeTextField = By.xpath("//input[@id='postcode']");
	By countryDropDown = By.xpath("//select[@id='id_country']");
	By phoneMobileTextField = By.xpath("//input[@id='phone_mobile']");
	By aliasEmailTextField = By.xpath("//input[@id='alias']");
	By submitAccountBtn = By.xpath("//button[@id='submitAccount']");

	//This method clicks title Radio Btn in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage clickTitleRadioBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, titleRadioBtn);
		return this;
	}

	//This method fills create Account Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillFirstNameTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, firstNameTextField, text);
		return this;
	}

	//This method fills last Name Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillLastNameTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, lastNameTextField, text);
		return this;
	}

	//This method fills password Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillPasswordTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, passwordTextField, text);
		return this;
	}

	//This method selects days DropDown in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage selectDaysDropDown(WebDriver driver, String value) throws IOException{
		ActionFactory.selectFromDropDown(driver, daysDropDown, value);
		return this;
	}

	//This method selects months DropDown in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage selectMonthsDropDown(WebDriver driver, String value) throws IOException{
		Select dropdown = new Select(driver.findElement(monthsDropDown));
		int i=Integer.parseInt(value);  
		dropdown.selectByIndex(i);
		return this;
	}
	
	//This method selects years DropDown in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage selectYearsDropDown(WebDriver driver, String value) throws IOException{
		ActionFactory.selectFromDropDown(driver, yearsDropDown, value);
		return this;
	}
	
	//This method fills first Name Address Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillFirstNameAddressTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, firstNameAddressTextField, text);
		return this;
	}
	
	//This method fills last Name Address Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillLastNameAddressTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, lastNameAddressTextField, text);
		return this;
	}

	//This method fills company Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillCompanyTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, companyTextField, text);
		return this;
	}

	//This method fills Address Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillAddressTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, addressTextField, text);
		return this;
	}

	//This method fills city Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillCityTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, cityTextField, text);
		return this;
	}

	//This method selects state DropDown in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage selectStateDropDown(WebDriver driver, String value) throws IOException{
		Select dropdown = new Select(driver.findElement(stateDropDown));
		int i=Integer.parseInt(value);  
		dropdown.selectByIndex(i);
		return this;
	}

	//This method fills postcode Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillPostalCodeTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, postCodeTextField, text);
		return this;
	}

	//This method selects country DropDown in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage selectCountryDropDown(WebDriver driver, String value) throws IOException{
		ActionFactory.selectFromDropDown(driver, countryDropDown, value);
		return this;
	}

	//This method fills phone mobile Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillPhoneMobileTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, phoneMobileTextField, text);
		return this;
	}

	//This method fills alias email Text Field in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage fillAliasEmailTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, aliasEmailTextField, text);
		return this;
	}

	//This method clicks submit Account Btn in the Automation Practice Registeration Page
	public AutomationPractice_RegisterationPage clickSubmitAccountBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, submitAccountBtn);
		return this;
	}
}
