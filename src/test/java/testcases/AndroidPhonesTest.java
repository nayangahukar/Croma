package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AndriodPhonesPage;
import pages.HomePage;
import testbase.WebTestBase;
import utility.StaticWait;

public class AndroidPhonesTest extends WebTestBase {

    SoftAssert softAssert;
    public HomePage homePage;
    public AndriodPhonesPage andriodPhonesPage;

    AndroidPhonesTest() {

        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        andriodPhonesPage = new AndriodPhonesPage();
    }

    @Test(priority = 1, description = "Verifying DropDown Functionality of Mobile Page")
    public void verifyDropDownFunctionality() throws InterruptedException {
        softAssert = new SoftAssert();
        homePage.clickOnMenuButton();
        homePage.clickOnPhonesAndWearablesElement();
        homePage.clickOnmobilePhonesElement();
        homePage.clickOnandroidPhonesElement();
        andriodPhonesPage.clickOnFeaturedDropDownMenu();
        andriodPhonesPage.clickonTopRatedItemsFromDropDown();
        softAssert.assertEquals(andriodPhonesPage.verifyTopRatedElement(),"TOP RATED" , "Text Should Be Matched");
        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }
}