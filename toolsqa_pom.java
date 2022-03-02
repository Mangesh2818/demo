package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class toolsqa_pom {
          
private static WebElement element  =null;

       public static WebElement textbox (WebDriver driver)
       {
    	  driver.get("https://demoqa.com/text-box");
    	  driver.findElement(By.id("userName")).sendKeys("Mangesh Munge");
    	  driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
    	  driver.findElement(By.id("currentAddress")).sendKeys("Pune");
    	  driver.findElement(By.id("permanentAddress")).sendKeys("Parbhani");  
    	  return element;
       }
       
        
	
}
