package driverManager;
import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static DriverManager ourInstance =null;
    public static WebDriver myDriver;


    public static DriverManager getInstance() {
        if (ourInstance == null)
            ourInstance=new DriverManager();
        return ourInstance;
    }
    //constructor
    private DriverManager() {

        myDriver = FactoryBrowser.make("chrome").create();
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        myDriver.close();

    }
    public void quitDriver(){

        myDriver.quit();
    }
}
