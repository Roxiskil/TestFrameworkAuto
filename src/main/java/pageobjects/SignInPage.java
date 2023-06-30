package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage extends BaseMain{

    public HomePage(ChromeDriver driver){
        super(driver);
    }

    String emailTxtField = "//input[@id='email']";
    String passwordTxtField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";

    //values
    String emailValue = "roxiskil@gmail.com";
    String passwordValue = "roxiskil123";

    public void fillTheSignInForm(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(new CharSequence[]{"roxiskil123"});
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(new CharSequence[]{"123roxiskil"});
        driver.findElement(By.xpath("//button[text()='Log In']")).sendKeys(new CharSequence[]{Keys.ENTER});
    }
}
