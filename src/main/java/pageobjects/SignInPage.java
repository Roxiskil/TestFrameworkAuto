package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class SignInPage extends BaseMain{

    public SignInPage (WebDriver driver, Logger log) {
        super(driver, log);
    }

    //homework-9
    String websiteURL = "https://test.my-fork.com";
    String webpageURL = "https://test.my-fork.com/quizzes-list";
    String emailValue = "testing@my-fork.com";
    String passwordValue = "Password";
    String emailField = "//input[@id='email']";
    String passwordField = "//input[@id='password']";
    String history = "//a[text()='History']";
    String history_Btn = "//a[@class='quiz-section-history-button']";
    boolean expectedHistory = false;
    boolean actualHistory;

    public void signInAndValidateHistory() {
        driver.get(websiteURL);
        driver.findElement(By.xpath(emailField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).submit();
        driver.navigate().to(webpageURL);
        WebDriverWait waitForPageToLoad = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitForPageToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(history_Btn)));
        System.out.println(driver.findElement(By.xpath(history_Btn)).isDisplayed());
        expectedHistory = driver.findElement(By.xpath(history)).isDisplayed();
        /*SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualHistory, expectedHistory);
        System.out.println("This functionality is unavailable");
        softAssert.assertAll();*/
    }
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    public void fillTheSignInForm()throws InterruptedException{
        driver.get(websiteURL);
        clickUsingXpath(signIn_Btn, "Sign in button");
        typeUsingXpath(emailTxtField, "email text field", emailValue);
        typeUsingXpath(passwordTxtField, "password text field", passwordValue);
        clickUsingXpath(logIn_Btn, "Sign in button");
        clickUsingXpathAfterWait(logIn_Btn,"Login button");
    }
}
       /* driver.findElement(By.xpath(emailTxtField)).sendKeys(emailValue);
       log.info("Email value was entered successfully");
       driver.findElement(By.xpath(passwordTxtField)).sendKeys(passwordValue);
       log.info("Password value was entered successfully");
       driver.findElement(By.xpath(logIn_Btn)).submit();
       log.info("Login button clicked successfully");*/

