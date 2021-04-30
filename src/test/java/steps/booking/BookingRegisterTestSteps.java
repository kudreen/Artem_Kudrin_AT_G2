package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.booking.BookingMainPage;
import pages.booking.BookingRegistrationPages;

public class BookingRegisterTestSteps {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();
    static Actions make = new Actions(driver);


    public static void clickRegisterButton() {
        LOGGER.debug("Step clickRegisterButton");
        driver.findElement(BookingMainPage.registerButton()).click();
    }

    public static void sendMailAdress(String intermediateMailAdress) {
        LOGGER.debug("Step sendMailAdress");
        driver.findElement(BookingRegistrationPages.mailboxInput()).sendKeys(intermediateMailAdress);
    }

    public static void confirmMailAdress() {
        LOGGER.debug("Step confirmMailAdress");
        driver.findElement(BookingRegistrationPages.confirmMailAdress()).click();
    }

    public static void enterPassword(String password) {
        LOGGER.debug("Step enterPassword");
        driver.findElement(BookingRegistrationPages.enterPassword()).sendKeys(password);
    }

    public static void confirmPassword(String password) {
        LOGGER.debug("Step confirmPassword");
        driver.findElement(BookingRegistrationPages.confirmPassword()).sendKeys(password);
    }

    public static void submitPasswords() {
        LOGGER.debug("Step submitPasswords");
        driver.findElement(BookingRegistrationPages.submitPasswords()).click();
    }

    public static void holdSubmitPasswords() {
        LOGGER.debug("Step holdSubmitPasswords");
        make.clickAndHold
                (driver.findElement
                        (BookingRegistrationPages.holdButton())).build().perform();
    }
}


