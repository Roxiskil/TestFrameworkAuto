package pageobjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseMain {
    public ChromeDriver driver;
    public BaseMain (ChromeDriver driver){

        this.driver = driver;
    }
    @BeforeTest
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
        SignUpPage signUpPage = new SignUpPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

