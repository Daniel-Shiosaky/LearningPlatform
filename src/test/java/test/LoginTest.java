package test;

import Pages.Login.LoginPage;
import driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTestCase {
    public LoginPage loginPage = new LoginPage();
    @Test
    public void SuccessfulLogin() throws InterruptedException {

        //click User name
        loginPage.userTextBox.Click();
        // type user name
        loginPage.userTextBox.Set("shiosaky@gmail.com.oe");
        // click Password
        loginPage.pwdTextBox.Click();
        // Type Password
        loginPage.pwdTextBox.Set("123456");
        // click Login button
        loginPage.loginButton.Click();


    }
}
