package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiptCheque {

	//Elements Locator For payment type select field
	@FindBy(xpath="//select[@name='payType']")
	private WebElement paytype;
	public WebElement getpaytype()
	{
	return paytype;
	}
	
	//Elements Locator For Bank Tie Up select field
	@FindBy(xpath="//select[@name='bankTieUp']")
	private WebElement tieup;
	public WebElement gettieup()
	{
	return tieup;
	}
		
	//Elements Locator For Cheque no text field
	@FindBy(xpath="//input[@placeholder='Enter Number']")
	private WebElement chequeno;
	public WebElement getchequeno()
	{
	return chequeno;
	}
		
	//Elements Locator For Cheque Amount text field
	@FindBy(xpath="//input[@placeholder='Enter Amount']")
	private WebElement chequeamt;
	public WebElement getchequeamt()
	{
	return chequeamt;
	}
	
	//Elements Locator For Day text field
	@FindBy(xpath="//input[@name='day']")
	private WebElement day;
	public WebElement getday()
	{
	return day;
	}
	
	//Elements Locator For Month text field
	@FindBy(xpath="//input[@name='month']")
	private WebElement month;
	public WebElement getmonth()
	{
	return month;
	}

	//Elements Locator For year text field
	@FindBy(xpath="//input[@name='year']")
	private WebElement year;
	public WebElement getyear()
	{
	return year;
	}
	
	//Elements Locator For cheque type select field
	@FindBy(xpath="(//div//select[1])[1]")
	private WebElement chequetype;
	public WebElement getchequetype()
	{
	return chequetype;
	}
	
	
	//Elements Locator For cheque type select field
		@FindBy(xpath="(//div//select[1])[3]")
		private WebElement chequetype1;
		public WebElement getchequetype1()
		{
		return chequetype1;
		}
	
	//Elements Locator For Bank Name text field
	@FindBy(xpath="//input[@name='Bank']")
	private WebElement bank;
	public WebElement getbank()
	{
	return bank;
	}
	
	//Elements Locator For Bank Branch Name text field
		@FindBy(xpath="(//input[@placeholder='Enter'])[1]")
		private WebElement bankbr;
		public WebElement getbankbr()
		{
		return bankbr;
		}
		
		//Elements Locator For Bank Account NO text field
		@FindBy(xpath="(//input[@placeholder='Enter'])[2]")
		private WebElement bankano;
		public WebElement getbankaccno()
		{
		return bankano;
		}
		
		//Elements Locator For Confirm Bank Account NO text field
		@FindBy(xpath="//input[@placeholder='Enter Account No']")
		private WebElement bankno;
		public WebElement getbankno()
		{
		return bankno;
		}
		
		//Elements Locator For Account Holder Name text field
		@FindBy(xpath="(//input[@placeholder='Enter'])[3]")
		private WebElement name;
		public WebElement getname()
		{
		return name;
		}
		
		//Elements Locator For save as draft buttton
		@FindBy(xpath="(//button[@class='btn btn-default']")
		private WebElement draft;
		public WebElement getdraft()
		{
		return draft;
		}
		
		//Elements Locator For save and proceed buttton
				@FindBy(xpath="//button[contains(text(),' Save and Proceed ')]")
				private WebElement proceed;
				public WebElement getproceed()
				{
				return proceed;
				}
				
				
				WebDriver driver;
				
				public ReceiptCheque(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
				}	

}
