package TeestClasses;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.exitPage;
import utilities.BaseClass;

public class exitvisitTest extends BaseClass
{
	@Test(priority = 6, groups="sanity", retryAnalyzer = utilities.RetryAnalyzer.class)
	public void endVisit() throws InterruptedException
	{
	 
	
	WebElement verifyActive = driver.findElement(exitPage.verifyActiveTitle());
	Assert.assertTrue(verifyActive.isDisplayed(), "'Active' tag should be visible before ending visit.");
	//logger.info("Verify that 'Active' tag should be visible before ending visit.");
	
	addExplicitWait(exitPage.clickOnEndVisit());
	driver.findElement(exitPage.clickOnEndVisit()).click();
	//test.log(Status.INFO, "Clicked on End Visit Button");
	//logger.info("Clicked on End Visit Button");
	
	addExplicitWait(exitPage.clickPopupEndVisit());
	driver.findElement(exitPage.clickPopupEndVisit()).click();
	//test.log(Status.INFO, "Clicked on End Visit Button in Confirmation Popup");
	//logger.info("Clicked on End Visit Button in Confirmation Popup");
	
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 boolean isTagGone = wait.until(ExpectedConditions.invisibilityOfElementLocated(exitPage.verifyActiveTitle()));
	 Assert.assertTrue(isTagGone, "'Active' tag should disappear after ending the visit.");
	 //test.log(Status.PASS,"Test Passes: Active is not visible");
	 //logger.info("Test Case Passed: Active is not visible");
}
}
