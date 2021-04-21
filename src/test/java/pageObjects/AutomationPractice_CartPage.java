package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ActionFactory;

public class AutomationPractice_CartPage {


	//////////////////////Cart page elements////////////////////////
	By firstProceedToCheckoutBtn = By.xpath("//*[contains(@title, 'Proceed to checkout') and @href=\"http://automationpractice.com/index.php?controller=order&step=1\"]");
	By secondProceedToCheckoutBtn = By.xpath("//button[@name='processAddress']");
	By thirdProceedToCheckoutBtn = By.xpath("//button[@name='processCarrier']");
	By paymentmethodLink = By.xpath("//a[contains(@href,\"http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment\") and @class=\"bankwire\"]");
	By confirmPaymentBtn = By.xpath("//span[contains(text(), 'I confirm my order')]");
	By completeOrderMsgLbl = By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");

	
	//This method clicks first Proceed To Checkout Btn in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickFirstProceedToCheckoutBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, firstProceedToCheckoutBtn);
		return this;
	}
	
	//This method clicks second Proceed To Checkout Btn in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickSecondProceedToCheckoutBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, secondProceedToCheckoutBtn);
		return this;
	}
	
	//This method clicks third Proceed To Checkout Btn in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickThirdProceedToCheckoutBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, thirdProceedToCheckoutBtn);
		return this;
	}
	
	//This method clicks terms Btn in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickTermsBtn(WebDriver driver){
		driver.findElement(By.xpath("//div[contains(@class, 'checker')]//input[@id='cgv']")).click();
		return this;
	}
	
	//This method clicks payment method Link in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickPaymentmethodLink(WebDriver driver){
		ActionFactory.clickOnElement(driver, paymentmethodLink);
		return this;
	}
	
	//This method clicks confirm Payment Btn in the Automation Practice Cart Page
	public AutomationPractice_CartPage clickConfirmPaymentBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, confirmPaymentBtn);
		return this;
	}
	
	//This method verify existance of complete order message in the Automation Practice Cart Page
	public boolean verifyExistanceCompleteOrderMsgLbl(WebDriver driver){
		return ActionFactory.VerifyWebElementExists(driver,completeOrderMsgLbl);
		 
	}
}
