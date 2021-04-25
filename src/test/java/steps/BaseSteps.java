package steps;


import driver.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseSteps {
    public static WebDriver driver;

    @BeforeClass
    public static void initDriver() {
        driver = Driver.getWebDriver();
        //driver = new Driver();
    }

    public static void ppageLoadTimeout() {
        driver = Driver.getWebDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public static void scriptLoadTimeout() {
        driver = Driver.getWebDriver();
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }

  /*  @AfterClass
    public static void closeDriver() {
        Driver.getWebDriver().close();
    }*/

}
