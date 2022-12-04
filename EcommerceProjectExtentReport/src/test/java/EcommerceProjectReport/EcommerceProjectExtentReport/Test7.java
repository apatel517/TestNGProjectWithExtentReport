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

public class Test7 extends base {
WebDriver driver;
	
	
	@Test
	public void TestCse7() throws InterruptedException {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
	  
//Step 2
		 driver.findElement(By.cssSelector(".skip-link.skip-account")) .click();
//Step 3
		 driver.findElement(By.xpath("//a[@title='Log In']")).click();
		 driver.findElement(By.id("email")).sendKeys("apatel978@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("ap01234");
		 driver.findElement(By.id("send2")).click();
//Step 4
		 driver.findElement(By.xpath("//a[normalize-space()='My Orders']")).click();
//Step 5
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("VIEW ORDER")).click();
//Step 6
		String recentOrd = driver.findElement(By.cssSelector("h2")).getText();
		if("RecentOrder".equals(recentOrd))
				{
			System.out.println("Recen Order Displayed");
				}
		else
		{
			System.out.println("Recen Order failed to Displayed");
		}
//Step 7
		driver.findElement(By.linkText("Print Order")).click();
		driver.quit();
}
}


