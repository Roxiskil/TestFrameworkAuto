package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class QuizPage extends BaseMain {

    public QuizPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    //GUI elements XPaths
    private String questionAnswer = "//div[contains(@class, 'quiz-process-question-block-answers-block-item') and @data-answer-id='0'][1]";
    private String nextBtn = "//div[text()='Next']";

    //Locators
    By questionAnswerLocator = By.xpath(questionAnswer);
    By progressBarLocator = By.id("quiz-process-progress-data");
    By nextBtnLocator = By.xpath(nextBtn);

    double totalNumberOfQuestions;

    public void selectTheAnswer() {
        driver.findElement(questionAnswerLocator).click();
    }
    private int getProgressBarValue() {
        String progressValueInString = driver.findElement(progressBarLocator).getText();
        String numberString = "11";
        System.out.println(progressValueInString.substring(11));
        System.out.println(progressValueInString.substring(0, 11));
        System.out.println(progressValueInString.indexOf("_"));
        return Integer.parseInt(numberString);
    }

    public void verifyProgressBarValue(double numberOfAnsweredQuestions) {
        totalNumberOfQuestions = PractisePage.getNumberOfQuestions();
        double correctValue = (numberOfAnsweredQuestions / totalNumberOfQuestions) * 100;
        Assert.assertEquals(getProgressBarValue(), (int) correctValue);
    }

    public void clickNextButton() {
        driver.findElement(nextBtnLocator).click();
    }

    public void verifyQuizProgressBarForAllAnswers() {
        totalNumberOfQuestions = PractisePage.getNumberOfQuestions();
        for (int i = 1; i <= totalNumberOfQuestions; i++) {
            selectTheAnswer();
            verifyProgressBarValue(i);
            clickNextButton();
        }
    }
}