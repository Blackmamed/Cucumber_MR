package Pages;

import Utilites.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    // Left side's menus here

    public LeftNav() { // Nav ---> Navigator demekdir
        PageFactory.initElements(GWD.
                getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    public WebElement country;

    @FindBy(xpath = "//span[text()='States']")
    public WebElement states;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenship;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees'][1]")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExam1;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExam2;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupEntEx;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "country":
                return country;
            case "citizenship":
                return citizenship;
            case "nationalities":
                return nationalities;
            case "fees":
                return fees;
            case "entranceExam1":
                return entranceExam1;
            case "entranceExam2":
                return entranceExam2;
            case "setupEntEx":
                return setupEntEx;
            case"states":return states;

        }
        return null;
    }
}


//Feature: Head "Add User"
//
//        Background:
//        Given Navigate to OrangeHRM
//        When Enter username and password correctly then click login button
//        Then User should login successfully
//        And User clicks Admin Tab on the menu and navigates User Management Page
//        When Click on the Addbutton
//
//        Scenario: “Add User” heading is displayed
//        When  user verify that “Add User” heading is displayed

//public class UserStory11Steps {
//
//    DialogItems di = new DialogItems();
//
//    @When("user verify that “Add User” heading is displayed")
//    public void userVerifyThatAddUserHeadingIsDisplayed() {
//        di.verifyElementDisplayed(di.addUserMessaj);
//    }
//}

//
//    @FindBy(xpath = "//h6[text()='Add User']")
//    public WebElement addUserMessaj;
//}


//    @FindBy(xpath = "(//span[text()='Setup'])[1]")
//    private WebElement setup;
//
//    @FindBy(xpath = "//span[text()='Parameters']")
//    private WebElement parameters;
//
//    @FindBy(xpath = "//span[text()='Human Resources']")
//    private WebElement humanResources;
//
//    @FindBy(xpath = "(//span[text()='Setup'])[3]")
//    private WebElement setupHumanResources;
//
//    @FindBy(xpath = "//span[text()='Position Categories']")
//    private WebElement positionCategories;
//
//    @FindBy(xpath = "(//span[text()='Attestations'])[1]")
//    private WebElement attestations;
//
//    @FindBy(xpath = "//span[text()='Grade Levels']")
//    private WebElement grandLevels;
//
//
//    public WebElement getWebElement(String Button) {
//
//        switch (Button) {
//            case "humanResources":
//                return humanResources;
//            case "setupHumanResources":
//                return setupHumanResources;
//            case "positionCategories":
//                return positionCategories;
//            case "attestations":
//                return attestations;
//            case "setup":
//                return setup;
//            case "parameters":
//                return parameters;
//            case "grandLevels":
//                return grandLevels;
//
//
//            default:
//                return null;
//        }
//
//    }

//
//Feature: Add Grade Levels Functionality
//
//        Background:
//        Given Navigate to Campus
//        When Enter username and password and click login button
//        Then User should login succesfully
//
//        Scenario: Admin User should be able to Add Grade Levels
//
//        And click on the element in LeftNav
//        | setup       |
//        | parameters  |
//        | grandLevels |
//        And click on the element in Dialog
//| addGradeLevels |