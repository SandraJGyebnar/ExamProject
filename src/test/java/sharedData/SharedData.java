package sharedData;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import sharedData.browserService.ChromeService;
import sharedData.browserService.EdgeServices;

@Getter
public class SharedData {

    private WebDriver driver;

    public void setUpDriver() {
        String browser = System.getProperty("browser");

        switch (browser){
            case "edge":
                EdgeServices edgeService = new EdgeServices();
                edgeService.openBrowser();
                driver = edgeService.getDriver();
                break;
            case "chrome":
                ChromeService chromeService = new ChromeService();
                chromeService.openBrowser();
                driver = chromeService.getDriver();
                break;
        }
    }


    public void quitDriver(){
        driver.quit();
    }
}
