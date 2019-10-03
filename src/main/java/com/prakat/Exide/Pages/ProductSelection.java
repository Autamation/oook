package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelection {
	
	
	/*---------- Element Locators for Product Selection Plan Starts here------------*/
	
	// Element locator for Single Product Radio button selection
	@FindBy(xpath="//label[@for='singleProduct']")
	private WebElement SingleProductRadio;
	
	public WebElement getSingleProduct() {
		return SingleProductRadio;
	}
	
	// Element locator for Combo Solution Radio button selection
	@FindBy(xpath="//label[@for='comboSolution']")
	private WebElement ComboSolutionRadio;
	
	public WebElement getComboSolution() {
		return ComboSolutionRadio;
	}
	
	// Element locator for Select Product Search text box
	@FindBy(name="Product")
	private WebElement SelectProductSearch;
	
	public WebElement getSelectProductSearch() {
		return SelectProductSearch;
	}
	
	// Element locator for Proposal Form Number text box
	@FindBy(id="ProposalNo1")
	private WebElement ProposalFormNo;
	
	public WebElement getProposalFormNo() {
		return ProposalFormNo;
	}
	
	// Element locator for Proposal Number validation text
	@FindBy(xpath="//p[text()=' Valid Proposal No ']")
	private WebElement ValidProposalMsg;
	public WebElement getValidProposalMsg() {
		return ValidProposalMsg;
	}	
	
	
	
	@FindBy(xpath="//p[contains(text(),' Required field. Field should be of 8 charact')]")
	private WebElement ProposalErrorMsg;
	public WebElement getProposalErrorMsg() {
		return ProposalErrorMsg;
	}		
	
	
	@FindBy(xpath="(//button[text()=' Save and Proceed '])[1]")
	private WebElement PlanSaveProceedBtn;
	
	public WebElement getPlanSaveProceedBtn() {
		return PlanSaveProceedBtn;
	}
	
	/*---------- Element Locators for Product Selection Plan Ends here--------------*/
	
	/*----- Element Locators for Product Selection Agent Details Starts here--------*/
	
	@FindBy(id="advisorCode")
	private WebElement AdvisorCode;
	public WebElement getAdvisorCode() {
		return AdvisorCode;
	}
	
	// Element locator for Advisor code validation success text
	@FindBy(xpath="//p[text()=' Valid Agent No ']")
	private WebElement ValidAdvisorMsg;
	public WebElement getValidAdvisorMsg(){
		return ValidAdvisorMsg;
	}
	
	// Element locator for Advisor code validation error text
	
	@FindBy(xpath="//p[text()='Invalid Agent No']")
	private WebElement ErrorAdvisorMsg;
	public WebElement getErrorAdvisorMsg(){
		return ErrorAdvisorMsg;
	}
		
	
	@FindBy(xpath="(//button[text()=' Save and Proceed '])[2]")
	private WebElement AgentSaveProceed;
	public WebElement getAgentSaveProceed(){
		return AgentSaveProceed;
	}
	
	
	@FindBy(xpath="//label[text()='Status']")
	private WebElement StatusText;
	public WebElement getStatusText(){
		return StatusText;
	}
			
			
	@FindBy(xpath = "(//button[text()=' Save as draft '])[1]")
	private WebElement AgentSaveAsDraft;
	public WebElement getAgentSaveAsDraft() {
		return AgentSaveAsDraft;
	}
	/*------- Element Locators for Product Selection Agent Details Ends here--------*/
	
	
	/*----- Element Locators for Product Selection E Policy Details Starts here-----*/
	
	@FindBy(xpath="//label[@for='isEPolicyYes']")
	private WebElement EPolicyYesBtn;
	public WebElement getEPolicyYesBtn() {
		return EPolicyYesBtn;
	}	
	
	@FindBy(xpath="//input[@name='epolicy']/following-sibling::label[@for='isEPolicyNo']")
	private WebElement EPolicyNoBtn;
	public WebElement getEPolicyNoBtn() {
		return EPolicyNoBtn;
	}	
		
	@FindBy(xpath="//label[text()='Select Insurance Repository']")
	private WebElement InsuranceRepositoryText;
	public WebElement getInsuranceRepoText() {
		return InsuranceRepositoryText;
	}	
	
	@FindBy(xpath="//label[text()='E-Insurance Account Number']")
	private WebElement EInsuranceAccText;
	public WebElement getEInsuranceAccText() {
		return EInsuranceAccText;
	}		
	
	
	
	@FindBy(name="insuranceRepositoryCode")
	private WebElement InsuranceRepositoryDropDown;
	public WebElement getInsuranceRepository() {
		return InsuranceRepositoryDropDown;
	}
	
	@FindBy(xpath="//label[@for='hasEInsuranceAccYes']")
	private WebElement EInsuranceAccYesBtn;
	public WebElement getEInsuranceAccYesBtn() {
		return EInsuranceAccYesBtn;
	}
	
	@FindBy(xpath="//label[@for='hasEInsuranceAccNo']")
	private WebElement EInsuranceAccNoBtn;
	public WebElement getEInsuranceAccNoBtn() {
		return EInsuranceAccNoBtn;
	}	
	
	@FindBy(xpath="//input[@placeholder='Enter Account Number']")
	private WebElement EAccNum;
	public WebElement getEAccNum(){
		return EAccNum;
	}
	
	@FindBy(xpath="(//button[text()=' Save as draft '])[2]")
	private WebElement EPolicySaveAsDraft;
	public WebElement getEPolicySaveAsDraft() {
		return EPolicySaveAsDraft;
	}	
	
	@FindBy(xpath="(//button[text()=' Save and Proceed '])[3]")
	private WebElement EPolicySaveProceed;
	public WebElement getEPolicySaveProceed(){
		return EPolicySaveProceed;
	}	
	
	
	/*------ Element Locators for Product Selection E Policy Details Ends here------*/
	
	WebDriver driver;
	
	public ProductSelection(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
}
