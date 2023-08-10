package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class InvalidDataPage extends BaseMain {

    public InvalidDataPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    //values

    String incorrectEmailValue = "roxiskil";
    String incorrectPasswordValue = "123";

    public void fillTheSignInFormIncorrectly(){
        driver.findElement(By.xpath(emailTxtField)).sendKeys(incorrectEmailValue);
        driver.findElement(By.xpath(passwordTxtField)).sendKeys(incorrectPasswordValue);
        driver.findElement(By.xpath(logIn_Btn)).submit();
    }
}
