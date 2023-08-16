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

    @Test
    public void AssertMenuItems() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.AssertMenuItems();
    }

    //Scenario_3

    @Test
        public void questionsNumberInSQL101Basic() {
            practisePage.questionsNumberInSQL101Basic();
        }

    @Test
        public void clickStartButtonAnswerQuestion() {
        practisePage.clickStartButtonAnswerQuestion();
    }

    @Test
        public void clickNextButtonValidateProgressBarValueChanged () {
            practisePage.clickNextButtonValidateProgressBarValueChanged();
        }

    @Test
        public void validateNewChangedValueIsCorrect () {
            practisePage.validateNewChangedValueIsCorrect();
        }
    }
