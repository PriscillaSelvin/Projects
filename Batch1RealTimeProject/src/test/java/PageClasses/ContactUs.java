package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class ContactUs 
{
WebDriver driver;
	
	public ContactUs(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[2]")
	WebElement Contactuslink;
	@FindBy(xpath="//input[@id = 'input_1496238250184']")
	WebElement your_Name;
	@FindBy(xpath="//input[@id='input_1496238230199']")
	WebElement your_Email;
	@FindBy(xpath="//input[@id='input_1496238259342']")
	WebElement your_Phonenum;
	@FindBy(xpath="//input[@id='input_1742714856123']")
	WebElement your_Address;
	@FindBy(xpath="//input[@id='input_1742714886366']")
	WebElement your_Country;
	@FindBy(xpath="//input[@id='input_1742714901821']")
	WebElement your_Zipcode;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Button_submit;
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement text_Message;
	
	
	public void clickOnContact()
	{
		Contactuslink.click();
	}
	
	 public void enteryourName(String yourname)
	   {
		   your_Name.sendKeys(yourname);
	   }
	   
	   public void enteryourEmail(String youremail)
	   {
		   your_Email.sendKeys(youremail);	
		      
	   }
	   public void enteryourPhone(String yourphone)
	   {
		   your_Phonenum.sendKeys(yourphone);	
		      
	   }
	   public void enteryourAddress(String youraddress)
	   {
		   your_Address.sendKeys(youraddress);	
		      
	   }
	   public void enteryourCountry(String yourcountry)
	   {
		   your_Country.sendKeys(yourcountry);	
		      
	   }
	   public void enteryourZipcode(String yourzipcode)
	   {
		   your_Zipcode.sendKeys(yourzipcode);	
		      
	   }
	   public void onSubmit()
		{
		   Button_submit.submit();
		}
		
		public String validateMessage()
		{
			String message=text_Message.getText();
			return message;
		}
	
	   public void exit()
	   {
		   BaseClass.closeBrowser();
	   }
}
