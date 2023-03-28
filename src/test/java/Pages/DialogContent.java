package Pages;

import Utilites.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(xpath = "((//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])/input)[2]")
    public WebElement nameInput;

    @FindBy(xpath = "((//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])/input)[1]")
    public WebElement nameSearchInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//mat-dialog-actions/ms-save-button")
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

        }
        return null;
    }
}
