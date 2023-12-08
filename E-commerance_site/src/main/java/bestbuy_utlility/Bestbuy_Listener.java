package bestbuy_utlility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_Listener extends BestBuy_base_class implements ITestListener {
	
	ExtentTest test;
	
	ExtentReports extents=Bestbuy_Extentrepoter.getreports();
	

	@Override
	public void onTestStart(ITestResult result) {
		test=extents.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "passed");
		System.out.println("Test Success");
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		System.out.println("Test failure");
		String filepath=null;
		try {
			filepath =takescreenshot(result.getMethod().getMethodName());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skip");
	}

	
	@Override
	public void onFinish(ITestContext context) {
    extents.flush();
	}
	
	

}
