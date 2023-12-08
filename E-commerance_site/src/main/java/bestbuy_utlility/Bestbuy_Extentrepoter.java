package bestbuy_utlility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Bestbuy_Extentrepoter {
	
	public static ExtentReports getreports() {
		
		ExtentSparkReporter report=new ExtentSparkReporter("./reports/report.html");
		report.config().setReportName("E-commerancesite");
		report.config().setDocumentTitle("Bestbuy_title");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		return extent;
		
	}

}
