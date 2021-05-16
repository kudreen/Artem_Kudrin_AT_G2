package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"runners"},
        features = {"src/test/resources/features/jotform.feature"},
        strict = false
)

public class CucumberRunner {

}


