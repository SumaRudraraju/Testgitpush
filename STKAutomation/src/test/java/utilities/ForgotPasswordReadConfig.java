package utilities;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	public class ForgotPasswordReadConfig {
		Properties prop;
		public ForgotPasswordReadConfig() {
		File f = new File("C:\\Users\\NaveenD\\eclipse-workspace\\phoenix\\properties\\Forgetpassword.configproperties");
		try {
			FileInputStream fis=new FileInputStream(f);
		       prop = new Properties();
		       prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
		public String getForgetpasswordLinkxpath() {
			String ForgetpasswordLink = prop.getProperty("ForgetpasswordlinkXpath");
			return ForgetpasswordLink;
		}
		public String getForgetpasswordTitlexpath() {
			String ForgetpasswordTitle = prop.getProperty("ForgetpasswordpageTitlexpath");
			return ForgetpasswordTitle;
		}
		public String getForgetpasswordTitle() {
			String ForgetpasswordTitle = prop.getProperty("ForgetpasswordTitle");
			return ForgetpasswordTitle;
		}
		public String getBacktoLoginlinkXpath() {
			String Backtologin = prop.getProperty("BacktologinlinkXpath");
			return Backtologin;
		}
		public String getBacktoLoginlinktext() {
			String Backtologin = prop.getProperty("Backtologin");
			return Backtologin;
		}
		public String getResetPasswordbuttonXpath() {
			String Resetpasswordbutton = prop.getProperty("ResetpasswordbuttonXpath");
			return Resetpasswordbutton;
		}
		public String getafterclickonResetpasswordhelptextXpath() {
			String helptext = prop.getProperty("AfterclickonResetpasswordhelptextXpath");
			return helptext;
		}
		public String getEmailPlaceholderXpath() {
			String EmailPlaceholder = prop.getProperty("EmailPlaceholderXpath");
			return EmailPlaceholder;
		}
		public String getEmailpasswordplaceholderXpath() {
			String passwordplaceholder = prop.getProperty("PasswordplaceholderXpath");
			return passwordplaceholder;
		}
		public String getNextButtonXpath() {
			String NextButton = prop.getProperty("NextButtonxpath");
			return NextButton;
		}
		public String getEmailSubjectXpath() {
			String EmailSubject = prop.getProperty("EmailSubjectXpath");
			return EmailSubject;
		}
		public String getResetbuttonXpath() {
			String Resetbutton = prop.getProperty("Resetbuttonxpath");
			return Resetbutton;
		}
		public String getchagepasswordFieldXpath() {
			String chagepassword = prop.getProperty("ChagepasswordFieldxpath");
			return chagepassword;
		}
		public String getRetypeNewpasswordFieldXpath() {
			String RetypeNewpassword = prop.getProperty("RetypeNewpasswordFieldXpath");
			return RetypeNewpassword;
		}
		public String getChangepasswordbuttonXpath() {
			String Changepassword = prop.getProperty("ChangepasswordbuttonXpath");
			return Changepassword;
		}
		public String getClickHereXpath() {
			String ClickHere = prop.getProperty("ClickHereXpath");
			return ClickHere;
		}
		public String getEmailUrl() {
			String EmailUrl = prop.getProperty("EmailUrl");
			return EmailUrl;
		}
		public String getExpectedForgetpasswordTitleValue() {
			String ForgetpasswordTitle = prop.getProperty("ForgetpasswordTitle");
			return ForgetpasswordTitle;
		}
		public String getExpectedBacktologinValue() {
			String BacktologinValue = prop.getProperty("EmailUrl");
			return BacktologinValue;
		}
		public String getExpectedAfterclickonforgetpasswordValue() {
			String HelpText = prop.getProperty("Afterclickonforgetpassword");
			return HelpText;
		}
		public String getNewpasswordValue() {
			String Newpassword = prop.getProperty("Newpassword");
			return Newpassword;
		}
		public String getEmailAddressValue() {
			String EmailAddress = prop.getProperty("EmailAddress");
			return EmailAddress;
		}
		public String getEmailPasswordValue() {
			String EmailPassword = prop.getProperty("EmailPassword");
			return EmailPassword;
		}
		
		}
