package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Loginpage extends Testbase
{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Enter Username 
	@FindBy (xpath = "//input[@placeholder = 'Username']")
	private WebElement username;
	
	// Enter Password
	@FindBy (xpath = "//input[@placeholder = 'Password']")
	private WebElement password;
	
	// Click on Login Button
	@FindBy (xpath = "//button[text() = ' Login ']")
	private WebElement loginButton;
	
	// Click on Dropdown for logOut
	@FindBy (xpath = "(//img[@alt = 'profile picture'])[1]")
	private WebElement img;
	
	// Click on logOut button
	@FindBy (xpath = "//a[text() = 'Logout']")
	private WebElement logout;
	
	
	public void enterUsername(String name)
	{
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.submit();
	}
	
	public void clickOnDropdown()
	{
		img.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
}
