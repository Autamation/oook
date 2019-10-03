package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAddressDetails {

	@FindBy(id="communicationAddress1")
	private WebElement InsuredCommunicationAddress1;
	public WebElement getInsuredCommunicationAddress1(){
		return InsuredCommunicationAddress1;
	}	
	
	
	@FindBy(id="communicationAddress2")
	private WebElement InsuredCommunicationAddress2;
	public WebElement getInsuredCommunicationAddress2(){
		return InsuredCommunicationAddress2;
	}		
	
	@FindBy(id="communicationAddress3")
	private WebElement InsuredCommunicationAddress3;
	public WebElement getInsuredCommunicationAddress3(){
		return InsuredCommunicationAddress3;
	}	
	
	@FindBy(id="landmark")
	private WebElement InsuredAddresslandmark;
	public WebElement getInsuredInsuredAddresslandmark(){
		return InsuredAddresslandmark;
	}	
	
	@FindBy(name="cPincode")
	private WebElement CAddressPincode;
	public WebElement getCAddressPincode(){
		return CAddressPincode;
	}	
	
	@FindBy(xpath="//label[@for='addressProof']/..//select")
	private WebElement InsuredAddressProof;
	public WebElement getInsuredAddressProof(){
		return InsuredAddressProof;
	}	
	
	@FindBy(xpath="//label[@for='sameAddressYes']")
	private WebElement SameAddressYesRadioBtn;
	public WebElement getSameAddressYesBtn(){
		return SameAddressYesRadioBtn;
	}	
	
	@FindBy(xpath="//label[@for='sameAddressNo']")
	private WebElement SameAddressNoRadioBtn;
	public WebElement getSameAddressNoBtn(){
		return SameAddressNoRadioBtn;
	}	
	
	
	@FindBy(id="pCommunicationAddress1")
	private WebElement InsuredPermanentAddress1;
	public WebElement getInsuredPermanentAddress1(){
		return InsuredPermanentAddress1;
	}	
	
	
	@FindBy(id="pCommunicationAddress2")
	private WebElement InsuredPermanentAddress2;
	public WebElement getInsuredPermanentAddress2(){
		return InsuredPermanentAddress2;
	}	
	
	@FindBy(id="pCommunicationAddress3")
	private WebElement InsuredPermanentAddress3;
	public WebElement getInsuredPermanentAddress3(){
		return InsuredPermanentAddress3;
	}	
	
	@FindBy(id="pLandmark")
	private WebElement InsuredPAddresslandmark;
	public WebElement getInsuredPAddresslandmark(){
		return InsuredPAddresslandmark;
	}	
		
	@FindBy(name="pPincode")
	private WebElement PAddressPincode;
	public WebElement getPAddressPincode(){
		return PAddressPincode;
	}
	
	
	@FindBy(xpath="//label[@for='city']")
	private WebElement CityText;
	public WebElement getCityText(){
		return CityText;
	}	
	
	@FindBy(id="mobileNumber")
	private WebElement InsuredMobileNum;
	public WebElement getInsuredMobileNum(){
		return InsuredMobileNum;
	}	
	
	
	@FindBy(xpath="//p[text()='Invalid Mobile Number.']")
	private WebElement MobileNoErr;
	public WebElement getMobileNoErr(){
		return MobileNoErr;
	}		
	
	
	@FindBy(id="altMobileNumber")
	private WebElement InsuredAltMobileNum;
	public WebElement getInsuredAltMobileNum(){
		return InsuredAltMobileNum;
	}	
	
	@FindBy(id="homeNumber")
	private WebElement InsuredHomeNum;
	public WebElement getInsuredHomeNum(){
		return InsuredHomeNum;
	}	
	
	@FindBy(id="officeNumber")
	private WebElement InsuredOfficeNum;
	public WebElement getInsuredOfficeNum(){
		return InsuredOfficeNum;
	}		
	
	
	@FindBy(id="email")
	private WebElement InsuredEmail;
	public WebElement getInsuredEmail(){
		return InsuredEmail;
	}		
	
	
	@FindBy(xpath="//p[text()='Invalid email!']")
	private WebElement InsuredEmailErr;
	public WebElement getInsuredEmailErr(){
		return InsuredEmailErr;
	}	
	
	@FindBy(xpath="//label[@for='commModeEmail']")
	private WebElement CommModeEmail;
	public WebElement getCommModeEmail(){
		return CommModeEmail;
	}		
	
	
	@FindBy(xpath="//label[@for='commModePaper']")
	private WebElement CommModePaper;
	public WebElement getCommModePaper(){
		return CommModePaper;
	}	
	
	
	@FindBy(xpath="//label[@for='commModeSms']")
	private WebElement CommModeSms;
	public WebElement getCommModeSms(){
		return CommModeSms;
	}	
	
	
	@FindBy(id="lang")
	private WebElement PreferedLanguage;
	public WebElement getPreferedLanguage(){
		return PreferedLanguage;
	}	
	
	
	
	@FindBy(xpath="(//button[text()='Save and Proceed'])[2]")
	private WebElement CustAddrSaveProceed;
	public WebElement getCustAddrSaveProceed(){
		return CustAddrSaveProceed;
	}	
	
	@FindBy(xpath="(//button[text()='Save as draft'])[2]")
	private WebElement CustAddrSaveDraft;
	public WebElement getCustAddrSaveDraft(){
		return CustAddrSaveDraft;
	}	
	
	WebDriver driver;
	
	public CustomerAddressDetails(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
}
