package com.box;

import AbstractComponent.WebCoreElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest {

    File classpathRoot = new File(System.getProperty("user.dir"));
    File driverPath = new File(classpathRoot, "/BrowserDriver/");

    public WebDriver driver;
    public WebDriverWait wait;
    public WebCoreElement abstractComponent;
    public WebElement sectionElement;
    public static String appUrl = "https://www.box.com/";

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.get(appUrl);


        // create the object of page class: Instantiate Page Class
        abstractComponent = new WebCoreElement(driver, sectionElement);
    }

    @AfterMethod
    public void tearDown() {
        if ( driver != null ) {
           driver.quit();
        }
    }

}
