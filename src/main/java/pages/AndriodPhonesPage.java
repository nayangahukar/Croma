package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

import java.util.List;

public class AndriodPhonesPage extends WebTestBase {

    @FindBy(xpath = "//div[@class='selected-item']")
    WebElement featuredDropDownMenu;

    @FindBy(xpath = "//div[@class='select-item-list']//li")
    List<WebElement> itemListOfDropDown;
    @FindBy(xpath = "//div[@class='selected-item']")
    WebElement topRatedFilterElement;


    public AndriodPhonesPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickOnFeaturedDropDownMenu() {

        Utility.waitUntilElementToBeClickable(featuredDropDownMenu);
    }
    public void clickonTopRatedItemsFromDropDown() {

        Utility.dropDownElement(itemListOfDropDown, prop.getProperty("itemofFeaturedDropDown"));
    }

    public String verifyTopRatedElement() {
       Utility.isDisplayedElement(topRatedFilterElement);
      return Utility.getTextOfElement(topRatedFilterElement);
    }


}
