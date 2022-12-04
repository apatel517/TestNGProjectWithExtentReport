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

public class Test8 extends base {

WebDriver driver;
	
	
	@Test
	public void TestCse8() throws InterruptedException {
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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='link-reorder']")).click();
		 String beforePrice = driver.findElement(By.cssSelector("strong span[class='price']")).getText();
		 System.out.println(beforePrice);
		 driver.findElement(By.cssSelector("input[title='Qty']")).clear();
		 driver.findElement(By.cssSelector("input[title='Qty']")).sendKeys("10");
		 driver.findElement(By.cssSelector("button[title='Update'] span span")).click();
		 String afterPrice = driver.findElement(By.cssSelector("strong span[class='price']")).getText();
		 System.out.println(afterPrice);
		 if(beforePrice.equals(afterPrice))
		 {
			 System.out.println("Grand Total Is not changed");
		 }
		 else
		 {
			 System.out.println("Grand Total Is changed");
		 }
//Step 6
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("billing:use_for_shipping_yes")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@onclick='billing.save()']//span//span[contains(text(),'Continue')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[onclick='shippingMethod.save()'] span span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[onclick='payment.save()'] span span")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
		 driver.quit();
}
}