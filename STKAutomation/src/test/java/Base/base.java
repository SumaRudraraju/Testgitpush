package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.ForgotPasswordPageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.LogoutPageObjects;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;





import utilities.LoginReadConfig;
public class base {
public static WebDriver driver;
	
public LoginPageObjects lpob;
public LogoutPageObjects lopo;
public ForgotPasswordPageObjects fppo;

LoginReadConfig config = new LoginReadConfig();

static Logger log= Logger.getLogger(base.class);

@BeforeTest
public void instatiateDrivers() throws InterruptedException {
	
	String browserName ="chrome";
	
	if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		/*driver = new EdgeDriver();
		WebDriverManager.edgedriver().clearDriverCache().setup();*/
		
	}
	else {
		System.out.println("Provide a valide browsername");
	}
	
	
	
	
	
	
	
	//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\NaveenD\\eclipse-workspace\\phoenix TestNG\\Webdrivers\\chromedriver.exe4");
	///WebDriverManager.edgedriver().clearDriverCache().setup();
	/*ChromeOptions options = new ChromeOptions();
	options.setCapability("browser version" ,"123.0.6312.59" );*/
	//driver = new EdgeDriver();
	log.info("browser intiated");
	driver.manage().window().maximize();
	log.info("window maximize");
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	log.info("ready to launch browser");
	driver.get(config.getAppUrl());
	log.info("Browser launched");
	
	Thread.sleep(15000);
	
	}
	
@AfterTest
public static  void closeDriver() throws InterruptedException {
    
	Thread.sleep(60000);
	//driver.close();
    }

public static void CaptureScreenShot(){
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("Screenshot","Failed.png");
	try {
		FileUtils.copyFile(source, target);
	}catch(IOException e) {
		e.printStackTrace();
	}
}

}