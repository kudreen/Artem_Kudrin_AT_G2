package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.booking.BookingLoginPages;
import pages.booking.BookingMainPage;

public class CheckingForAlertInBookingAccount {
    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        driver.findElement(BookingMainPage.loginButton()).click();
    }

    public static void sendMailAdress(String mail) {
        LOGGER.debug("Step sendMailAdress");
        driver.findElement(BookingLoginPages.sendMailAdress()).sendKeys(mail);
    }

    public static void loginClickButton() {
        LOGGER.debug("Step loginClickButton");
        driver.findElement(BookingLoginPages.loginClickButton()).click();
    }

    public static void sendPass(String password) {
        LOGGER.debug("Step sendPass");
        driver.findElement(BookingLoginPages.sendPass()).sendKeys(password);
    }

    public static void passClickButton() {
        LOGGER.debug("Step passClickButton");
        driver.findElement(BookingLoginPages.passClickButton()).click();
    }

    public static void profileButtonClick() {
        LOGGER.debug("Step profileButtonClick");
        driver.findElement(BookingLoginPages.profileButtonClick()).click();
    }

    public static void profileDropdownButtonClick() {
        LOGGER.debug("Step profileDropdownButtonClick");
        driver.findElement(BookingLoginPages.profileDropdownButtonClick()).click();
    }

    public static void personDetailsClick() {
        LOGGER.debug("Step personDetailsClick");
        driver.findElement(BookingLoginPages.personDetailsClick()).click();
    }

    public static Boolean notification() {
        LOGGER.debug("Assert condition: notification");
        if (driver.findElement(BookingLoginPages.notification()).isEnabled()) ;
        return true;
    }
}
