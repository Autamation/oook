package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiptCreditCard
{
	//Elements Locator For Receipt credit card field
	@FindBy(xpath="//select[@name='payType']")
	private WebElement ccard;
	public WebElement getccard()
	{
	return ccard;
	}

	//Elements Locator For Receipt Bank Tieup field
	@FindBy(xpath="//select[@name='bankTieUp']")
	private WebElement tieup;
	public WebElement gettieup()
	{
	return tieup;
	}

	//Elements Locator For Receipt credit card type field
	@FindBy(xpath="//select[@name='ccType']")
	private WebElement cctype;
	public WebElement getcctype()
	{
	return cctype;
	}

	//Elements Locator For Receipt credit card No field
	@FindBy(xpath="//input[@name='ccNo']")
	private WebElement ccno;
	public WebElement getccno()
	{
	return ccno;
	}

	//Elements Locator For expiry month field
	@FindBy(xpath="//input[@name='month']")
	private WebElement month;
	public WebElement getmonth()
	{
	return month;
	}

	//Elements Locator For expiry year field
	@FindBy(xpath="//input[@name='year']")
	private WebElement year;
	public WebElement getyear()
	{
	return year;
	}

	//Elements Locator For credit card amount field
	@FindBy(xpath="//input[@name='ccAmt']")
	private WebElement ccamt;
	public WebElement getccamt()
	{
	return ccamt;
	}

	//Elements Locator For credit card Approval code field
	@FindBy(xpath="//input[@name='ccApproval']")
	private WebElement approval;
	public WebElement getapproval()
	{
	return approval;
	}

	//Elements Locator For card issuing bank field
	@FindBy(xpath="//input[@name='ccBank']")
	private WebElement ccbank;
	public WebElement getccbank()
	{
	return ccbank;
	}

	//Elements Locator For bank mid field
	@FindBy(xpath="//input[@name='ccMID']")
	private WebElement mid;
	public WebElement getmid()
	{
	return mid;
	}

	//Elements Locator For bank tid field
	@FindBy(xpath="//input[@name='ccTID']")
	private WebElement tid;
	public WebElement gettid()
	{
	return tid;
	}

	//Elements Locator For save as draft button
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement draft;
	public WebElement getdraft()
	{
	return draft;
	}

	//Elements Locator For save and proceed button
	@FindBy(xpath="//button[contains(text(),' Save and Proceed ')]")
	private WebElement proceed;
	public WebElement getproceed()
	{
	return proceed;
	}

	WebDriver driver;
	
	public ReceiptCreditCard(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	
}
