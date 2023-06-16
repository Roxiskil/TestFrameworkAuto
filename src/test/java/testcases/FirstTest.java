package testcases;

import org.openqa.selenium.By;
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

    driver.findElement(By.xpath(xpathExpression: "//span[text()='Account']")).click();

}