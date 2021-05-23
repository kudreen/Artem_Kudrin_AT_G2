package day23;

import day19.L4JLogging;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class ForAllureTest {


     Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

   /*@BeforeClass
    public static void initDriver() {
        LOGGER.info("Start of test");
        driver = Driver.getWebDriver();
    }

    @AfterClass
    public  void closeDriver() {
        LOGGER.info("End of test");
        Driver.getWebDriver().close();
    }*/

    @Test @RailCase(caseId = 84655)
    public void clearTest1(){
        LOGGER.debug("Start of test1");
        Assert.assertTrue(1==1);
    }

    @Test @RailCase(caseId = 84655)
    public void clearTest2(){
        LOGGER.debug("Start of test2");
        Assert.assertTrue(2==2);
    }

    @Test @RailCase(caseId = 84655)
    public void clearTest3(){
        LOGGER.debug("Start of test3");
        Assert.assertTrue(3==3);
    }

}
