package pages;

import helpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected ElementMethods elementMethods;

    public BasePage(WebDriver driver) {
    }
}
