package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditcardDetails {
	
	//PLAN DETAILS

	//Renewal payment credit card 
	 
	//Element locator Renewal payment credit card for credit card radio button
	@FindBy(xpath="//label[@for='creditCard']")
	private WebElement  creditCardRadiobutton;
	public WebElement getcreditCardRadiobutton()
	{
	return creditCardRadiobutton;
	}

	//Element locator Renewal payment credit card for credit card Holders name text field
	@FindBy(xpath="(//input[@placeholder='Enter Name'])[1]")
	private WebElement  creditHoldernametfield;
	public WebElement getcreditHoldernametfield()
	{
	return creditHoldernametfield;
	}

	//Element locator Renewal payment credit card for credit card brand drop down
	@FindBy(xpath="//select[@name='creditccBrand']")
	private WebElement  creditccBrandDropdown;
	public WebElement getcreditccBrandDropdown()
	{
	return creditccBrandDropdown;
	}


	//Element locator Renewal payment credit card for credit card number text field
	@FindBy(xpath="//input[@name='creditccNumber']")
	private WebElement  creditccNumbertfield;
	public WebElement getcreditccNumbertfield()
	{
	return creditccNumbertfield;
	}


	//Element locator Renewal payment credit card for Expirydate Month text field
	@FindBy(xpath="(//input[@name='month'])[2]")
	private WebElement  ExpirydateMonthtfield;
	public WebElement getExpirydateMonthtfield()
	{
	return ExpirydateMonthtfield;
	}

	//Element locator Renewal payment credit card for Expirydate Year text field
	@FindBy(xpath="(//input[@name='year'])[2]")
	private WebElement  ExpirydateYeartfield;
	public WebElement getExpirydateYeartfield()
	{
	return  ExpirydateYeartfield;
	}
	
	//save and proceed reneval payment

	@FindBy(xpath="(//button[contains(text(),' Save and Proceed ')])[2]")
	private WebElement saveandproceedForCreditReneval;
	public WebElement getsaveandproceedForCreditReneval()
	{
	return saveandproceedForCreditReneval;
	}
	
	

	@FindBy(xpath="(//button[contains(text(),' Save and Proceed ')])[3]")
	private WebElement saveandproceedForCredPayout;
	public WebElement getsaveandproceedForCredPayout()
	{
	return saveandproceedForCredPayout;
	}
	
	@FindBy(xpath="(//button[contains(text(),' Save and Proceed ')])[4]")
	private WebElement saveandproceedForCredPremiumt;
	public WebElement getsaveandproceedForCredPremiumt()
	{
	return saveandproceedForCredPremiumt;
	}

	//Element locator Renewal payment credit card for credit issuer drop down
	@FindBy(xpath="//select[@name='creditCardIssuer']")
	private WebElement  CardIssuerDropdown;
	public WebElement getCardIssuerDropdown()
	{
	return CardIssuerDropdown;
	}
	

	//Element locator Renewal payment credit card for preffer Debit date drop down
	@FindBy(xpath="//select[@name='debitDate']")
	private WebElement  debitDateDropdown;
	public WebElement getdebitDateDropdown()
	{
	return debitDateDropdown;
	}
	
	

	//PREMIUM PAYER

	//Element locator premium payer for YES radio button

	@FindBy(xpath="//label[@for='isEPolicyYes']")
	private WebElement  YesRadiobutton;
	public WebElement getYesRadiobutton()
	{
	return YesRadiobutton;
	}

	//Element locator premium payer for First name text field
	@FindBy(xpath="//input[@id='firstName'][2]")
	private WebElement  firstNametfield1;
	public WebElement getfirstNametfield1()
	{
	return  firstNametfield1;
	}

	//Element locator premium payer for Middle name text field
	@FindBy(xpath="//input[@id='middleName']")
	private WebElement  firstNametfield;
	public WebElement getfirstNametfield()
	{
	return  firstNametfield;
	}

	//Element locator premium payer for Last name text field
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement  lastNametfield;
	public WebElement getlastNametfield()
	{
	return  lastNametfield;
	}

	//Element locator premium payer for premium payer's relationship with life assured dropdown
	@FindBy(xpath="//select[@id='laRelationship']")
	private WebElement  laRelationshipDropdown;
	public WebElement getlaRelationshipDropdown()
	{
	return laRelationshipDropdown;
	}

	//Element locator premium payer for country of residence dropdown
	@FindBy(xpath="//select[@class='ng-valid ng-touched ng-dirty']")
	private WebElement  residencepDropdown;
	public WebElement getresidenceDropdown()
	{
	return residencepDropdown;
	}


	//Element locator premium payer for Identity proof dropdown
	@FindBy(xpath="//select[@class='ng-pristine ng-valid ng-touched'][2]")
	private WebElement  IdProofDropdown;
	public WebElement getIdProofDropdown()
	{
	return IdProofDropdown;
	}

	//Element locator premium payer for Identity proof document number text field
	@FindBy(xpath="//input[@id='docNumber']")
	private WebElement  IdProofDocNOtfield;
	public WebElement getIdProofDocNOtfield()
	{
	return IdProofDocNOtfield;
	}


	//Element locator premium payer for Address proof dropdown
	@FindBy(xpath="//select[@class='ng-pristine ng-valid ng-touched'][3]")
	private WebElement AddressproofDropdown;
	public WebElement getAddressproofDropdown()
	{
	return AddressproofDropdown;
	}


	//Element locator premium payer for Address proof issuing Authority text field
	@FindBy(xpath="//input[@id='iAuthority']")
	private WebElement issuingAuthoritytfield;
	public WebElement getissuingAuthoritytfield()
	{
	return issuingAuthoritytfield;
	}
	
	
	//credit card type
		@FindBy(xpath="//select[@name='ccType']")
		private WebElement creditcardtype;
		public WebElement getcreditcardtype()
		{
		return creditcardtype;
		}
	
	
WebDriver driver;
	
	public CreditcardDetails(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}


}
