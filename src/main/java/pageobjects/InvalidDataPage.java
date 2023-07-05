package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidDataPage extends BaseMain {

    public InvalidDataPage(ChromeDriver driver) {
        super(driver);
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
