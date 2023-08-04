package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.PractisePage;

import java.util.ArrayList;
import java.util.List;

public class PractiseTest extends BaseTest {

    public ChromeDriver driver;

    protected String websiteURL = "https://test.my-fork.com";
    protected String webpageURL = "https://test.my-fork.com/quizzes-list";
    String history = "//div[@id='bodyInfoPopup']";
    String history_Btn = "//a[@class='quiz-section-history-button']";
    boolean expectedHistory = false;
    boolean actualHistory;
    String areaOfExpertise = "///div[@class=\"expertise-areas-list\"]//div";
    int areaOfExpertiseSizeActual;
    int areaOfExpertiseSizeExpected = 5;

    @Test
    public void openMainPage() {
        PractisePage practisePage = new PractisePage(driver);
        practisePage.openWebsite();
    }

    @Test
    public void openCourseGallery() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(webpageURL);

        PractisePage practisePage = new PractisePage(driver);
        practisePage.openCourseGallery();
    }

    @Test
    public void validateHistoryUnavailable() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(webpageURL);

        PractisePage practisePage = new PractisePage(driver);
        practisePage.historyUnavailable();
        expectedHistory = driver.findElement(By.xpath(history)).isDisplayed();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualHistory, expectedHistory);
        System.out.println("This functionality is unavailable");
        softAssert.assertAll();
    }

    @Test
    public void returnMainPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(websiteURL);
        PractisePage practisePage = new PractisePage(driver);
        practisePage.returnMainPage();
        driver.navigate().to(websiteURL);
    }

    @Test
    public void signInAndValidateHistory() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(websiteURL);
        driver.findElement(By.xpath("//a[@class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(new CharSequence[]{"testing@my-fork.com"});
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(new CharSequence[]{"Password"});
        driver.findElement(By.xpath("//div[@id='loginButton']/button")).sendKeys(new CharSequence[]{Keys.ENTER});

        driver.navigate().to(webpageURL);
        System.out.println(driver.findElement(By.xpath(history_Btn)).isDisplayed());

       /* PractisePage practisePage = new PractisePage(driver);
        practisePage.openWebsite();
        practisePage.signInAndValidateHistory();*/
    }

    //Scenario_2
    @Test
    public void openMainPageAndCourseGallery() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(websiteURL);
        driver.navigate().to(webpageURL);
    }

    @Test
    public void ValidateMenuItems() {

        List<Object> menuItem = new ArrayList<>();
        menuItem.add("Development");
        menuItem.add("Testing");
        menuItem.add("Business Analysis");
        menuItem.add("Agile");
        menuItem.add("Project Management");

        System.out.println(menuItem);
        System.out.println(menuItem.size());
    }

    @Test
    public void AssertMenuItems() {
        driver.get("https://test.my-fork.com/quizzes-list");
        List<WebElement> elementList = driver.findElements(By.xpath(areaOfExpertise));
        areaOfExpertiseSizeActual = elementList.size();
        Assert.assertEquals(areaOfExpertiseSizeActual, areaOfExpertiseSizeExpected);
    }
}
//Scenario_3

