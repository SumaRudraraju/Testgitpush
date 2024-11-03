package PageObjects;

	import java.net.SocketTimeoutException;
	import java.time.Duration;
	import java.util.concurrent.TimeUnit;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import core_logic.ComponentOperation;
	
import utilities.ForgotPasswordReadConfig;
import utilities.LoginReadConfig;
	public class ForgotPasswordPageObjects  {
	public WebDriver driver;
		
	ForgotPasswordReadConfig Forgotconfig = new ForgotPasswordReadConfig();
		
	public 	ForgotPasswordPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	   public void ClickonForgetPasswordlink() {
		    
		    ComponentOperation.ClickxpathElementByusingmouse(Forgotconfig.getForgetpasswordLinkxpath());
	   }
		
	    public String VerifyForgetPasswordpageTitle() {
			
			String Actual = driver.findElement(By.xpath(Forgotconfig.getForgetpasswordTitlexpath())).getText();
		       return Actual;	
		}
		
		public String VerifyBacktoLoginlink() {
			String Actual =driver.findElement(By.xpath(Forgotconfig.getBacktoLoginlinkXpath())).getText();
			return Actual;	
		}
	    public boolean VerifyResetpasswordbutton() {
			
			boolean status =driver.findElement(By.xpath(Forgotconfig.getResetPasswordbuttonXpath())).isDisplayed();
			return status;
		}
	    public void getResetPasswordBackgroudcolor() {
		WebElement errorMessage = driver.findElement(By.xpath(Forgotconfig.getResetPasswordbuttonXpath()));
	    String color = errorMessage.getCssValue("background-color");
	    System.out.println("Error message color: " + color);
	}
	    public void ClickonResetpasswordButton()throws InterruptedException {
			ComponentOperation.ClickxpathElementByusingmouse(Forgotconfig.getResetPasswordbuttonXpath());
		}
	    public void ClickonBacktoLoginlink()throws InterruptedException {
			
		ComponentOperation.ClickxpathElementByusingmouse(Forgotconfig.getBacktoLoginlinkXpath());
		}
	    public String VerifytheResetpasswordEmailText() {
	    	
	    	String Actual =driver.findElement(By.xpath("(//p[@class='mb-1 text-success ng-star-inserted'])[1]")).getText();
			return Actual;	 
	    	
	    }
	public String VerifytheUsernamevalidation() {
	    	
	    	String Actual =driver.findElement(By.xpath("//label[text()='User Name is required. ']")).getText();
			return Actual;	 
	    	
	    }
	    
	    public void NavigateEmailBrowsers() throws SocketTimeoutException, InterruptedException {
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    	driver.get(Forgotconfig.getEmailUrl());
	    	Thread.sleep(7000);
	    	ComponentOperation.Entervaluestofields(Forgotconfig.getEmailPlaceholderXpath(),Forgotconfig.getEmailAddressValue());
	    	//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("naveen.damodara@stackyon.com");
	    	Thread.sleep(3000);
	    	ComponentOperation.ClickXpathElementByusingClickmethode(Forgotconfig.getNextButtonXpath());
	    	//driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	    	Thread.sleep(3000);
	    	ComponentOperation.Entervaluestofields(Forgotconfig.getEmailpasswordplaceholderXpath(),Forgotconfig.getEmailPasswordValue());
	    	//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Naveen@1998");
	    	Thread.sleep(3000);
	    	ComponentOperation.ClickXpathElementByusingClickmethode(Forgotconfig.getNextButtonXpath());
	    	//driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	    	try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    	wait.until(ExpectedConditions.titleContains("Gmail"));
	        System.out.println("ready to click mail subject");
	        
	            Thread.sleep(3000);
	        } catch (StaleElementReferenceException e) {
	            e.printStackTrace();
	        }
	        WebElement emailSubject = driver.findElement(By.xpath("(//span[text()=\"Reset Your Password\"])[2]"));
	    	emailSubject.click();
	       
	    	System.out.println("clicked mail subject");
	    	Thread.sleep(5000);
	    	System.out.println("ready to click reset");
	    
	    	ComponentOperation.ClickXpathElementByusingClickmethode(Forgotconfig.getResetbuttonXpath());
	       // driver.findElement(By.xpath("//body[1]/div[8]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
	        Thread.sleep(7000);
	        
	    	Set<String>windowIds  = driver.getWindowHandles();
	    	for(String windowid : windowIds) {
	    		driver.switchTo().window(windowid);
	    		if(driver.getTitle().equals("Change your password")) {
	    		String url =driver.getCurrentUrl();
	    		System.out.println(url);
	    	}
	    	}
	    }
	         public void EnterNewpasswordandComformpassword() throws SocketTimeoutException, InterruptedException{
	    	 
	         
	         
	         driver.findElement(By.xpath("//input[@placeholder=\"New Password\"]")).sendKeys("Test$123");
	         //ComponentOperation.Entervaluestofields(Forgetconfig.getchagepasswordFieldXpath(),Forgetconfig.getEmailAddressValue());
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("//input[@placeholder=\"Re-Type New Password\"]")).sendKeys("Test$123");
	         //ComponentOperation.Entervaluestofields(Forgetconfig.getEmailPlaceholderXpath(),Forgetconfig.getEmailAddressValue());
	         Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()=\"Change Password\"]")).click();
	         //ComponentOperation.ClickXpathElementByusingClickmethode(Forgetconfig.getNextButtonXpath());
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//a[text()=\" here \"]")).click();
	         //ComponentOperation.ClickXpathElementByusingClickmethode(Forgetconfig.getNextButtonXpath());
	         
	         }
	         
	        
	        
	        
	      
	        
	       
	    	
	    	
	    }




