package com.box;

import PageObjects.BoxHomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateFolderTest extends BaseTest {

    @Test
    public void verifyCreateFolderFunctionality() {
        abstractComponent.getInstance(BoxHomePage.class).getHeadersection().clickLoginButton();
        abstractComponent.getInstance(LoginPage.class).login("adeyeye079@gmail.com","3g4ty5mtVPPnr6t");
        abstractComponent.getInstance(LandingPage.class).createFolder("ChallengeBox","challengebox@gmail.com");

    }
}
