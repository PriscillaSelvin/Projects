package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.edge.EdgeOptions;
 
 

import ConstantsData.constantData;

public class BaseClass
{
   public static WebDriver driver;
   //FetchDataFromProperty obj = new FetchDataFromProperty();
   
   @BeforeSuite(alwaysRun = true)
   public void openBrowser() throws IOException
   {
	   String browserName = FetchDataFromProperty.readDataFromProperty().getProperty("browser");
	   if(browserName.equalsIgnoreCase("chrome"))
	   {
		   driver = new ChromeDriver();
		   driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
		   driver.manage().window().maximize();
	   }
	   if(browserName.equalsIgnoreCase("edge"))
	   {
		   EdgeOptions options = new EdgeOptions();
                   options.addArguments("--headless=new"); // or "--headless" if "new" fails
                   options.addArguments("--disable-gpu");
                   options.addArguments("--window-size=1920,1080");
                   driver = new EdgeDriver(options);		   
		   String URL_address = FetchDataFromProperty.readDataFromProperty().getProperty("URL");
		   driver.get(URL_address);
		   driver.manage().window().maximize();
	   }
	   if(browserName.equalsIgnoreCase("fiefox"))
	   {
		   driver = new FirefoxDriver();
		   driver.get(FetchDataFromProperty.readDataFromProperty().getProperty("URL"));
		   driver.manage().window().maximize();
	   }
   }
   
   public static void addExplicitWait(By locator) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

   public static void addImplicitWait()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   }
   
   public static void scrollDown()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", " ");
	}
   public static void getWindowHandle()
	{
		Set<String> alltabs=driver.getWindowHandles();
		Iterator<String> pcid=alltabs.iterator();
		@SuppressWarnings("unused")
		String parentTab=pcid.next();
		String childTab=pcid.next();
		driver.switchTo().window(childTab);
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		if(driver != null)
		{
		driver.quit();
		}
		
	}
   
}
