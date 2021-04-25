package pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    static WebDriver driver;

    public static void openBookingPage(){
        driver = Driver.getWebDriver();
        driver.get("https://booking.com");
    }
}
