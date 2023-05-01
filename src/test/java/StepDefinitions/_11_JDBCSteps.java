package StepDefinitions;

import Pages.DialogContent;
import Utilites.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send query the database {string} and control match")
    public void sendQueryTheDatabaseAndControlMatch(String query) {

        // DB den lazim olan melumatlari alaq

        ArrayList<ArrayList<String>> dblist = DBUtility.getListData(query);

        DialogContent dc = new DialogContent();
        List<WebElement> UIList = dc.nameList;
        //UI de lazim olan melumatla alaq

        for (int i = 1; i <= dblist.size(); i++) {
            System.out.print(dblist.get(i).get(1).trim());
            System.out.println("\t" + UIList.get(i).getText().trim());

            Assert.assertEquals(
                    dblist.get(i).get(1).trim(),
                    UIList.get(i).getText().trim());
        }

    }
}
