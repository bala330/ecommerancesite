package bestbuy_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import bestbuy_utlility.BestBuy_Utililty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuy_base_class extends BestBuy_Utililty {
	

	FirefoxOptions firefoxoptions=new FirefoxOptions();
	ChromeOptions chromeoptions=new ChromeOptions();
	
	
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void browserlaunch(String browser,String url) {
		launchbrowsing(browser, url);
	}
	@AfterMethod
	public void browserclose() {
	closebrowser();
	}
	
	
}