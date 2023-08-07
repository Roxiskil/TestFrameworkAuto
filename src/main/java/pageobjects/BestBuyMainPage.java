package pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BestBuyMainPage extends BaseMain {
    public BestBuyMainPagePage(WebDriver driver) {
        super(driver);
    }
    String domain = "https://www.bestbuy.com/";
    By suggestedItemSection = By.xpath("//ul[@class=''c-carousel-list']");

    //String URL = domain + "signin";
        public void openMainPage(){
            driver.get(domain);
        }

    public int suggestedItemSectionCount() {
            return driver.findElements(suggestedItemSection).size();
    }
    public void suggestedItemSectionScrollAndCount() {
        Assert.assertEquals(suggestedItemSectionScrollAndCount(), 1);

        for (int i = 2; i < 5; i++) {
            System.out.println("iteration number: " + i);
            scrollBy(1600);
            waitForSuggestedItemSection(i);
            Assert.assertEquals(suggestedItemSectionCount(), i);
        }
       /* scrollBy(1600);
        waitForSuggestedItemSection(3);
        current = suggestedItemSectionCount();
        System.out.println(current);
        Assert.assertEquals(current, 3);

        scrollBy(1600);
        waitForSuggestedItemSection(4);
        current = suggestedItemSectionCount();
        System.out.println(current);
        Assert.assertEquals(current, 4);
    }
*/
        public void waitForSuggestedItemSection ( int expectedNumber){
            WebDriverWait sectionWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            sectionWait.until(ExpectedConditions.numberOfElementsToBe(suggestedItemSection, 2));
        }

        public void scrollToEndAndVerify4Sections () {
            scrollBy(5000);
            try {
                waitForSuggestItemSection(5);
                Assert.assertEquals(suggestedItemSectionCount(), 4); //will fail the test case if 5th element appears
            } catch (TimeoutException e) {
                Assert.assertEquals(suggestedItemSectionCount(), 4); //will pass the test if 5th element didn't appear
            }
        }

        public void aa () {
            List<WebElement> hh = driver.findElements(By.xpath("sdfasdd"));
            System.out.println(hh);
            Assert.assertTrue(hh.isEmpty());
        }
        public String subStringLastName (String fullname){
            //FirstName_LastName
            ////FirstName
            System.out.println(fullName);
            Srting result = fullName.substring(0, fullName.indexOf("_"));
            return result;
        }
    }
}
