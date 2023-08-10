package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class CheckboxPage extends BaseMain {

    public CheckboxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    String logIn_Btn = "//div[@id='loginButton']/button']";
    String rememberMe_Checkbox = "//input[@id='auth-page-remember-me']";


    public void validateRememberMeCheckbox() throws InterruptedException {

        Thread.sleep(1000L);
        driver.findElement(By.xpath(logIn_Btn)).click();
        driver.findElement(By.xpath(rememberMe_Checkbox)).isSelected();

    }
}
