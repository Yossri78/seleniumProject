package procedure;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.AutomationPractice_CartPage;
import pageObjects.AutomationPractice_HomePage;
import pageObjects.AutomationPractice_LoginPage;
import pageObjects.AutomationPractice_ProductPage;
import pageObjects.AutomationPractice_ProfilePage;
import pageObjects.AutomationPractice_RegisterationPage;
import java.util.Random;

public class AutomationPractice_Procedures {

	//Method to perfom registeration procedure
	public static void registerationProcedure(WebDriver driver,String firstName,String lastName ,String password ,String days,String months,String years,String firstNameAddress,String lastNameAddress,String company,String address,String state,String postCode,String city,String country,String phoneNumber,String aliasAddress,String emailAddress) throws IOException {

		//used page objects 
		AutomationPractice_HomePage homePageObject = new AutomationPractice_HomePage();
		AutomationPractice_LoginPage loginPageObject = new AutomationPractice_LoginPage();
		AutomationPractice_RegisterationPage registerationPageObject = new AutomationPractice_RegisterationPage();
		AutomationPractice_ProfilePage  profilePageObject = new AutomationPractice_ProfilePage();

		homePageObject.clickSignInBtn(driver);

		loginPageObject.fillCreateAccountTextField(driver, emailAddress).clickSubmitCreateBtn(driver);

		//Fill elements in registeration page
		registerationPageObject.clickTitleRadioBtn(driver).fillFirstNameTextField(driver, firstName)
		.fillLastNameTextField(driver, lastName).fillPasswordTextField(driver, password)
		.selectDaysDropDown(driver, days).selectMonthsDropDown(driver, months)
		.selectYearsDropDown(driver, years).fillCompanyTextField(driver, company)
		.fillAddressTextField(driver, address).selectStateDropDown(driver, state)
		.fillCityTextField(driver,city).fillPostalCodeTextField(driver, postCode)
		.fillPhoneMobileTextField(driver, phoneNumber).fillAliasEmailTextField(driver, aliasAddress)
		.clickSubmitAccountBtn(driver);

		Assert.assertTrue(profilePageObject.verifyExistanceLogOutBtn(driver));
	}

	//Method to perfom login procedure
	public static void loginProcedure(WebDriver driver, String emailAddress, String password) throws IOException {

		//used page objects 
		AutomationPractice_ProfilePage  profilePageObject = new AutomationPractice_ProfilePage();
		AutomationPractice_LoginPage loginPageObject = new AutomationPractice_LoginPage();

		//Perform login page
		profilePageObject.clickLogOutBtn(driver);
		loginPageObject.fillEmailAddressTextField(driver, emailAddress)
		.fillPasswordTextField(driver, password)
		.clickSignInBtn(driver);

		Assert.assertTrue(profilePageObject.verifyExistanceLogOutBtn(driver));

	}

	//Method to perfom cart procedure
	public static void cartProcedure(WebDriver driver) throws IOException {

		//used page objects 
		AutomationPractice_HomePage homePageObject = new AutomationPractice_HomePage();
		AutomationPractice_ProductPage  productPageObject = new AutomationPractice_ProductPage();
		AutomationPractice_CartPage  cartPageObject = new AutomationPractice_CartPage();

		//Perform cart page
		homePageObject.clickTShirtLink(driver);
		productPageObject.clickProductImage(driver);
		productPageObject.clickAddCartProductBtn(driver)
		.clickProceedToCheckoutBtn(driver);

		//Perform checkout page
		cartPageObject.clickFirstProceedToCheckoutBtn(driver)
		.clickSecondProceedToCheckoutBtn(driver)
		.clickTermsBtn(driver)
		.clickThirdProceedToCheckoutBtn(driver)
		.clickPaymentmethodLink(driver)
		.clickConfirmPaymentBtn(driver);

		//Assert on complete order message
		Assert.assertTrue(cartPageObject.verifyExistanceCompleteOrderMsgLbl(driver));

	}

	//Method to generate random email address
	public static String generateRandomEmailAddress(String username, String emailAddressExtention){
		Random rand = new Random(); //instance of random class
		int upperbound = 1000;
		//generate random values from 0-1000
		int int_random = rand.nextInt(upperbound); 
		System.out.println(int_random);
		String emailValue=String.valueOf(int_random);  
		emailValue = username + emailValue + emailAddressExtention ; 
		return emailValue;
	}
}
