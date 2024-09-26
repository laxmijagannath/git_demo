package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature/google.feature"},glue={"StepDefinitions"},
plugin = { "pretty",
		"html:target/report/cucumber.html", "json:target/report/cucumber.json" },
monochrome=true)
public class Testrunner {

}
