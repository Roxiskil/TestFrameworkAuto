package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\TestAutomationFramework/src/test/resources/executables/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        driver.close();


    }
}
