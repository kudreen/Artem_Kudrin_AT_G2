import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class BookingCurrencyLanguage {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        driver.get("https://booking.com");
    }

    @Test
    public void test() throws IOException {
        Actions action = new Actions(driver);

        WebElement currency = driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[1]/button"));
        action.moveToElement(currency);
        action.perform();

        String getCurrensyTooltipText = currency.getAttribute("data-tooltip-text");

        String currensyTextEtalon = "Choose your currency";
        if (getCurrensyTooltipText.equals(currensyTextEtalon)) {
            System.out.println("ок1");
        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }


        WebElement language = driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[2]/button"));
        action.moveToElement(language);
        action.perform();

        String getLanguageTooltipText = language.getAttribute("data-tooltip-text");

        String languageTextEtalon = "Choose your language";
        if (getLanguageTooltipText.equals(languageTextEtalon)) {
            System.out.println("ок2");
        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterTest() {
        driver.close();
    }
}

