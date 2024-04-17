package com.qa.testlayer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_011 extends Testbase
{
	@Test
	public void deleteEmployee() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.enterEmployeeName("vishwajeet");
		home.clickOnSearchButton();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(5000);
		home.clickOnDeleteButton();
		
		Thread.sleep(1000);
		
		home.clickOnConfirmDeleteButton();
		
		Thread.sleep(10000);
		
		String Expectedtext = 
				driver.findElement(By.xpath("//span[text() = 'No Records Found']")).getText();
		System.out.println(Expectedtext);
		
		Assert.assertEquals("No Records Found",Expectedtext);
		
		driver.quit();
	}

}
