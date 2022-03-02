package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.google;

public class google_page {
        
	    private static WebDriver driver = null;
	    public static void main(String[] args) {
			 
	    	 
	     System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();		 
		 
		 google.open_url(driver);
		 google.enter_the_input(driver).sendKeys("Mangesh Munge");
		 google.click_on_button(driver).click();
		 
	    	
		}
}
