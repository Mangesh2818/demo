package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class google {
    private static WebElement element = null; 
     
    public static void open_url (WebDriver driver)
	{
    	driver.get("https://www.google.com/");
	}
    
    public static WebElement enter_the_input(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement click_on_button (WebDriver driver)
	{
		element = driver.findElement(By.name("btnK"));
		return element;
	}
	
}
