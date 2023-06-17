package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class FirstTest {
    @Test
    public void startDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://mvnrepository.com/open-source/testing-frameworks");
    }
    @Test
public void openWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");
    }
    @Test
public void openSignInPage(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

    driver.findElement(By.xpath("//span[text()='Account']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
    }
    @Test
    public void fillEmailAndPasswordFields(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://bestbuy.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()=''Sign In]")).submit();
    }

    @Test
public void fillEmailAndPasswordAndPressEnter(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

    driver.findElement(By.xpath("//span[text()='Account']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();

    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
    driver.findElement(By.xpath("//button[text()=''Sign In]")).sendKeys(Keys.ENTER);
    }

    @Test
public void fillEmailAndPasswordFieldsAndValidateError(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

    driver.findElement(By.xpath("//span[text()='Account']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();

    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
    driver.findElement(By.xpath("//button[text()=''Sign In]")).sendKeys(Keys.ENTER);
    Thread.sleep(3000);
    System.out.println(driver.findElement(By.xpath("//div[@aria-label='Error']")).isDisplayed());
    }

    @Test
public void fillEmailAndPasswordFieldsAndValidateCheckbox(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

    driver.findElement(By.xpath("//span[text()='Account']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
    System.out.println(driver.findElement(By.id("cia-remember-me")).isSelected());
    }

    @Test
public void verifyCheckboxText(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

    driver.findElement(By.xpath("//span[text()='Account']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@data-lid='ubr_mby_signin_b']")).click();
    System.out.println(driver.findElement(By.xpath("//label[@for='cia-remember-me']")).getText());
    }

    @Test
public void isEnabled()throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    ChromeDriver driver = new ChromeDriver(options);
    driver.get("http://bestbuy.com");

   driver.findElement(By.xpath("//h3[text()='Everyday Banking']")).click();
   Thread.sleep(1000);
   System.out.println(driver.findElement(By.xpath("//button[text()='Cancel' and @href='javascript:void(0);']")).isEnabled());
   System.out.println(driver.findElement(By.xpath("//button[@id='nextBtnSubTopic']")).isEnabled());
    }



    @Test
    public void openWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");
    }

    @Test
    public void openSignInPage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
    }

    @Test
    public void validateEmailAndPasswordFields(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("roxiskil@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("roxiskil123");
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).submit();
    }

    @Test
    public void fillInvalidEmailAndPasswordAndPressEnter(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("roxiskil123");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123roxiskil");
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(Keys.ENTER);
    }

    @Test
    public void fillEmailAndPasswordFieldsAndValidateError(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("roxiskil123");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123roxiskil");
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@class='test-login-errors']")).isDisplayed());
    }

    @Test
    public void validateRememberMeCheckboxTextCheckedByDefault(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.my-fork.com");

        driver.findElement(By.xpath("//span[text()='Account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).getText());
    }