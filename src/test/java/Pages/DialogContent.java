package Pages;

import Utilites.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {

    //POM:  Page Object Model

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement nameSearchInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveBtn;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addPlusBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement messCountCreatSuccess;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath = "//span[text()='Search']")
    public WebElement searchBtn;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted'])[1]")
    public WebElement deleteBtn;

    @FindBy(xpath = "(//button[@type='submit' and @tabindex='-1'])/span")
    public WebElement deleteBtn1;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priority;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-option//span)[1]")
    public WebElement academicPeriod2;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLevel1;

    @FindBy(xpath = "(//mat-option/span)[2]")
    public WebElement gradeLevel2;

    @FindBy(xpath = "/tr[contains(@class, 'mat-row')]/td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "(//mat-option/span)[3]")
    public WebElement gradeLevel3;

    @FindBy(xpath = "(//mat-option/span)[4]")
    public WebElement gradeLevel4;

    @FindBy(xpath = "(//mat-option/span)[5]")
    public WebElement gradeLevel5;

    public void deleteItem(String searchText) {

        sendKeysFunction(nameSearchInput, searchText);
        clickFunction(nameSearchInput);
        clickFunction(searchBtn);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.
                xpath("//fuse-progress-bar/*"), 0));
        // //fuse-progress-bar/*  --> 0  olana kimi gozle
        clickFunction(deleteBtn);
        clickFunction(deleteBtn1);

    }

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "addPlusBtn":
                return addPlusBtn;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "saveBtn":
                return saveBtn;
            case "shortName":
                return shortName;
            case "searchBtn":
                return searchBtn;
            case "deleteBtn":
                return deleteBtn;
            case "deleteBtn1":
                return deleteBtn1;
            case "integCode":
                return integCode;
            case "priority":
                return priority;
            case "toggleBar":
                return toggleBar;
            case "academicPeriod1":
                return academicPeriod1;
            case "academicPeriod2":
                return academicPeriod2;
            case "gradeLevel1":
                return gradeLevel1;
            case "gradeLevel2":
                return gradeLevel2;
            case "gradeLevel3":
                return gradeLevel3;
            case "gradeLevel4":
                return gradeLevel4;
            case "gradeLevel5":
                return gradeLevel5;


        }
        return null;
    }
}


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
//
//        And click on the element in Dialog
//        | addGradeLevels |
//
//        And user sending the keys in Dialog Content
//        | nameInput  | ab126 |
//        | shortName  | ab126 |
//        | orderInput | 2     |
//
//        And click on the element in Dialog
//        | nextGradeBtn   |
//        | nextGradeInput |
//        | saveButton     |
//
//        Then success message should be displayed
//
//        Scenario: Admin User should be able to Edit Grade Levels
//
//        And click on the element in LeftNav
//        | setup       |
//        | parameters  |
//        | grandLevels |
//
//        And click on the element in Dialog
//        | editGradeInput |
//
//        And user sending the keys in Dialog Content
//        | orderInput | 2 |
//
//        And click on the element in Dialog
//        | saveButton |
//
//        Then success message should be displayed
//
//        Scenario: Admin User should be able to Delete Grade Levels
//
//        And click on the element in LeftNav
//        | setup       |
//        | parameters  |
//        | grandLevels |
//
//        And click on the element in Dialog
//        | deleteImageBtn  |
//        | deleteDialogBtn |
//
//        Then success message should be displayed
//
//        Scenario: Admin User should have an option to activate and deactivate grade levels.
//
//        And click on the element in LeftNav
//        | setup       |
//        | parameters  |
//        | grandLevels |
//
//        And click on the element in Dialog
//        | slideToggleBtn |
//
//        Then success message should be displayed

//
//    @FindBy(xpath = "(//span[text()='Setup'])[1]")
//    private WebElement setup;
//
//
//    @FindBy(xpath = "(//span[text()='Parameters'])[1]")
//    private WebElement parameters;
//
//    @FindBy(xpath = "//span[text()='Grade Levels']")
//    private WebElement grandLevels;

//  case "setup":
//          return setup;
//          case "parameters":
//          return parameters;
//          case "grandLevels":
//          return grandLevels;


//    @FindBy(xpath = "//ms-add-button[@tooltip='GRADE_LEVELS.TITLE.ADD']")
//    public WebElement addGradeLevels;
//
//    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
//    public WebElement orderInput;
//
//    @FindBy(xpath = "//span[text()='Next Grade']")
//    public WebElement nextGradeBtn;
//
//    @FindBy(xpath = "//mat-option[1]")
//    public WebElement nextGradeInput;
//
//    @FindBy(xpath = "(//tbody//ms-edit-button)[1]")
//    public WebElement editGradeInput;
//
//    @FindBy(xpath = "(//td/mat-slide-toggle)[1]")
//    public WebElement slideToggleBtn;


// case "addGradeLevels":return addGradeLevels;
//         case "orderInput":return orderInput;
//         case "nextGradeBtn":return nextGradeBtn;
//         case "nextGradeInput":return nextGradeInput;
//         case "editGradeInput":return editGradeInput;
//         case "deleteImageBtn":return deleteImageBtn;
//         case "deleteDialogBtn":return deleteDialogBtn;
//         case "slideToggleBtn":return slideToggleBtn;

