package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{
    public String url = "https://en.wikipedia.org/wiki/Main_Page";
    public String title = "Wikipedia, the free encyclopedia";
    public By main_logo = By.xpath("//span[@class='mw-logo-container skin-invert']");
    public By search_box = By.xpath("//input[@title='Search Wikipedia");
    public By search_btn = By.xpath("//button[normalize-space()='Search']");
    public By appearance = By.xpath("//input[@id='vector-appearance-dropdown-checkbox']");
    public By donate_btn = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Donate')]");
    public By create_account = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Create account')]");
    public By login_btn = By.xpath("//a[@data-mw='interface']//span[contains(text(),'Log in')]");
    public By sidebar = By.xpath("//input[@id='vector-main-menu-dropdown-checkbox']");

    public By username = By.xpath("(//span[contains(text(),'Automation1230')])[1]");
    public By user_icon = By.xpath("//div[@id='vector-user-links-dropdown']");

}
