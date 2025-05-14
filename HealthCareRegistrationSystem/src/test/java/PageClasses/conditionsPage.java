package PageClasses;

import org.openqa.selenium.By;

public class conditionsPage 
{
	public static By clickConditions()
	{
		 
		String clickCondt = "//a[contains(text(),'Conditions')]";
				return By.xpath(clickCondt);
	}
	public static By addnewConditions()
	{
		//String recordCondt = "//button[contains(text(), 'conditions')]";
		//String recordCondt = "//button[@class = 'cds--btn cds--layout--size-lg cds--btn--ghost']";
		//String recordCondt = "//button[@type = 'button'][17]";
		//String recordCondt = "//button[contains(text(),'Record')][2]";
		String recordCondt = "//button[normalize-space()='Record conditions']";
		return By.xpath(recordCondt);
		
	}
	public static By searchCondition()
	{
		String searchPat = "//input[@id='conditionsSearch' and @type='text']";
		return By.xpath(searchPat);
	}
	public static By selectCondt()
	{
		String selectListCondt = "//fieldset[@class='cds--fieldset']/ul/li";
		return By.xpath(selectListCondt);
	}
	public static By submitConditions()
	{
		String savebutton = " //button[@type = 'submit']";
		return By.xpath(savebutton);
	}
	public static By selectclinicalStatus()
	{
		String clinicalStatus = "//input[@class='cds--radio-button' and @value = 'active']";
		return By.xpath(clinicalStatus);
	}
}
