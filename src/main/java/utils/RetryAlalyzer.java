package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAlalyzer implements IRetryAnalyzer{
 
		@Override
		public boolean retry(ITestResult result) {
			 int count=0;
			 int retrycount=1;
 
					while(count<retrycount)
					{
						count++;
						return true;
					}
					return false;
 
	}

}
