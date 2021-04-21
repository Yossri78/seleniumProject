package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionFactory;

public class AutomationPractice_LoginPage {

	//////////////////////Login page elements////////////////////////
	By createAccountTextField = By.xpath("//input[@id='email_create']");
	By submitCreateBtn = By.xpath("//*[@id=\"SubmitCreate\"]");
	By emailAddressTextField = By.xpath("//input[@id='email']");
	By passwordTextField = By.xpath("//input[@id='passwd']");
	By signInBtn = By.xpath("//*[@id=\"SubmitLogin\"]");

	
	
	//This method fills create Account Text Field in the Automation Practice Login Page
	public AutomationPractice_LoginPage fillCreateAccountTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, createAccountTextField, text);
		return this;
	}
	
	//This method clicks submit Create Btn in the Automation Practice Login Page
	public AutomationPractice_LoginPage clickSubmitCreateBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, submitCreateBtn);
		return this;
	}
	
	//This method clicks sign In Btn in the Automation Practice Login Page
	public AutomationPractice_LoginPage clickSignInBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, signInBtn);
		return this;
	}
	
	//This method fills email Address Text Field in the Automation Practice Login Page
	public AutomationPractice_LoginPage fillEmailAddressTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, emailAddressTextField, text);
		return this;
	}
	
	//This method fills password Text Field in the Automation Practice Login Page
	public AutomationPractice_LoginPage fillPasswordTextField(WebDriver driver, String text) throws IOException{
		ActionFactory.enterTextIntoWebElement(driver, passwordTextField, text);
		return this;
	}
}
