package test;

import driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        //STG
        DriverManager.getInstance().myDriver.get("https://learningplatform.stg.openenglish.com");
        //PROD
        //DriverManager.getInstance().myDriver.get("https://learningplatform.openenglish.com");
        DriverManager.myDriver.manage().window().maximize();

    }
    @AfterClass
    public void closeBrowser() {
        DriverManager.getInstance().closeBrowser();


    }

    @AfterTest
    public void quitDriver() {
        DriverManager.getInstance().quitDriver();


   }
}
