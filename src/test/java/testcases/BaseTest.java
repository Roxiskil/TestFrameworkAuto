package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class BaseTest {

  public ChromeDriver driver;
  HomePage homePage;
  SignInPage signInPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
