package com.qa.testlayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_009 extends Testbase
{
	@Test
	public void uploadFileUsingAutoit() throws InterruptedException, IOException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		home.clickOnConfiguration();
		home.clickOnDataImportLink();
		home.clickOnBrowseButton();
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("C://users//kavya//Downloads//fileupload.exe");
		
		Thread.sleep(1000);
		
		home.clickOnUploadButton();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type = 'button'])[3]")).click();
		
		driver.quit();
		
		
	}
}
