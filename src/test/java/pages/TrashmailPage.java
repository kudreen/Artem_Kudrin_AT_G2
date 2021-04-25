package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrashmailPage {

    static WebDriver driver;

    public static void openTrashmailPage() {
        driver = Driver.getWebDriver();
        driver.get("https://trashmail.com");
    }

}

