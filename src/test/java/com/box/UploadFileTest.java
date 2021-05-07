package com.box;

import PageObjects.BoxHomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest{


    @Test
    public void verifyFileUploadFunctionality() {
        abstractComponent.getInstance(BoxHomePage.class).getHeadersection().clickLoginButton();
        abstractComponent.getInstance(LoginPage.class).login("adeyeye079@gmail.com","3g4ty5mtVPPnr6t");
        abstractComponent.getInstance(LandingPage.class).uploadFile();

    }


}
