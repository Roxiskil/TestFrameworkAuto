package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

//homework5
public class SignUpPage extends BaseMain {

    public SignUpPage (WebDriver driver, Logger log) {
        super(driver, log);
    }

    String websiteURL = "https://test.my-fork.com";
    String signUp_Btn = "//div[@id='sign-up-button']";
    String jobTitle = "//select[@id='job-title']";


    public void ValidateJobTitleDropdown() throws InterruptedException {
        driver.get(websiteURL);
        driver.findElement(By.xpath(jobTitle)).isSelected();

    }

    public void openSignUpPage() throws InterruptedException {
        driver.get(websiteURL);
        driver.findElement(By.xpath(signUp_Btn)).click();
    }
}

