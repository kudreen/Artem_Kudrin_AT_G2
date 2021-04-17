package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BookingMaxRate {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        Actions action = new Actions(driver);

        driver.get("https://booking.com");

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


        WebElement selector = driver.findElement((By.xpath("//*[@id=\"ajaxsrwrap\"]/div[3]/div/div/div/ul/li[9]/a")));
        selector.click();


        //WebDriverWait wait = new WebDriverWait(driver,1);
        //wait.until(ExpectedCondition.(By.xpath(""));


        WebElement sorting = driver.findElement(By.xpath("//*[@id=\"ajaxsrwrap\"]/div[3]/div/div/div/ul/li[9]/ul/li[1]"));
        sorting.click();


        WebElement wait = new WebDriverWait(driver, 3).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));

        Boolean dontWait = new WebDriverWait(driver, 3).
                until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"b2searchresultsPage\"]/div[19]/div")));


        WebElement clickFirstResult = driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]"));
        clickFirstResult.click();

        driver.switchTo().window(String.valueOf(driver.getWindowHandles()));



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement getRating = driver.findElement(By.xpath("//*[@id=\"hp_hotel_name\"]"));
        //action.moveToElement(getRating);
        //action.perform();


        String ratingSearch = driver.findElement(By.xpath("//*[@id=\"js--hp-gallery-scorecard\"]/a/div/div[1]")).getText();

        String rating = ratingSearch.replaceAll("[^0-9]", "");

        System.out.println(rating);

    }
}
