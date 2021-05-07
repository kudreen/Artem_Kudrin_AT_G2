package steps.restAssuredBaseSteps;

import day19.L4JLogging;
import driver.Driver;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class REBaseStaps {
   // static WebDriver driver = Driver.getWebDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @BeforeClass
    public static void initDriver() {
        LOGGER.info("Start of test");
     //   driver = Driver.getWebDriver();
    }

    @AfterClass
    public static void closeDriver() {
        LOGGER.info("End of test");
        Driver.getWebDriver().close();
    }

    public static RequestSpecification connectionParameters() {
            RequestSpecification requestSpec = new RequestSpecBuilder().
                    setBaseUri("http://178.124.206.46:8001/app/ws/")
                    .setAccept(ContentType.JSON)
                    .setContentType(ContentType.JSON)
                    .log(LogDetail.ALL)
                    .build();
        return requestSpec;
    }
}
