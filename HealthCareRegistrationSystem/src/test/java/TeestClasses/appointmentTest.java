package TeestClasses;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

 
import PageClasses.appointmentPage;
import utilities.BaseClass;

public class appointmentTest extends BaseClass
{

	@Test(priority=2, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void createAppointment() throws InterruptedException
	{
		 
		addExplicitWait(appointmentPage.clickAppointments());
		driver.findElement(appointmentPage.clickAppointments()).click();
		System.out.println("Test case Passed"); 
		Thread.sleep(3000);
		addExplicitWait(appointmentPage.addnewAppointments());
		driver.findElement(appointmentPage.addnewAppointments()).click();
		 		
		addExplicitWait(appointmentPage.selectService());
		driver.findElement(appointmentPage.selectService()).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(appointmentPage.selectService()).sendKeys(Keys.ENTER);
		addImplicitWait();
		addExplicitWait(appointmentPage.selectAppointmentType());
		driver.findElement(appointmentPage.selectAppointmentType()).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(appointmentPage.selectAppointmentType()).sendKeys(Keys.ENTER);
		addImplicitWait();
		addExplicitWait(appointmentPage.duration());
		driver.findElement(appointmentPage.duration()).sendKeys("30");
		addImplicitWait();
		addExplicitWait(appointmentPage.selectAppointmentStatus());
		driver.findElement(appointmentPage.selectAppointmentStatus()).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(appointmentPage.selectAppointmentStatus()).sendKeys(Keys.ENTER);
		addImplicitWait();
		addExplicitWait(appointmentPage.submitAppointment());
		driver.findElement(appointmentPage.submitAppointment()).click();
		addExplicitWait(appointmentPage.todayAppointment());
		driver.findElement(appointmentPage.todayAppointment()).click();
		Thread.sleep(4000);		 
	}
}
