package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.*;

import java.time.Duration;

public class PractiseBaseTest {

    public ChromeDriver driver;
    PractisePage practisePage;

    @BeforeMethod
    public void practiseTests () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);

        practisePage = new PractisePage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

