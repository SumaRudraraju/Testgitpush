package core_logic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Base.base;



public class ComponentOperation extends base {


public static void sendkeyboardEnterToXpathElement(String xpath, String value) throws InterruptedException {
	driver.findElement(By.xpath(xpath)).clear();
	Thread.sleep(3000);
	driver.findElement(By.xpath(xpath)).sendKeys(value,Keys.TAB);
	
}
public static void clickxpathElementbyusingTAB(String xpath) {
	WebElement inputField = driver.findElement(By.xpath(xpath));
    inputField.sendKeys(Keys.TAB);
	 
 }
public static void clickxpathElementbyusingShift(String xpath) {
	Actions actions = new Actions(driver);
	 actions.sendKeys(Keys.SHIFT).build().perform();
}
public static void ClickxpathElementbyusingRightArrow(String xpath) {
	Actions actions = new Actions(driver);
	 actions.sendKeys(Keys.ARROW_LEFT).build().perform();
}
public static void ClickxpathElementByusingmouse(String xpath) {
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();
	
}
public static void scrollToviewElement(String xpath) {
 WebElement element = driver.findElement(By.xpath(xpath));
 JavascriptExecutor jsc =(JavascriptExecutor)driver;
 jsc.executeScript("arguments[0].scrollIntoView()",element);
 
}
public static void scrollToviewElementByusingMousehoveractions(String xpath) {
	 
	 
	}

public static void Entervaluestofields(String xpath,String value)
{
	driver.findElement(By.xpath(xpath)).clear();
	driver.findElement(By.xpath(xpath)).sendKeys(value);
	    
	
}
public static void ClickXpathElementByusingClickmethode(String xpath) {
	driver.findElement(By.xpath(xpath)).click();
}
public static void EditfieldXpathElement(String xpath,String value) {
	driver.findElement(By.xpath(xpath)).clear();
	WebElement ele =driver.findElement(By.xpath(xpath));
	ele.sendKeys(value);
	
}
public static void ClickonElementusingBywebdriverwait(String xpath) {
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));     
	
	driver.findElement(By.xpath(xpath)).click();
	
}
public static void ClickonbuttonByusingJavascriptExecutor(String xpath) {
	WebElement element = driver.findElement(By.xpath(xpath));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	
}
public static void getValidationmessagecolor(String Xpath, String value) {
	WebElement errorMessage = driver.findElement(By.xpath(Xpath));
    String color = errorMessage.getCssValue(value);
    System.out.println("Error message color: " + value);
	
	}
public static void getButtonsBackgroundcolor(String Xpath) {
	WebElement errorMessage = driver.findElement(By.xpath(Xpath));
    String color = errorMessage.getCssValue("color");
    System.out.println("Error message color: " + color);
	
	}



		



}

