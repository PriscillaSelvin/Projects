package TeestClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import PageClasses.conditionsPage;
import utilities.BaseClass;

public class conditionsTest extends BaseClass
{

	@Test(priority=5, groups = {"sanity"},retryAnalyzer = utilities.RetryAnalyzer.class)
	public static void executeConditions() throws InterruptedException
	{
	addExplicitWait(conditionsPage.clickConditions());
	driver.findElement(conditionsPage.clickConditions()).click();
	Actions actions1 = new Actions(driver);
    actions1.moveToElement(driver.findElement(By.xpath("//div[@class='cds--tile -esm-appointments__empty-state__tile___iS7NK']")));
	addExplicitWait( conditionsPage.addnewConditions());
	driver.findElement(conditionsPage.addnewConditions()).click();
	addExplicitWait( conditionsPage.searchCondition());
	driver.findElement(conditionsPage.searchCondition()).sendKeys("heart");
	Thread.sleep(3000);
	addExplicitWait( conditionsPage.selectCondt());
	List<WebElement> a1 = driver.findElements(conditionsPage.selectCondt());
	System.out.println("List a1");
	System.out.println(a1);
	a1.get(2).click();
	addExplicitWait( conditionsPage.selectclinicalStatus());
	WebElement radio = driver.findElement(conditionsPage.selectclinicalStatus());
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", radio);
	//driver.findElement(conditionsPage.selectclinicalStatus()).click();
	addExplicitWait( conditionsPage.submitConditions());
	driver.findElement(conditionsPage.submitConditions()).click();
	 
}
}
