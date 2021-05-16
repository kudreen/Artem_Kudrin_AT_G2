package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CurrencyAndLanguagePopupPage {
    static WebDriver driver = Driver.getWebDriver();
    static Actions make = new Actions(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void dragMouseToCurrensyField() {
        LOGGER.debug("");
        WebElement currency = driver.findElement(By.xpath("//*[contains(@data-modal-aria-label, 'currency')]"));
        make.moveToElement(currency).perform();
    }

    public static String getTextFromCurrensyPupup() {
        String textOfCurrencyPopup = driver.findElement(By.xpath("//*[contains(@class, 'bui-tooltip--bottom')]"))
                .getText();
        return textOfCurrencyPopup;
    }

    public static void dragMouseToLanguageField() {
        LOGGER.debug("");
        WebElement language = driver.findElement(By.xpath("//*[contains(@data-modal-aria-label, 'language')]"));
        make.moveToElement(language).perform();
    }

    public static String getTextFromLanguagePupup() {
        String textOfLanguagePopup = driver.findElement(By.xpath("//*[contains(@class, 'bui-tooltip--bottom')]"))
                .getText();
        return textOfLanguagePopup;
    }

}
