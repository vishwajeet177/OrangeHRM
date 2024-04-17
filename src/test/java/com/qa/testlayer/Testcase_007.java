package com.qa.testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_007 extends Testbase
{
	@Test
	public void searchEmployeeID() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.enterEmployeeID("0374");
		home.clickOnSearchButton();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		String actualText = 
			driver.findElement(By.xpath("//div[@role= 'table']/div[2]/div/div/div[2]")).getText();
			System.out.println(actualText);
		
		Assert.assertEquals(actualText,"0375");
		
	
		
	}
}
