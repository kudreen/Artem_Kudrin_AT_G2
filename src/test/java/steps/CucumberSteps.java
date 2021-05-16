package steps;

import day17.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import steps.cucumberBaseSteps.CucumberBaseSteps;

import java.util.concurrent.TimeUnit;

public class CucumberSteps extends CucumberBaseSteps {

    WebDriver driver = Driver.getWebDriver();

    @Given("I start execution")
    public void openSite() {
        String url = "https://jotform.com";
        driver.get(url);
    }

    @When("I click to Login button")
    public void clickLoginButton() {
        driver.findElement(By.xpath("//a[@data-name='login']")).click();
    }

    @Then("I enter password")
    public void enterEmail() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("firestarter97@mail.ru");
    }

    @Then("I enter email")
    public void enterPassword() {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123456");
    }

    @Then("I click 'Login' button again")
    public void clickLoginButtonAgain() {
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    }

    @Then("I wait")
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I click 'Create form' button")
    public void clickCreateFormButton() {
        driver.findElement(By.xpath("//*[@id='createForm-wrapper']/child::*[1]")).click();
    }

    @Then("I click button with +")
    public void clickButtonWithPlus() {
        driver.findElement(By.xpath("//div[@class='jfWizard-list']/child::*[1]")).click();
    }

    @Then("I click 'Classic format' and wait")
    public void clickClassicFormatButton() {
        driver.findElement(By.xpath("//div[@class='jfWizard-list']/child::*[1]")).click();
    }

    @Then("I click 'Card format' and wait")
    public void clickCardFormatButton() {
        driver.findElement(By.xpath("//div[@class='jfWizard-list']/child::*[2]")).click();
    }

    @Then("I click 'Publicate' button")
    public void clickPublicateButton() {
        driver.findElement(By.xpath("//a[@id='siteNav_id_publish']")).click();
    }

    @Then("I check creation")
    public void clickOpenButton() {
        String text = driver.findElement(By.xpath("//span[@class='header-newForm-text'] ")).getText();
        Assert.assertTrue(text.contains("Created"));
    }
}

