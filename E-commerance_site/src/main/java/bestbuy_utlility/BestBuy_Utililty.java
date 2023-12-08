package bestbuy_utlility;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuy_Utililty {
	
	

	ChromeOptions chromeoptions=new ChromeOptions();
	public static WebDriver driver;
	
	public void launchbrowsing(String browser,String url) {
		if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions edgeoptions=new EdgeOptions();
			edgeoptions.addArguments("--disable-notifications");

			driver =new EdgeDriver(edgeoptions);
			WebDriverManager.edgedriver().setup();
			System.out.println("edge is launched");
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeoptions=new ChromeOptions();
			chromeoptions.addArguments("--disable-notifications");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeoptions);
			System.out.println("chrome is launched");
		}else if (browser.equalsIgnoreCase("firefox")){
			FirefoxOptions firefoxoptions=new FirefoxOptions();
			firefoxoptions.addPreference("geo.enabled", false);
			firefoxoptions.addPreference("dom.webnotifications.enabled", false);
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(firefoxoptions);
			System.out.println("firefox is launched");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	
		

	  	public void sendkeys(WebElement element,String values) {
	  		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
            wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(values);
	  
	}
	  	public void action(WebElement elemnt) {
	  		Actions a=new Actions(driver);
	  		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	  		wait.until(ExpectedConditions.visibilityOf(elemnt));
	  		a.click(elemnt).build().perform();
	  	}
	  	public void click(WebElement element) {
	  		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	  		wait.until(ExpectedConditions.visibilityOf(element));
	  		element.click();
	  	}
		public void Assert(String actual,String Excepted) {
		    assertEquals(actual, Excepted);
		}
		public void closebrowser() {
			driver.close();
		}
		public String takescreenshot(String testmethodname) throws IOException  {
			String path="./screenshot/"+testmethodname+".png";
			TakesScreenshot screenshot=((TakesScreenshot)driver);
			File src=  screenshot.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			FileUtils.copyFile(src, dest);
			return path;
			
		}
		public void javascript(WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
            wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView();", element);
		}
		public void javascript_click(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click();", element);
		}
		public void findelements()  {
			 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
			 
			 for (WebElement link : links) {
				String url= link.getAttribute("href");
				System.out.println("----------");
				System.out.println(url);
				
				if(url==null||url.isEmpty()) {
					System.out.println("url is empty");
					continue;
				}
				
				try {
					HttpURLConnection htc=(HttpURLConnection)(new URL(url).openConnection());
					htc.connect();
					if(htc.getResponseCode()>=400) {
						System.out.println(url+" is broken");
					}else {
						System.out.println(url+ "is valid");
					} 
					htc.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 
		}
			
			
			
		
		
		}


