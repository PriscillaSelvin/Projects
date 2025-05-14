package StepDefinition;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import PageClasses.AccountDetailsPage;
import PageClasses.ContactUs;
import PageClasses.ForgetPasswordPage;
import PageClasses.LoginPage;
import PageClasses.SignUpPage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass 
{
	WebDriver driver = BaseClass.initializeDriver();
	SignUpPage signup = new SignUpPage(driver);
	LoginPage login = new LoginPage(driver);
	ContactUs contactus = new ContactUs(driver);
	AccountDetailsPage accountdetailspage = new AccountDetailsPage(driver);	
	ForgetPasswordPage forgetpasswordpage = new ForgetPasswordPage(driver);
	String ActualMessage="Thank you! Your data has been submitted.";
	
	 @After("@test1")
	 
	 public void closeWindow()
	 {
		 closeBrowser();
	 }
//   **********SignupPage *************
	@Given("user opens the url for banking application")
	public void user_opens_the_url_for_banking_application()
	{
	    System.out.println("Application launched");
	    System.out.println(getPageTitle());
	    String x = getPageTitle();
	    Assert.assertEquals(x, "Home");
	}
	
	@Given("user clicks on SignUp Button in WebPage")
	public void user_clicks_on_sign_up_button_in_web_page() 
	{
	     signup.clickOnSignUp();
	}
	
	@Given("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String firstname)
	{
	     signup.enterFirstName(firstname);
	}

	@Given("user enters the lastname as {string}")
	public void user_enters_the_lastname_as(String lastname) 
	{
	     signup.enterLastName(lastname);
	}

	@Given("user enters the phonenumber as {string}")
	public void user_enters_the_phonenumber_as(String phonenumber)
	{
	     signup.enterPhone(phonenumber);
	     scrollDown();
	}

	@Given("user enters the dateofBirth as {string}")
	public void user_enters_the_dateof_birth_as(String DateOfBirth) throws InterruptedException
	{
		 addHardCodedWait();
	     signup.enterDOB(DateOfBirth);
	}

	@Given("user selects the gender")
	public void user_selects_the_gender()
	{
	    signup.selectGender(1);
	}

	@Given("user enters the cityname as {string}")
	public void user_enters_the_cityname_as(String city)
	{
	    
	}

	@Given("user enters the userid as {string}")
	public void user_enters_the_userid_as(String Username) 
	{
	    
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) 
	{
	    
	}
	@When("user clicks on SignUp button")
	public void user_clicks_on_sign_up_button() throws InterruptedException 
	{
	    scrollDown();
	    addHardCodedWait();
		signup.clickonSubmit();
	}

	@Then("user will get a message from the site")
	public void user_will_get_a_message_from_the_site() 
	{
	    
	}
	
	@Then("validate that user is getting proper response from the site")
	public void validate_that_user_is_getting_proper_response_from_the_site() throws InterruptedException
	{
		//addHardCodedWait();	
		//String msg=	signup.validateMessage();
		//Assert.assertEquals(ActualMessage, msg);

	}

	@Then("also verify that the Title of the page is showing correct value")
	public void also_verify_that_the_title_of_the_page_is_showing_correct_value()
	{
	     
	}
//  **********LoginPage *************

	@Given("user clicks on Login link in WebPage")
	public void user_clicks_on_login_link_in_web_page()
	{
	    login.clickOnLogin();
	}

	
	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String Uname)
	{
		login.enterUserName(Uname);
	}

	@Given("user enters the userpwd as {string}")
	public void user_enters_the_userpwd_as(String password) 
	{
		login.enterPassword(password);
		 
	}
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException
	{
		addHardCodedWait();  
		login.onSubmit();;
	}

	@Then("validate that user is able to login into the website")
	public void validate_that_user_is_able_to_login_into_the_website() throws InterruptedException
	{
		//addHardCodedWait();	
		//String msg=	login.validateMessage();
		//Assert.assertEquals(ActualMessage, msg);

	}
//  **********ContactusPage *************
	@Given("user clicks on Contactus link in WebPage")
	public void user_clicks_on_contactus_link_in_web_page()
	{
	     contactus.clickOnContact();
	}

	@Given("user enters the name as {string}")
	public void user_enters_the_name_as(String yourname)
	{
	     contactus.enteryourName(yourname );
	}

	@Given("user enters the email as {string}")
	public void user_enters_the_email_as(String youremail) 
	{
	     contactus.enteryourEmail(youremail);
	}

	@Given("user enters the Phonenum as {string}")
	public void user_enters_the_phonenum_as(String phonenum)
	{
		scrollDown();  
		contactus.enteryourPhone(phonenum);
	}

	@Given("user enters the Address as {string}")
	public void user_enters_the_address_as(String address) throws InterruptedException 
	{
		addHardCodedWait();
		contactus.enteryourAddress(address);
	}

	@Given("user enters the country as {string}")
	public void user_enters_the_country_as(String country)
	{
		scrollDown();
	     contactus.enteryourCountry(country);
	}
	@Given("user enters the zipcode as {string}")
	public void user_enters_the_zipcode_as(String zipcode)
	{
	     contactus.enteryourZipcode(zipcode);
	}

	@When("user clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException 
	{
		addHardCodedWait();
		contactus.onSubmit();
	}

	@Then("validate that user is able to submit details into the website")
	public void validate_that_user_is_able_to_submit_details_into_the_website()
	{
	    
	}
	 

//  **********forgetPasswordPage *************

	@Given("user clicks on Forget Password link in WebPage")
	public void user_clicks_on_forget_password_link_in_web_page() 
	{
		forgetpasswordpage.clickOnLogin();
	}

	@Given("user enters the useremail as {string}")
	public void user_enters_the_useremail_as(String useremail) 
	{
		forgetpasswordpage.enterUserEmail(useremail );
	     
	}

	@Given("user enters the usermobileno as {string}")
	public void user_enters_the_usermobileno_as(String usermobileno) 
	{
	    forgetpasswordpage.enterMobileno(usermobileno);
	}

	@When("user clicks on ResetPassword button")
	public void user_clicks_on_reset_password_button() throws InterruptedException 
	{
		addHardCodedWait();
		forgetpasswordpage.onSubmit();
	}

	@Then("validate that user is able to submit the user details into the website")
	public void validate_that_user_is_able_to_submit_the_user_details_into_the_website()
	{
	     
	}

//   **********AccountDetailsPage *************
	
	@Given("user clicks on Account Detail link in WebPage")
	public void user_clicks_on_account_detail_link_in_web_page() throws InterruptedException
	{
		addHardCodedWait();
		accountdetailspage.clickOnAccountDetails();
	}
	@Given("user navigates to the AccountDetails Page")
	public void user_navigates_to_the_account_details_page()
	{
		getWindowHandle();
		System.out.println("Passed Window Handle");
		System.out.println(getPageTitle());
	}

	@Given("user selects the accountusername")
	public void user_selects_the_accountusername() throws InterruptedException, AWTException 
	{
		 
		//addExplicitWait(By.xpath("//div[@id='menuitem-0']"));
		accountdetailspage.selectyourName( );
		addHardCodedWait();
	}

	@When("user clicks on Loginaccountuser button")
	public void user_clicks_on_loginaccountuser_button() 
	{
	   accountdetailspage.submitLogin();
	}

	@Then("validate that user is able to login into the AccountDetails Page")
	public void validate_that_user_is_able_to_login_into_the_account_details_page()
	{
	     System.out.println(getPageTitle());
	     //getWindowHandle();
	}

	@Then("validate the balance amount")
	public void validate_the_balance_amount()
	{
	    System.out.print("balance");
	}

	@When("user clicks on Deposit link")
	public void user_clicks_on_deposit_link() throws InterruptedException 
	{
		accountdetailspage.depositClick();
	}

	@When("user enters the Depositamount as {string}")
	public void user_enters_the_depositamount_as(String DepositAmount) throws InterruptedException 
	{
		accountdetailspage.enteryourAmount(DepositAmount);
	}

	@Then("user clicks on Deposit button")
	public void user_clicks_on_deposit_button() throws InterruptedException
	{
		accountdetailspage.depositSubmit();
	}

	@Then("also verify the Balance amount")
	public void also_verify_the_balance_amount()
	{
		System.out.print("balance");
	}

	@When("user clicks on withdraw link")
	public void user_clicks_on_withdraw_link() throws InterruptedException
	{
		accountdetailspage.withdrawClick();
	}

	@When("user enters the withdrawamount as {string}")
	public void user_enters_the_withdrawamount_as(String WithdrawAmount) throws InterruptedException
	{
		accountdetailspage.enterwdlAmount(WithdrawAmount);
	}

	@Then("user clicks on withdraw button")
	public void user_clicks_on_withdraw_button() throws InterruptedException
	{
		accountdetailspage.withdrawSubmit();
		addHardCodedWait();
	}





}
