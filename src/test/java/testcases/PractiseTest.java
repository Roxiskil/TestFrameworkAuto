package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.PractisePage;

import java.time.Duration;
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
    String questionsSQL101 = "//a[@href='/quiz/run/9']";
    int questionsNumberActual;
    int questionsNumberExpected = 9;
    String startBtn = "//a[@href='/quiz/run/9']//div";
    String firstQuestionAnswer = "//div[@data-answer-id='3']";
    String nextBtn = "//div[@class='quiz-process-navigations-block-button-next']";

    @Test
    public void openMainPage() {
        practisePage.openWebsite();
    }

    @Test
    public void openCourseGalleryPage() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
    }

    @Test
    public void validateHistoryUnavailable() {
        practisePage.openWebsite();
        practisePage.signInAndValidateHistory();
        PractisePage practisePage = new PractisePage(driver);
        practisePage.historyUnavailable();
        expectedHistory = driver.findElement(By.xpath(history)).isDisplayed();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualHistory, expectedHistory);
        System.out.println("This functionality is unavailable");
        softAssert.assertAll();
    }
    public void returnMainPageAfterLogIn() {
        practisePage.returnMainPageAfterLogIn();
    }
    @Test
    public void validateHistoryAgain() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.validateHistoryAgain();
    }

    //Scenario_2
    @Test
    public void ValidateMenuItems() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        List<Object> menuItem = new ArrayList<>();
        menuItem.add("Development");
        menuItem.add("Testing");
        menuItem.add("Business Analysis");
        menuItem.add("Agile");
        menuItem.add("Project Management")
        System.out.println(menuItem);
        System.out.println(menuItem.size());
    }
    @Test
    public void AssertMenuItems() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        List<WebElement> elementList = driver.findElements(By.xpath(areaOfExpertise));
        areaOfExpertiseSizeActual = elementList.size();
        Assert.assertEquals(areaOfExpertiseSizeActual, areaOfExpertiseSizeExpected);
    }
    //Scenario_3

        @Test
        public void questionsNumberInSQL101Basic() {
            practisePage.openWebsite();
            practisePage.openCourseGalleryPage();
            List<WebElement> elementList = driver.findElements(By.xpath(questionsSQL101));
            questionsNumberActual = elementList.size();
            Assert.assertEquals(questionsNumberActual, questionsNumberExpected);
        }
    @Test
        public void clickStartButton() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        driver.findElement(By.xpath(startBtn)).click();
        }
        public void selectAnswerForFirstQuestion () {
            driver.findElement(By.xpath(firstQuestionAnswer)).click();
        }

    @Test
        public void validateNumberOfAnsweredQuestionsAndTotalNumber () {
            practisePage.openWebsite();
            practisePage.openCourseGallery();
            practisePage.numberOfAnsweredQuestions();
            practisePage.clickNextButton();
        }
    @Test
        public void validateProgressBarValueChanged () {
            practisePage.openWebsite();
            practisePage.openCourseGallery();
            practisePage.validateProgressBarValueChanged();
            practisePage.validateNewChangedValueIsCorrect();
        }

    }
}