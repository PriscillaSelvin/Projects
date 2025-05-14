package PageClasses;

import org.openqa.selenium.By;

public class startvisitPage 
{
	public static By startVisit()
	{
		//String clickVisit =  "//button[@class='-esm-patient-chart__visit-header__startVisitButton___ZgOSy cds--btn cds--layout--size-lg cds--btn--primary']";
		String clickVisit = "//button[contains(text(), 'Start a visit')]";
		return By.xpath(clickVisit);
	}
	public static By visitType()
	{
		String selectvisitType =  "//span[@class='cds--radio-button__label-text'][1]";
		return By.xpath(selectvisitType);
		
	}
	public static By submitVisit()
	{
		String btnSubmitVisit = "//button[@type='submit']";
		return By.xpath(btnSubmitVisit);
	}
}
