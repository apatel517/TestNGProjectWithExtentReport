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

public class Test2 extends base {

WebDriver driver;
	
	
	@Test
	public void TestCae2() {
 //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
//Step 2
		 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
//Step 3
		 String cost = driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
		 System.out.println(cost);
		 if(cost.equals(cost))
		 {
			 System.out.println("Cost of sony Xperia is =" +cost) ;
		 }
		 else
		 {
			 System.out.println("Cost of sony Xperia is not verified");
		 }
//Step 4
		 driver.findElement(By.id("product-collection-image-1")).click();
//Step 5
		String detailCost = driver.findElement(By.xpath("//span[@class='price']")).getText();
		 System.out.println(detailCost);
		 if(detailCost.equals(detailCost))
		 {
			 System.out.println("Cost of sony Xperia in detail page is =" +detailCost) ;
		 }
		 else
		 {
			 System.out.println("Cost of sony Xperia is not verified");
		 }
		 driver.quit();
	}

}

