package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TestHomepage extends DriverSetup {

    @Test
    public void TestHomePageTitle(){
        getDriver().get("https://www.google.com");
        Assert.assertEquals(getDriver().getTitle(), "Google");
    }
}
