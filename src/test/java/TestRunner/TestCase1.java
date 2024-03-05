package TestRunner;

import org.testng.annotations.Test;

import pageEvents.LoginPageEvents;
import utils.FetchElements;

public class TestCase1 {
	
	FetchElements element = new FetchElements();
	LoginPageEvents loginPage;
	
  @Test
  public void loginMethod() {
	  
	  loginPage.enterCredentials();
	  
  }
}
