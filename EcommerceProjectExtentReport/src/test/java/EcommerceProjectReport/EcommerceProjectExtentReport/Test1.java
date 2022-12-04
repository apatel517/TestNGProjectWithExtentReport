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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test1  extends base
{
	WebDriver driver;
	
	
	@Test 
	public void TestCse1() throws IOException {
  //Step 1
	  driver=launchDriver();
	  driver.get("http://live.techpanda.org/");
  //Step 2
    String title = driver.findElement(By.xpath("//h2[1]")).getText();
    System.out.println(title);
    if(title.equals(title))
    {
	  System.out.println("Title is verified");
    }
    else
    {
	  System.out.println("Title is not verified");
    }
 //Step 3
	 driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
 //Step 4
	 String titleM = driver.findElement(By.xpath("//h1[normalize-space()='Mobile']")).getText();
	 System.out.println(titleM);
	 if(titleM.equals(titleM))
	 {
   System.out.println("Title is verified");	
	 }
	 else
	 {
   System.out.println("Title is not verified");
	 }
 //Step 5
	 WebElement statiDropwdown = driver.findElement(By.cssSelector("select[title=\"Sort By\"]"));
	 Select dropdown = new Select(statiDropwdown);
	 dropdown.selectByVisibleText("Name");
	
 //Step 6
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(scrFile, new File("./screenshots.png"));
     driver.quit();
}
}