import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BookingMoskowRoomsByDate {
    static WebDriver driver = new ChromeDriver();

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://booking.com");
    }

    @Test
    public void test(){

        WebElement city = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/label/span/following-sibling::*")));
        city.click();
        city.sendKeys("Москва");

        WebElement date = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")));
        date.click();

        WebElement exactInDate = driver.findElement((By.xpath("//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[2]/span/span")));
        exactInDate.click();

        WebElement exactOutDate = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[1]/span/span")));
        exactOutDate.click();

        WebElement persons = driver.findElement((By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]")));
        persons.click();


        WebElement search = driver.findElement((By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")));
        search.click();

        if (driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]")).isEnabled()) {
            System.out.println("результат есть");
        }
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
