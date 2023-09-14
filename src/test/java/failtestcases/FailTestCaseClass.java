package failtestcases;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import testbase.WebTestBase;

public class FailTestCaseClass extends WebTestBase implements IRetryAnalyzer {



    private int retryCount = 0;
    private int maxCount = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
