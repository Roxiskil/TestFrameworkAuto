package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//homework5
public class SignUpPage extends BaseMain{

    public SignUpPage (ChromeDriver driver){
        super(driver);
    }

    String websiteURL = "https://test.my-fork.com";
    String signUp_Btn = "//div[@id='sign-up-button']";
    String jobTitle = "//select[@id='job-title']";


    public void ValidateJobTitleDropdown() throws InterruptedException {
        driver.findElement(By.xpath(jobTitle)).isSelected();

    }
}

