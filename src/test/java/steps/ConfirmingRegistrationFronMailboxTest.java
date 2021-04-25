package steps;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmingRegistrationFronMailboxTest {
    static WebDriver driver;
    public static void openMailBox() {
        driver = Driver.getWebDriver();
        driver.get("https://mail.ru/");
    }

    public static void loginEnterAdress() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@class='email-input svelte-1eyrl7y']")).sendKeys("firestarter97");
    }

    public static void loginClickButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@data-testid='enter-password']")).click();
    }

    public static void loginEnterPass() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys("Nabiylka3251555");

    }

    public static void loginClickPassButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//button[@data-testid='login-to-mail']")).click();
    }

    public static void findAndClickConfirmationLetter() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//span[@title='Booking.com <lessie79@mailgano.com>']")).click();

    }

    public static void clickConfirmationButton() {
        driver = Driver.getWebDriver();
        driver.findElement(By.xpath("//td[@class='button-inner_mr_css_attr']")).click();
    }
}
