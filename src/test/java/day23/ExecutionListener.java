package day23;

import day19.L4JLogging;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.util.concurrent.atomic.AtomicLong;


public class ExecutionListener extends RunListener {

    static Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public static void main(String[] args) {
       // runConnector(getCaseId(description), result);
    }

   /* private void runConnector() {

    }*/


   /* private static void runConnector(long caseId, day23.Result result) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //POST index.php?/api/v2/add_result_for_case/:run_id/:case_id

        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("fakemail@tech.co");
        authScheme.setPassword("Abc123");

        RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46/index.php?/api/v2/add_result_for_case/777/115798")
                .setPort(8000)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setAuth(authScheme)
                .log(LogDetail.BODY)
                .build();

        // ServiceResponse serviceResponse = RestAssured
        String serviceResponse = RestAssured
                .given()
                .spec(REQUEST_SPECIFICATION)
                //.body("")
                .when()
                //.post()
                .get("http://178.124.206.46/index.php?/api/v2/get_projects")
                .then()
                .extract().body().asString();
        //.extract().body().as(ServiceResponse.class);
        // .statusCode(300);
        LOGGER.info(serviceResponse);
    }*/


    public void testRunStarted(Description description) {


        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("fakemail@tech.co");
        authScheme.setPassword("Abc123");

        RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46")
                .setPort(8000)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setAuth(authScheme)
                .log(LogDetail.ALL)
                .build();

       /* // ServiceResponse serviceResponse = RestAssured
        String serviceResponse = RestAssured
                .given()
                .spec(REQUEST_SPECIFICATION)
                .body(result)
                .body(result)
                .when()
                //.post()
                .post("index.php?/api/v2/get_projects")
                .then()
                .extract().body().asString();
        //.extract().body().as(ServiceResponse.class);
        // .statusCode(300);
        LOGGER.info(serviceResponse);
*/
        System.out.println("Number of tests to execute : " + description.testCount());
    }


    public void testRunFinished(Result result) throws java.lang.Exception {
        System.out.println("Number of tests executed : " + result.getRunCount());
    }


    public void testStarted(Description description) throws java.lang.Exception {
        System.out.println("Starting execution of test case : " + description.getMethodName());
    }


    public void testFinished(Description description) {
        day23.Result result = new day23.Result(1);

        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("fakemail@tech.co");
        authScheme.setPassword("Abc123");

        RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46")
                .setPort(8000)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setAuth(authScheme)
                .log(LogDetail.ALL)
                .build();


        String serviceResponse = RestAssured
                .given()
                .spec(REQUEST_SPECIFICATION)
                .body(result)
                .body(result)
                .when()
                .post("index.php?/api/v2/add_result_for_case/777/84655")
                .then()
                .extract().body().asString();

        LOGGER.info(serviceResponse);

        //runConnector(getCaseId(description), result);
    }


    public void testFailure(Failure failure) throws java.lang.Exception {

        day23.Result result = new day23.Result(5);

        System.out.println("Execution of test case failed : " + failure.getMessage());

    }


    public void testIgnored(Description description) throws java.lang.Exception {
        System.out.println("Execution of test case ignored : " + description.getMethodName());
    }


    private long getCaseId(Description description) {
        AtomicLong id = new AtomicLong(0L);
        description.getAnnotations().forEach(annotation -> {
            if (annotation.annotationType().equals(RailCase.class)) {
                LOGGER.info("Case id found: {}" + ((RailCase) annotation).caseId());
                id.set(((RailCase) annotation).caseId());
            }
        });
        return id.get();
    }
}

