package resources;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name="ValidLoginData")
    public static Object[][] getValidLoginDataprovider(){
        return new Object[][] {
                //STG
                //{ "daniel.oeauto+1@mailinator.com", "Test123" }

                //PROD
                { "shiosaky@gmail.com", "Test123" }

        };
    }

    @DataProvider(name="inValidLoginData")
    public static Object[][] getInvalidLoginDataprovider(){
        return new Object[][] {
                { "invalidemail@mailinator.com", "InvalidPW" }

        };
    }
}
