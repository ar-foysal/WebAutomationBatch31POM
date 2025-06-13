package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidUserCredentials")
    public static Object invalidCredentials(){
        Object[][] data = {
                {"Automation1230", "password", "Incorrect username or password entered. Please try again."},
                {"Username", "Automation%4321", "Incorrect username or password entered. Please try again."},
                {"Username", "password", "Incorrect username or password entered. Please try again."}
        };
        return data;
    }
}
