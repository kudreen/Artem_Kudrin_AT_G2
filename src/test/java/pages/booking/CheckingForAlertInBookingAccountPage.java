package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckingForAlertInBookingAccountPage {
    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        driver.findElement(By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]")).click();
    }

    public static void sendMailAdress(String mail) {
        LOGGER.debug("Step sendMailAdress");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mail);
    }

    public static void loginClickButton() {
        LOGGER.debug("Step loginClickButton");
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void sendPass(String password) {
        LOGGER.debug("Step sendPass");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    public static void passClickButton() {
        LOGGER.debug("Step passClickButton");
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void profileButtonClick() {
        LOGGER.debug("Step profileButtonClick");
        driver.findElement(By.xpath("//div[@class='bui-avatar-block']")).click();
    }

    public static void profileDropdownButtonClick() {
        LOGGER.debug("Step profileDropdownButtonClick");
        driver.findElement(By.xpath("//a[@class='bui-dropdown-menu__button']")).click();
    }

    public static void personDetailsClick() {
        LOGGER.debug("Step personDetailsClick");
        driver.findElement(By.xpath("//a[@aria-labelledby='personaldetails_title']")).click();
    }

    public static boolean notification() {
        LOGGER.debug("Assert condition: notification");
        return (driver.findElement(By.xpath("//span[@class='bui-badge__text']")).isEnabled());

    }
}
