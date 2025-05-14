package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage
{
WebDriver driver;
	
	public ForgetPasswordPage(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[6]")
	WebElement Forget_Password;
	@FindBy(xpath="//input[@id = 'input_7539084004150']")
	WebElement user_email;
	@FindBy(xpath="//input[@id='input_7539084004151']")
	WebElement user_mobileno;
	@FindBy(xpath="//button[@type='submit']")
	WebElement SubmitButton;
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement textMessage;
	
	
	public void clickOnLogin()
	{
		Forget_Password.click();
	}
	
	 public void enterUserEmail(String Useremail)
	   {
		   user_email.sendKeys(Useremail);
	   }
	   
	   public void enterMobileno(String mobileno)
	   {
		   user_mobileno.sendKeys(mobileno);	
		      
	   }
	   public void onSubmit()
		{
		   SubmitButton.submit();
		}
		
		public String validateMessage()
		{
			String message=textMessage.getText();
			return message;
		}
	

}
