package page_TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pomProject.LoginPage;
import pomProject.baseClass;

public class loginTestcases extends baseClass{
    	
    	@Test(priority = 2)
    	public void testvalidloginpage() {
			driver.get(url);
			
			LoginPage Loginpage = new LoginPage(driver);
			
			 Loginpage.enterUsername("Admin");
			 Loginpage.enterPassword("admin123");
			 Loginpage.button1();
			
			
		}
	
	
	
    	@Test(priority = 1)
    	   public void testInvalidLogin() {
    		driver.get(url);
    		
    		LoginPage Loginpage = new LoginPage(driver);
    		
    		 Loginpage.enterUsername("Adminn");
			 Loginpage.enterPassword("admin1234");
			 Loginpage.button1();
           
         }
    	 @AfterClass
    	    public void tearDown() {
    	        driver.quit();
    	    }
	
	

}
