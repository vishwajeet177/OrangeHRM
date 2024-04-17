package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_001 extends Testbase
{
	@Test
	public void enterValidUsername_And_ValidPassword()
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		
		login.clickOnDropdown();
		login.clickOnLogout();
		
		
		
	}
}
