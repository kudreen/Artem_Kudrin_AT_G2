package driver;

import day17.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static WebDriver getDriver(Config config) {
        switch (config != null ? config : Config.CHROME) {
            case FIREFOX -> {
                return getFFDriver();
            }
            case REMOTE -> {
                return getRemoteDriver();
            }
            default -> {
                return getChromeDriver();
            }
        }
    }

    public static FirefoxDriver getFFDriver() {
        return null;
    }

    public static RemoteWebDriver getRemoteDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("statrt-maximaized");
        try {
            return new RemoteWebDriver(new URL("http://localhost:9515/"), new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ChromeDriver getChromeDriver() {
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}



