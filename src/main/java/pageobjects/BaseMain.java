package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

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

}

