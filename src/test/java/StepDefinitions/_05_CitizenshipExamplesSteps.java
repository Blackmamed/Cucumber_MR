package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.When;

public class _05_CitizenshipExamplesSteps {

    DialogContent dc = new DialogContent();

    @When("User a Citizenship name as {string} shortname as {string}")
    public void userACitizenshipNameAsShortnameAs(String name, String shortname) {

        dc.clickFunction(dc.addPlusBtn);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.shortName, shortname);
        dc.clickFunction(dc.saveBtn);
    }

    @When("User delete name {string}")
    public void userDeleteName(String name) {
        dc.deleteItem(name);
//        dc.sendKeysFunction(dc.nameSearchInput, name);
//        dc.clickFunction(dc.searchBtn);
//        dc.clickFunction(dc.deleteBtn);
//        dc.clickFunction(dc.deleteBtn1);
    }
}
