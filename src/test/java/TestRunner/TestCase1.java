package TestRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.BaseTest;
import pageEvents.CartPage;
import pageEvents.LoginPageEvents;
import pageEvents.ProductPage;
import pageEvents.LogoutPage;
import utils.FetchElements;

public class TestCase1 extends BaseTest {

	FetchElements element = new FetchElements();
	LoginPageEvents loginPage = new LoginPageEvents();
	CartPage cart = new CartPage();
	ProductPage product = new ProductPage();
	LogoutPage logout = new LogoutPage();
	WebDriver driver;
 
 
	@Test
	 public void loginMethod() {
		loginPage.enterCredentials();
		product.selectProduct();
		cart.addCustomerDetails();
		cart.finishOrder();
		logout.logout();
		//driver.close();
	}

	@Test(priority = 2)
	public void SelectProduct() {

	}

	@Test(priority = 3)
	public void Addtocard() {

	}

	@Test(priority = 4)
	public void finishOrder() {

	}

	@Test(priority = 5)
	public void Logout() {

	}
}
