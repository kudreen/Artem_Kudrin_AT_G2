package tests.restAssured;

import org.junit.Assert;
import org.junit.Test;
import steps.restAssuredSteps.RestAssuredTestSteps;

import java.io.FileNotFoundException;

public class RestAssuredTest extends RestAssuredTestSteps{

    @Test
    public void restAssuredSearchByPartialUsername() throws FileNotFoundException {
        Assert.assertTrue(RestAssuredTestSteps.searchByPartialUsername() == true);
    }

    @Test
    public void restAssuredSearchByExactUsername() throws FileNotFoundException {
        Assert.assertTrue(RestAssuredTestSteps.searchByExactUsername() == true);
    }

    @Test
    public void restAssuredSearchByExactRealname() throws FileNotFoundException {
        Assert.assertTrue(RestAssuredTestSteps.searchByExactRealname() == true);
    }

    @Test
    public void restAssuredSearchByPartialRealname() throws FileNotFoundException {
        Assert.assertTrue(RestAssuredTestSteps.searchByPartialRealname() == true);
    }

    @Test
    public void restAssuredSearchAllUsers() throws FileNotFoundException {
        Assert.assertTrue(RestAssuredTestSteps.searchAllUsers()== true);
    }
}
