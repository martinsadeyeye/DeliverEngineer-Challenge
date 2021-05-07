package AbstractComponent;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebCoreElement extends Element {

    public WebDriver driver;
    public WebElement sectionElement;
    public WebElement webElement;
    public By findBy;


    public WebCoreElement(WebDriver driver, WebElement sectionElement) {
        this.driver = driver;
        this.sectionElement = sectionElement;
    }

    // create a method with Java Generics and return a new page
    public <TestPage extends BasePage> TestPage getInstance(Class<TestPage> pageClass) {
        try {
            return pageClass.getDeclaredConstructor(WebDriver.class, WebElement.class)
                    .newInstance(this.driver, this.sectionElement);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void doClick(By locator) {
        driver.findElement(locator).click();
    }

    public WebElement findSectionElement(By findElementBy) {

        return sectionElement.findElement(findElementBy);
    }

    public List<WebElement> findSectionElements(By findElementBy) {

        return sectionElement.findElements(findElementBy);
    }

    public void waitForElementToDisappear(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
    }

    public WebElement waitAndFindElement(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 100);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public List<WebElement> waitAndFindElements(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(findBy));
    }

    public void waitToBeClickable(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(findBy));
    }

    @Override
    public By getBy() {
        return findBy;
    }

    @Override
    public String getText() {
        return webElement.getText();
    }

    @Override
    public Boolean isEnabled() {
        return webElement.isEnabled();
    }

    @Override
    public Boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    @Override
    public void typeText(String text) {
        webElement.click();
        webElement.sendKeys(text);
    }

    @Override
    public void click() {
        waitToBeClickable(findBy);
        webElement.click();
    }

    @Override
    public String getAttribute(String attributeName) {
        return webElement.getAttribute(attributeName);
    }
}
