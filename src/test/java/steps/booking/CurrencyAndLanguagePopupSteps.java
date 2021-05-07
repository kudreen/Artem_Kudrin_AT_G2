package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.booking.BookingMainPage;

public class CurrencyAndLanguagePopupSteps {
    static WebDriver driver = Driver.getWebDriver();
    static Actions make = new Actions(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void dragMouseToCurrensyField() {
        LOGGER.debug("");
        WebElement currency = driver.findElement(BookingMainPage.currensyField());
        make.moveToElement(currency);
        make.perform();
    }

    public static String getTextFromCurrensyPupup() {
        String textOfCurrencyPopup = driver.findElement(BookingMainPage.currensyPopup()).getText();
        return textOfCurrencyPopup;
    }

    public static void dragMouseToLanguageField() {
        LOGGER.debug("");
        WebElement language = driver.findElement(BookingMainPage.languageField());
        make.moveToElement(language);
        make.perform();
    }

    public static String getTextFromLanguagePupup() {
        String textOfLanguagePopup = driver.findElement(BookingMainPage.languagePopup()).getText();
        return textOfLanguagePopup;
    }

}
