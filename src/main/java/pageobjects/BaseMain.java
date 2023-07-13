package pageobjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseMain {
    public ChromeDriver driver;
    public BaseMain (ChromeDriver driver){

        this.driver = driver;
    }

}

