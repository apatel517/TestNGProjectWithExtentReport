package EcommerceProjectReport.EcommerceProjectExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporteNG {

	static ExtentReports extent;
	public static ExtentReports extentReportGenerator()
	{
		
	
	String path = System.getProperty("user.dir")+"/reports/index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Ecommerece Test Report");
	reporter.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Asad Patel");
	return extent;
}
}

