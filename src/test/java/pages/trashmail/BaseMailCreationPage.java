package steps.precondition.trashMail;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.bookingBaseSteps.BaseSteps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class BaseMailCreationPage extends BaseSteps {
    static WebDriver driver = Driver.getWebDriver();

    public static void chooseDomain() {
        driver.findElement(By.xpath("//select[@name='form_domain']")).click();
        driver.findElement(By.xpath("//option[@value='trashmail.es']")).click();
    }

    public static void inputRealEmail(String password) {
        driver.findElement(By.xpath("(//input[@ng-model='user.email'])[1]")).sendKeys(password);
    }

    public static void clickFormRedirectionsNumber() {
        driver.findElement(By.xpath("//select[@name='form_nb_redirections']")).click();
    }

    public static void clickExactNumbersOfRedirections() {
        driver.findElement(By.xpath("//option[@value='10']")).click();
    }

    public static void clickDesableCapcha() {
        driver.findElement(By.xpath("(//input[@name='form_whitelisting'])[2]")).click();
    }

    public static void pushCreateButton() {
        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
    }

    public static void getCreatedEmailName() throws IOException {
        String email = driver.findElement(By.xpath("//div[@class='jumbotron']//h4[@class='text-center']")).getText();
        FileOutputStream fis = new FileOutputStream(String.valueOf("tempEmailAdress.txt"));
        fis.write(email.getBytes(StandardCharsets.UTF_8));
        fis.close();
    }

}
