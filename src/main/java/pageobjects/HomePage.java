package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomePage extends BaseMain {

    String urlBestBuy = "http://bestbuy.com";

    String skuCardsLocator = "//div[@data-testid='sku-card']/a/p";

    //  public void openHomePage () {


    public void openBestBuy() {
        driver.get(urlBestBuy);

    }
    public HomePage(ChromeDriver driver) {
        super(driver);

    }

    public void ValidateSkuCards() {
        WebElement element = driver.findElement(By.xpath(skuCardsLocator));
        System.out.println(element.getText());
        System.out.println("____________-");
        List<WebElement> skuCards = driver.findElements(By.xpath(skuCardsLocator));
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + skuCards.get(i).getText());
        }
    }

    String websiteURL = "https://test.my-fork.com";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String logIn_Error = "//p[@text-point='login-error']/..";
    String rememberMe_Checkbox = "//input[@id='auth-page-remember-me']";
    String signUp_Btn = "//div[@id='sign-up-button']";

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




