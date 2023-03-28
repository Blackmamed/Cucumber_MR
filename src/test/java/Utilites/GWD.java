package Utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {  //GeneralWebDriver

    private static WebDriver driver;

    public static WebDriver getDriver() {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) { // bir defe islesin
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) { // dolu ise, bos deyilse
            driver.quit();
            driver = null;
        }
    }
}
