package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LoginPage;


public class POM_TC 
{
	 
	   public static void main(String[] args) 
	   {
	 
	     FirefoxDriver  driver = new FirefoxDriver();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("https://www.tellyphase1.rrfreelancer.com/newadmin/");
	 
	     // Use page Object library now
	 
	     LoginPage.UserName(driver).sendKeys("sadmin");
	     LoginPage.Password(driver).sendKeys("mm@dmin11");
	     LoginPage.SelectRole(driver).click();
	     LoginPage.OptionSuperAdmin(driver).click();
	     LoginPage.CheckboxRememberMe(driver).click();
	     LoginPage.ButtonLogin(driver).click();
	 
	     System.out.println(" Login Successfully"); 
	 
	     driver.quit();
	 
	    }
	 

}
