package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }
    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    public void clickSignIn(){
        driver.get(websiteURL);
        driver.findElement (By.xpath(logIn_Btn)).click();
        Thread.sleep(2000);
        driver.findElement (By.xpath(signIn_Btn)).click();

    }
}
