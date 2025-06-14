package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void TestUserCanLoginWithValidCredentials(){
        mainPage.loadAPage(mainPage.url);
        mainPage.addScreenShot("Main Page");
        mainPage.clickOnElement(mainPage.login_btn);

        loginPage.writeOneElement(loginPage.username_input, loginPage.username);
        loginPage.writeOneElement(loginPage.password_input, loginPage.password);
        loginPage.addScreenShot("Login Page After adding username and password");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(mainPage.getElementText(mainPage.username), loginPage.username);
        Assert.assertTrue(mainPage.waitForElementVisible(mainPage.user_icon).isDisplayed());
        mainPage.addScreenShot("Log in Success");

//        Assert.assertFalse(mainPage.visibleState(mainPage.login_btn));
    }

    @Test
    public void TestUserShouldNotBeAbleToLoginWithInvalidPassword(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
        loginPage.writeOneElement(loginPage.username_input, loginPage.username);
        loginPage.writeOneElement(loginPage.password_input, "password");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_btn));
    }

    @Test
    public void TestUserShouldNotBeAbleToLoginWithInvalidUsername(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
        loginPage.writeOneElement(loginPage.username_input, "Username");
        loginPage.writeOneElement(loginPage.password_input, loginPage.password);
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_btn));

    }

    @Test
    public void TestUserShouldNotBeAbleToLoginWithInvalidUsernamePassword(){
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
        loginPage.writeOneElement(loginPage.username_input, "Username");
        loginPage.writeOneElement(loginPage.password_input, "password");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), loginPage.error_text);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_btn));
    }

    @Test(dataProvider = "invalidUserCredentials", dataProviderClass = DataSet.class)
    public void TestUserShouldNotBeAbleToLoginWithInvalidCredentials(String username, String password, String error_message) {
        mainPage.loadAPage(mainPage.url);
        mainPage.clickOnElement(mainPage.login_btn);
        loginPage.writeOneElement(loginPage.username_input, username);
        loginPage.writeOneElement(loginPage.password_input, password);
        loginPage.addScreenShot("Login Page After adding username and password");
        loginPage.clickOnElement(loginPage.login_btn);
        Assert.assertEquals(loginPage.getElementText(loginPage.error_message), error_message);
        Assert.assertTrue(loginPage.visibleState(loginPage.login_btn));
        loginPage.addScreenShot("Login Page with Error msg");
    }


}
