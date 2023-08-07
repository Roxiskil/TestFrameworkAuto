package testcases;


import net.bytebuddy.build.ToStringPlugin;
import org.testng.annotations.Test;

public class BestBuyMainPageTest extends BaseTest {
    //Main page should have 4 Suggested Item Sections, and display then as user scrolls
    @Test
    public void REQ92832_TC389_4SuggestItemSectionsOnMainPageOnScroll() {
        bestBuyMainPage.openMainPage();
        bestBuyMainPage.suggestedItemSectionCount();
    }

    //Main page should have no more than 4 Suggested Item Sections, as user scrolls to the end of the page

    @Test
    public void REQ92833_TC394_4SuggestItemSectionsOnMainPageOnScroll() {
        bestBuyMainPage.openMainPage();
        bestBuyMainPage.suggestedItemSectionCount();
    }

    @Test
    public void sss() {
        bestBuyMainPage.openMainPage();
        bestBuyMainPage.aa();
    }

    @Test
    public void sss() {
        System.out.println(bestBuyMainPage.substringLastName("Roksolana_Stef"));
    }
}

