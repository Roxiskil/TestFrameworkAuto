package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

//Assertion = validation
// 2 types: Hard Assert and Soft Assert


/*public class Assertions extends BaseTest{
        String expectedTitle = "Amazon Clinic";
        String actualTitle;

        @Test
    public void dropdown(){
            driver.get("https://clinic.amazon.com/?nodl=0&ref_=nav_cs_clinic");
            actualTitle = driver.getTitle();

            /*Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("title is correct");*/

            /*Assert.assertNotEquals(actualTitle, expectedTitle);
            System.out.println("title is different");
        }

}
public class Assertions1 extends BaseTest{

    private String bestBuyUrl = "https://www.bestbuy.com/site/health-wellness/health-wellness-solutions/"
    private int expectedCategoryListSize = 6;
    private int actualCategoryListSize;

    private String expectedTitleBlock1 = "Stay fit and track your progress";
    private String expectedTitleBlock2 = "Eat well";
    private String expectedTitleBlock3 = "Create a healthy environment";

    String locatorBlock3 = "//div[]"
    String locatorBlock2 = "//div[]"
    String locatorBlock1 = "//div[]"


    @Test
    public void start(){
        driver.get(bestBuyUrl);

        List<WebElement> categorirs = driver.findElement(By.xpath(""));
        actualCategoryListSize = categories.size();

        Assert.assertEquals(actualCategoryListSize, expectedCategoryListSize);

        for (WebElement element :categories) {
            System.out.println(element.get.Text());
        }


    }
    @Test
    public void softAssers(){
        driver.get(bestBuyUrl);
        List<WebElement> categories = driver.findElement(By.xpath(""));
        actualCategoryListSize = categories.size();

        expectedTitleBlock1 = "Stay fit and be well";
        actualTitleBlock1 = driver.findElement(By.xpath(""));

        SoftAssert softAssert = new SoftAsser();

        softAssert.assertEquals(actualCategoryListSize, expectedCategoryListSize); //int
        softAssert.assertEquals(actualTitleBlock1, expectedCTitleBlock1); // String

        softAssert.assertAll();*/




