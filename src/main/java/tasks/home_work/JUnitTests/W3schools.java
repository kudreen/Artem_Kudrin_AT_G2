import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
import java.util.List;

public class W3 {
    static WebDriver driver = new ChromeDriver();
    static Actions make = new Actions(driver);

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://w3schools.com/java/");
    }

    @Test
    public void test() {

        WebElement word = driver.findElement(By.xpath("//*[@id=\"main\"]/h1/span"));
        make.doubleClick(word).keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();

        driver.get("https://google.com/");

        make.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).build().perform();
        make.sendKeys(Keys.ENTER).build().perform();

        List<WebElement> sress = driver.findElements(By.xpath("//div[@class='g']"));

        sress.forEach(webElement -> {
            System.out.println(webElement.findElement(By.xpath("//em")).
                    getText().equalsIgnoreCase("tutorial"));
        });
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
