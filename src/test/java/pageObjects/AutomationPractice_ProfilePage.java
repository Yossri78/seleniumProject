package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionFactory;

public class AutomationPractice_ProfilePage {

	//////////////////////Profile page elements////////////////////////
	By logOutBtn = By.xpath("//*[contains(@title, 'Log me out')]");
	
	//This method clicks log out btn in the Automation Practice Profile Page
	public AutomationPractice_ProfilePage clickLogOutBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, logOutBtn);
		return this;
	}
	
	//This method verify existance of log out btn in the Automation Practice Profile Page
	public boolean verifyExistanceLogOutBtn(WebDriver driver){
		return ActionFactory.VerifyWebElementExists(driver,logOutBtn);
		 
	}
	
}
