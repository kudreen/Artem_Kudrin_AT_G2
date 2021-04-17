package day16;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.IOException;
import java.util.List;

public class BookingCurrencyLanguage {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://chromeDriver/chromedriver.exe");
        Actions action = new Actions(driver);

        driver.get("https://booking.com");

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
}

