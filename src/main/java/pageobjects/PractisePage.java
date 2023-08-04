package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisePage extends PractiseBaseMain {

    public PractisePage (ChromeDriver driver){
        super(driver);
    }
    public ChromeDriver driver;

    protected String websiteURL = "https://test.my-fork.com";
    protected String webpageURL = "https://test.my-fork.com/quizzes-list";
    String history = "//div[@id='bodyInfoPopup']";
    String history_Btn = "//a[@class='quiz-section-history-button']";
    String emailField = "//input[@id='email']";
    String passwordField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    //values:
    String emailValue = "testing@my-fork.com";
    String passwordValue = "Password";

    public void openWebsite() {

        driver.get(websiteURL);
    }

    public void openCourseGallery() {
        driver.get(this.webpageURL);
    }

    public void historyUnavailable() {
        driver.get(this.webpageURL);
    }

    public void returnMainPage() {
        driver.get(websiteURL);
    }

    public void signInAndValidateHistory(){
        driver.get(websiteURL);
        driver.findElement(By.xpath(emailField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).submit();

        driver.navigate().to(webpageURL);
        System.out.println(driver.findElement(By.xpath(history_Btn)).isDisplayed());
    }
}

