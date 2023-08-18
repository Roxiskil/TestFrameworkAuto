package pageobjects;

import com.google.common.annotations.VisibleForTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PractisePage extends BaseMain {

    public PractisePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    String websiteURL = "https://test.my-fork.com";
    String webpageURL = "https://test.my-fork.com/quizzes-list";
    String signIn_Btn = "//a[@class='menu-item log-in-button']";
    String history = "//div[@id='bodyInfoPopup']";
    String history_Btn = "//a[@class='quiz-section-history-button']";
    String emailField = "//input[@id='email']";
    String passwordField = "//input[@id='password']";
    String logIn_Btn = "//div[@id='loginButton']/button']";
    String startBtn = "//a[@href='/quiz/run/9']//div";
    String firstQuestionAnswer = "//div[@data-answer-id='3']";
    String nextBtn = "//div[@class='quiz-process-navigations-block-button-next']";

    String progressBar = "//div[@class='quiz-process-progress-progress']";
    String emailValue = "testing@my-fork.com";
    String passwordValue = "Password";
    String domain = "https://test.my-fork.com/";
    String URL = domain + "quiz/661";
    String questionsSQL101 = "//div[@class=\"quiz-process-questions\"]/div";
    String areaOfExpertise = "///div[@class=\"expertise-areas-list\"]//div";
    int areaOfExpertiseSizeActual;
    int areaOfExpertiseSizeExpected = 5;

    int questionsNumberActual;
    int questionsNumberExpected = 9;
    boolean expectedHistory = false;
    boolean actualHistory;
    By numberOfAnsweredQuestions = By.xpath("//div[@class='quiz-process-progress-bar']");

    // scenario 1
    public void openCourseGallery() {
        driver.get(this.webpageURL);
    }
    public void openWebsite() {
        driver.get(websiteURL);
    }
    public void openCourseGalleryPage() {
        driver.get(webpageURL);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\GitHub\\TestFrameworkAuto\\src\\test\\Resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to(webpageURL);
    }
    public void signInAndValidateHistory() {
        driver.get(websiteURL);
        driver.findElement(By.xpath(emailField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).submit();
        driver.navigate().to(webpageURL);
        WebDriverWait waitForPageToLoad = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitForPageToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(history_Btn)));
        System.out.println(driver.findElement(By.xpath(history_Btn)).isDisplayed());
        expectedHistory = driver.findElement(By.xpath(history)).isDisplayed();
        /*SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualHistory, expectedHistory);
        System.out.println("This functionality is unavailable");
        softAssert.assertAll();*/
    }
    public void returnMainPageAfterLogIn() {
        driver.navigate().to(webpageURL);
        driver.navigate().to(websiteURL);
    }
    public void validateHistoryAgain() {
        driver.navigate().to(websiteURL);
        driver.findElement(By.xpath(signIn_Btn)).click();
        driver.findElement(By.xpath(emailField)).sendKeys(emailValue);
        driver.findElement(By.xpath(passwordField)).sendKeys(passwordValue);
        driver.findElement(By.xpath(logIn_Btn)).sendKeys(new CharSequence[]{Keys.ENTER});
        driver.navigate().to(webpageURL);
        WebDriverWait waitForPageToLoad = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitForPageToLoad.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(history_Btn)));
        System.out.println(driver.findElement(By.xpath(history_Btn)).isDisplayed());
    }
    // scenario 2
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

    public void AssertMenuItems() {
        List<WebElement> elementList = driver.findElements(By.xpath(areaOfExpertise));
        areaOfExpertiseSizeActual = elementList.size();
        Assert.assertEquals(areaOfExpertiseSizeActual, areaOfExpertiseSizeExpected);
    }
    public int numberOfAnsweredQuestions() {
        return driver.findElements(numberOfAnsweredQuestions).size();
    }
    public void validateNumberOfAnsweredQuestionsAndTotalNumber() {
        Assert.assertEquals(validateNumberOfAnsweredQuestionsAndTotalNumber(), 1);
        for (int i = 0; i < 9; i++) {
            System.out.println("iteration number: " + i);
            scroll(1600);
            waitForNumberOfAnsweredQuestions(i);
            Assert.assertEquals(numberOfAnsweredQuestions(), i);
        }
    }
        // scenario 3
        public void questionsNumberInSQL101Basic () {
            driver.get(this.webpageURL);
            List<WebElement> elementList = driver.findElements(By.xpath(questionsSQL101));
            questionsNumberActual = elementList.size();
            Assert.assertEquals(questionsNumberActual, questionsNumberExpected);
        }
        public void clickStartButtonAnswerQuestion() {
            driver.get(this.webpageURL);
            driver.findElement(By.xpath(startBtn)).click();
            driver.findElement(By.xpath(firstQuestionAnswer)).click();
        }

    public void clickNextButtonValidateProgressBarValueChanged () {
        driver.get(this.webpageURL);
        driver.findElement(By.xpath(startBtn)).click();
        driver.findElement(By.xpath(firstQuestionAnswer)).click();
        driver.findElement(By.xpath(nextBtn)).click();
                scroll(5000);
                try {
                    waitForNumberOfAnsweredQuestions(11);
                    Assert.assertEquals(numberOfAnsweredQuestions(), 100);
                } catch (Exception e) {
                    Assert.assertEquals(numberOfAnsweredQuestions(), 100);
                }
            }
            public String validateNewChangedValueIsCorrect (int searchProgressBarResult){
                System.out.println(progressBar);
                String progressBarValue = driver.findElement(By.xpath(progressBar)).getText();
                progressBarValue.substring(0, progressBarValue.indexOf("11"));
                String totalValueOfProgressBar = "100";
                int questionAnswered = Integer.parseInt(totalValueOfProgressBar);
                System.out.println(questionAnswered+89);
                return driver.findElements(numberOfAnsweredQuestions).get(searchProgressBarResult).getText();
            }
        }



