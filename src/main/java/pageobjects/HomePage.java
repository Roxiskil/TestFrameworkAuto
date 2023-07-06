package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain {

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String logIn_Error = "//p[@text-point='login-error']/..";
    String rememberMe_Checkbox = "//input[@id='auth-page-remember-me']";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    public void clickSignIn() throws InterruptedException {
        driver.get(websiteURL);
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_Btn)).click();

    }
}


