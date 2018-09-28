package test;

import Pages.Login.LP2LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LP2Login extends BaseTestCase {
    public LP2LoginPage LP2LoginPage = new LP2LoginPage();
    @Test
    @Parameters ({"sUsername","sPassword"})
    public void SuccessfulLogin(String sUsername, String sPassword) throws InterruptedException {

        // check that Bienvenido Label is visible
        Assert.assertEquals(LP2LoginPage.BienvenidoLabel.getTextValue(),"Welcome");
        System.out.println("Welcome Label is present");
        LP2LoginPage.BienvenidoLabel.isDisplayed();
        //click User name
        LP2LoginPage.userTextBox.Click();
        // type user name
        LP2LoginPage.userTextBox.Set(sUsername);
        // click Password
        LP2LoginPage.pwdTextBox.Click();
        // Type Password
        LP2LoginPage.pwdTextBox.Set(sPassword);
        // click Login button
        LP2LoginPage.loginButton.Click();



    }
}
