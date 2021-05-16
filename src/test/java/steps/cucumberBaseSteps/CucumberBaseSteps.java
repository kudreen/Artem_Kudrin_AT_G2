package steps.cucumberBaseSteps;


import day17.Config;
import day17.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class CucumberBaseSteps {

    @BeforeClass
    public void doBefore() {
        Driver.setDriver(Config.CHROME);
    }

    @AfterClass
    public void scrollTest2() {
        Driver.destroy();
    }
}

