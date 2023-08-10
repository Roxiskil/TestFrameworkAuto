package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pageobjects.*;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BaseTest {

  public WebDriver driver;

  Logger log;
  HomePage homePage;
  SignInPage signInPage;
  InvalidDataPage invalidDataPage;
  ErrorValidationPage errorValidationPage;
  SignUpPage signUpPage;
  CheckboxPage checkboxPage;

  PractisePage practisePage;
  BestBuyMainPage bestBuyMainPage;
    @BeforeMethod(groups = {"sign", "login", "checkbox", "dropbox"}, alwaysRun = true)
    public void setUp() throws IOException {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        log = Logger.getLogger(getClass().getName());
        saveLogs(log);
        homePage = new HomePage(driver, log);
        signInPage = new SignInPage(driver, log);
        invalidDataPage = new InvalidDataPage(driver, log);
        errorValidationPage = new ErrorValidationPage(driver, log);
        checkboxPage = new CheckboxPage(driver, log);
        signUpPage = new SignUpPage(driver, log);
        practisePage = new PractisePage(driver, log);
        bestBuyMainPage = new BestBuyMainPage(driver, log);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    @AfterMethod(groups = {"sign", "login", "checkbox", "dropbox"}, alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    public void saveLogs(Logger log) throws IOException {
        FileHandler fileHandler;
        fileHandler = new FileHandler("C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\MyLogs.log");
        log.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        log.info("This is the beginning of the test suit");
    }
    }

