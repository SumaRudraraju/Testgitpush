package TestCases;




	import java.net.SocketTimeoutException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.base;
import PageObjects.ForgotPasswordPageObjects;
import PageObjects.LoginPageObjects;
import utilities.LoginReadConfig;

	public class ForgotPasswordTestCases  extends base{
		
		
		LoginReadConfig config = new LoginReadConfig();
		static Logger log = Logger.getLogger(LoginTestCases.class);
		
	    @Test(priority=1)
		public void  clickonForgotpasswordlinkonloginpage() throws InterruptedException {
	    	fppo= new ForgotPasswordPageObjects(driver);
	    	log.info("Ready to Click on forget password button");
	    	fppo.ClickonForgetPasswordlink();
	    	log.info("Clicked Forget password button");
	    	Thread.sleep(5000);
		}
		
		
		
	  @Test(priority=2)
	public void VerifyForgetpageUI() {
		  lpob =new LoginPageObjects(driver);
		 fppo= new ForgotPasswordPageObjects(driver);
		 log.info("ready to verify forget password Title");
		Assert.assertEquals(fppo.VerifyForgetPasswordpageTitle(),"Forgot password");
		log.info("Verified forget password Title");
		log.info("Ready to verify back to login");
		Assert.assertEquals(fppo.VerifyBacktoLoginlink(),"Back to login");
		log.info("Verified back to login");
		Assert.assertTrue(fppo.VerifyResetpasswordbutton());
		log.info("Ready to Verify username label");
		Assert.assertEquals(lpob.VerifyUsernameLabel(),config.getUsernameLabel());
		log.info("Verified Username label");
	}
	  @Test(priority=3)
	  public void WhentheuserclickontheUsernamefieldandagainclickontheoutsidefieldonforgetpasswordpage() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  
			lpob.clickontheUsernamefieldandagainclickontheoutsidefield();
			log.info("Ready to Verify usernamevalidation Message");
			Assert.assertEquals(fppo.VerifytheUsernamevalidation(),"User Name is required.");
		
			log.info("Verified usernamevalidation Message");
	  }
	  @Test(priority=4)	
	  public void WhenuserenteredInvalideUsernameidintheEmailfieldonResetpasswordpage() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		    log.info("Ready to enter invalied user name");
			lpob.EnterUserName(config.getInvaliedUserName());
			log.info("Entered invalied user name");
			Thread.sleep(2500);
			fppo.ClickonResetpasswordButton();
			System.out.println("Clicked Rest button");
			Thread.sleep(8000);
			lpob.Refeshthepage();
	  }	
	  @Test(priority=5)
	  public void WhentheuserentersvalideUsernameintoemailidfieldandagainclickonbackarrowbuttononthescreen() throws InterruptedException {
		  
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  log.info("Ready to enter valied user name");
			lpob.EnterUserName(config.getValiedUserName());
			log.info("Entered valied user name");
			Thread.sleep(5000);
			fppo.ClickonBacktoLoginlink();;
			Thread.sleep(8000);
			fppo.ClickonForgetPasswordlink();
			Thread.sleep(8000);
			//lpob.Refeshthepage();
			
	  }
	  @Test(priority=6)
	  public void Whentheuserwithoutenteringtextintoemailidfieldandagainclickonbackarrowbuttononthescreen() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  lpob.EnterUserName("");
			log.info("Entered Invalied user name");
			Thread.sleep(5000);
			fppo.ClickonBacktoLoginlink();;
			Thread.sleep(8000);
			fppo.ClickonForgetPasswordlink();
			Thread.sleep(8000);
	  }
	  @Test(priority=7)
	  public void WhentheuserentersInvalidemailintoemailidfieldandagainclickonbackarrowbuttononthescreen() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  lpob.EnterUserName(config.getInvaliedUserName());
			log.info("Entered valied user name");
			Thread.sleep(5000);
			fppo.ClickonBacktoLoginlink();
			Thread.sleep(8000);
			fppo.ClickonForgetPasswordlink();
			Thread.sleep(8000);
	 }
	  
	  @Test(priority=8)
	  public void WhentheuserentersthevalidmailintotheemailfieldandclickontheresetpasswordbuttononForgotpasswordScreen() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  lpob.EnterUserName(config.getValiedUserName());
			log.info("Entered valied user name");
			Thread.sleep(5000);
			fppo.ClickonResetpasswordButton();
			Thread.sleep(5000);
			Assert.assertEquals(fppo.VerifytheResetpasswordEmailText(), "Password reset link mailed successfully");
			Thread.sleep(000);
	  }
	  @Test(priority=9)
	  public void NavigateEmailBrowser() throws InterruptedException {
		  lpob =new LoginPageObjects(driver);
		  fppo= new ForgotPasswordPageObjects(driver);
		  try {
			fppo.NavigateEmailBrowsers();
		} catch (SocketTimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  @Test(priority=10)
	  public void EnterValiedCredentialschnagepasswordscreen() throws SocketTimeoutException, InterruptedException {
		  fppo= new ForgotPasswordPageObjects(driver);
		  fppo.EnterNewpasswordandComformpassword();
	  }
	  
	  
	  
	 @Test(priority=11)
	public void EnterValiedCredentials() {
				lpob =new LoginPageObjects(driver);
				lpob.EnterUserName(config.getValiedUserName());
				log.info("Username Entered");
				lpob.EnterPassword(config.getValiedPassword());
				log.info("Password Entered");
				lpob.Clickonloginbutton();
				
			}
	 
	 
	  }
	  
	  
	  
	  
	  

		


