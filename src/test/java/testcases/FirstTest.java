//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest{
    public ChromeDriver driver;
    public Locators locators = new Locators();
    protected String websiteURL = "https://test.my-fork.com";

    public FirstTest() {
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.driver = new ChromeDriver(options);
    }

    public void takeMeToSignInPage() throws InterruptedException {
        this.driver.get(this.websiteURL);
        this.driver.findElement(this.locators.logIn_Btn).click();
        Thread.sleep(1000L);
        this.driver.findElement(this.locators.signIn_Btn).click();
    }

    public void fillUpCredentials(String email, String password) {
        this.driver.findElement(By.xpath("//input[@type='email']")).sendKeys(new CharSequence[]{"email"});
        this.driver.findElement(By.xpath("//input[@type='password']")).sendKeys(new CharSequence[]{"password"});
    }

    //@Test
    public void openWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(this.websiteURL);
    }

    //@Test
    public void openSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(this.websiteURL);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
    }

    //@Test
    public void validateEmailPasswordLogInDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(this.websiteURL);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(new CharSequence[]{"roxiskil@gmail.com"});
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(new CharSequence[]{"roxiskil123"});
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).isDisplayed();
    }

    @Test
    public void fillInvalidEmailAndPasswordAndPressEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        String logIn_Btn = "//div[@id='loginButton']/button']";
        String signIn_Btn = "//a[@class='menu-item log-in-button']";

        driver.get(this.websiteURL);
        driver.findElement(By.xpath(logIn_Btn)).click();
        WebDriverWait waitForDropdownToLoad = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitForDropdownToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logIn_Btn)));
        driver.findElement(By.xpath(logIn_Btn)).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(new CharSequence[]{"roxiskil123"});
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(new CharSequence[]{"123roxiskil"});
        driver.findElement(By.xpath("//button[text()='Log In']")).sendKeys(new CharSequence[]{Keys.ENTER});
    }

    //@Test
    public void EmailAndPasswordFieldsAndValidateError() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);

        String logIn_Btn = "//div[@id='loginButton']/button']";
        String signIn_Btn = "//a[@class='menu-item log-in-button']";

        driver.get(this.websiteURL);
        driver.findElement(By.xpath(logIn_Btn)).click();
        WebDriverWait waitForDropdownToLoad = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitForDropdownToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(logIn_Btn)));
        driver.findElement(By.xpath(logIn_Btn)).click();

        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(new CharSequence[]{"roxiskil123"});
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(new CharSequence[]{"123roxiskil"});
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(new CharSequence[]{Keys.ENTER});
    }

    @Test
    public void validateRememberMeCheckboxTextSelectedByDefault() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(this.websiteURL);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
    }
}
