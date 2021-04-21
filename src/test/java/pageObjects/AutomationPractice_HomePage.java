package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionFactory;


public class AutomationPractice_HomePage {

	//////////////////////Home page elements////////////////////////
	By signInBtn = By.xpath("//a[contains(text(),'Sign in')]");
	By tShirtLink = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");



	//This method clicks signInBtn in the Automation Practice Home Page
	public AutomationPractice_HomePage clickSignInBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, signInBtn);
		return this;
	}
	
	//This method clicks tShirtLink in the Automation Practice Home Page
	public AutomationPractice_HomePage clickTShirtLink(WebDriver driver){
		ActionFactory.clickOnElement(driver, tShirtLink);
		return this;
	}
}
