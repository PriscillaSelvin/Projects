package TeestClasses;

import org.testng.annotations.Test;

import PageClasses.appointmentPage;
import PageClasses.startvisitPage;
import utilities.BaseClass;

public class startvisitTest extends BaseClass
{
	@Test(priority=3, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void createVisit() throws InterruptedException
	{
	 
		addExplicitWait(startvisitPage.startVisit());
		driver.findElement(startvisitPage.startVisit()).click();
		Thread.sleep(3000);
		scrollDown();
		addExplicitWait(startvisitPage.visitType());
		driver.findElement(startvisitPage.visitType()).click();
		addExplicitWait(startvisitPage.submitVisit());
		driver.findElement(startvisitPage.submitVisit()).click();;
		 
}
}
