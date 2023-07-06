package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaMethodTest extends BaseTest {

    //locators
    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    @Test
    public void validateEmailPasswordLogInDisplayed() throws InterruptedException {

        driver.get(websiteURL);

        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_Btn)).click();
        driver.findElement(By.xpath(emailTxtField)).sendKeys(new CharSequence[]{"roxiskil@gmail.com"});
        driver.findElement(By.xpath(passwordTxtField)).sendKeys(new CharSequence[]{"roxiskil123"});
        driver.findElement(By.xpath(logIn_Btn)).isDisplayed();
    }
}

