package appModule;
import org.openqa.selenium.*;
import Utility.ExcelUtils;

import pageObjects.LoginPage;


public class SingIn_Action 
{
    public static void Execute(WebDriver driver) throws Exception
    {
    
    	String sUserName = ExcelUtils.getCellData(1, 1);
    	 
		String sPassword = ExcelUtils.getCellData(1, 2);

    	 LoginPage.UserName(driver).sendKeys(sUserName);
	     LoginPage.Password(driver).sendKeys(sPassword);
	     LoginPage.SelectRole(driver).click();
	     LoginPage.OptionSuperAdmin(driver).click();
	     LoginPage.CheckboxRememberMe(driver).click();
	     LoginPage.ButtonLogin(driver).click();
	 
    
     }
}
