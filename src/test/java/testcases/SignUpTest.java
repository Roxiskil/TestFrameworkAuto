package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageobjects.SignUpPage;

import java.util.ArrayList;
import java.util.List;

public class SignUpTest extends BaseTest {

   @Test (priority = 2, groups = "dropdown")

     public void closeOrQuit() {
        driver.get("https://test.my-fork.com");
        driver.findElement(By.xpath("//div[@id='sign-up-button']")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        System.out.println();
    }

    //homework5
    @Test (priority = 1, groups = "dropdown")
    public void dropdown() {
        driver.get("https://test.my-fork.com");
        signUpPage = new SignUpPage(driver);
        WebElement searchDropdownElement;
        searchDropdownElement = driver.findElement(By.id("job-title"));
        Select searchDropdown = new Select(searchDropdownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropdown.getOptions();
        int listSize = options.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println(options.get(i).getText());
        }
    }

}
































































