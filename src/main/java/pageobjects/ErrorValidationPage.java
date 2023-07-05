package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorValidationPage extends BaseMain {

    public ErrorValidationPage(ChromeDriver driver) {
        super(driver);
    }

    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String logIn_Error = "//p[@text-point='login-error']/..";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    public void validateError();{
        driver.findElement(By.xpath(logIn_Btn)).click();
        driver.findElement(By.xpath(emailTxtField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordTxtField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).sendKeys(new CharSequence[]{Keys.ENTER});
        Thread.sleep(3000L);
        driver.findElement(By.xpath(logIn_Error)).getText();

        }
}
