package TestRunner;

import org.testng.annotations.Test;
import base.BaseTest;
import pageEvents.LoginPageEvents;
import utils.FetchElements;

public class TestCase1 extends BaseTest {

	FetchElements element = new FetchElements();
	LoginPageEvents loginPage = new LoginPageEvents();

	@Test
	public void loginMethod() {
		loginPage.enterCredentials();

	}
}
