package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import testbase.WebTestBase;
import org.testng.asserts.SoftAssert;
import utility.ScreenShotUtility;

public class HomeTest extends WebTestBase {
    SoftAssert softAssert;
    public HomePage homePage;

    HomeTest() {

        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();

    }

    @Test(priority = 1, description = "verifying the functionality of Link and coming back to Parent window")
    public void verifyFunctionalityOfLink() {
        softAssert = new SoftAssert();
        homePage.clickOnMyAccountBtn();
        homePage.clickOnTermsAndConditionLink();
        System.out.println(driver.getCurrentUrl());
        softAssert.assertTrue(homePage.isTermsOfUseElementDisplayed(),"Element Should Be Displayed");
        softAssert.assertEquals(homePage.getCurrentUrl(), "https://www.croma.com/", "Url Should Be Matched");
        ScreenShotUtility.takeScreenShot("termsOfUsePage");
        homePage.switchToParentWindow();
        homePage.closePopUpOfLogin();
        System.out.println(driver.getTitle());
        softAssert.assertTrue(homePage.isElementDisplayed(),  "What's New Element Should Be Displayed");
        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Method to Run Only Failed Test Cases" )
    public void failedTestCases(){
        Assert.assertFalse(true);
    }

    @AfterMethod
    public void tearDown() {
      driver.close();

    }
}

