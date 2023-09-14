package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.JavaScriptExecutorUtility;
import utility.StaticWait;
import utility.Utility;

import java.util.List;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//button[@class='text-bold account font-signin']")
    WebElement myAccountbtn;

    @FindBy(linkText = "Terms of Use")
    WebElement termOfUselink;

    @FindBy(xpath = "//span[@class='text']")
    WebElement termsOfUseElement;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiDialog-paper dark-theme MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiPaper-elevation24 MuiPaper-rounded']//button[@type='button']")
    WebElement closePopUpElement;

    @FindBy(xpath = "//a[@href='https://www.croma.com/unboxed']//span[@class=' lazy-load-image-background blur lazy-load-image-loaded']//img[@alt='undefined']")
    WebElement homePageWhatsNewElement;

    /////////////////////////////////////////
    @FindBy(xpath = "//span[@class='menu-icon-hamb']")
    WebElement menuButton;

    @FindBy(xpath = "//h4[text()='Televisions & Accessories']")
    WebElement televisionElement;

    @FindBy(xpath = "//h5[text()='LED TVs']")
    WebElement ledTvElement;

    @FindBy(xpath = "//h6[text()='Full HD TVs']")
    WebElement fullHdTvElement;

    ////////////////////////

    @FindBy(xpath = "//h4[normalize-space()='Phones & Wearables']")
    WebElement phonesAndWearablesElement;

    @FindBy(xpath = "//h5[normalize-space()='Mobile Phones']")
    WebElement mobilePhonesElement;

    @FindBy(xpath = "//h6[normalize-space()='Android Phones']")
    WebElement androidPhonesElement;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickOnMyAccountBtn() {
        Utility.waitUntilElementToBeClickable(myAccountbtn);

    }

    public void clickOnTermsAndConditionLink() {
        Utility.waitUntilElementToBeClickable(termOfUselink);

    }

    public boolean isTermsOfUseElementDisplayed() {

        return Utility.isDisplayedElement(termsOfUseElement);
    }

    public void switchToParentWindow() {

        Utility.closeAllChildWindowsAndSwitchToParentWindow();
    }

    public String getCurrentUrl() {

        return Utility.getUrlOfSite();
    }

    public void closePopUpOfLogin() {

        Utility.waitUntilElementToBeClickable(closePopUpElement);
    }

    public boolean isElementDisplayed() {

        return Utility.isDisplayedElement(homePageWhatsNewElement);
    }
    public void clickOnMenuButton() {

        Utility.waitUntilElementToBeClickable(menuButton);
    }

    public void hoverOnTelevisionElement() {

        ActionUtility.moveToElementFunctionality(televisionElement);
    }

    public void hoverOnLedTvElement() {

        ActionUtility.moveToElementFunctionality(ledTvElement);
    }

    public void clickOnFullHdTvElement() {

        Utility.waitUntilElementToBeClickable(fullHdTvElement);
    }


    public void waitForSeconds() {
        StaticWait.waitForSeconds(Integer.parseInt(prop.getProperty("threedSleepSeconds")));
    }

    public void clickOnPhonesAndWearablesElement() {

      ActionUtility.moveToElementFunctionality(phonesAndWearablesElement);
    }

    public void clickOnmobilePhonesElement() {

        ActionUtility.moveToElementFunctionality(mobilePhonesElement);
    }
    public void clickOnandroidPhonesElement() {

        androidPhonesElement.click();
    }

}

