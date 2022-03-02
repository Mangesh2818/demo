package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebook_pom {
       
	   private static WebElement element = null;
	   public static void open_url(WebDriver driver)
	   {
		   driver.get("https://www.facebook.com/");
	   }
	   
	   public static WebElement enter_user_id (WebDriver driver)
	   {
		   element = driver.findElement(By.name("email"));
		   return element;
	   }
	   
	   public static WebElement enter_password (WebDriver driver)
	   {
		   element = driver.findElement(By.name("pass"));
		   return element;
	   }
	   
	   public static WebElement click_on_login_button (WebDriver driver)
	   {
		   element = driver.findElement(By.name("login"));
		   return element;
	   }
}
