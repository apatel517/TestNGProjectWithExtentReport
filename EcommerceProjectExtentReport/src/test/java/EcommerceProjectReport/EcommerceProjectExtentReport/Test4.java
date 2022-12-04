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

public class Test4 extends base {

WebDriver driver;
	
	
	@Test
	public void TestCase4() {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
 //Step 2
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 3
		 driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]")).click();
//Step 4
		 driver.findElement(By.xpath("//button[@title='Compare']//span//span[contains(text(),'Compare')]")).click();
		 for (String handle:driver.getWindowHandles())
		 {
			driver.switchTo().window(handle) ;
		 }
			 
//Step 5
		String heading = driver.findElement(By.xpath("//h1[normalize-space()='Compare Products']")).getText();
	    System.out.println(heading);
	    if (heading.equals(heading))
	    {
	    	System.out.println("Two phone are Compared");
	    }
	    else
	    {
	    	System.out.println("Two phone are not compared");
	    }
//Step 6
	    driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	    driver.quit();
	}
	
	
}
