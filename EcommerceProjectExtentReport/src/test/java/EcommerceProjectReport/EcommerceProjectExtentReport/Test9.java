package EcommerceProjectReport.EcommerceProjectExtentReport;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test9 extends base {
WebDriver driver;
	
	
	@Test
	public void TestCase9() throws InterruptedException, IOException {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
	//Step 2
      driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		 driver.findElement(By.xpath("//li[1]//div[1]//div[3]//button[1]//span[1]//span[1]")).click();
//Step 3
		 driver.findElement(By.id("coupon_code")).sendKeys("GURU50");
		 driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
//Step 4
		 String text= driver.findElement(By.className("success-msg")).getText();
		 System.out.println(text);
    
		 
	      if (text.equals(text))
		  {
			System.out.println("coupon applied successfully");
		  }
		 else
		  {
			System.out.println("coupon is not applied");
		  }
	      Thread.sleep(2000);
	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(scrFile, new File("./scrshots.png"));
	      driver.quit();
}
}