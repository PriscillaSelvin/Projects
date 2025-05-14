package PageClasses;

import org.openqa.selenium.By;
 

public class LoginPage  
{
   public static By getUserName()
   {
	   String uname = "//input[@id='username']";
	   return By.xpath(uname );
   }
   public  static By getContinueButton()
   {
	   //String btn_continue = "//button[.='Continue']";
	   String btn_continue = "//button[@class='continue-button btn-primary']";
	   return By.xpath(btn_continue);
   }
   
   public  static By getPassword()
   {
	   String password = "//input[@id='password']";
	   return By.xpath(password);
   }
   
   public static By clickOnSubmit()
   {
	   //String btn_Submit = "//button[@type='submit']";
	   String btn_Submit = "(//button[@class='continue-button btn-primary'])[2]";
	   
	   return By.xpath(btn_Submit);
   }
}
