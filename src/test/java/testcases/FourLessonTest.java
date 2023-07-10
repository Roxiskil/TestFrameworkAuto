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
    @Test
    public void openSignInPage() throws InterruptedException {

        homePage.clickSignIn();
        homePage.clickSignUp();
    }

    @Test
    public void validateEmailPasswordLogInDisplayed() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
    }

    @Test
    public void fillInvalidEmailAndPasswordAndPressEnter() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
        invalidDataPage.fillTheSignInFormIncorrectly();

    }

    @Test
    public void EmailAndPasswordFieldsAndValidateError() throws InterruptedException {

        homePage.clickSignIn();
        signInPage.fillTheSignInForm();
        errorValidationPage.validateError();
    }

    @Test
    public void validateRememberMeCheckboxTextSelectedByDefault() throws InterruptedException {

        homePage.clickSignIn();
        checkboxPage.validateRememberMeCheckbox();
    }

    @Test
    public void openSignUpPage() throws InterruptedException {

        homePage.clickSignUp();


    }
}


