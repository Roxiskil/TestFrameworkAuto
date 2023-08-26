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
// scenario 1
    @Test
    public void historyAvailability() {
        homePage.openWebsite();
        homePage.openCourseGalleryPage();
        practisePage.isHistoryDisplayed(false);
        homePage.returnMainPageAfterLogIn();
        signInPage.signInAndValidateHistory();
        homePage.openCourseGalleryPage();
        practisePage.isHistoryDisplayed(true);
    }

    //Scenario_2
    @Test
    public void validateMenuItemsInCourseGallery() {
        homePage.openWebsite();
        homePage.openCourseGalleryPage();
        practisePage.validateMenuItems();
    }

    //Scenario_3
    @Test
        public void questionsProgressBar() {
        homePage.openWebsite();
        homePage.openCourseGalleryPage();
        practisePage.numberOfQuizQuestions();
        practisePage.clickStartButtonAnswerQuestion();
        practisePage.switchingBetweenTabAndPage(1);
        quizPage.verifyQuizProgressBarForAllAnswers();
        }
    }
