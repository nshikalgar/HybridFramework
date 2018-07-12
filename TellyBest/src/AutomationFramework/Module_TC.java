package AutomationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import appModule.SingIn_Action;

public class Module_TC 
{
	public static void main(String[] args) 
	   {
	 
	     FirefoxDriver  driver = new FirefoxDriver();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("https://www.tellyphase1.rrfreelancer.com/newadmin/");
	 
	     // Use page Object library now
	 
	     SingIn_Action.Execute(driver);	
	     System.out.println(" Login Successfully");
	     driver.quit();
	   }
	
}
