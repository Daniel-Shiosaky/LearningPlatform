package seleniumControls;
import driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.mustache.Value;
public class Control {
    public WebElement myControl;
    public By myLocator;

    public void Find(){
        myControl= DriverManager.getInstance().myDriver.findElement(myLocator);
    }

    public Control(By myLocator){
        this.myLocator=myLocator;

    }

    public void Click(){
        Find();
        myControl.click();
    }
    public void Set(String value){
        Find();
        myControl.sendKeys(value);
    }
    public void DoubleClick(){
        Find();
        myControl.click();
        myControl.click();
    }
    public String getTextValue(){
        Find();
        return myControl.getText();
    }

    public String getTextAttributes(String attrribute){
        Find();
        return  myControl.getAttribute(attrribute);
    }

    public boolean isDisplayed(){
        try {
            Find();
            return myControl.isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }
}
