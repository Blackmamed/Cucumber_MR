package Pages;

import Utilites.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(),
            Duration.ofSeconds(25));

    public void sendKeysFunction(WebElement element, String text) {

        //gözükene kadar bekle
        //scroll olana kadra bekle
        //içini temizle
        //yazıyı gönder

        waitUntilVisibility(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);

    }

    public void clickFunction(WebElement element) {

        //tıklatılabilir olana kadar bekle
        //scroll olana kadar bekle
        //elemente click

        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void clickFunctionStalenless(WebElement element){

        waitUntilStalenessOf(element);
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public void waitUntilVisibility(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public void waitUntilStalenessOf(WebElement element) {

       wait.until(ExpectedConditions.stalenessOf(element));

    }

    public void verifyContainsTextFunction(WebElement element, String value) {

        wait.until(ExpectedConditions.textToBePresentInElement
                (element, value));
        Assert.assertTrue(element.getText().toLowerCase().
                contains(value.toLowerCase()), "NoSuchText");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
                 // acik dialoq qutusu varsa baglayir
    }

}
