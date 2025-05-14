package amazonproject_test;

import org.openqa.selenium.WebDriver;
 

import amazonproject_source.searchproduct_page;

public class TC5_SearchProduct 
{	 
	public static void main(String[] args) throws InterruptedException
	{
		Launch_Quit lq = new Launch_Quit();
		try
		{
			 WebDriver driver = lq.Launch();
			 TC2_SuccessfulLogin login = new TC2_SuccessfulLogin();
			 login.loginuser(driver) ; 
			 searchproduct_page searchpage = new searchproduct_page(driver);
			 searchpage.searchtext();
			 searchpage.search();
		} 
		catch (Exception e)
		{
			 e.printStackTrace();
		} 
		  
	}

}
