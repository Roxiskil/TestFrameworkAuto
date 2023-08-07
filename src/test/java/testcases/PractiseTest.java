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
    @Test
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
    public void openMainPageAndCourseGallery() {
        practisePage.openMainPageAndCourseGallery();
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

/*Scenario_3
        Validate that the progress bar now has the correct value (correct value = number of answered questions / total number of questions)
        Click the “Next” button
        Validate progress bar has changed value
        Validate new changed value is correct*/

    @Test
    public void openMainPageThenCourseGallery() {
        practisePage.openMainPageThenCourseGallery();
    }
    @Test
    public void questionsNumberInSQL101Basic() {
        driver.get(this.webpageURL);
        List<WebElement> elementList = driver.findElements(By.xpath(questionsSQL101));
        questionsNumberActual = elementList.size();
        Assert.assertEquals(questionsNumberActual, questionsNumberExpected);
    }
    @Test
    public void clickStartButton() {
        driver.get(this.webpageURL);
        driver.findElement(By.xpath(startBtn)).click();
    }
    @Test
    public void selectAnswerForFirstQuestion() {
        driver.get(this.webpageURL);
        driver.findElement(By.xpath(startBtn)).click();
        driver.findElement(By.xpath(firstQuestionAnswer)).click();
    }
    @Test
    public void validateNumberOfAnsweredQuestionsAndTotalNumber() {
        practisePage.openWebsite();
        practisePage.openCourseGallery();
        practisePage.numberOfAnsweredQuestions();
    }
    @Test
    public void clickNextButton() {
        practisePage.openWebsite();
        practisePage.openCourseGallery();
        driver.findElement(By.xpath(nextBtn)).click();
    }
    //@Test
    public void validateProgressBarValueChanged() {
        practisePage.openWebsite();
        practisePage.openCourseGallery();

    }
    //@Test
    public void validateNewChangedValueIsCorrect() {
        practisePage.openWebsite();
        practisePage.openCourseGallery();


    }
}






