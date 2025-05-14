package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class SignUpPage  extends BaseClass
{
	WebDriver driver;
	
	public SignUpPage(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[3]")
	WebElement signUp;
	@FindBy(xpath="//input[@id='input_1495646567135']")
	WebElement FirstName;
   
   @FindBy (xpath = "//input[@id='input_1500473664921']")
   WebElement LastName;
   @FindBy (xpath = "//input[@id='input_1495646533382']")
   WebElement Phone;
   @FindBy (xpath = "//input[@id='input_1742711839224']")
   WebElement DOB;
   @FindBy (xpath = "//select[@id='input_1742711863977']")
   WebElement gender;
   @FindBy (xpath = "//input[@id='input_1742711965354']")
   WebElement city;
   @FindBy (xpath = "//input[@id='input_1742711986078']")
   WebElement username;
   @FindBy (xpath = "//input[@id='input_1742712432708']")
   WebElement password;
   @FindBy(xpath="//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textMessage;
   
   public void clickOnSignUp()
	{
		signUp.click();
	}
   
   public void enterFirstName(String firstName)
   {
	   FirstName.sendKeys(firstName);
   }
   
   public void enterLastName(String lastName)
   {
	   LastName.sendKeys(lastName);	   
   }
   
   public void enterPhone(String phonenum)
   {
	   Phone.sendKeys(phonenum);
	   scrollDown();
   }
  
   public void enterDOB(String dateofbirth)
   {
	   DOB.sendKeys(dateofbirth);	   
   }
   
   public void selectGender(int x)
	{
		Select oselect=new Select(gender);
		oselect.selectByIndex(x);
	}
	
	public void clickonSubmit()
	{
		submitButton.submit();
	}
	
	public String validateMessage()
	{
		String message=textMessage.getText();
		return message;
	}
}
