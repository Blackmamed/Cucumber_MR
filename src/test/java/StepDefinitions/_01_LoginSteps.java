package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilites.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps extends Parent {
    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    DialogContent dc = new DialogContent();

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {


//        WebDriverWait wait = new WebDriverWait(GWD.
//                getDriver(), Duration.ofSeconds(25));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginButton.click();

        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy,
                "Techno Study");

    }
}
