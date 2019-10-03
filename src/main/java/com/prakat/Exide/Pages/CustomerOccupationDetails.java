package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerOccupationDetails {
	
	@FindBy(id="occupation")
	private WebElement InsuredOccupation;
	public WebElement getInsuredOccupation(){
		return InsuredOccupation;
	}
	
	@FindBy(id="designation")
	private WebElement InsuredDesignation;
	public WebElement getInsuredDesignation(){
		return InsuredDesignation;
	}	
	
	@FindBy(name="oDescription")
	private WebElement InsuredOccupationDesc;
	public WebElement getInsuredOccupationDesc(){
		return InsuredOccupationDesc;
	}		
	
	@FindBy(id="employerName")
	private WebElement InsuredEmployerName;
	public WebElement getInsuredEmployerName(){
		return InsuredEmployerName;
	}	
	
	@FindBy(id="annualIncome")
	private WebElement InsuredAnnualIncome;
	public WebElement getInsuredAnnualIncome(){
		return InsuredAnnualIncome;
	}	
		
	@FindBy(xpath="//label[@for='incomeProofSubmitted']")
	private WebElement InsuredIncomeProofCheckBox;
	public WebElement getInsuredIncomeProofCheckBox(){
		return InsuredIncomeProofCheckBox;
	}	
	
	@FindBy(id="annualIncomefather")
	private WebElement InsuredFatherAnnualIncome;
	public WebElement getInsuredFatherAnnualIncome(){
		return InsuredFatherAnnualIncome;
	}	
	
	@FindBy(id="fDesignation")
	private WebElement InsuredFatherDesignation;
	public WebElement getInsuredFatherDesignation(){
		return InsuredFatherDesignation;
	}	
	
	@FindBy(xpath="//label[@for='contactForAssignmentYes']")
	private WebElement ContactForAssignmentYes;
	public WebElement getContactForAssignmentYes(){
		return ContactForAssignmentYes;
	}	
	
	@FindBy(xpath="//label[@for='contactForAssignmentNo']")
	private WebElement ContactForAssignmentNo;
	public WebElement getContactForAssignmentNo(){
		return ContactForAssignmentNo;
	}		
	
	
	@FindBy(xpath="(//button[text()='Save and Proceed'])[4]")
	private WebElement CustOccuSaveProceed;
	public WebElement getCustOccuSaveProceed(){
		return CustOccuSaveProceed;
	}	
	
	@FindBy(xpath="(//button[text()='Save as draft'])[4]")
	private WebElement CustOccuSaveDraft;
	public WebElement getCustOccuSaveDraft(){
		return CustOccuSaveDraft;
	}	
	
	@FindBy(xpath="(//select[@name='incomeProofType'])[1]")
	private WebElement paytype;
	public WebElement getpaytype()
	{
	return paytype;
	}

	//Elements Locator For Financial year select feild
	@FindBy(xpath="(//select[@name='incomeProofType'])[2]")
	private WebElement finyear;
	public WebElement getfinyear()
	{
	return finyear;
	}

	//Elements Locator For income text feild
	@FindBy(xpath="(//input[@placeholder='Enter' and @type='number'])[4]")
	private WebElement income;
	public WebElement getincome()
	{
	return income;
	}
	
	
	WebDriver driver;
	
	public CustomerOccupationDetails(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
}
