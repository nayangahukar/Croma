package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.TelevisionPage;
import testbase.WebTestBase;

public class TelevisionTest extends WebTestBase {
    SoftAssert softAssert;
    public HomePage homePage;
    public TelevisionPage televisionPage;

    TelevisionTest() {

        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        televisionPage = new TelevisionPage();
    }


    @Test(priority = 1, description = "Verifying Add To Cart Functionality")
    public void verifyAddToCartFunctionality() {
        softAssert = new SoftAssert();
        homePage.clickOnMenuButton();
        homePage.hoverOnTelevisionElement();
        homePage.hoverOnLedTvElement();
        homePage.clickOnFullHdTvElement();
        televisionPage.clickOnCroma109FullHdTvElement();
        televisionPage.clickOnWithOutExchangeRadioButton();
        televisionPage.waitForSeconds();
        televisionPage.scrollToAddToCartButton();
        televisionPage.clickOnAddToCartButton();
        televisionPage.clickOnProceedToCartButton();
        softAssert.assertTrue(televisionPage.prodcutAddedInCart(),"Product Should Be Displayed In Cart");
        softAssert.assertEquals(televisionPage.getTextOfCart(), "YOUR CART", "Text Should Be Matched");
        softAssert.assertAll();
    }

    public void AllStepsFromClinkingOnMenuButtontoClickingOnProceedToCartButton() {
        homePage.clickOnMenuButton();
        homePage.hoverOnTelevisionElement();
        homePage.hoverOnLedTvElement();
        homePage.clickOnFullHdTvElement();
        televisionPage.clickOnCroma109FullHdTvElement();
        televisionPage.clickOnWithOutExchangeRadioButton();
        televisionPage.waitForSeconds();
        televisionPage.scrollToAddToCartButton();
        televisionPage.clickOnAddToCartButton();
        televisionPage.clickOnProceedToCartButton();
    }

    @Test(priority = 2, description = "Verifying CheckOut Functionality WithOut Login on website")
    public void verifyCheckOutFunctionalityWithOutLogin() {
        softAssert = new SoftAssert();
        AllStepsFromClinkingOnMenuButtontoClickingOnProceedToCartButton();
        televisionPage.scrollToCheckOutButton();
        televisionPage.clickOnCheckOutButton();
        System.out.println(televisionPage.getTextOfPleaseLoginElement());
        softAssert.assertEquals(televisionPage.getTextOfPleaseLoginElement(), "Please enter your Email ID or Phone number", "Text Should Be Matched");
        softAssert.assertAll();
    }

    @Test(priority = 3, description = "Verifying CromaCheckBox Functionality on TV Page" )
    public void verifyCromaCheckBoxFunctionality() {
        softAssert = new SoftAssert();
        homePage.clickOnMenuButton();
        homePage.hoverOnTelevisionElement();
        homePage.hoverOnLedTvElement();
        homePage.clickOnFullHdTvElement();
        televisionPage.moveToCromaCheckBox();
        televisionPage.clickOnCheckBoxOfChromaTv();
        softAssert.assertTrue(televisionPage.isCromaCheckBoxDisplayed(),"Checkbox Should Be Selected");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }
}