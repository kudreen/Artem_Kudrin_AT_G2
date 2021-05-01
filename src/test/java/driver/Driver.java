package driver;

import day17.Config;
import day17.DriverManager;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver webDriver;
    public static Config config;

    public static void setDriver(Config config){
        day17.Driver.config = config;
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            //webDriver = DriverManager.getDriver(Config.CHROME);
            webDriver = DriverManager.getDriver(config);
        }

        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver){
        day17.Driver.webDriver = webDriver;
    }

    public static void destroy(){
        webDriver.quit();
        day17.Driver.webDriver = null;
    }

    public Driver(){

    }
}