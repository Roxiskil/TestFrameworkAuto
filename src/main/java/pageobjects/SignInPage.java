package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage extends BaseMain{

    public SignInPage (ChromeDriver driver){
        super(driver);
    }

    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    public void fillTheSignInForm(){
        driver.findElement(By.xpath(emailTxtField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordTxtField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).submit();
    }
}
