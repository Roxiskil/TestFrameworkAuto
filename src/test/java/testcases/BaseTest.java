package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pageobjects.*;

import java.time.Duration;

public class BaseTest {

  public ChromeDriver driver;

  HomePage homePage;
  SignInPage signInPage;
  InvalidDataPage invalidDataPage;
  ErrorValidationPage errorValidationPage;
  SignUpPage signUpPage;
  CheckboxPage checkboxPage;

  PractisePage practisePage;
    @BeforeMethod(groups = {"sign", "login", "checkbox", "dropbox"}, alwaysRun = true)
    public void setUp() {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        invalidDataPage = new InvalidDataPage(driver);
        errorValidationPage = new ErrorValidationPage(driver);
        checkboxPage = new CheckboxPage(driver);
        signUpPage = new SignUpPage(driver);
        practisePage = new PractisePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    @AfterMethod(groups = {"sign", "login", "checkbox", "dropbox"}, alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
