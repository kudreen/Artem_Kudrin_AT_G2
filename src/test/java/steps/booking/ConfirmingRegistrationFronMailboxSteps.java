package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.mailru.MailRuPage;

public class ConfirmingRegistrationFronMailboxSteps {
    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void loginEnterAdress(String mainMailName) {
        LOGGER.debug("Step loginEnterAdress");
        driver.findElement(MailRuPage.loginEnterAdress()).sendKeys(mainMailName);
    }

    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        driver.findElement(MailRuPage.loginButton()).click();
    }

    public static void loginEnterPass(String password) {
        LOGGER.debug("Step loginEnterPass");
        driver.findElement(MailRuPage.loginEnterPass()).sendKeys(password);
    }

    public static void loginClickPassButton() {
        LOGGER.debug("Step loginClickPassButton");
        driver.findElement(MailRuPage.loginClickPassButton()).click();
    }

    public static void findAndClickConfirmationLetter() {
        LOGGER.debug("Step findAndClickConfirmationLetter");
        driver.findElement(MailRuPage.findAndClickConfirmationLetter()).click();
    }

    public static void clickConfirmationButton() {
        LOGGER.debug("Step clickConfirmationButton");
        driver.findElement(MailRuPage.clickConfirmationButton()).click();
    }

    public static Boolean presentingBookingHeader() {
        LOGGER.debug("Step presentingBookingHeader");
        if (driver.findElement(MailRuPage.bookingHeader()).isEnabled());
        return true;
    }
}
