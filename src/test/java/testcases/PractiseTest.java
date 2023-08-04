package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.PractisePage;

public class PractiseTest extends BaseTest {

        public ChromeDriver driver;

    protected String websiteURL = "https://test.my-fork.com";
    protected String webpageURL = "https://test.my-fork.com/quizzes-list";
    String history = "//div[@id='bodyInfoPopup']";
    String history_Btn = "//a[@class='quiz-section-history-button']";
    boolean expectedHistory = false;
    boolean actualHistory;

    @Test
    public void openMainPage() {
        HomePage homePage = new HomePage(driver);
        homePage.openWebsite();
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

   /* @Test
    public void ValidateMenuItems() {

        List<Object> menuItem = new ArrayList<>();
        menuItem.add("Development");
        menuItem.add("Testing");
        menuItem.add("Business Analysis");
        menuItem.add("Agile");
        menuItem.add("Project Management");

        System.out.println(menuItem);
        System.out.println(menuItem.size());

        searchDropdownElement = driver.findElement(By.id("job-title"));
        Select searchDropdown = new Select(searchDropdownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropdown.getOptions();
        int listSize = options.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println(options.get(i).getText());
        }
    }*/

}


