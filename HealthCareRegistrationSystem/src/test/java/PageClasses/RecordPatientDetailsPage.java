package PageClasses;

import org.openqa.selenium.By;

public class RecordPatientDetailsPage {
	
	
	
	
	public static By clickPatName()
	{		
	return	By.xpath("//a[@href='/openmrs/spa/patient/8bdece81-5b38-458b-92cc-523b7ee02894/chart']");
		 
	//return By.xpath("(//script[@src='/openmrs/spa/openmrs.82b4aa057953423f.js'])");
	}
	
	public static By recordVitals()
	{
		//return	By.xpath("(//button[@class='cds--btn cds--btn--sm cds--layout--size-sm cds--btn--ghost'])[1]");
	       return By.xpath("//button[contains(text(), 'Record vitals')]");
	}
	
	public static By temprature()
	{
		return	By.xpath("//input[@name='Temperature']");
	}
	
	public static By systolic()
	{
		return	By.xpath("//input[@name='systolic']");
	}
	
	public static By diastolic()
	{
		return	By.xpath("//input[@name='diastolic']");
	}
	
	public static By heartRate()
	{
		return	By.xpath("//input[@name='Pulse']");
	}
	
	
	public static By submitDetails()
	{
		return	By.xpath("//button[@type='submit']");
	}

}
