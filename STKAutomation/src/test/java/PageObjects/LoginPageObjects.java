package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core_logic.ComponentOperation;
import utilities.LoginReadConfig;
import org.openqa.selenium.interactions.Actions;

public class LoginPageObjects {
	public WebDriver driver;
	//WebDriverWait wait;
	LoginReadConfig config = new LoginReadConfig();
	
	ComponentOperation con = new ComponentOperation();

	public LoginPageObjects(WebDriver driver) {
		this.driver =driver;
	}
	
	public String VerifyloginpageTitle() {
		
		String Actual = driver.findElement(By.xpath(config.getLoginpageTitleXpath())).getText();
	       return Actual;
	       
	}
	
	public String VerifyUsernameLabel() {
		
		String actual =driver.findElement(By.xpath(config.getUsernamelableXpath())).getText();
	    return actual;
	}
	public boolean VerifyUsernameField() {
		//String xpath =config.getUsernameInputfieldXpath();
		boolean status =driver.findElement(By.xpath(config.getUsernameInputfieldXpath())).isDisplayed();
		
	    return status;
	}
	public String VerifyPasswordLabel() {
		String Actual =driver.findElement(By.xpath(config.getPasswordlabelXpath())).getText();
	    return Actual;
	}
	public boolean VerifyPasswordField() {
		boolean status =driver.findElement(By.xpath(config.getpasswordInputfiledXpath())).isDisplayed();
	    return status;	
	}
	public String Verifyforgetpasswordlink() {
	String Actual =driver.findElement(By.xpath(config.getforgetpasswordxpath())).getText();
    return Actual;
    }
	public String VerifyTermsandConditions() {
	String Actual =driver.findElement(By.xpath(config.getforgetpasswordxpath())).getText();
	return Actual;
	}
	public boolean VerifyLoginbutton() {
		
		boolean status =driver.findElement(By.xpath(config.getloginbuttonxpath())).isDisplayed();
		return status;
	}
	public void ClickonTermsandConditionslink()throws InterruptedException {
		ComponentOperation.ClickxpathElementByusingmouse(config.getTermsandConditionsxpath());
		
		/*WebElement element = driver.findElement(By.xpath(config.getTermsandConditionsxpath()));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();*/
		
	}
	public String VerifyTermsandConditionsTitle() {
		String Actual =driver.findElement(By.xpath(config.getTermsandConditionsTitlexpath())).getText();
		return Actual;
	}
	public void ScrollDowntoReadtheEntireContent() {
				ComponentOperation.scrollToviewElement(config.getsingleelementxpath());
		
	}
	public void ClickonCrossIcononTermsandConditionspopup() {
		
		ComponentOperation.ClickXpathElementByusingClickmethode(config.getCrossIconxpathinTermsandConditionsPopup());
		//driver.findElement(By.xpath(config.getCrossIconxpathinTermsandConditionsPopup())).click();
	}
	
	public void EnterUserName(String username) {
		WebElement user =driver.findElement(By.xpath(config.getUsernameInputfieldXpath()));
		user.clear();
		ComponentOperation.Entervaluestofields(config.getUsernameInputfieldXpath(), username);
		
		
	}
	public void EnterPassword(String password) {
		WebElement pass =driver.findElement(By.xpath(config.getpasswordInputfiledXpath()));
		pass.clear();
		ComponentOperation.Entervaluestofields(config.getpasswordInputfiledXpath(), password);
		
	}
	public void Clickoneyesyombol() {
		
		ComponentOperation.ClickxpathElementByusingmouse(config.getEyesymbolXpth());
		/*WebElement element = driver.findElement(By.xpath(config.getEyesymbolXpth()));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();*/
	}
	
	
	public void Clickonloginbutton() {
		ComponentOperation.ClickonbuttonByusingJavascriptExecutor(config.getloginbuttonxpath());
	}
	public String VerifyInavliedCredentialErrormessage() {
		String Actual =driver.findElement(By.xpath(config.getInvaliedErrorMessagexpath())).getText();
		return Actual;
	}
	public void getErrormessagecolor() {
		WebElement errorMessage = driver.findElement(By.xpath(config.getInvaliedErrorMessagexpath()));
        String color = errorMessage.getCssValue("color");
        System.out.println("Error message color: " + color);

	}
	
	public void Refeshthepage() {
		driver.navigate().refresh();
	}
	public void clickontheUsernamefieldandagainclickontheoutsidefield() throws InterruptedException {
		WebElement user =driver.findElement(By.xpath(config.getUsernameInputfieldXpath()));
		user.clear();
		ComponentOperation.clickxpathElementbyusingTAB(config.getUsernameInputfieldXpath());
	}
	public void clickonthePasswordfieldandagainclickontheoutsidefield() throws InterruptedException {
		WebElement pass =driver.findElement(By.xpath(config.getpasswordInputfiledXpath()));
		pass.clear();
		ComponentOperation.clickxpathElementbyusingTAB(config.getpasswordInputfiledXpath());
	}
	
	
	public void EnterUsernamefieldandagainclickontheoutsidefield(String value) throws InterruptedException {
		driver.findElement(By.xpath(config.getUsernameInputfieldXpath())).clear();
		driver.findElement(By.xpath(config.getUsernameInputfieldXpath())).sendKeys(value);
	}
	public void clickonthepasswordfieldandagainclickontheoutsidefield(String value) throws InterruptedException {
		driver.findElement(By.xpath(config.getpasswordInputfiledXpath())).clear();
		driver.findElement(By.xpath(config.getpasswordInputfiledXpath())).sendKeys(value);
		
	}
	public String Verifyusernamevalidationmessage() {
		String Actual =driver.findElement(By.xpath(config.getUsernamevalidationXpath())).getText();
		return Actual;	
	}
	
	
	public String Verifypasswordvalidationmessage() {
		String Actual=driver.findElement(By.xpath(config.getpasswordvalidationmessageXpth())).getText();
		return Actual;	
	}
	public void getusernameValidationmessagecolor() {
		WebElement errorMessage = driver.findElement(By.xpath(config.getUsernamevalidationXpath()));
        String color = errorMessage.getCssValue("color");
        System.out.println("Error usernamevalidation message color: " + color);
		
	
	}
	public void getPasswordValidationmessagecolor() {
		WebElement errorMessage = driver.findElement(By.xpath(config.getpasswordvalidationmessageXpth()));
        String color = errorMessage.getCssValue("color");
        System.out.println("Error Passwordvalidation message color: " + color);
	}
	
	
}
