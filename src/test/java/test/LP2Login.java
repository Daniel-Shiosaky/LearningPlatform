package test;

import Pages.Login.LP2LoginPage;
import Pages.NewStudyBundle.NewStudyBundlePage;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.DataProviderClass;

public class LP2Login extends BaseTestCase {
    public LP2LoginPage LP2LoginPage = new LP2LoginPage();


    @Test (dataProvider="ValidLoginData",dataProviderClass = DataProviderClass.class)
    //@Parameters ({"sUsername","sPassword"})

    public void SuccessfulLogin(String sUsername, String sPassword) throws InterruptedException {
        NewStudyBundlePage StudyBundlePage =new NewStudyBundlePage();
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




    }
}
