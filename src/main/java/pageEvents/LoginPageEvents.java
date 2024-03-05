package pageEvents;

import org.openqa.selenium.WebElement;

import pageObject.LoginPageObjectss;
import utils.FetchElements;
public class LoginPageEvents {
	
	 FetchElements element = new FetchElements();
	 
	 public void enterCredentials() {
		 
		 element.getWebElement("XPATH", LoginPageObjectss.userName).sendKeys("standard_user");
		 element.getWebElement("XPATH", LoginPageObjectss.passWord).sendKeys("secret_sauce");
		 element.getWebElement("XPATH", LoginPageObjectss.loginButton).click();
	 }

}
