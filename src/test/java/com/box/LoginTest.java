package com.box;

import PageObjects.BoxHomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test(priority = 1)
    public void verifyTheAppUrl() {

        String currentUrl = abstractComponent.getInstance(BoxHomePage.class).getCurrentUrl();
        Assert.assertTrue(currentUrl.startsWith("https"));
        Assert.assertEquals(appUrl, currentUrl);

        if (currentUrl.startsWith("https")) {
            System.out.println("Current Url is secured");
        } else {
            System.out.println("The CurrentUrl is not secured");
        }


    }

    @Test(priority = 2)
    public void verifyLoginWithValidCredential() {

        abstractComponent.getInstance(BoxHomePage.class).getHeadersection().clickLoginButton();
        abstractComponent.getInstance(LoginPage.class).login("adeyeye079@gmail.com","3g4ty5mtVPPnr6t");
    }


}