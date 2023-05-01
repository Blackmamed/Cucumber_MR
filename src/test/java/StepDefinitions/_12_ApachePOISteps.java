package StepDefinitions;

import Pages.DialogContent;
import Utilites.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _12_ApachePOISteps {

    DialogContent dc=new DialogContent();
    @When("User Create citizenship with ApacehPOI")
    public void userCreateCitizenshipWithApacehPOI() {
        ArrayList<ArrayList<String>>tablo= ExcelUtility.
                getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",2);

        for (ArrayList<String>row : tablo){

            dc.clickFunction(dc.addPlusBtn);
            dc.sendKeysFunction(dc.nameInput,row.get(0));
            dc.sendKeysFunction(dc.nameInput,row.get(1));
            dc.clickFunction(dc.saveBtn);
            dc.verifyContainsTextFunction(dc.messCountCreatSuccess,"success");
        }
    }

    @Then("User Delete citizenship with ApacehPOI")
    public void userDeleteCitizenshipWithApacehPOI() {

        ArrayList< ArrayList<String> > tablo=
                ExcelUtility.getData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen",1);

        for(ArrayList<String> row: tablo){
            dc.deleteItem(row.get(0));
        }

    }
}
