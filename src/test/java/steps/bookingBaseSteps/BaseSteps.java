package steps.bookingBaseSteps;


import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @BeforeClass
    public static void initDriver() {
        LOGGER.info("Start of test");
        driver = Driver.getWebDriver();
    }

    @AfterClass
    public static void closeDriver() {
        LOGGER.info("End of test");
        Driver.getWebDriver().close();
    }


    public static void openPageAdress(String pagename){
        LOGGER.debug("Step openPageAdress");
        driver.get(pagename);
    }

    public static void ppageLoadTimeout() {
        LOGGER.debug("Timeout ppageLoadTimeout");
        driver = Driver.getWebDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public static void implicitlyWait() {
        LOGGER.debug("Timeout implicitlyWait");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void scriptLoadTimeout() {
        LOGGER.debug("Timeout scriptLoadTimeout");
        driver = Driver.getWebDriver();
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }
    public static void fluentWait() {
        LOGGER.debug("Step fluentWait");
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated
                        (By.cssSelector(".bui-spinner.bui-spinner--size-large")));
    }

    public static void switchActualPage() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }


    }
}
