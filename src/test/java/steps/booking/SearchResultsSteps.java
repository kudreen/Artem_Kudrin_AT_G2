package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pages.booking.BookingSerchResultsPage;

import java.time.Duration;
import java.util.NoSuchElementException;

public class SearchResultsSteps {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();
    static BookingSerchResultsPage page = new BookingSerchResultsPage();
    ;

    public static String getTittleTextColor() {
        LOGGER.debug("Step getTittleTextColor");
        WebElement tittle = driver.findElement(page.tenElementInResults());
        String rgbFormat = tittle.getCssValue("color");
        return rgbFormat;
    }

    public static Boolean presentingsearchResults() {
        LOGGER.debug("Step presentingsearchResults");
        if (driver.findElement(page.presentigSearchResultOnPage()).isEnabled()) ;
        return true;
    }

    public static void hooseMaxPriceInLeftSideMenu() {
        LOGGER.debug("Step hooseMaxPriceInLeftSideMenu");
        driver.findElement(page.chooseMaxPriceInLeftSideMenu()).click();
    }

    public static void fluentWait () {
        LOGGER.debug("Step fluentWait");
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.invisibilityOfElementLocated
                        (page.fluentSpinnerWait()));
    }

    public static void pickHighestStarsSelector(){
        LOGGER.debug("Step pickHighestStarsSelector");
        driver.findElement(page.highestStarsSelector()).click();
    }

    public static String getPriceFromFirstCard() {
        LOGGER.debug("Step getPriceFromFirstCard");
        String priceTextFromCard = driver.findElement(page.priseFromFirstCard()).getText();
        return priceTextFromCard;
    }

    public static String getTexFromLeftSideMenu() {
        LOGGER.debug("Step getTexFromLeftSideMenu");
        String priceTextFromLeftMenu = driver.findElement(page.chooseMaxPriceInLeftSideMenu()).getText();
        return priceTextFromLeftMenu;
    }


}
