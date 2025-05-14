package TeestClasses;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import PageClasses.RecordPatientDetailsPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class AddPatVitalsTest extends BaseClass

{
	@Test(priority = 4, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void addPatVitals() throws InterruptedException
	{
		//LoginTest.executeLoginTest();
		//scrollDown();
		//addExplicitWait(RecordPatientDetailsPage.clickPatName());
		//driver.findElement(RecordPatientDetailsPage.clickPatName()).click();
		//Thread.sleep(3000);
		addExplicitWait(RecordPatientDetailsPage.recordVitals());
		driver.findElement(RecordPatientDetailsPage.recordVitals()).click();
		
		addExplicitWait(RecordPatientDetailsPage.temprature());
		driver.findElement(RecordPatientDetailsPage.temprature()).sendKeys("32");;
		addExplicitWait(RecordPatientDetailsPage.systolic());
		driver.findElement(RecordPatientDetailsPage.systolic()).sendKeys("120");
		addExplicitWait(RecordPatientDetailsPage.diastolic());
		driver.findElement(RecordPatientDetailsPage.diastolic()).sendKeys("80");
		addExplicitWait(RecordPatientDetailsPage.heartRate());
		driver.findElement(RecordPatientDetailsPage.heartRate()).sendKeys("200");
		addExplicitWait(RecordPatientDetailsPage.submitDetails());
		driver.findElement(RecordPatientDetailsPage.submitDetails()).click();
		
	}
	
	

}
