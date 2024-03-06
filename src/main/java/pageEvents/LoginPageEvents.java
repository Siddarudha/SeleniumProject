package pageEvents;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.LoginPageObjectss;
import utils.FetchElements;

public class LoginPageEvents {
	FetchElements ele = new FetchElements();

	public void enterCredentials() {

		ele.getWebElement("XPATH", LoginPageObjectss.userName).sendKeys("standard_user");
		ele.getWebElement("XPATH", LoginPageObjectss.passWord).sendKeys("secret_sauce");
		ele.getWebElement("XPATH", LoginPageObjectss.loginButton).click();
	}

	public void enterCredentialsd() {
		ele.getWebElement("XPATH", LoginPageObjectss.userName).sendKeys("standard_user");
		ele.getWebElement("XPATH", LoginPageObjectss.passWord).sendKeys("secret_sauce");
		ele.getWebElement("XPATH", LoginPageObjectss.loginButton).click();
	}

}
