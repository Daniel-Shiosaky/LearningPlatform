package test;

import Pages.Login.LP2LoginPage;
import Pages.NavBar.LP2NavBar;
import Pages.NewStudyBundle.NewStudyBundlePage;
import driverManager.DriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.DataProviderClass;
import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;


public class LP2Login extends BaseTestCase {

    public LP2LoginPage LP2LoginPage = new LP2LoginPage();



    @Test (dataProvider="ValidLoginData",dataProviderClass = DataProviderClass.class)
    //@Parameters ({"sUsername","sPassword"})

    public void SuccessfulLogin(String sUsername, String sPassword) throws InterruptedException {


        NewStudyBundlePage StudyBundlePage =new NewStudyBundlePage();
        LP2NavBar navBar =new LP2NavBar();
        // check that welcome Label is visible
        System.out.println("check that Welcome Label is visible");
        Assert.assertEquals(LP2LoginPage.BienvenidoLabel.getTextValue(),"Welcome");
        System.out.println("Welcome Label is present");

        //click User name
        System.out.println("click User name");
        LP2LoginPage.userTextBox.Click();
        // type user name
        System.out.println("type user name");
        LP2LoginPage.userTextBox.Set(sUsername);
        // click Password
        System.out.println("click Password");
        LP2LoginPage.pwdTextBox.Click();
        // Type Password
        System.out.println("type Password");
        LP2LoginPage.pwdTextBox.Set(sPassword);
        // click Login button
        System.out.println("click Login button");
        LP2LoginPage.loginButton.Click();
        //check title after login
        Assert.assertEquals(StudyBundlePage.TitleBarLabel.getTextValue(),"plan de estudio");
        System.out.println("succesfully logged in, Plan De Estudio Title bar is displayed");
        // click user profile icon
        System.out.println("click user profile icon");
        navBar.userProfileIcon.Click();
        // check logout option is displayed
        System.out.println("check logout option is displayed");
        navBar.userProfileIcon.Click();
        Assert.assertTrue(navBar.SignOutMenuOption.isDisplayed());
        System.out.println(" logout option is displayed");
        // click the sign out menu option
        System.out.println("click the sign out menu option");
        navBar.SignOutMenuOption.Click();
        Assert.assertTrue(LP2LoginPage.BienvenidoLabel.isDisplayed());
        System.out.println("Successfully logged out");
        // check that welcome Label is visible
        System.out.println("check that Welcome Label is visible");
        Assert.assertEquals(LP2LoginPage.BienvenidoLabel.getTextValue(),"Bienvenido");
        System.out.println("Welcome Label is present");
    }

    @Test (dataProvider="inValidLoginData",dataProviderClass = DataProviderClass.class)
    public void invalidLogin(String iUsername, String iPassword) throws InterruptedException {
        DOMConfigurator.configure("log4j.xml");

        // check that welcome Label is visible
        System.out.println("check that Welcome Label is visible");
        Assert.assertEquals(LP2LoginPage.BienvenidoLabel.getTextValue(),"Bienvenido");
        System.out.println("Welcome Label is present");

        //click User name
        System.out.println("click User name");

        LP2LoginPage.userTextBox.Click();
        // type invalid user name
        System.out.println("type invalid user name");
        LP2LoginPage.userTextBox.Set(iUsername);
        // click Password
        System.out.println("click Password");
        LP2LoginPage.pwdTextBox.Click();
        // Type invalid Password
        System.out.println("type invalid Password");
        LP2LoginPage.pwdTextBox.Set(iPassword);
        // click Login button
        System.out.println("click Login button");
        LP2LoginPage.loginButton.Click();
        //check title after login
        Assert.assertEquals(LP2LoginPage.InvalidEmailValidator.getTextValue(),"El email que usted ingresó no ha sido reconocido. Por favor, inténtelo de nuevo.");
        System.out.println("invalid email validator displayed");
    }
}
