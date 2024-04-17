package com.qa.testlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_003 extends Testbase
{
	@Test
	public void enterValidUsername_And_InvalidPassword() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123456");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		String errorMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		
		Assert.assertEquals("Invalid credentials", errorMessage);
		
		driver.quit();
	}
}
