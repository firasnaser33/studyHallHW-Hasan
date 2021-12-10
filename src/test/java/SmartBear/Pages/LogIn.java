package SmartBear.Pages;

import SmartBear.Util.ConfigurationsReader;
import SmartBear.Util.Driver;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

    public LogIn() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    private WebElement usernameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    private WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    private WebElement loginButton;


    public void setUsername(){
        usernameBox.sendKeys(ConfigurationsReader.getProperty("username"));
    }
    public void setPasswordBox(){
        passwordBox.sendKeys(ConfigurationsReader.getProperty("password"));
    }
    public void setLoginButton(){
        loginButton.click();
    }









}
