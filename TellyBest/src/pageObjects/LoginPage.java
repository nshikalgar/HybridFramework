package pageObjects;
    import org.openqa.selenium.By;

    import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;


 public class LoginPage 
 {

    private static WebElement element = null;

    public static WebElement UserName(WebDriver driver)
    {

    element = driver.findElement(By.id("username"));

    return element;

    }

    public static WebElement Password(WebDriver driver)
    {

    element = driver.findElement(By.id("pswd"));

    return element;
    
    }
    public static WebElement SelectRole(WebDriver driver)
    {

    element = driver.findElement(By.xpath("//button/span[text()='Select one role*']"));

    return element;
    
    }
    public static WebElement OptionSuperAdmin(WebDriver driver)
    {

    element = driver.findElement(By.xpath("//span[text()='Super Admin']"));

    return element;
    
    }

    
    public static WebElement CheckboxRememberMe(WebDriver driver)
    {

    element = driver.findElement(By.id("rememberme"));

    return element;
    }
    public static WebElement ButtonLogin(WebDriver driver)
    {

    element = driver.findElement(By.id("login"));

    return element;

    }
}

