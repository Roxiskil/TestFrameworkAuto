package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BaseMain {
    public WebDriver driver;
    public Logger log;
    public BaseMain (WebDriver driver, Logger logger){
        this.driver = driver;
        this.log = logger;
    }
    public void clickUsingXpath(String xpath, String elementName){
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Element: " + elementName + " was successfully clicked");
    }
    public void clickUsingWebElement(WebElement element, String elementName){
        element.click();
        log.info("Element: " + elementName + " was successfully clicked");
    }
    public void typeUsingXpath(String xpath, String elementName, String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        System.out.println("Value: " + value + " was successfully entered into " + elementName + "element");
    }

    public void typeUsingXpath(By xpath, String elementName, String value){
        driver.findElement(xpath).sendKeys(value);
        System.out.println("Value: " + value + " was successfully entered into " + elementName + "element");
    }
    public void clickUsingXpathAfterWait(String xpath, String elementName) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(xpath)).click();
        System.out.println("Element: " + elementName + " was successfully clicked");
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

