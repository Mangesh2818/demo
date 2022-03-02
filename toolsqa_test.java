package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.toolsqa_pom;

public class toolsqa_test {
     
private static WebDriver driver = null;

      public static void main(String[] args) {
		
    	  System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
 		  driver= new ChromeDriver();
 		  
 		  toolsqa_pom.textbox(driver);
    	  
    	  
    	  
    	  
	}
}
