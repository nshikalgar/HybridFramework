package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase
{
		 
		public static void NewTestCase(String[] args) 
		{
			
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();
			
	        //Launch the Online Store Website
			driver.get("https://www.tellyphase1.rrfreelancer.com/newadmin/");
	 
	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
	 
			//Wait for 5 Sec
	
			
	        // Close the driver
	        driver.quit();
	    }
}


