package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureSet/LoginF.feature",glue={"StepsSet"},
plugin = {"json:target/cucumber.json"},
tags = "@smoke"
)
public class TestRunner {

}
