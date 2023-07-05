package testcases;

import org.openqa.selenium.By;

public class Locators {

    public By signIn_Btn = By.xpath("//a[@class='menu-item log-in-button']");
    public By logIn_Btn = By.xpath("//div[@id='loginButton']/button']");

    public By logIn_Error = By.xpath("//p[@text-point='login-error']/.." );

    public By rememberMe_Checkbox = By.xpath("//input[@id='auth-page-remember-me'");

}
