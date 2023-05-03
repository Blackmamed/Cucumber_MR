package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",

        features = {"src/test/java/FeatureFiles"},

        glue = {"StepDefinitions"},

        plugin= {"json:target/site/cucumber-pretty.json"}
        // Jenkins-de json raporu ucun
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
