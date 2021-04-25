package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookingPage;

public class BookingRegisterTestSteps {
    static WebDriver driver;

    public static void clickRegisterButton() {
        driver = Driver.getWebDriver();
        driver.findElement
                (By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[5]")).click();

    }

    public static void sendMailAdress() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("toptoptoptop@trashmail.com");
    }

    public static void confirmMailAdress() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void enterPassword() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys("Aa1234567890");

    }

    public static void confirmPassword() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@id='confirmed_password']")).sendKeys("Aa1234567890");
    }

    public static void submitPasswords() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


}


