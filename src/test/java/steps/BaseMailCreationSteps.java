package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseMailCreationSteps {
    static WebDriver driver;

    public static void chooseNewUserTab() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//a[@href= '#tab-register']")).click();
    }

    public static void inputName() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//*[@id='tab-register']/form/*[@class='input-group input-group-sm']/input"))
                .sendKeys("artem");
    }

    public static void inputPass() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//*[@id='tab-register']/form/div[2]/input"))
                .sendKeys("123456");
    }

    public static void confirmPass() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//*[@id='tab-register']/form/div[3]/input"))
                .sendKeys("123456");
    }

    public static void mirrorMailbox() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//*[@id='tab-register']/form/div[4]/input"))
                .sendKeys("kudreen@gmail.com");
    }


    public static void clickSubmitButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@ng-click='registerAccount();']")).click();
    }
}
