package amazonproject_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regisration_Page 
{
	public Regisration_Page(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	
	// Step 1
@FindBy(xpath = "//input[@name='customerName']")  
WebElement custname_tf;
@FindBy(xpath = "//input[@name='email']")
WebElement email_tf;
@FindBy(xpath = "//input[@name='password']")
WebElement pwd_tf;
@FindBy(xpath = "//input[@id='ap_password_check']")
WebElement pwdcheck_tf;
@FindBy(xpath = "//input[@id='continue']")
WebElement contbutton_tf;

//Step 2
public void custname()
{
	  custname_tf.sendKeys("PriscillaSelvin");
}
public void email()
{
	  email_tf.sendKeys("paselvincareers@yahoo.ca");
}
public void pwd()
{
	  pwd_tf.sendKeys("1PrisciJohn23*");
}
public void pwdcheck()
{
	  pwdcheck_tf.sendKeys("1PrisciJohn23*");
}
public void continue_button()
{
	  contbutton_tf.click();
}


}
