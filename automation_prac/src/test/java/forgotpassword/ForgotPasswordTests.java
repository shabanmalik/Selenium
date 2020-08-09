package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.*;


public class ForgotPasswordTests extends BaseTests{

    @Test
    public void testForgotPwd(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPwd();
        forgotPasswordPage.setEmail("malik@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieveButton();
        assertTrue(emailSentPage.getEmailMsg()
                .contains("Your e-mail's been sent!"),
                "Test Failed,Email not sent.");
    }
}
