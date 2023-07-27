package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class FourLessonTest extends BaseTest {
    @Test (priority = 1, groups = "sign")
    public void openSignInPage() throws InterruptedException {

        homePage.clickSignIn();
        homePage.clickSignUp();
    }

    @Test (priority = 3, groups = "login")
    public void validateEmailPasswordLogInDisplayed() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
    }

    //@Test
    public void fillInvalidEmailAndPasswordAndPressEnter() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
        invalidDataPage.fillTheSignInFormIncorrectly();

    }

    //@Test
    public void EmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
        errorValidationPage.validateError();
    }

    @Test (priority = 2, groups = "checkbox")
    public void validateRememberMeCheckboxTextSelectedByDefault() throws InterruptedException {

        homePage.clickSignIn();
        checkboxPage.validateRememberMeCheckbox();
    }

    @Test (priority = 4, groups = "sign")
    public void openSignUpPage() throws InterruptedException {

        homePage.clickSignUp();

    }
}


