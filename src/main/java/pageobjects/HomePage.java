package pageobjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }

    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    public void clickSignIn(){
        driver.findElement(locators.logIn_Btn).click();
        Thread.sleep(2000);
        driver.findElement (locators.signIn_Btn).click();

    }
}
