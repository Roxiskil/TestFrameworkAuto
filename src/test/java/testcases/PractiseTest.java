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
        practisePage.signInAndValidateHistory();
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
        practisePage.ValidateMenuItems();
    }
    /*@Test
    public void AssertMenuItems() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.AssertMenuItems();*/
    }
    //Scenario_3

       /* @Test
        public void questionsNumberInSQL101Basic() {
            practisePage.openWebsite();
            practisePage.openCourseGalleryPage();
            practisePage.questionsNumberInSQL101Basic();
        }
    @Test
        public void clickStartButton() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        driver.findElement(By.xpath(startBtn)).click();
        }
        public void selectAnswerForFirstQuestion () {
            driver.findElement(By.xpath(firstQuestionAnswer)).click();
        }*/

    /*@Test
        public void validateNumberOfAnsweredQuestionsAndTotalNumber () {
            practisePage.openWebsite();
            practisePage.openCourseGallery();
            practisePage.numberOfAnsweredQuestions();
            practisePage.clickNextButton();
        }*/
    /*@Test
        public void validateProgressBarValueChanged () {
            practisePage.openWebsite();
            practisePage.openCourseGallery();
            practisePage.validateProgressBarValueChanged();
            practisePage.validateNewChangedValueIsCorrect();
        }

    }*/
