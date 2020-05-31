package tests;

import lib.BaseWebTesting;
import lib.MyTestngListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

@Listeners(MyTestngListener.class)
public class ExampleFileTest extends BaseWebTesting {

    @Test
    public void enterPage() {
        System.out.println("Test page");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Polska\n"); // send also a "\n"
        element.submit();

    }

    @Test
    public void nextPage() {
        System.out.println("Next test page");
    }
}