package PageObjects;

import AbstractComponent.WebCoreElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends WebCoreElement {


    WebDriver driver;
    public BasePage(WebDriver driver, WebElement sectionElement) {
        super(driver, sectionElement);
    }


}
