package steps.chuckNorrisSteps;

import day19.L4JLogging;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ChuckNorrisSteps {

        private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

        @BeforeClass
        public static void startOfTest()
        {
            LOGGER.info("Start of test");
        }

        @AfterClass
        public static void endOfTest() {
            LOGGER.info("End of test");
        }

        public boolean changingNameForJoke(String firstName, String lastName) {
            LOGGER.info("Start of test");
            RequestSpecification requestSpec = new RequestSpecBuilder().
                    setBaseUri("http://api.icndb.com/jokes/random")
                    .addQueryParam("firstName", firstName)
                    .addQueryParam("lastName", lastName)
                    .setAccept(ContentType.JSON)
                    .setContentType(ContentType.JSON)
                    .log(LogDetail.ALL)
                    .build();
            String result = RestAssured
                    .given()
                    .spec(requestSpec)
                    .when()
                    .get()
                    .then()
                    .extract().body().asString();
            LOGGER.debug(result);
            return result.contains("Aragorn " +  "Son_of_Arathorn");
        }

    public boolean fetchingRandomJokeStep() {
        LOGGER.info("Start of test");
        RequestSpecification requestSpec = new RequestSpecBuilder().
                setBaseUri("http://api.icndb.com/jokes/random")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        String result = RestAssured
                .given()
                .spec(requestSpec)
                .when()
                .get()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("success");
    }

    public boolean fetchingMultipleRandomJokes(String numbersOfJokes) {
        LOGGER.info("Start of test");
        RequestSpecification requestSpec = new RequestSpecBuilder().
                setBaseUri("http://api.icndb.com/jokes/random/" + numbersOfJokes)

                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        String result = RestAssured
                .given()
                .spec(requestSpec)
                .when()
                .get()
                .then()
                .extract().body().asString();
        LOGGER.debug(result);
        return result.contains("success");
    }
}
