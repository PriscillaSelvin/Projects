package PageClasses;

import org.openqa.selenium.By;
 
 

public class appointmentPage 
{
   public static By homepage()
   {
   String homeclick = "//a[@href='/openmrs/spa/home']";
   return By.xpath(homeclick);
   }
	
	public static By clickAppointments()
	{
		//String clickAppt =  "//a[@class='cds--side-nav__link active-left-nav-link']";
		String clickAppt = "//a[contains(text(),'Appointments')]";
		//String clickAppt = "//a[@href='/openmrs/spa/patient/da4f423d-5784-4a06-97e9-f47382401e2b/chart/Appointments' and @class='cds--side-nav__link active-left-nav-link' ]";
		//String clickAppt = "//a[@href='/openmrs/spa/home/appointments']";
		return By.xpath(clickAppt);
	}
	public static By addnewAppointments()
	{
		//String newappt =  "//button[@class='cds--btn cds--btn--ghost' and @type = 'button'][4]";
		String newappt = "//button[contains(text(), 'Add')]";
		//String newappt = "//button[@class='cds--btn cds--btn--md cds--layout--size-md cds--btn--primary']";
		return By.xpath(newappt);
		
	}
	public static By searchPatient()
	{
		String searchPat = "//input[@id='search-input-:r2f:']";
		return By.xpath(searchPat);
	}
	public static By clickSearch()
	{
		String click_search = "//button[@class='cds--btn cds--layout--size-lg cds--btn--secondary']";
		return By.xpath(click_search);
	}
	public static By selectPatient()
	{
		String selPat = "//div[@class='-esm-patient-search__patient-banner__demographics___oNdDk']";
		return By.xpath(selPat);
	}
	public static By selectService()
	{
		String service = "//select[@id='service']";
		return By.xpath(service);
	}
	public static By selectAppointmentType()
	{
		String apptType = "//select[@id='appointmentType']";
		return By.xpath(apptType);
	}
	public static By duration()
	{
		String timeDuration = "//input[@id='duration']";
		return By.xpath(timeDuration);
	}

	public static By selectAppointmentStatus()
	{
		String apptStatus = "//select[@id='appointmentStatus']";
		return By.xpath(apptStatus);
	}
	public static By submitAppointment()
	{
		String btnSubmitAppt = "//button[@class='-esm-appointments__appointments-form__button___Qxg5L cds--btn cds--btn--primary']";
		return By.xpath(btnSubmitAppt);
	}
	public static By todayAppointment()
	{
		String btnSubmitAppt = "//span[@class='cds--content-switcher__label' and @title = 'Today']";
		return By.xpath(btnSubmitAppt);
	}
}
