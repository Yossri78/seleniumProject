package tests;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.JsonDataReader;
import procedure.AutomationPractice_Procedures;
import utils.ActionFactory;
import utils.WebDriverFactory;
public class AutomationPractice_Test {
	private static WebDriver driver;
	String emailAddress;

	@BeforeMethod
	public void startProcedure() throws IOException {
		
		//Initializing chrome instance
		driver = WebDriverFactory.getChromeInstance();
		
		//Open project url
		driver.get(ActionFactory.getProperty("ProjectURL"));

	}

	@Test
	public void test() throws IOException, ParseException {
		
		//Initializing json reader
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();

		//Calling Generate unique email address method
		emailAddress = AutomationPractice_Procedures.generateRandomEmailAddress(jsonReader.userName,jsonReader.emailAddressExtention);
		
		//Calling Registeration method
		AutomationPractice_Procedures.registerationProcedure(driver, jsonReader.firstName, jsonReader.lastName, jsonReader.password, jsonReader.days, jsonReader.months, jsonReader.years, jsonReader.firstNameAddress, jsonReader.lastNameAddress, jsonReader.company, jsonReader.address, jsonReader.state, jsonReader.postCode, jsonReader.city, jsonReader.country, jsonReader.phoneNumber, jsonReader.aliasAddress, emailAddress);
		
		//Calling Login method
		AutomationPractice_Procedures.loginProcedure(driver, emailAddress, jsonReader.password);
		
		//Calling Cart method
		AutomationPractice_Procedures.cartProcedure(driver);
	}


	@AfterMethod
	public void quitProcedure() {
		//Close driver
		driver.quit();
	}

}
