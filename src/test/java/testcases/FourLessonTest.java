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

public class FourLessonTest extends BaseTest{
    public Locators locators = new Locators();
    protected String websiteURL = "https://test.my-fork.com";
    public String emailTxtField = "//input[@id='email']";
    public String passwordTxtField = "//input[@id='password']";

    public String emailValue = "roxiskil@gmail.com";
    public String passwordValue = "roxiskil123";
    public void takeMeToSignInPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.findElement(locators.logIn_Btn).click();
        Thread.sleep(2000);
        driver.findElement (locators.signIn_Btn).click();
    }
    public void fillUpCredentials(String email, String password) {
        driver.findElement(By.xpath(emailTxtField)).sendKeys(email);
        driver.findElement(By.xpath(passwordTxtField)).sendKeys();
    }
    @Test
    public void openWebsite() {
        driver.get(websiteURL);
    }
    @Test
    public void openSignInPage() throws InterruptedException {

        homePage.clickSignIn();
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
}

