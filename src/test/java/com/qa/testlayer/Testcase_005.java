package com.qa.testlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_005 extends Testbase
{
	@Test
	public void addEmployee() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.clickOnAddEmployee();
		home.enterFirstname("vishwajeet");
		home.enteMiddlename("v");
		home.enterLastname("jadhav");
		home.clickOnSubmitbutton();
		
		Thread.sleep(10000);
	
		String expectedText = driver.findElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 --strong']")).getText();
		System.out.println(expectedText);
		
		Assert.assertEquals("vishwajeet jadhav", expectedText);
		
	
	
		
		
	}
}
