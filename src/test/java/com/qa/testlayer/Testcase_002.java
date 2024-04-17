package com.qa.testlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_002 extends Testbase
{
	@Test
	public void enterInvalidUsername_And_ValidPassword() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("abc");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		String errorMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		
		Assert.assertEquals("Invalid credentials", errorMessage);
		
		driver.quit();
	}
}
