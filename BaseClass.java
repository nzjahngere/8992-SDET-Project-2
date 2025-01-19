package pomProject.pages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import file.readConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	readConfig readConfig = new readConfig();

	protected String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	
	public static WebDriver driver;
	

	@BeforeClass
	public void setup()
	{

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
		//implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		        //open url
				driver.get(url);
		
	}
   
	

	@AfterClass
	public void tearDown()
	{
	
//		driver.close();
//		driver.quit();
	}

	

}