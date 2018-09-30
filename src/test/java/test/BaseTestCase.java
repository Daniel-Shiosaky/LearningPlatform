package test;

import driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    @BeforeMethod
    public void openBrowser() throws InterruptedException {
        //STG
        //DriverManager.getInstance().myDriver.get("https://learningplatform.stg.openenglish.com");
        //PROD
        DriverManager.getInstance().myDriver.get("https://learningplatform.openenglish.com");


    }
    @AfterMethod
    public void closeBrowser() {
        DriverManager.getInstance().closeBrowser();


    }

    @AfterClass
    public void quitDriver() {
        DriverManager.getInstance().quitDriver();


    }
}
