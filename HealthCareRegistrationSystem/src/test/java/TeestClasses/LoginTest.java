package TeestClasses;

import org.openqa.selenium.By;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import utilities.BaseClass;
import utilities.ListenerImplementation;


@Listeners(ListenerImplementation.class)

public class LoginTest extends BaseClass
{
	//LoginPage obj = new LoginPage();
	
	@Test(priority=0, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void executeLoginTest() throws InterruptedException
	{
		addExplicitWait(LoginPage.getUserName());
		driver.findElement(LoginPage.getUserName()).sendKeys("jdoe");
		addExplicitWait(LoginPage.getContinueButton());
		driver.findElement(LoginPage.getContinueButton()).click();
		addExplicitWait(LoginPage.getPassword());
		driver.findElement(LoginPage.getPassword()).sendKeys("password");
		Thread.sleep(3000);
		addExplicitWait(LoginPage.clickOnSubmit());
		driver.findElement(LoginPage.clickOnSubmit()).click();
		 
	}

}
