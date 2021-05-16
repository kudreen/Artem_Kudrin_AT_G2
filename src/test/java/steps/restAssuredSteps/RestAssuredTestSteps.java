package steps.restAssuredSteps;

import day19.L4JLogging;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import objects.jsonObjects.RealnameObject;
import objects.jsonObjects.UserObject;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.FileNotFoundException;

public class RestAssuredTestSteps {

    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @BeforeClass
    public static void StratOfTest()
    {
        LOGGER.info("End of test");
    }

    @AfterClass
    public static void endOfTest() {
        LOGGER.info("End of test");
    }

    public RequestSpecification restAssuredBaseStep()  {
        LOGGER.info("Start of test");
        RequestSpecification requestSpec = new RequestSpecBuilder().
                setBaseUri("http://178.124.206.46:8001/app/ws/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        return requestSpec;
    }

    public boolean searchByExactUsername() throws FileNotFoundException {
        String result = RestAssured
                .given()
                .spec(restAssuredBaseStep())
                .body(new UserObject(utils.ParseGSON.user(), true))
                .when()
                .post()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("id");
    }

    public boolean searchByPartialUsername() throws FileNotFoundException {
        String result = RestAssured
                .given()
                .spec(restAssuredBaseStep())
                .body(new UserObject(utils.ParseGSON.user(), false))
                .when()
                .post()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("id");
    }

    public boolean searchByExactRealname() throws FileNotFoundException {
        String result = RestAssured
                .given()
                .spec(restAssuredBaseStep())
                .body(new RealnameObject(utils.ParseGSON.realname(), true))
                .when()
                .post()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("id");
    }

    public boolean searchByPartialRealname() throws FileNotFoundException {
        String result = RestAssured
                .given()
                .spec(restAssuredBaseStep())
                .body(new RealnameObject(utils.ParseGSON.realname(), false))
                .when()
                .post()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("id");
    }

    public boolean searchAllUsers() throws FileNotFoundException {
        String result = RestAssured
                .given()
                .spec(restAssuredBaseStep())
                .body(new UserObject("", false))
                .when()
                .post()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("id");
    }
}
