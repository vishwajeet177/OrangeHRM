package com.qa.testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_006 extends Testbase
{
	@Test
	public void searchEmployee() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.enterEmployeeName("vishwajeet");
		Thread.sleep(1000);
		home.clickOnSearchButton();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		String expectedText = 
		driver.findElement(By.xpath("(//span[@class = 'oxd-text oxd-text--span'])[1]")).getText();
		System.out.println(expectedText);
		
		Assert.assertEquals("(1) Record Found", expectedText);
	}
	

}
