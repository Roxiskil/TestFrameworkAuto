package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class SignInPage extends BaseMain{

    public SignInPage (WebDriver driver, Logger log) {
        super(driver, log);
    }
    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";
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

