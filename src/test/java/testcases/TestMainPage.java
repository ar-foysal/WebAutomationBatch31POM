package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.DriverSetup;

public class TestMainPage extends DriverSetup {

    MainPage mainPage = new MainPage();
    @Test(description = "Test main page title")
    @Description("Validating Main Page title")
    public void TestMainPageTitle(){
       mainPage.loadAPage(mainPage.url);
       mainPage.addScreenShot("Main Page");
       Assert.assertEquals(mainPage.getPageTitle(), mainPage.title);

    }

    @Test
    public void TestLoginButton(){
        mainPage.loadAPage(mainPage.url);
        mainPage.addScreenShot("Main Page");
        Assert.assertEquals(mainPage.getElementText(mainPage.login_btn), "Log in");
        Assert.assertTrue(mainPage.getElement(mainPage.login_btn).isEnabled());
    }

}
