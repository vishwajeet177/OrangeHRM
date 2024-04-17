package com.qa.testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pagelayer.Homepage;
import com.qa.pagelayer.Loginpage;
import com.qa.testbase.Testbase;

public class Testcase_013 extends Testbase
{
	@Test
	public void printAllEmployeeList() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Homepage home = new Homepage();
		home.clickOnPIM();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		// Print only header
		for(int i=1; i<=1; i++)
		{
			for(int j=1; j<=4; j++)
			{
				String text = 
	driver.findElement(By.xpath("//div[@class = 'oxd-table orangehrm-employee-list']/div["+i+"]/div/div["+j+"]")).getText();
				
				System.out.print(text +" | ");
			}
			System.out.println();
		}
		
		Thread.sleep(1000);
		
		
		int count = 0;
		
		for(int i=1; i<=100; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==51)
				{
					driver.findElement(By.xpath("(//button[@class = 'oxd-pagination-page-item oxd-pagination-page-item--page'])[1]")).click();
					Thread.sleep(2000);
					String text1 = 
							driver.findElement(By.xpath("//div[@class = 'oxd-table-body']/div["+i+"]/div/div["+j+"]")).getText();
										
										System.out.print(text1 +" | ");
					
				}
				else
				{
					String text1 = 
							driver.findElement(By.xpath("//div[@class = 'oxd-table-body']/div["+i+"]/div/div["+j+"]")).getText();
										
										System.out.print(text1 +" | ");
					count++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Total employee list = "+ count);
		
	
	}
}
