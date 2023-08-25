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
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.signInAndValidateHistory();
        practisePage.returnMainPageAfterLogIn();
        practisePage.openCourseGalleryPage();
        practisePage.validateHistoryAgain();
    }

    //Scenario_2
    @Test
    public void ValidateMenuItemsInCourseGallery() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.ValidateMenuItems();
    }

    //Scenario_3
    @Test
        public void questionsProgressBar() {
        practisePage.openWebsite();
        practisePage.openCourseGalleryPage();
        practisePage.questionsNumberInSQL101Basic();
        practisePage.clickStartButtonAnswerQuestion();
        practisePage.switchToTab(1);
        practisePage.clickNextButtonValidateProgressBarValueChanged();
        practisePage.validateNewChangedValueIsCorrect();
        }
    }
