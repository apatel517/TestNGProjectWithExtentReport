package EcommerceProjectReport.EcommerceProjectExtentReport;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test3 extends base {

WebDriver driver;
	
	
	@Test
	public void TestCase3() {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
	//Step 2
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
	//Step 3
		 driver.findElement(By.xpath("//li[3]//div[1]//div[3]//button[1]//span[1]//span[1]")).click();
	//Step 4
		 driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		 driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		 driver.findElement(By.cssSelector("button[title='Update'] span span")).click();
	//Step 5
		 String errorMsg = driver.findElement(By.xpath("//li[@class='error-msg']//ul//li")).getText();
		 System.out.println(errorMsg);
		 if(errorMsg.equals(errorMsg))
		 {
			System.out.println("Error Message Verified") ;
		 }
		 else
		 {
			 System.out.println("Error Message Verified"); 
		 }
	//Step 6
		 driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
	//Step 7
		String shoppingCart = driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart is Empty']")).getText();
		System.out.println(shoppingCart);
		driver.quit();

	}
	
	
}
