package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingCheckingHeartColorSteps {

    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());


    public static void clickLoginButton() {
        LOGGER.debug("Click Login Button");
        driver.findElement(By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]/child::*[2]"))
                .click();
    }

    public static void sendMailAdress(String mailAdress) {
        LOGGER.debug("Send Mail Adress" + mailAdress);
        driver.findElement(By.xpath("//input[@type='email']"))
                .sendKeys(mailAdress);
    }

    public static void loginClickButton() {
        LOGGER.debug("Click 'Login' button");
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']"))
                .click();
    }

    public static void sendPass(String password) {
        LOGGER.debug("Sending password");
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys(password);
    }

    public static void passClickButton() {
        LOGGER.debug("Click 'continue' button");
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']"))
                .click();
    }

    public static void citySearchInput(String city) {
        LOGGER.debug("Send" + city + "to input");
        driver.findElement(By.xpath("//*[@id='ss']")).sendKeys(city);
    }

    public static void datePick() {
        LOGGER.debug("Pick dates for room");
        driver.findElement(By.xpath("//*[contains(@class, 'xp__dates xp__group')]")).click();
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-22')]")).click();
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-26')]")).click();
    }

    public static void searchButtonClick() {
        LOGGER.debug("Click 'Search' button");
        driver.findElement(By.xpath("//*[contains(@class, 'xp__button')]")).click();
    }

    public static void firstCardAddToFavorites() {
        LOGGER.debug("Adding to favorites first card");
        driver.findElement(By.xpath("(//div[@id='hotellist_inner']//child::*[1]//button[@data-text-create='Create a list'])[1]"))
                .click();

    }

    public static void lastCardAddToFavorites() {
        LOGGER.debug("Adding to favorites last card");
        driver.findElement(By.xpath("(//div[@id='hotellist_inner']//child::*[1]//button[@data-text-create='Create a list'])[last()]"))
                .click();
    }

    public static String getHartColor() {
        LOGGER.debug("Getting CssValue of 'like' button");
        String rgbFormat = driver.findElement
                (By.xpath("(//div[@id='hotellist_inner']//child::*[1]//button[@data-text-create='Create a list'])[1]"))
                .getCssValue("color");
        LOGGER.debug("CssValue is" + rgbFormat);
        return rgbFormat;
    }

    public static void closeWelcomPopup() {
        LOGGER.debug("Close 'Welcome' popup");
        driver.findElement(By.xpath("//button[@class='modal-mask-closeBtn']")).click();
    }

}
