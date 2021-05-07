package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class LandingPage extends BasePage{


    By profileMenu = By.xpath("//span[contains(text(),'MA')]");
    By logoutButton= By.xpath("//span[contains(text(),'Log Out')]");
    By signUpText = By.id("webapp-signup-button");
    By newButton = By.id("menubutton28");
    By folderMenu = By.xpath("//body[1]/div[5]/ul[1]/div[1]/div[1]/div[1]/li[3]");
    By folderName = By.xpath("//body/div[5]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/label[1]/input[1]");
    By emailId = By.tagName("textarea");
    By createButton = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/form/div[3]/button[2]");
    By fileUploadMenu = By.xpath("//*[@id=\"menu27\"]/div/div/div/span/li/span");


    public LandingPage(WebDriver driver, WebElement sectionElement) {
        super(driver, sectionElement);
    }


    public void logOut (){
        findElement(profileMenu).click();
        findElement(logoutButton).click();

    }

    public String getSignUpText()
    {
        return findElement(signUpText).getText();
    }

    public void createFolder(String myFolderName, String emailAddress){
        findElement(newButton).click();
        findElement(folderMenu).click();
        findElement(folderName).sendKeys(myFolderName);
        findElement(emailId).sendKeys(emailAddress);
        findElement(createButton).click();

    }


    public void uploadFile(){
        findElement(newButton).click();
        findElement(fileUploadMenu).click();


    }



}
