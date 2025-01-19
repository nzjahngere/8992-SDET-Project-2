package pomProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;

    // Methods
    public void enterUsername(String userNameText) {
        userName.sendKeys(userNameText);
    }

    public void enterPassword(String passwordText) {
        password.sendKeys(passwordText);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}

