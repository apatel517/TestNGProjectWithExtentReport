package EcommerceProjectReport.EcommerceProjectExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	
	 public WebDriver launchDriver () {
		 
		 System.setProperty("webdriver.chrome.driver","/Users/asad/Desktop/workspace/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 return driver;
	 }
}
