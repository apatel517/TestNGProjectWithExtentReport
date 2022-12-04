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

public class Test5 extends base {

WebDriver driver;
	
	
	@Test
	public void TestCase5() {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
	//Step 2
		driver.findElement(By.cssSelector(".skip-link.skip-account")) .click();
//Step 3
		driver.findElement(By.xpath("//a[@title='Register']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Asad");
		driver.findElement(By.id("lastname")).sendKeys("Patel");
		driver.findElement(By.id("email_address")).sendKeys("apatel978@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ap01234");
		driver.findElement(By.id("confirmation")).sendKeys("ap01234");
//Step 4
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
//Step 5
	String confirmation =driver.findElement(By.xpath("//li[@class='success-msg']//ul//li")).getText();
	System.out.println(confirmation);
	if(confirmation.equals(confirmation))
	{
		System.out.println("Registration is Successfull");	
	}
	else
	{
		System.out.println("Registration is Successfull");
	}
//Step 6
	driver.findElement(By.xpath("//a[normalize-space()='TV']")).click();
//Step 7
	driver.findElement(By.xpath("//li/a[@class='link-wishlist']")).click();
//Step 8
	driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
//Step 9
	driver.findElement(By.id("email_address")).sendKeys("as@gmail.com");
	driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();
//Step 10
	String wishList=driver.findElement(By.cssSelector("li[class='success-msg'] ul li")).getText();
	System.out.println(wishList);
	if(wishList.equals(wishList))
	{
		System.out.println("WishList Successfully Shared");
	}
	else
	{
		System.out.println("WishList Failed to Shared");
	}
		driver.quit();
}
}

