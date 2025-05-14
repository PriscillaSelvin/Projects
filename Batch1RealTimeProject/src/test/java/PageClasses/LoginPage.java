package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
   WebDriver driver;
	
	public LoginPage(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[5]")
	WebElement loginlink;
	@FindBy(xpath="//input[@id = 'input_1495646567135']")
	WebElement userName;
	@FindBy(xpath="//input[@id='input_1742715919526']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement Buttonsubmit;
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textMessage;
	
	
	public void clickOnLogin()
	{
		loginlink.click();
	}
	
	 public void enterUserName(String Username)
	   {
		   userName.sendKeys(Username);
	   }
	   
	   public void enterPassword(String pwd)
	   {
		   password.sendKeys(pwd);	
		      
	   }
	   public void onSubmit()
		{
		   Buttonsubmit.submit();
		}
		
		public String validateMessage()
		{
			String message=textMessage.getText();
			return message;
		}
	
}
