package steps.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.booking.BookingMainPage;

public class MainPageSteps {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();
    static BookingMainPage page;

    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        BookingMainPage page = new BookingMainPage();
        driver.findElement(page.loginButton()).click();
    }

    public static void enterCityName(String city){
        LOGGER.debug("Step enterCityName");
        driver.findElement(page.cityInput()).click();
        driver.findElement(page.cityInput()).sendKeys(city);
    }

    public static void datesInput(){
        LOGGER.debug("Step datesInput");
        driver.findElement(page.dateInput()).click();
    }

    public static void exactStartDate(){
        LOGGER.debug("Step exactStartDate");
        driver.findElement(page.date2021_05_01()).click();
    }

    public static void exaxtLeaveDate(){
        LOGGER.debug("Step exaxtLeaveDate");
        driver.findElement(page.date2021_05_07()).click();
    }

    public static void clickSearchButton(){
        LOGGER.debug("Step clickSearchButton");
        driver.findElement(page.searchButton()).click();
    }

    public static void clickGuestsToggle() {
        LOGGER.debug("Step clickGuestsToggle");
        driver.findElement(page.guestsToggle()).click();
    }

    public static void clickPlusAdultGuest(){
        LOGGER.debug("Step clickPlusAdultGuest");
        driver.findElement(page.plusAdultGuestBUtton()).click();
    }
}
