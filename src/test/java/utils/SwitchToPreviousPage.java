package utils;

import org.openqa.selenium.WebDriver;

public class SwitchToPreviousPage {

    static WebDriver driver;


    public static void switchToPreviousPage() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }
}
