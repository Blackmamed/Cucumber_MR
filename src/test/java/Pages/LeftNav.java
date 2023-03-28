package Pages;

import Utilites.GWD;
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

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenship;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;


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
        }
        return null;
    }
}
