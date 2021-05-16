package tests.restAssured;

import org.junit.Assert;
import org.junit.Test;
import steps.restAssuredSteps.RestAssuredTestSteps;

import java.io.FileNotFoundException;

public class RestAssuredTest extends RestAssuredTestSteps{

    @Test
    public void restAssuredSearchByPartialUsername() throws FileNotFoundException {
        Assert.assertTrue(searchByPartialUsername());
    }

    @Test
    public void restAssuredSearchByExactUsername() throws FileNotFoundException {
        Assert.assertTrue(searchByExactUsername());
    }

    @Test
    public void restAssuredSearchByExactRealname() throws FileNotFoundException {
        Assert.assertTrue(searchByExactRealname());
    }

    @Test
    public void restAssuredSearchByPartialRealname() throws FileNotFoundException {
        Assert.assertTrue(searchByPartialRealname());
    }

    @Test
    public void restAssuredSearchAllUsers() throws FileNotFoundException {
        Assert.assertTrue(searchAllUsers());
    }
}
