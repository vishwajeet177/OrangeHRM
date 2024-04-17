package com.qa.pagelayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class Homepage extends Testbase
{
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// click on PIM
	@FindBy (xpath = "//span[text() = 'PIM']")
	private WebElement PIM;
	
	// click on Add Employee
	@FindBy (xpath = "//a[text() = 'Add Employee']")
	private WebElement add_Employee;
	
	// enter firstname
	@FindBy (xpath = "//input[@name = 'firstName']")
	private WebElement firstname;
	
	// enter middlename
	@FindBy (xpath = "//input[@name = 'middleName']")
	private WebElement middlename;
	
	// enter lastname
	@FindBy (xpath = "//input[@name = 'lastName']")
	private WebElement lastname;
	
	// click on save button
	@FindBy (xpath = "//button[@type = 'submit']")
	private WebElement submit;
	
	// enter employee name
	@FindBy (xpath = "(//input[@placeholder = 'Type for hints...'])[1]")
	private WebElement employeeName;
		
	// enter employee ID
	@FindBy (xpath = "(//input[@class = 'oxd-input oxd-input--active'])[2]")
	private WebElement employeeID;
	
	// click on search button
	@FindBy (xpath = "//button[text() = ' Search ']")
	private WebElement searchButton;
	
	// click on Configuration
	@FindBy (xpath = "//span[contains(text(),'Configuration ')]")
	private WebElement configuration;
		
	// click on data_import link
	@FindBy (linkText = "Data Import")
	private WebElement dataImportLink;
	
	// click on browse button
	@FindBy (xpath = "//div[text() = 'Browse']")
	private WebElement browseButton;
	
	// click on upload button
	@FindBy (xpath = "//button[text() = ' Upload ']")
	private WebElement uploadButton;
	
	// click on upload image button
	@FindBy (xpath = "//i[@class = 'oxd-icon bi-plus']")
	private WebElement imageUploadButton;
		
	// click on delete employee button
	@FindBy (xpath = "//i[@class = 'oxd-icon bi-trash']")
	private WebElement deleteButton;	
	
	// click on confirm delete employee button
	@FindBy (xpath = "//button[@class = 'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement confirnDeleteButton;
	
	public void clickOnPIM()
	{
		PIM.click();
	}
	public void clickOnAddEmployee()
	{
		add_Employee.click();
	}
	public void enterFirstname(String name)
	{
		firstname.sendKeys(name);
	}
	public void enteMiddlename(String name)
	{
		middlename.sendKeys(name);
	}
	public void enterLastname(String name)
	{
		lastname.sendKeys(name);
	}
	public void clickOnSubmitbutton()
	{
		submit.click();
	}
	public void enterEmployeeName(String name)
	{
		employeeName.sendKeys(name);
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	public void enterEmployeeID(String id)
	{
		employeeID.sendKeys(id);
	}
	public void clickOnConfiguration()
	{
		Actions act = new Actions(driver);
		act.moveToElement(configuration).click().perform();
	}
	public void clickOnDataImportLink()
	{
		dataImportLink.click();
	}
	public void clickOnBrowseButton()
	{
		browseButton.click();	
	}
	public void clickOnUploadButton()
	{
		uploadButton.click();
	}
	public void clickOnImageUploadButton()
	{
		imageUploadButton.click();
	}
	public void clickOnDeleteButton()
	{
		deleteButton.click();
	}
	public void clickOnConfirmDeleteButton()
	{
		confirnDeleteButton.click();
	}

}
