package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainpagePage {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();


    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        driver.findElement(By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]")).click();
    }

    public static void enterCityName(String city){
        LOGGER.debug("Step enterCityName");
        //driver.findElement(By.xpath("//*[@id='ss']")).click();
        driver.findElement(By.xpath("//*[@id='ss']")).sendKeys(city);
    }

    public static void datesInput(){
        LOGGER.debug("Step datesInput");
        driver.findElement(By.xpath("//*[contains(@class, 'xp__dates xp__group')]")).click();
    }

    public static void exactStartDate(){
        LOGGER.debug("Step exactStartDate");
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-01')]")).click();
    }

    public static void exaxtLeaveDate(){
        LOGGER.debug("Step exaxtLeaveDate");
        driver.findElement(By.xpath("//*[contains(@data-date, '2021-05-07')]")).click();
    }

    public static void clickSearchButton(){
        LOGGER.debug("Step clickSearchButton");
        driver.findElement(By.xpath("//*[contains(@class, 'xp__button')]")).click();
    }

    public static void clickGuestsToggle() {
        LOGGER.debug("Step clickGuestsToggle");
        driver.findElement(By.xpath("//*[@id='xp__guests__toggle']")).click();
    }

    public static void clickPlusAdultGuest(){
        LOGGER.debug("Step clickPlusAdultGuest");
        driver.findElement(By.xpath("//*[contains(@aria-label, 'Increase number of Adults')]")).click();
    }
}
