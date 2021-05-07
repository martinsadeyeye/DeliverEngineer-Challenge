package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    By emailAddress = By.id("login-email");
    By nextButton = By.id("login-submit");
    By loginPassword = By.id("password-login");
    By submit = By.id("login-submit-password");


    public LoginPage(WebDriver driver, WebElement sectionElement) {
        super(driver, sectionElement);
    }

    public void login (String username, String password){
       findElement(emailAddress).sendKeys(username);
       doClick(nextButton);
       findElement(loginPassword).sendKeys(password);
       doClick(submit);
    }




}
