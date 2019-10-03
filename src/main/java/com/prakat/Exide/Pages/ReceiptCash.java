package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiptCash
{

	//Elements Locator For Pay Type Cash select field
		@FindBy(xpath="//select[@name='payType']")
		private WebElement cash;
		public WebElement getcash()
		{
		return cash;
		}
		
		//Elements Locator For Bank TieUp text field
		@FindBy(xpath="//select[@name='bankTieUp']")
		private WebElement banktieup;
		public WebElement getbanktieup()
		{
		return banktieup;
		}
		
		//Elements Locator For Cash Amount text field
		@FindBy(xpath="//input[@placeholder='Enter Amount']")
		private WebElement cashamt;
		public WebElement getcashamt()
		{
		return cashamt;
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
		private WebElement proceedReciept;
		public WebElement getproceedReciept()
		{
		return proceedReciept;
		}
		
		WebDriver driver;
		
		public ReceiptCash(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
}
