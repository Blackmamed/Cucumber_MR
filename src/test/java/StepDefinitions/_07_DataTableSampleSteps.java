package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _07_DataTableSampleSteps {

    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println("Username = " + username);
    }

    @And("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println("username = " + username + "; password= " + password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elements) {

        List<String> listelements = elements.asList(String.class);

        for (String el : listelements)
            System.out.println("Name = " + el);

    }

    @And("Write username and password as DataTable")
    public void writeUsernameAndPasswordAsDataTable(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {

            System.out.println(
                    "Name= " + listelements.get(i).get(0)
                            + "; password= " + listelements.get(i).get(1));

        }

    }

    @And("Write number, username and password as DataTable")
    public void writeNumberUsernameAndPasswordAsDataTable(DataTable elements) {
        List<List<String>> listelements = elements.asLists(String.class);

        for (int i = 0; i < listelements.size(); i++) {

            System.out.println("N= " + listelements.get(i).get(0)
                    + "; Name= " + listelements.get(i).get(1)
                    + "; password= " + listelements.get(i).get(2));

        }
    }
}
