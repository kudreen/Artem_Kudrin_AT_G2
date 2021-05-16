package pages.booking;

import day19.L4JLogging;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmingRegistrationFronMailboxPage {
    static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void loginEnterAdress(String mainMailName) {
        LOGGER.debug("Step loginEnterAdress");
        driver.findElement(By.xpath("//input[@class='email-input svelte-1eyrl7y']")).sendKeys(mainMailName);
    }

    public static void clickLoginButton() {
        LOGGER.debug("Step clickLoginButton");
        driver.findElement(By.xpath("//button[@data-testid='enter-password']")).click();
    }

    public static void loginEnterPass(String password) {
        LOGGER.debug("Step loginEnterPass");
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys(password);
    }

    public static void loginClickPassButton() {
        LOGGER.debug("Step loginClickPassButton");
        driver.findElement(By.xpath("//button[@data-testid='login-to-mail']")).click();
    }

    public static void findAndClickConfirmationLetter() {
        LOGGER.debug("Step findAndClickConfirmationLetter");
        driver.findElement(By.xpath("(//span[contains(@title, 'Booking.com')])[1]")).click();
    }

    public static void clickConfirmationButton() {
        LOGGER.debug("Step clickConfirmationButton");
        driver.findElement(By.xpath("//td[@class='button-inner_mr_css_attr']")).click();
    }

    /*public static boolean presentingBookingHeader() {
        LOGGER.debug("Step presentingBookingHeader");
        return (driver.findElement(By.xpath("//h1[@class='bui_font_display_two bui_font_heading--bold bui-spacer--medium nw-step-header']")).isEnabled());
    }*/
}
