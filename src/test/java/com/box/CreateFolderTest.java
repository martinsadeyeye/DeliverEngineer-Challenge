package com.box;

import PageObjects.BoxHomePage;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class CreateFolderTest extends BaseTest {


    public static final String SIGNUP_TEXT_AFTER_LOGOUT = "Sign Up";

    @Test
    public void verifyCreateFolderFunctionality() {
        abstractComponent.getInstance(BoxHomePage.class).getHeadersection().clickLoginButton();
        abstractComponent.getInstance(LoginPage.class).login("adeyeye079@gmail.com","3g4ty5mtVPPnr6t");
        abstractComponent.getInstance(LandingPage.class).createFolder("ChallengeBox","challengebox@gmail.com");


       /* String signUpText = abstractComponent.getInstance(LandingPage.class).getSignUpText();

        if (signUpText.equals(SIGNUP_TEXT_AFTER_LOGOUT))
        {
            System.out.println("I successfully logged out of Box application");
        }else{
            System.out.println("Logout functionality failed");
        }*/


    }
}
