package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BookingRegisterTestPage {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();
    static Actions make = new Actions(driver);


    public static void clickRegisterButton() {
        LOGGER.debug("Step clickRegisterButton");
        driver.findElement(By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[5]")).click();
    }

    public static void sendMailAdress(String intermediateMailAdress) {
        LOGGER.debug("Step sendMailAdress");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(intermediateMailAdress);
    }

    public static void confirmMailAdress() {
        LOGGER.debug("Step confirmMailAdress");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void enterPassword(String password) {
        LOGGER.debug("Step enterPassword");
        driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys(password);
    }

    public static void confirmPassword(String password) {
        LOGGER.debug("Step confirmPassword");
        driver.findElement(By.xpath("//input[@id='confirmed_password']")).sendKeys(password);
    }

    public static void submitPasswords() {
        LOGGER.debug("Step submitPasswords");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void holdSubmitPasswords() {
        LOGGER.debug("Step holdSubmitPasswords" );
        make.clickAndHold(driver.findElement
                        (By.xpath("//*[@id='px-captcha']/iframe"))).build().perform();
    }
}


