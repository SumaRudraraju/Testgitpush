package utilities;

import java.io.IOException;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class LoginReadConfig {
	Properties prop;
	
	public LoginReadConfig() {
	File file = new File("C:\\Users\\SumaR\\eclipse-workspace\\STKAutomation\\properties\\Loginconfig.properties");
	try {
		FileInputStream fis=new FileInputStream(file);
	       prop = new Properties();
	       prop.load(fis);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
	public String getAppUrl() {
		String url =prop.getProperty("appUrl");
		return url;
	}
	public String getInvaliedUserName() {
		String Invaliedusername=prop.getProperty("InvaliedUserName");
		return Invaliedusername;
	}
	public String getValiedUserName() {
		String valiedusername=prop.getProperty("ValiedUserName");
		return valiedusername;
	}
	public String getInvaliedPassword() {
		String InvaliedPassword=prop.getProperty("Inavliedpassword");
		return InvaliedPassword;
	}
	public String getValiedPassword() {
		String Valiedusername=prop.getProperty("ValiedPassword");
		return Valiedusername;
	}
	public String getsingleelementxpath() {
		String sinleelement=prop.getProperty("OneElmentONTermeandConditionsdetails");
	    return sinleelement;
	}
	public String getCrossIconxpathinTermsandConditionsPopup() {
		String Cross=prop.getProperty("CrossiconxpathinTermsandconditionspopup");
	    return Cross;
	}
	public  String getEyesymbolXpth() {
		String eyesymbol= prop.getProperty("EyeSymobolXpath");
		return eyesymbol;
	}
	
	
	public String getLoginpageTitle() {
		String Name =prop.getProperty("Loginpagetitle");
		return Name;
	}
	public String getInvaliedErrorMessage() {
		String Errormessage =prop.getProperty("Errormessage");
		return Errormessage;
	}
	public String getInvaliedErrorMessagexpath() {
		String Errormessagexpath =prop.getProperty("InvaliedCredentialsXpath");
		return Errormessagexpath;
	}
	
	public String getUsernameLabel() {
		String Value =prop.getProperty("Usernamelabel");
		return Value;
	}
	public String getPasswordLabel() {
		String passwordLabel =prop.getProperty("Passwordlabel");
		return passwordLabel;
	}
	public String getSpecialcaharcters() {
		String Specialcaharcters =prop.getProperty("Specialcharacters");
		return Specialcaharcters;
	}
	public String getUsernameValidationmessage() {
		String usernamevalidation =prop.getProperty("Usernamevalidationmessage");
		return usernamevalidation;
	}
	public String getPasswordValidationmessage() {
		String Passwordvalidation =prop.getProperty("passwordvalidationmessage");
		return Passwordvalidation;
	}
	
	
	public String getLoginpageTitleXpath() {
		String Loginpagetitle=prop.getProperty("LoginpageTitleXpath");
		return Loginpagetitle;
	}
	public String getTermsandConditionsTitle() {
		String TermsandConditionsTitle=prop.getProperty("TermsandConditionsTitle");
		return TermsandConditionsTitle;
	}
	
	public String getlogoonloginpagexpath() {
		String Logoonloginpage=prop.getProperty("Logoonloginpagexpath");
		return Logoonloginpage;
    }
	public String getUsernamelableXpath() {
		String Usernamelable =prop.getProperty("UsernamelableXpath");
		return Usernamelable;
	}
	
	public String getUsernameInputfieldXpath() {
		String UsernameInputfield =prop.getProperty("UsernameInputfieldXpath");
		return UsernameInputfield;
		
	}
	public String getUsernamevalidationXpath() {
		String Usernamevalidation = prop.getProperty("UsernamevalidationXpath");
		return Usernamevalidation;
	}
	public String getPasswordlabelXpath() {
		String Passwordlabel = prop.getProperty("PasswordlabelXpath");
		return Passwordlabel;
	}
	public String getpasswordInputfiledXpath() {
		String PasswordInputfield = prop.getProperty("PasswordInputfieldXpath");
		return PasswordInputfield;
	}
	public String getpasswordvalidationmessageXpth() {
		String passwordvalidationmessage = prop.getProperty("passwordvalidationmessageXpath");
		return passwordvalidationmessage;
	}
	public String getloginbuttonxpath() {
		String loginbutton = prop.getProperty("LoginbuttonXpath");
		return loginbutton;
	}
	public String getforgetpasswordxpath() {
		String forgetpassword = prop.getProperty("ForgetpasswordXpath");
		return forgetpassword;
	}
	public String getTermsandConditionsxpath() {
		String TermsandConditions = prop.getProperty("TermsandConditions");
		return TermsandConditions;
	}
	public String getTermsandConditionsTitlexpath() {
		String TermsandConditionsTitle = prop.getProperty("TermsandConditionspageTitle");
		return TermsandConditionsTitle;
	}
	public String getTermsandConditionsDetialsxpath() {
		String TermsandConditionsTitle = prop.getProperty("TotalTermeandConditionsdetails");
		return TermsandConditionsTitle;
	}
	
}

