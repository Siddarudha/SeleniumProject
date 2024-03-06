package pageEvents;

import pageObject.LoginPageObjectss;
import pageObject.ProductPageObjects;
import utils.FetchElements;

public class ProductPage {

	
	FetchElements ele = new FetchElements();

	public void selectProduct() {

		ele.getWebElement("XPATH", ProductPageObjects.selectProduct("Sauce Labs Bike Light")).click();
		
		ele.getWebElement("XPATH", ProductPageObjects.gotoCheckoutPage).click();
		

	}
	
	
}
