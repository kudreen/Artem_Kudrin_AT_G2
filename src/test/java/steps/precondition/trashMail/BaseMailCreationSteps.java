package steps.precondition.trashMail;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import pages.trashmail.TrashmailMainPage;
import steps.bookingBaseSteps.BaseSteps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class BaseMailCreationSteps extends BaseSteps {
    static WebDriver driver = Driver.getWebDriver();

    public static void chooseDomain() {
        driver.findElement(TrashmailMainPage.formDomain()).click();
        driver.findElement(TrashmailMainPage.exactDomain()).click();
    }

    public static void inputRealEmail(String password) {
        //driver.findElement(TrashmailMainPage.passwordInput()).click();
        driver.findElement(TrashmailMainPage.realEmail()).sendKeys(password);
    }

    public static void clickFormRedirectionsNumber() {
        driver.findElement(TrashmailMainPage.formRedirections()).click();
    }

    public static void clickExactNumbersOfRedirections() {
        driver.findElement(TrashmailMainPage.exactNumbersOfRedirections()).click();
    }

    public static void clickDesableCapcha() {
        driver.findElement(TrashmailMainPage.deactivateCapcha()).click();
    }

    public static void pushCreateButton() {
        driver.findElement(TrashmailMainPage.pushRegisterButton()).click();
    }

    public static void getCreatedEmailName() throws IOException {
        String email = driver.findElement(TrashmailMainPage.getCreatedEmail()).getText();
        FileOutputStream fis = new FileOutputStream(String.valueOf("tempEmailAdress.txt"));
        fis.write(email.getBytes(StandardCharsets.UTF_8));
        fis.close();
    }

}
