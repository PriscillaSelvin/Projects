package TeestClasses;
 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.RegisterPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;
import utilities.RetryAnalyzer;

@Listeners(ListenerImplementation.class)

public class RegisterPatientTest extends BaseClass
{
	// LoginTest logintest = new LoginTest();
	 // RegisterPage registerpage = new RegisterPage();
	//{"Henry", "Williamson" , "34", "Kolkata"}
	 
	   @DataProvider(name="registerpatientdata")
	   public Object [][] method()
	   {
		   return new Object[][] 
				   {
			   {"Bev", "Green" , "82", "Manitoba"}
			   
				   };
		   }
	   @Test(priority=1, dataProvider="registerpatientdata",groups= {"sanity"}, retryAnalyzer = utilities.RetryAnalyzer.class)
	   public void addPatient(String fname,String lname, String patientage, String adds)throws InterruptedException   
	   {
		    addImplicitWait();
		    //LoginTest.executeLoginTest();
		    addExplicitWait(RegisterPage.addPatientButton());
		    driver.findElement( RegisterPage.addPatientButton()).click();
		    addExplicitWait(RegisterPage.patientIdentityButton());
		    driver.findElement( (RegisterPage.patientIdentityButton())).click();
			addExplicitWait(RegisterPage.firstName());
		    driver.findElement( (RegisterPage.firstName())).sendKeys(fname);
		    addExplicitWait(RegisterPage.lastName());
		    driver.findElement( (RegisterPage.lastName())).sendKeys(lname);
		    scrollDown();
			addExplicitWait(RegisterPage.gender());
			Thread.sleep(3000);
		    driver.findElement( (RegisterPage.gender())).click();
		    addExplicitWait(RegisterPage.dobStataus());
			scrollDown();
			WebElement element=driver.findElement(RegisterPage.dobStataus());
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			addExplicitWait(RegisterPage.age());
			Thread.sleep(3000);
		   driver.findElement( (RegisterPage.age())).sendKeys(patientage);
		   driver.findElement( (RegisterPage.address()));
			WebElement element1=	driver.findElement(RegisterPage.address());
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
			    element1.sendKeys(adds);
			addExplicitWait(RegisterPage.btnregPatient());
			Thread.sleep(3000);
		   driver.findElement( (RegisterPage.btnregPatient())).click();
		   addExplicitWait(RegisterPage.validatePatID());

		   WebElement patId = driver.findElement( (RegisterPage.validatePatID()));
	         if (patId.isDisplayed() == true)
	         {
	        	 System.out.println("Test case Passed");
	        	 
	         }
	         else
	         {
	        	 throw new NullPointerException("Patient Registration faile");
	         }
	         Thread.sleep(4000);
	     	 
	   	//Actions a1 = new Actions(driver);
	   	//a1.moveToElement(driver.findElement(By.xpath("//nav[@class='cds--side-nav__navigation fEgN8Bvix0Pspnd0+Kv3rA== cds--side-nav cds--side-nav--expanded cds--side-nav--ux'and @aria-label = 'Left navigation' ]")));
	   	System.out.println("Test case Passed");
	   	//a1.moveToElement(driver.findElement(By.xpath("//div[@dr = 'patient-appointments-summary-dashboard']")));
		//System.out.println("Test case Passed");    
	   	// Actions a1 = new Actions(driver);
	         //a1.moveToElement(driver.findElement(By.xpath("//header[@aria-label='OpenMRS']")));
	       //  appointmentTest.createAppointment();
	        // Thread.sleep(4000);
	       //  startvisitTest.createVisit();
	        // Thread.sleep(4000);
	        // AddPatVitalsTest.addPatVitals();
	         Thread.sleep(4000);
	        // conditionsTest.executeConditions();      
	         
	        // driver.findElement( (RegisterPage.closePg())).click();
	   }
}
