package com.qa.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUP()
	{
		String browser = "chrome";
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();	
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("provide correct browser name");
		}
		
		// Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		// Window Maximize
		driver.manage().window().maximize();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		//driver.quit();
	}
}
