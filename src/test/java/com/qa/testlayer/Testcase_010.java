package com.qa.testlayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_010 extends Testbase
{
	@Test
	public void uploadImageUsingAutoit() throws InterruptedException, IOException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.clickOnAddEmployee();
		home.clickOnImageUploadButton();
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("C://Users//kavya//Downloads//uploadImage.exe");
		
		
		
	}
}
