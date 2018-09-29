package resources;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name="ValidLoginData")
    public static Object[][] getDataFromDataprovider(){
        return new Object[][] {
                { "daniel.oeauto+1@mailinator.com", "Test123" }

        };
    }}
