package com.qa.testlayer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_008 extends Testbase
{
	@Test
	public void uploadFile() throws InterruptedException, AWTException
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
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\kavya\\Downloads\\importData.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		home.clickOnUploadButton();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type = 'button'])[3]")).click();
		
		driver.close();
		
		driver.quit();
	
	}
}
