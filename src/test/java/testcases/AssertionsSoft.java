package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

//homework AssertionsSoft
public class AssertionsSoft extends BaseTest {
    String expectedTitle = "Quizzes";
    String actualTitle;
    String menuList = "//body/div[1]/div[2]/div[1]/nav[1]/ul[1]//li";
    int listSizeActual;
    int listSizeExpected = 6;
    boolean expectedMenuItem = true;
    boolean actualMenuItem;
    boolean expectedAnotherMenuItem = false;
    boolean actualAnotherMenuItem;

    @Test
    public void dropdown() {
        driver.get("https://test.my-fork.com");
        actualTitle = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualTitle, expectedTitle, "titles are different");

        List<WebElement> elementList = driver.findElements(By.xpath("menuList"));
        listSizeActual = elementList.size();

        softAssert.assertNotEquals(listSizeActual, listSizeExpected, "list size is six");

        softAssert.assertEquals(actualMenuItem, expectedMenuItem);
        System.out.println("Menu item is not Development");

        softAssert.assertEquals(actualAnotherMenuItem, expectedAnotherMenuItem);
        System.out.println("Menu item is Project Management");

        softAssert.assertAll();

    }
}