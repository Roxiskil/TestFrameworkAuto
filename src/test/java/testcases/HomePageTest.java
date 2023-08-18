package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePageTest extends BaseTest{

    @Test
    public void websiteURLVerification(){
        homePage.openHomePage();
        List<Integer> codes = homePage.websiteURLVerification();
        SoftAssert softAssert = new SoftAssert();
        Integer expected = 200;
        for (Integer code: codes){
            Assert.assertEquals(code, expected);
        }
    }

    /* @Test
    public void urlStoresVerification(){
        homePage.openWebsite();
        List<Integer> codes = homePage.urlStoresVerification();
        Integer expected = 200;
        for (Integer code: codes){
            Assert.assertEquals(code, expected);
        }
    }

    @Test
    public void urlAmazonVerification(){
        homePage.openMainPage();
        List<Integer> codes = homePage.urlAmazonVerification();
        Integer expected = 200;
        for (Integer code: codes){
            Assert.assertEquals(code, expected);
        }
    }*/
}
