package pageEvents;

import com.github.dockerjava.api.model.Driver;

import pageObject.LoginPageObjectss;
import pageObject.LogoutPageObjects;
import utils.FetchElements;

public class LogoutPage {

	FetchElements ele = new FetchElements();

	public void logout() {

		ele.getWebElement("XPATH", LogoutPageObjects.menu).click();
		ele.getWebElement("XPATH", LogoutPageObjects.logoutLinktext).click();
		
		 

	}
}
