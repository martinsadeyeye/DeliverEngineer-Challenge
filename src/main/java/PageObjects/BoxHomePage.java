package PageObjects;
import LayoutComponent.HeaderSection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoxHomePage extends BasePage {

    By headerSection = By.id("site-header");

    public BoxHomePage(WebDriver driver, WebElement sectionElement) {
        super(driver, sectionElement);
        this.driver = driver;
       this.sectionElement = sectionElement;
    }


    public HeaderSection getHeadersection() {

        return new HeaderSection(driver, sectionElement);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }


}