package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckingForAlertInBookingAccount {
    static WebDriver driver;

    public static void clickLoginButton() {
        driver = Driver.getWebDriver();
        driver.findElement
                (By.xpath("//*[contains(@class, '-vertical-align-middle')]/child::*[6]")).click();

    }


    public static void sendMailAdress() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("toptoptoptop@trashmail.com");

    }

    public static void loginClickButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void sendPass() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aa123456789");
    }

    public static void passClickButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).click();
    }

    public static void profileButtonClick() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//div[@class='bui-avatar-block']")).click();


    }

    public static void profileDropdownButtonClick() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//a[@class='bui-dropdown-menu__button']")).click();
    }


    public static void personDetailsClick() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//a[@aria-labelledby='personaldetails_title']")).click();
    }

    public static void notification() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//span[contains(text(), 'Resend verification email?')]"));
    }

}
