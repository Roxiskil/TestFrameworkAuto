package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

//Assertion = validation
// 2 types: Hard Assert and Soft Assert

//homework AssertionsHard

    public class Assertions extends BaseTest {
        String expectedTitle = "Quizzes List";
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

            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("title is correct");

            List<WebElement> elementList = driver.findElements(By.xpath("menuList"));
            listSizeActual = elementList.size();

            Assert.assertEquals(actualMenuItem, expectedMenuItem);
            System.out.println("Menu item is Development");

            Assert.assertEquals(actualAnotherMenuItem, expectedAnotherMenuItem);
            System.out.println("Menu item is Management");

            Assert.assertNotEquals(actualTitle, expectedTitle, "Didn't match");
            System.out.println("title is different");
        }
    }
/*
    public class Assertions extends BaseTest{
        String expectedTitle = "Clinic";
        String actualTitle;
        String menuList = "//body/div[@id='a-page']/div[@id='apex-content-container']/div[@id='conditions']/div[1]/pui-section[3]/pui-tab-container[1]/ul[1]//li";
        int listSizeActual;
        int listSizeExpected = 8;

        //Hard Assertions = asserts which fail the test

        @Test
    public void dropdown(){
            driver.get("https://clinic.amazon.com/?nodl=0&ref_=nav_cs_clinic");
            actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("title is correct");

            Assert.assertNotEquals(actualTitle, expectedTitle);
            System.out.println("title is different");

            List<WebElement> elementList = driver.findElements(By.xpath("menuList"));
            listSizeActual = elementList.size();
                    Assert.assertEquals(listSizeActual, listSizeExpected, "Didn't match");
        }
}
*/





