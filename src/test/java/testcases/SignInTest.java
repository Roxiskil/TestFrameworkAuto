package testcases;

import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

    @Test
    public void test() throws InterruptedException{
        signInPage.fillTheSignInForm();
    }
}
