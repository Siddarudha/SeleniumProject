package pageEvents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import base.BaseTest;

public class HomePageEvents {

	public void takescreenshotMethod(ITestResult result) {
		String filename = System.getProperty("user.dir" + File.separator + result.getMethod().getMethodName());

		File f1 = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f1, new File(filename + ".png"));

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
