package pageEvents;

import pageObject.ProductPageObjects;
import utils.FetchElements;
public class CartPage {

	
	
	FetchElements ele = new FetchElements();

	public void addCustomerDetails() {
		
		ele.getWebElement("XPATH", ProductPageObjects.checkOutButton).click();

		ele.getWebElement("XPATH", ProductPageObjects.firstName).sendKeys("Sid");
		
		ele.getWebElement("XPATH", ProductPageObjects.lastName).sendKeys("Pat");
 
		ele.getWebElement("XPATH", ProductPageObjects.postalCode).sendKeys("654321");
		
		
		ele.getWebElement("XPATH", ProductPageObjects.continueButton).click();

	}
	
	public void finishOrder() {

		ele.getWebElement("XPATH", ProductPageObjects.finishButton).click();
	}

}
