package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

   public HomePage (WebDriver driver) {super(driver);}

   @FindBy(xpath = "//div[@class='category-button']/i[@class='material-icons' and text()='menu']")
   private WebElement categoriiMenu;

   public void clickCategoriiMenu(){
      elementMethods.clickElement(categoriiMenu);

   }


}
