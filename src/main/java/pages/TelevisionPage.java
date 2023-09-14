package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.JavaScriptExecutorUtility;
import utility.StaticWait;
import utility.Utility;

public class TelevisionPage extends WebTestBase {



    @FindBy(xpath = "//span[@class='menu-icon-hamb']")
    WebElement menuButton;

    @FindBy(xpath = "//h4[text()='Televisions & Accessories']")
    WebElement televisionElementHover;

    @FindBy(xpath = "//h5[text()='LED TVs']")
    WebElement ledTvElement;

    @FindBy(xpath = "//h6[text()='Full HD TVs']")
    WebElement fullHdTvElement;

    @FindBy(xpath = "//a[contains(text(),'Croma 109 cm (43 inch) Full HD LED Smart TV with B')]")
    WebElement croma109FullHdTv;

    @FindBy(xpath = "//label[@for='withOutExchange']//span[@class='check']")
    WebElement withOutExchangeRadioButton;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//button[text()='Proceed to Cart']")
    WebElement proceedToCartButton;

    @FindBy(xpath = "//span[text()='YOUR CART']")
    WebElement textOfCartElement;

    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement checkOutButton;

    @FindBy(xpath = "//small[@class='card-subtitle login-text']")
    WebElement textOfPleaseLoginElement;

    @FindBy(xpath = "//label[@for='SG-ManufacturerDetails-Brand-Croma']//span[@class='check']")
    WebElement checkBoxOfChromaTv;


    public TelevisionPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickOnMenuButton() {

        Utility.waitUntilElementToBeClickable(menuButton);
    }

    public void hoverOnTelevisionElement() {

        ActionUtility.moveToElementFunctionality(televisionElementHover);
    }

    public void hoverOnLedTvElement() {

        ActionUtility.moveToElementFunctionality(ledTvElement);
    }

    public void clickOnFullHdTvElement() {

        Utility.waitUntilElementToBeClickable(fullHdTvElement);
    }

    public void clickOnCroma109FullHdTvElement() {

        Utility.waitUntilElementToBeClickable(croma109FullHdTv);
    }

    public void clickOnWithOutExchangeRadioButton() {

        Utility.waitUntilElementToBeClickable(withOutExchangeRadioButton);
    }

    public void scrollToAddToCartButton() {

        JavaScriptExecutorUtility.scrollToElement(prop.getProperty("aurgument"));
    }


    public void clickOnAddToCartButton() {

        Utility.waitUntilElementToBeClickable(addToCartButton);
    }

    public void clickOnProceedToCartButton() {

        Utility.waitUntilElementToBeClickable(proceedToCartButton);
    }

    public String getTextOfCart() {

        return Utility.getTextOfElement(textOfCartElement);
    }
    public boolean prodcutAddedInCart() {

        return Utility.isDisplayedElement(croma109FullHdTv);
    }


    public void waitForSeconds() {
        StaticWait.waitForSeconds(Integer.parseInt(prop.getProperty("threedSleepSeconds")));
    }

    public void scrollToCheckOutButton() {

        JavaScriptExecutorUtility.scrollToElement(prop.getProperty("aurgument"));
    }

    public void clickOnCheckOutButton() {

        Utility.waitUntilElementToBeClickable(checkOutButton);
    }

    public String getTextOfPleaseLoginElement() {

        return Utility.getTextOfElement(textOfPleaseLoginElement);
    }

    public void moveToCromaCheckBox() {

        ActionUtility.moveToElementFunctionality(checkBoxOfChromaTv);
    }

    public void clickOnCheckBoxOfChromaTv() {

        Utility.waitUntilElementToBeClickable(checkBoxOfChromaTv);
    }

    public boolean isCromaCheckBoxDisplayed() {

        return Utility.isDisplayedElement(checkBoxOfChromaTv);

    }

}
