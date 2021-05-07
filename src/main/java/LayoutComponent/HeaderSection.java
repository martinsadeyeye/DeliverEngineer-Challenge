package LayoutComponent;

import AbstractComponent.WebCoreElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderSection extends WebCoreElement {
     WebDriver driver;

    By loginButton = By.xpath("//a[contains(text(),'Log in')]");

    public HeaderSection(WebDriver driver, WebElement sectionElement) {
        super(driver, sectionElement);
    }

    public void clickLoginButton() {

      waitAndFindElement(loginButton).click();
    }

}
