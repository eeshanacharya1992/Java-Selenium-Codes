package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryMechanism implements IRetryAnalyzer {
   int count =0;
   int retrycount=4;
	@Override
	public boolean retry(ITestResult arg0) {
		if(count<retrycount)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
