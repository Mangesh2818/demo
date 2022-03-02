package Pages;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class facebook_test {
      
	 private static WebDriver driver = null;
	 
	 public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 facebook_pom.open_url(driver);
		 facebook_pom.enter_user_id(driver).sendKeys("abc@gmail.com");
		 facebook_pom.enter_password(driver).sendKeys("12345");
		 facebook_pom.click_on_login_button(driver).click();
		 
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File ("F:\\abc.jpeg");
		 
		 FileHandler.copy(source, destination);
	}
}
