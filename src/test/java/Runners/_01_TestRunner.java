package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature"},
        //buraya feature faylin pathi yazilir
        glue = {"StepDefinitions"}
        // Step definitionun classi yazilir
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
