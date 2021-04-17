package day16;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Moskow {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://booking.com");

        WebElement city = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/label/span/following-sibling::*")));
        city.click();

        city.sendKeys("Москва");

        WebElement search = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")));
        search.click();

        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector(\"#hotellist_inner > div:nth-child(10)\").scrollIntoView(true);");

        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector(\"#hotellist_inner > div:nth-child(10)\").style.backgroundColor = 'green'");

        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector(\"#hotellist_inner > div:nth-child(10) > div.sr_item_content.sr_item_content_slider_wrapper > div.sr_property_block_main_row > div.sr_item_main_block > div.sr-hotel__title-wrap > h3 > a > span.sr-hotel__name\")." +
                        "style.color = 'red'");

        WebElement tittle = driver.findElement(By.className("sr-hotel__name"));

        String rgbFormat = tittle.getCssValue("color");

        String redRGB = "rgba(0, 113, 194, 1)";


        if (rgbFormat.equals(redRGB)) {
            System.out.println("Цвет верный");
        } else System.out.println("Цвет неправильный");

        driver.close();
    }
}

