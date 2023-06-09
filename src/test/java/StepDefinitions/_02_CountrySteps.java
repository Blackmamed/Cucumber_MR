package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps extends Parent {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.country);
    }

    @When("Create a Country")
    public void createACountry() {

        String countryName= RandomStringUtils.randomAlphanumeric(8); // 4 harf
        String countryCode= RandomStringUtils.randomNumeric(4); // 4 rakam
        dc.clickFunction(dc.addPlusBtn);
        dc.sendKeysFunction(dc.nameInput, countryName);
        dc.sendKeysFunction(dc.codeInput, countryCode);
        dc.clickFunction(dc.saveBtn);
    }

    @Then("Success message should be displeyed")
    public void successMessageShouldBeDispleyed() {
        verifyContainsTextFunction(dc.messCountCreatSuccess,
                "success");
    }

    @When("Create a Country name as{string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {

        dc.clickFunction(dc.addPlusBtn);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.codeInput, code);
        dc.clickFunction(dc.saveBtn);

    }

}