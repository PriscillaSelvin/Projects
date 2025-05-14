package PageClasses;

import org.openqa.selenium.By;

public class RegisterPage
{
public static By addPatientButton()
{
	String addPatientButton = "//button[@name='AddPatientIcon']";
	return By.xpath(addPatientButton);
}

public static By patientIdentityButton()
{
	String patientIdentityButton = "(//button[@type='button' and @aria-selected = 'true'])[1]";
	return By.xpath(patientIdentityButton);
}

public static By firstName()
{
	String firstName = "//input[@id = 'givenName']";
	return By.xpath(firstName);
}

public static By lastName()
{
	String lastName =  "//input[@id = 'familyName']";
	return By.xpath(lastName);
}
public static By gender()
{
	String gender =  "(//span[@class='cds--radio-button__appearance'])[1]";
	return By.xpath(gender);
	
}
public static By dobStataus()
{
	//String dobSt="(//button[@aria-selected='true'])[2]";
	return By.xpath("(//button[@aria-selected='false'])[2]");
}

public static By age()
{
	String age =  "//input[@id = 'yearsEstimated']";
	return By.xpath(age);
}
public static By address()
{
	String address = "//input[@role='searchbox']";
	return By.xpath(address);
}
public static By btnregPatient()
{
	String btnregPatient =  "//button[@type = 'submit']";
	return By.xpath(btnregPatient);
}

public static By validatePatID()
{
	String valid  = "//*[text()='OpenMRS ID']";
	return By.xpath(valid);
}

public static By closePg()
{
	String cPge = "//button[@aria-label='Close']";
	return By.xpath(cPge);
}

}
