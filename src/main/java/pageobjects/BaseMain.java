package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseMain {
    public ChromeDriver driver;
    public BaseMain (ChromeDriver driver){

        this.driver = driver;
    }
    public void scroll(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, "+ pixels +")", "");
    }
    public void a (){
        scroll(5);
    }

    public void switchingBetweenTabAndPage(int tab){
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandler.get(tab));
    }
}

