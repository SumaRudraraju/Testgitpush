package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPageObjects {
public WebDriver driver;
    
	//private By pagetittle = By.xpath("");
	
    private By pofile_button = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-nav-bar[1]/app-nav-right[1]/ul[1]/li[4]/div[1]/a[1]/*[name()='svg'][1]");
	
	private By logout = By.xpath("/html[1]/body[1]/app-root[1]/app-admin[1]/app-nav-bar[1]/app-nav-right[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/a[1]/i[1]");
	
	public LogoutPageObjects(WebDriver driver) {
		this.driver= driver;
	}
	
	public boolean verifyProfileButtonisClickable() {
		boolean status =driver.findElement(pofile_button).isEnabled();
		return status;
	}
	public void clickonProfileButton() {
		driver.findElement(pofile_button).click();
	}
	public boolean verifyLogoutarrowButtonisClickable() {
		boolean status =driver.findElement(pofile_button).isEnabled();
		return status;
	}
	public void clickonLogoutarrowButton() {
		driver.findElement(logout).click();
	}
	
	
	//private By LoginButton =By.xpath("//div/button[text()=\" Login now \"]");
}
