package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

public class HomePage extends BaseMain {
    public HomePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //homework-9

    //URLs
    String websiteURL = "https://test.my-fork.com";

    //GUI elements XPaths
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String signUp_Btn = "//div[@id='sign-up-button']";
    String linkCourseGallery = "//div[text()='Course Gallery']/..";

    public void openWebsite() {
        driver.get(websiteURL);
    }

    public void openSignUpPage() {
        driver.findElement(By.xpath(signUp_Btn)).click();
    }
    public void openSignInPage() {
        driver.findElement(By.xpath(signIn_Btn)).click();
    }
    public void openCourseGalleryPage() {
        driver.findElement(By.xpath(linkCourseGallery)).click();
    }
    public void returnMainPageAfterLogIn() {
        driver.get(websiteURL);
    }

    String urlBestBuy = "http://bestbuy.com";
    String skuCardsLocator = "//div[@data-testid='sku-card']/a/p";
    String urlStores = "https://www.c21stores.com/";
    String urlAmazon = "https://www.amazon.com/";
    public void openHomePage() {
        driver.get(websiteURL);
    }

    public List<Integer> websiteURLVerification() {
        return verifyLinkActive();
    }
    /* public void openWebsite() {
        driver.get(urlStores);
    }
    public List<Integer> urlStoresVerification() {
        return verifyLinkActive();
    }

    public void openMainPage() {
        driver.get(urlAmazon);

        public List<Integer> urlAmazonVerification () {
            return verifyLinkActive();*/


    public void ValidateSkuCards() {
        WebElement element = driver.findElement(By.xpath(skuCardsLocator));
        System.out.println(element.getText());
        System.out.println("____________-");
        List<WebElement> skuCards = driver.findElements(By.xpath(skuCardsLocator));
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + skuCards.get(i).getText());
        }
    }

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
    public void clickSignUp() throws InterruptedException {
        driver.get(websiteURL);
        Thread.sleep(2000);
        driver.findElement(By.xpath(signUp_Btn)).click();
    }
}




