package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.base;
import PageObjects.LoginPageObjects;

import org.apache.log4j.Logger;



import utilities.LoginReadConfig;

public class LoginTestCases extends base{
	
	LoginReadConfig config = new LoginReadConfig();
	static Logger log = Logger.getLogger(LoginTestCases.class);	
	
	@Test(priority=1, enabled= false)
	public void VerifyloginpageUI() throws InterruptedException {
	//log= Logger.getLogger(LoginTestCases.class);	
	lpob =new LoginPageObjects(driver);
	log.info("Ready to Verify loginpage titile");
	log.info("Ready to Verify loginpage Title");
	Assert.assertEquals(lpob.VerifyloginpageTitle(),config.getLoginpageTitle());
	log.info("Verified loginpage Title");
	log.info("Ready to Verify Username label");
	Assert.assertEquals(lpob.VerifyUsernameLabel(),config.getUsernameLabel());
	log.info("Verified Username Label");
	log.info("ready to Verify Username Inputfield");
	Assert.assertTrue(lpob.VerifyUsernameField(),"Unable to display UserNameinput field...");
	log.info("Verify UserName Field");
	log.info("Ready to Verify Password Label");
	Assert.assertEquals(lpob.VerifyPasswordLabel(),config.getPasswordLabel());
	log.info("Verified password Label");
	log.info("Ready to Verified password Field");
	Assert.assertTrue(lpob.VerifyPasswordField(), "Unable to dispaly passwordInputfield");
	log.info("Verified Password Field");
	log.info("Ready to verify Login button");
	Assert.assertTrue(lpob.VerifyLoginbutton(),"Unable to dispaly Loginbutton");
	log.info("Verified Login button");
	//lpob.VerifyLoginbuttonbackgroundcolor();
	}
	@Test(priority=2, enabled=false)
	public void ClickonTermsAndConditionsLink() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		log.info("Ready to Click on Terms and Conditions link");
		Thread.sleep(5000);
		lpob.ClickonTermsandConditionslink();
		Thread.sleep(5000);
		log.info("Clicked Terms and conditions link");
		lpob.ScrollDowntoReadtheEntireContent();
		log.info("Ready to Verify TermsandConditions page title");
		Assert.assertEquals(lpob.VerifyTermsandConditionsTitle(),config.getTermsandConditionsTitle());
		log.info("verified Terms and conditions page Title");
		log.info("Ready to Scroll Terms and conditions page");
		lpob.ScrollDowntoReadtheEntireContent();
		log.info("Scroll down TermsandConditions popup");
		Thread.sleep(3000);
		lpob.ClickonCrossIcononTermsandConditionspopup();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void VerifytheloginfunctionalitywithInvalidcredentials() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		log.info("Ready to Enter Invaliedusername");
		lpob.EnterUserName(config.getInvaliedUserName());
		log.info("Entered to Invalied UserName");
		Thread.sleep(5000);
		log.info("Ready to Enter Invaliedusername");
		lpob.EnterPassword(config.getInvaliedPassword());
		log.info("Entered Invaliedusername");
		Thread.sleep(5000);
		lpob.Clickoneyesyombol();
		Thread.sleep(5000);
		log.info("Ready to clickonloginbutton");
		lpob.Clickonloginbutton();
		log.info("Clicked loginbutton");
		log.info("Ready to verify Invalied Credentials");
	    Assert.assertEquals(lpob.VerifyInavliedCredentialErrormessage(),config.getInvaliedErrorMessage());
		log.info("Verified Invalied Credentials");
		lpob.getErrormessagecolor();
		Thread.sleep(8000);
		lpob.Refeshthepage();
		log.info("Page Refreshed");
		Thread.sleep(12000);
		
	}
	@Test(priority=4)
	public void VerifytheLoginpagewithaninvalidUserNameandvalidpassword() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		log.info("Ready to Enter Invalied Username ");
		lpob.EnterUserName(config.getInvaliedUserName());
		log.info("Entered Invalied Username ");
		Thread.sleep(5000);
		log.info("Ready to Enter valied Username ");
		lpob.EnterPassword(config.getValiedPassword());
		log.info("Ready to Enter valied Username ");
		Thread.sleep(5000);
		lpob.Clickoneyesyombol();
		Thread.sleep(5000);
	    log.info("Ready to clickonloginbutton");
		lpob.Clickonloginbutton();
		log.info("Clicked loginbutton");
		log.info("Ready to verify Invalied Credentials");
		Assert.assertEquals(lpob.VerifyInavliedCredentialErrormessage(),config.getInvaliedErrorMessage());
		log.info("verified Invalied Credentials");
		Thread.sleep(8000);
		lpob.Refeshthepage();
		log.info("Page Refreshed");
	    Thread.sleep(12000);
	}
	@Test(priority=5,enabled=false)
	public void VerifyLoginpagewiththevalidUsernameandinvalidPassword() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		log.info("Ready to Enter Valied Username ");
		lpob.EnterUserName(config.getValiedUserName());
		log.info("Entered Valied Username ");
		Thread.sleep(5000);
		log.info("Ready to Enter InValied Username");
		lpob.EnterPassword(config.getInvaliedPassword());
		log.info("Entered Invalied Username");
		Thread.sleep(5000);
		lpob.Clickoneyesyombol();
		Thread.sleep(5000);
		lpob.Clickonloginbutton();
		log.info("Clicked login button");
		Thread.sleep(3000);
		Assert.assertEquals(lpob.VerifyInavliedCredentialErrormessage(),config.getInvaliedErrorMessage());
		
		Thread.sleep(8000);
		lpob.Refeshthepage();
		Thread.sleep(12000);
		
	}
	@Test(priority=6,enabled=false)
	public void VerifytheUsernameFieldfunctionalitywithEmpitydata() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.clickontheUsernamefieldandagainclickontheoutsidefield();
		log.info("Enterd Empity Values");
		Thread.sleep(7000);
		Assert.assertEquals(lpob.Verifyusernamevalidationmessage(),config.getUsernameValidationmessage());
		Thread.sleep(3000);
		lpob.getusernameValidationmessagecolor();
		/*Assert.assertEquals(lpob.Verifypasswordvalidationmessage(),config.getPasswordValidationmessage());
		Thread.sleep(3000);
		lpob.getPasswordValidationmessagecolor();
		Thread.sleep(7000);*/
	}

	@Test(priority=7)
	public void VerifytheUsernameFieldfunctionalitywithinValiedCredentials() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.EnterUsernamefieldandagainclickontheoutsidefield(config.getInvaliedUserName());
		log.info("Enterd Invalied username");
		Thread.sleep(3000);
	}
	@Test(priority=8)
	public void VerifytheUsernameFieldfunctionalitywithSecialCharacters() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.EnterUsernamefieldandagainclickontheoutsidefield(config.getSpecialcaharcters());
		log.info("Entered Special Characters");
		Thread.sleep(3000);
	}
	@Test(priority=9,enabled=false)
	public void VerifythepasswordFieldfunctionalitywithEmpitydata() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.clickonthePasswordfieldandagainclickontheoutsidefield();
		log.info("Entered Empity values");
		Thread.sleep(3000);
		Assert.assertEquals(lpob.Verifypasswordvalidationmessage(),config.getPasswordValidationmessage());
		Thread.sleep(3000);
		lpob.getPasswordValidationmessagecolor();
		Thread.sleep(3000);
		lpob.Clickoneyesyombol();
	}
	
	@Test(priority=10)
	public void VerifythepasswordFieldfunctionalitywithinValiedCredentials() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.clickonthepasswordfieldandagainclickontheoutsidefield(config.getInvaliedPassword());
		log.info("Entered Invalied Password");
		Thread.sleep(3000);
		lpob.Clickoneyesyombol();
		Thread.sleep(3000);
		
	}
	@Test(priority=11)
	public void VerifythepasswordFieldfunctionalitywithSpecialCharacters() throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.clickonthepasswordfieldandagainclickontheoutsidefield(config.getSpecialcaharcters());
		log.info("Entered Special Characters in password field");
		lpob.Clickoneyesyombol();
		Thread.sleep(10000);
	}
	
	@Test(priority=12)
	public void VerifyLogin()throws InterruptedException {
		lpob =new LoginPageObjects(driver);
		lpob.EnterUserName("Sample_HR");
		lpob.EnterPassword("Test$123");
		log.info("Enter Username and Password");
		lpob.Clickonloginbutton();
		Thread.sleep(15000);
	}
	
	
	
	
	
	
	
	
	
	/*lpob.Enterusername();
	Thread.sleep(5000);
	lpob.enterpassword();
	lpob.Clickonloginbutton();
	Thread.sleep(6000);*/
	
	
	
	
	
    	//Assert.assertTrue(apo.verifythepresenceofaddorganizationbutton(), "unable to click add organizationbutton");
    	 //apo.ClickonAddOrganizationbutton();
    	//log.info("Clicked add organization button");
    	
    
	/*@Test(priority =2,enabled = false)
	public void VerityAddorganizationpagedetails() throws InterruptedException  {
		Addorganizationpagedetailspageobjects apod= new Addorganizationpagedetailspageobjects(driver);
		
		Assert.assertTrue(apod.verifyaddorgpagetittle("Add Organization"));
		//Thread.sleep(10000);
		apod.Scroll_to_bottom_of_addorganizationpage();
	    //Thread.sleep(5000);
	    apod.Clickonsavebutton();
	    //Thread.sleep(5000);
	    apod.ClickonCancelbutton();
	    //Thread.sleep(5000);
	    apod.clickonAddorganizationbutton1();
	    //Thread.sleep(5000);
	    Assert.assertTrue(apod.verifythepresenceofFirstInputbox(),"Firstname inputbox not present.. !");
	    //Thread.sleep(5000);
	    //Assert.assertTrue(apod.verifyfirstnamelabel("First Name"));
	    apod.enter_firstname_empyty_valiadtion();
	    log.info("validation completed");
	    Assert.assertTrue(apod.verifyfirstnamevalidationmessage("First Name is required."));
	    //Thread.sleep(5000);
	    apod.enter_firstname_specialchracter_valiadtion();
	    //Thread.sleep(5000);
	    Assert.assertTrue(apod.verifyfirstnamespecialcharactervalidationmessage("Enter Alpha numeric with only _,'. and -"));
	    //Thread.sleep(5000);
	    apod.NameExceedText("naveendamodara123456789naveendamodara123");
	    //Thread.sleep(5000);
	    apod.EnterFirstName("Naveen");
	    Assert.assertTrue(apod.verifythepresenceoflastnameinputbox(),"Laststname inputbox not present.. !");
	    //Assert.assertTrue(apod.verifylastnamelabel("Last Name"));
	    apod.enter_Lastname_empyty_valiadtion();
	    log.info("last name enter special ");
	    Assert.assertTrue(apod.verifylastnamevalidationmessage("Last Name is required."));
	    
	    apod.Enter_lastname_specialchracter_valiadtion();
	    
	    Assert.assertTrue(apod.verifyLastnamespecialcharactervalidationmessage("Enter Alpha numeric with only _,'. and -"));
	    
	    apod.LastNameExceedText("naveendamodara123456789naveendamodara123");
	    apod.EnterLastName("Damodara");
	    Assert.assertTrue(apod.verifythepresenceofEmailAddressinputbox(),"Email Address inputboxnot present..");
	   // Thread.sleep(5000);
     	apod.enter__empyty_emailaddress_valiadtion();
     	//Thread.sleep(5000);
     	
     	Assert.assertTrue(apod.verifyEmailAddressvalidationmessage("Email is required."));
     	//Thread.sleep(5000);
     	
     	apod.Enter_emailAddress_invalied_valiadtion();
     	//Thread.sleep(5000);
     	
     	Assert.assertTrue(apod.verifyinvaliedemailaddreessvalidationmessage("Enter valid email."));
     	
     	apod.EnterEmailAddress("damodaranaveen@gmail.com");
     	//Thread.sleep(5000);
     	Assert.assertTrue(apod.verifythepresenceofPhonenumberinputbox(),"phonenumber inputbox notpresent..");
     	//Thread.sleep(5000);
     	apod.enter__empyty_phonenumber_valiadtion();
     	//Thread.sleep(5000);
     	Assert.assertTrue(apod.verifyPhonenumbervalidationmessage("Phone Number is required."));
     	//Thread.sleep(5000);
     	apod.Enter_Phonenumber_invalied_valiadtion();
     	//Thread.sleep(5000);
     	Assert.assertTrue(apod.verifyinvaliedphonenumbervalidationmessage("Enter valid phone number."));
     	//Thread.sleep(5000);
     	apod.phonenumber_exceed_Test("+9194914953597894561");
     	//Thread.sleep(5000);
     	apod.EnterPhonenumber("+919491495359");
     	apod.EnterExtensionNumber("123456");
     	Assert.assertTrue(apod.verifythepresenceofBussinessnameinputbox(),"BussinessName inputbox notpresent..");
     	apod.enter__empyty_bussinessname_valiadtion();
     	Assert.assertTrue(apod.verifybussinessnamevalidationmessage("Business Name is required."));
     	apod.enter_bussiness_specialchracter_valiadtion();
     	Assert.assertTrue(apod.verifyBussinessspecialcharactervalidationmessage("Enter Alpha numeric with only _,'. and -"));
     	apod.Bussiness_exceed_Test("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv");
        apod.EnterBussinessName("Logitech");
        Assert.assertTrue(apod.VerifythePresenceofWebsiteinputbox(),"website input box not present...");
        apod.Invaliedtextgivenwebsiteinputbox();
        Assert.assertTrue(apod.Verifytheinvaliedvalidationmessagevalidation("Please enter format https://text.com."));
        apod.EnterWebsiteAddress("https://www.facebook.com/");
        Assert.assertTrue(apod.VerifythepresenceofStreetAddressinputbox(),"Street Address input not present....");
        apod.enter__empyty_StreetAddress_valiadtion();
        Assert.assertTrue(apod.verifyStreetAddressvalidationmessage("Street Address is required."));
        apod.enter_StreetAddress_specialchracter_valiadtion();
        Assert.assertTrue(apod.verifyStreetAddressspecialcharactervalidationmessage("Enter Alpha numeric with only _,'.# and -"));
        apod.EnterStreetAddress("Temple Street");
        apod.Selectcountrydropdown();
        apod.Enter__empyty_state_valiadtion();
        Assert.assertTrue(apod.Verifystatevalidationmessage("State / Prov / Region is required."));
       apod.Selectstatedropdown();
       apod.enter__empyty_City_valiadtion();
       Assert.assertTrue(apod.VerifyCityvalidationmessage("City is required."));
       apod.Selectcitydropdown();
       apod.Enter_empity_Zipcode_valiadtion();
       Assert.assertTrue(apod.Verifyzipcodevalidationmessage("Zip / Postal Code is required."));
	   apod.Enterzipcode();
	   apod.Scroll_to_bottom_of_addorganizationpage1();
	   log.info("ok");
	   apod.Enter_Empity_Timezone_validation();
	   log.info("ok");
	   //Assert.assertTrue(apod.verifyTimezonevalidationmessage("Time Zone is required."));
	   //log.info("ok");
	   //apod.Selecttimezone();
	   apod.Selectogganizationtype();
	   apod.ClickonTogglebutton();
	   apod.Clickonsavebutton1();
	}
	@Test(priority =2,enabled = true)
	public void Enterdertailsonsettingorganization() throws InterruptedException {
		Settingorganizationpageobjects sop = new Settingorganizationpageobjects(driver);
		sop.Cliokonselectorgdropdown();
		sop.ClickonlogitechOrganization();
		Thread.sleep(10000);
		sop.scrolltosettingstab();
		Thread.sleep(5000);
		/*sop.Clickoneditbutton();
		Thread.sleep(2000);
		sop.uploadeprofile();
	    Thread.sleep(2000);
		sop.scrolltoupdatebutton();*
		sop.ClickonCustomValuepage();
		Thread.sleep(12000);
		System.out.println("read to click");
		sop.ClickonAddCustomValuebutton();
		
	}*
	@Test(priority =3)
	public void EnterCustomvaluedetails() throws InterruptedException {
		Customvaluepageoperations cvpo = new Customvaluepageoperations();
		cvpo.EnterFirstName();
		//Thread.sleep(2000);
		cvpo.EnterValue();
		cvpo.ClickonSavebutton();
		Thread.sleep(5000);
		cvpo.ClickonEditicon();
	}*/



}
