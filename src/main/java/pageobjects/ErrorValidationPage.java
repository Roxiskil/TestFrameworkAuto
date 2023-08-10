package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class ErrorValidationPage extends BaseMain {

    public ErrorValidationPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String logIn_Error = "//p[@text-point='login-error']/..";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    public void validateError() throws InterruptedException {
        driver.findElement(By.xpath(logIn_Btn)).click();
        driver.findElement(By.xpath(emailTxtField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordTxtField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).sendKeys(new CharSequence[]{Keys.ENTER});
        Thread.sleep(3000L);
        driver.findElement(By.xpath(logIn_Error)).getText();

        }
}
