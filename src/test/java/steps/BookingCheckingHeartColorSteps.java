package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingCheckingHeartColorSteps {

    static WebDriver driver;

    public static void openBookingPage(String pagename){
        driver = Driver.getWebDriver();
        driver.get(pagename);
    }

    public static void clickLoginButton() {
        driver = Driver.getWebDriver();
      //  driver.findElement
                //(By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]")).click();
    }

    public static void sendMailAdress() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("toptoptoptop@trashmail.com");
    }

    public static void loginClickButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void sendPass() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aa123456789");
    }

    public static void passClickButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void citySearchInput() {
        WebElement cityInput = driver.findElement((By.xpath("//*[@id='ss']")));
        cityInput.click();
        cityInput.sendKeys("Madrid");
    }

    public static void datePick() {
        driver.findElement(By.xpath("//*[contains(@class, 'xp__dates xp__group')]")).click();
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-22')]")).click();
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-26')]")).click();
    }

    public static void searchButtonClick() {
        driver.findElement(By.xpath("//*[contains(@class, 'xp__button')]")).click();
    }

    public static void firstCardAddToFavorites() {
        driver.findElement(By.xpath("(//*[@id='search_results_table']//button[@data-title='Save'])[1]")).click();
    }

    public static void lastCardAddToFavorites() {
        driver.findElement(By.xpath("(//*[@id='search_results_table']//button[@data-title='Save'])[last()]")).click();
    }

    public static String getHartColor() {
        WebElement hartColor = driver.findElement
                (By.xpath("(//*[@id='search_results_table']//*[@class='bk-icon -iconset-heart sr-wl-entry-heart-svg'])[1]"));
        String rgbFormat = hartColor.getCssValue("color");
        return rgbFormat;
    }

    public static void openMyNextTrip() {
        driver.findElement(By.xpath("//a[@class='js-open-list']")).click();
    }



}
