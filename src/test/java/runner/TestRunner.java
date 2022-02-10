package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//@CucumberOptions(strict = true)
@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features="src/test/resources/features",
glue= {"steps"},
plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
