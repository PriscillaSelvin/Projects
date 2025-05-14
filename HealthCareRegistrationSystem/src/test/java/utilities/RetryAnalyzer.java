package utilities;

import org.testng.ITestResult;

import org.testng.IRetryAnalyzer;

public class RetryAnalyzer implements IRetryAnalyzer
{
	  private int count = 0;
	    private static final int maxTry = 1;
        
	    @Override
	    public boolean retry(ITestResult iTestResult)
	    {
	        if (!iTestResult.isSuccess()) {
	            if (count < maxTry) {
	                count++;
	                return true;
	            }
	        }
	        return false;
	    }

}
