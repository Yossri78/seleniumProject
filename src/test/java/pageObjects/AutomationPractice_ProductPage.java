package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import utils.ActionFactory;

public class AutomationPractice_ProductPage {

	//////////////////////Product page elements////////////////////////
	By addCartProductBtn = By.xpath("//span[contains(text(),'Add to cart')]");
	By proceedToCheckoutBtn = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By productImage = By.xpath("//div[contains(@class, 'right-block')]//a[contains(@href,\"http://automationpractice.com/index.php?id_product=1&controller=product\") and @class=\"product-name\"]");
	
	//This method clicks add Cart Product Btn in the Automation Practice Product Page
	public AutomationPractice_ProductPage clickAddCartProductBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, addCartProductBtn);
		return this;
	}	
	
	//This method clicks proceed To Checkout Btn in the Automation Practice Product Page
	public AutomationPractice_ProductPage clickProceedToCheckoutBtn(WebDriver driver){
		ActionFactory.clickOnElement(driver, proceedToCheckoutBtn);
		return this;
	}
	
	//This method clicks product Image in the Automation Practice Product Page
	public AutomationPractice_ProductPage clickProductImage(WebDriver driver){
		ActionFactory.clickOnElement(driver, productImage);
		return this;
	}
}

