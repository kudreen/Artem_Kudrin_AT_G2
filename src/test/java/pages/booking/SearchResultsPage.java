package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    static WebDriver driver = Driver.getWebDriver();


    public static String getTittleTextColor() {
        LOGGER.debug("Step getTittleTextColor");
        WebElement tittle = driver.findElement(By.className("sr-hotel__name"));
        String rgbFormat = tittle.getCssValue("color");
        return rgbFormat;
    }

    public static Boolean presentingsearchResults() {
        LOGGER.debug("Step presentingsearchResults");
        return(driver.findElement(By.xpath("//*[@id='hotellist_inner']")).isEnabled());
    }

    public static void hooseMaxPriceInLeftSideMenu() {
        LOGGER.debug("Step hooseMaxPriceInLeftSideMenu");
        driver.findElement(By.xpath("//*[contains(@data-id, 'pri-5')]")).click();
    }

    public static void pickHighestStarsSelector() {
        LOGGER.debug("Step pickHighestStarsSelector");
        driver.findElement(By.xpath("//ul[contains(@role, 'menubar')]/child::*[3]")).click();
    }

    public static String getPriceFromFirstCard() {
        LOGGER.debug("Step getPriceFromFirstCard");
        String priceTextFromCard = driver.findElement(By.xpath("//*[contains(@class, 'bui-price-display__value prco-inline-block-maker-helper')]"))
                .getText();
        return priceTextFromCard;
    }

    public static String getTexFromLeftSideMenu() {
        LOGGER.debug("Step getTexFromLeftSideMenu");
        String priceTextFromLeftMenu = driver.findElement(By.xpath("//*[contains(@data-id, 'pri-5')]"))
                .getText();
        return priceTextFromLeftMenu;
    }

    public static void clickFirstCardInSearchResults() {
        driver.findElement(By.xpath("//*[@id='hotellist_inner']/child::*[1]//*[contains(@class, 'sr-hotel__name')]"))
                .click();
    }

    public static String getRatingFromHotelPage() {

        String ratingText = driver.findElement(By.xpath("(//div[@class='bui-review-score__badge'])[1]"))
                .getText();
        return ratingText;


    }
}
