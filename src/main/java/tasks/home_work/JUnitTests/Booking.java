import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class Booking {

    static WebDriver driver = new ChromeDriver();


    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://booking.com");
    }

    @Test
    public void test() {

        WebElement city = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/label/span/following-sibling::*")));
        city.click();
        city.sendKeys("Paris, Ile de France, France");

        WebElement date = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")));
        date.click();

        WebElement exactInDate = driver.findElement((By.xpath("//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[2]/span/span")));
        exactInDate.click();

        WebElement exactOutDate = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[1]/span/span")));
        exactOutDate.click();

        WebElement persons = driver.findElement((By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]")));
        persons.click();

        WebElement plusPerson = driver.findElement((By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[2]/span")));
        plusPerson.click();
        plusPerson.click();

        WebElement plusRoom = driver.findElement((By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/div/div[2]/button[2]/span")));
        plusRoom.click();

        WebElement search = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")));
        search.click();

        WebElement ckickCheckbox = driver.findElement(By.xpath("//*[@id='filter_price']/div[3]/a[5]/label/div"));
        ckickCheckbox.click();

        WebElement wait = new WebDriverWait(driver, 3).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));

        Boolean dontWait = new WebDriverWait(driver, 3).
                until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));

        WebElement maxPrice = driver.findElement((By.xpath("//*[@id=\"ajaxsrwrap\"]/div[3]/div/div/div/ul/li[3]/a")));
        maxPrice.click();


        WebElement wait2 = new WebDriverWait(driver, 3).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));

        Boolean dontWait2 = new WebDriverWait(driver, 3).
                until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));


        String minPriceForRoom = driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/child::div/child::div")).getText();
        String MaxPrice = driver.findElement(By.xpath("//*[@id=\"filter_price\"]/div[3]/a[5]/label/div/span[1]")).getText();

        String minPriceForRoomTakeInts = minPriceForRoom.replaceAll("[^0-9]", "");
        String maxPriceTakeInts = MaxPrice.replaceAll("[^0-9]", "");

        System.out.println(minPriceForRoomTakeInts);
        System.out.println(maxPriceTakeInts);

        int minPriceForRoomPaseInts = Integer.parseInt(minPriceForRoomTakeInts);
        int maxPriceParseInts = Integer.parseInt(maxPriceTakeInts);

        int c = minPriceForRoomPaseInts / 7;


        if (c >= maxPriceParseInts) {
            System.out.println("Минимальная цена за номер больше, чем минммальная цена за дорогой номер");
        } else System.out.println("Минимальная цена за номер меньше, чем минммальная цена за дорогой номер");
    }

    @After
    public void afterTest() {
        driver.close();
    }
}



