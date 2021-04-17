package day16;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
import java.util.List;

public class W3schools {
    static WebDriver driver = new ChromeDriver();
   static Actions make = new Actions(driver);

    public static void main(String[] args){

        //Actions make = new Actions(driver);

        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://w3schools.com/java/");
        WebElement word = driver.findElement(By.xpath("//*[@id=\"main\"]/h1/span"));
        make.doubleClick(word).keyDown(Keys.LEFT_CONTROL).sendKeys("c").keyUp(Keys.LEFT_CONTROL).build().perform();
        driver.get("https://google.com/");
       // WebElement input = driver.findElement((By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")));
        //input.click();
        make.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).build().perform();
        make.sendKeys(Keys.ENTER).build().perform();

        List<WebElement> sress = driver.findElements(By.xpath("//div[@class='g']"));

      sress.forEach(webElement ->  {
          System.out.println(webElement.findElement(By.xpath("//em")).getText().equalsIgnoreCase("tutoril"));
      });


    }
}
