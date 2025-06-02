package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String url = "https://auth.wikimedia.org/enwiki/wiki/Special:UserLogin";
    public String username = "Automation1230";
    public String password = "Automation%4321";

    public String email= "hadoceg714@eduhed.com";

    public String error_text = "Incorrect username or password entered. Please try again.";
    public By username_input = By.xpath("//input[@id='wpName1']");
    public By password_input = By.xpath("//input[@id='wpPassword1']");
    public By remember_checkbox = By.xpath("//input[@id='wpRemember']");
    public By login_btn = By.xpath("//button[@id='wpLoginAttempt']");

    public By error_message = By.xpath("//div[@class='cdx-message__content']");


}
