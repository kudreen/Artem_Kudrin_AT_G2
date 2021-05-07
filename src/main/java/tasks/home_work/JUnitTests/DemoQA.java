import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DemoQA {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://demoqa.com/select-menu");

    }

    @Test
    public void test() {

        WebElement firstDropdown = driver.findElement(By.cssSelector("#withOptGroup > div > div.css-1hwfws3"));
        firstDropdown.click();
        WebElement firstDropdownSelect = driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0-0\"]"));
        firstDropdownSelect.click();

        WebElement secondDropdown = driver.findElement(By.cssSelector("#selectOne > div > div.css-1hwfws3"));
        secondDropdown.click();
        WebElement secondDropdownSelect = driver.findElement(By.xpath("//*[@id=\"react-select-3-option-0-3\"]"));
        secondDropdownSelect.click();

        WebElement thirdDropdown = driver.findElement(By.cssSelector("#oldSelectMenu"));
        thirdDropdown.click();
        WebElement thirdDropdownSelect = driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]/option[5]"));
        thirdDropdownSelect.click();

        WebElement fourthDropdown = driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div > div.css-1hwfws3"));
        fourthDropdown.click();
        WebElement fourthDropdownSelect = driver.findElement(By.xpath("//*[@id=\"react-select-4-option-1\"]"));
        fourthDropdownSelect.click();
        WebElement fourthDropdownSelectPlusOne = driver.findElement(By.xpath("//*[@id=\"react-select-4-option-3\"]"));
        fourthDropdownSelectPlusOne.click();

        driver.findElement(By.xpath("//*[@id=\"cars\"]/option[1]")).click();

    }

    @After
    public void afterTest() {
        driver.close();
    }
}
