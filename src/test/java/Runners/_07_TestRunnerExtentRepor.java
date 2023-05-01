package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

       tags = "@Regression",

        features = {"src/test/java/FeatureFiles/_01_Login.feature"},

        glue = {"StepDefinitions"},

        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class _07_TestRunnerExtentRepor extends AbstractTestNGCucumberTests {
}
