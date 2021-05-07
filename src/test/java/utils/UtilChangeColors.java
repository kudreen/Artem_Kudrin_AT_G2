package utils;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static day17.DriverManager.getChromeDriver;

public class UtilChangeColors {

    static WebDriver driver;

    //ChromeDriver driver

    public static void changeColors(){
        driver = Driver.getWebDriver();
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector('#hotellist_inner > div:nth-child(10)').scrollIntoView(true);");
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector('#hotellist_inner > div:nth-child(10)').style.backgroundColor = 'green'");
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector('#hotellist_inner > div:nth-child(10)  span.sr-hotel__name')." +
                        "style.color = 'red'");
    }
}
