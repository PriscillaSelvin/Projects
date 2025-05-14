package PageClasses;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class AccountDetailsPage extends BaseClass
{
WebDriver driver;
WebDriverWait wait;
	
	public AccountDetailsPage(WebDriver driver )
	{
		this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Corrected Duration usage
		PageFactory.initElements(driver, this);
		
	}
 
	@FindBy(xpath="(//a[@class='t-menu__link-item'])[7]")
	WebElement AccountDetailslink;
	@FindBy(xpath="//select[@id = 'collection_comp-m8swuunx']")
	WebElement account_Name;
	@FindBy(xpath="//div[@id='menuitem-0']")
	WebElement accOne;	 
	@FindBy(xpath="//div[@id='comp-m8swx4kp']")
	WebElement login_button;
	@FindBy(xpath="//div[@id='tab-comp-m8szwsxa']")
	WebElement deposit_tab;
    @FindBy(xpath = "//*[@id=\"tab-comp-m8szwsxa\"]/span")
    WebElement Deposit;
	@FindBy(xpath="//input[@id='input_comp-m8t00o79']")
	WebElement amount;
	@FindBy(xpath="//div[@id='comp-m8t0270q']")
	WebElement deposit_button;
	@FindBy(xpath="//div[@id='tab-comp-m8szwsx41']")
	WebElement withdraw_tab;
	@FindBy(xpath="//div[@id='tab-comp-m8szwsx41']")
	WebElement withdrawtab;
	@FindBy(xpath="//input[@id='input_comp-m8t03jwk']")
	WebElement wdl_amount;
	@FindBy(xpath="//button[@class='_NpZMS wixui-button PlZyDq']")	 
	WebElement withdraw_button;	 	 
	@FindBy(xpath="//div[@class='js-successbox t-form__successbox t-text t-text_md']")
	WebElement text_Message;
	
	
	public void clickOnAccountDetails()
	{
		AccountDetailslink.click();
	}
	
	 public void selectyourName() throws InterruptedException, AWTException
	   {
		      
			
		 
			wait.until(ExpectedConditions.elementToBeClickable(account_Name)).click();
	    	Thread.sleep(5000);
	    	account_Name.sendKeys(Keys.ARROW_DOWN); // if Rahul is first or second option
	    	account_Name.sendKeys(Keys.ARROW_DOWN);
	    	account_Name.sendKeys(Keys.ENTER); // Confirm selection
	    	account_Name.sendKeys(Keys.ENTER); // Confirm selection
	    	account_Name.sendKeys(Keys.ARROW_DOWN);
	    	account_Name.sendKeys(Keys.ENTER); // Confirm selection

   
	   }
	   
	   public void submitLogin()
	   {
		   login_button.click();;	
		      
	   }
	   public void depositClick() throws InterruptedException
	   {
		   addHardCodedWait();
		   Deposit.click();	
		      
	   }
	   public void enteryourAmount(String your_amount) throws InterruptedException
	   {
		   addHardCodedWait();
		   amount.sendKeys(your_amount);	
		      
	   }
	   public void depositSubmit() throws InterruptedException
	   {
		   addHardCodedWait();
		   deposit_button.click();		   
		     
	   }
	   public void withdrawClick() throws InterruptedException
	   {
		   addHardCodedWait();
		   withdrawtab.click();	
		      
	   }
	   public void enterwdlAmount(String your_amount) throws InterruptedException
	   {
		   addHardCodedWait();
		   wdl_amount.sendKeys(your_amount);	
		      
	   }
	   public void withdrawSubmit() throws InterruptedException
	   {
		   addHardCodedWait();
		   withdraw_button.click();	
		      
	   }
	    
		
		public String validateMessage()
		{
			String message=text_Message.getText();
			return message;
		}
	
	   

}
