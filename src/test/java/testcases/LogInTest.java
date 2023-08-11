package testcases;

import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

    @Test
    public void loginFunctionalityValidation() throws InterruptedException{
        signInPage.fillTheSignInForm();
    }
}

