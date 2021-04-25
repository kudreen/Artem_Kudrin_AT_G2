package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class СhangeHotelCardTittleColorSteps {
    static WebDriver driver;


    public static void enterCityName(){
        driver = Driver.getWebDriver();
        WebElement city = driver.findElement((By.xpath("//*[@id='ss']")));
        city.click();
        city.sendKeys("Москва");
    }

    public static void pushFindButton(){
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//*[contains(@class, 'xp__button')]")).click();
    }

    public static String getTittleTextColor(){
        driver = Driver.getWebDriver();
        WebElement tittle = driver.findElement(By.className("sr-hotel__name"));
        String rgbFormat = tittle.getCssValue("color");
        return rgbFormat;
    }


}
