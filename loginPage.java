package pomProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
	//constructor

WebDriver LoginPage;
	
	public LoginPage(WebDriver rdriver) {
	
		LoginPage = rdriver;
		
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Locators
      @FindBy(xpath = "//input[@placeholder='Username']")
      WebElement userName;
      
      @FindBy(xpath = "//input[@placeholder='Password']")
      WebElement password;
      
      @FindBy(xpath = "//button[normalize-space()='Login']")
      WebElement button;
      
	//Method
      
      public void enterUsername(String UserName) {
              userName.sendKeys(UserName);
      }
      
      public void enterPassword(String Enterpassword) {
		    password.sendKeys(Enterpassword);
		
	}
  
   public void button1() {
	          button.click();
	          
}
  
      
      
}
