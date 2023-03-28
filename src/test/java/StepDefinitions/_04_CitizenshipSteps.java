package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenship);

    }
    @When("User a Citizenship name as{string} shortname as {string}")
    public void userACitizenshipNameAsShortnameAs(String name,
                                                  String shortname) {
        dc.clickFunction(dc.addPlusBtn);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.shortName, shortname);
        dc.clickFunction(dc.saveBtn);
    }


    @Then("Already exist message should be displeyed")
    public void alreadyExistMessageShouldBeDispleyed() {

        dc.verifyContainsTextFunction(dc.alreadyExist, "already");
    }



}
