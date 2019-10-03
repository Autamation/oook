package com.prakat.Exide.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPersonalDetails {
	@FindBy(name="proposerRelationship")
	private WebElement ProposerRelationship;
	public WebElement getProposerRelationship(){
		return ProposerRelationship;
	}
	
	@FindBy(xpath="//div[text()='Customer Search']")
	private WebElement CustomerSearchText;
	public WebElement getCustomerSearchText(){
		return CustomerSearchText;
	}
	
	@FindBy(name="day")
	private WebElement DateOfBirthDay;
	public WebElement getDateOfBirthDay(){
		return DateOfBirthDay;
	}
	
	
	@FindBy(name="month")
	private WebElement DateOfBirthMonth;
	public WebElement getDateOfBirthMonth(){
		return DateOfBirthMonth;
	}
	
	
	@FindBy(name="year")
	private WebElement DateOfBirthYear;
	public WebElement getDateOfBirthYear(){
		return DateOfBirthYear;
	}	
	
	@FindBy(xpath="//label[@for='custInitSearchGenderMale']")
	private WebElement GenderMale;
	public WebElement getGenderMale(){
		return GenderMale;
	}
	
	@FindBy(xpath="//label[@for='custInitSearchGenderFemale']")
	private WebElement GenderFemale;
	public WebElement getGenderFemale(){
		return GenderFemale;
	}
	
	
	@FindBy(id="custInitSearchPAN")
	private WebElement PANNum;
	public WebElement getPANNum(){
		return PANNum;
	}	
	
	
	@FindBy(xpath="//p[text()=' Valid PAN ']")
	private WebElement validPanTxt;
	public WebElement getvalidPanTxt(){
		return validPanTxt;
	}	
	
	public String getvalidPanText() {
		return validPanTxt.getText();
	}
	

	@FindBy(xpath="//label[@for='custInitSearchHasPAN']")
	private WebElement CustNoPANCheckbox;
	public WebElement getCustNoPANCheckbox(){
		return CustNoPANCheckbox;
	}
	
	@FindBy(xpath="//label[@for='custInitSearchHasAadhaar']")
	private WebElement CustNoAadharCheckbox;
	public WebElement getCustNoAadharCheckbox(){
		return CustNoAadharCheckbox;
	}
	
	
	@FindBy(id="custInitSearchEiaNum")
	private WebElement CustInitSearchEiaNum;
	public WebElement getCustInitSearchEiaNum() {
		return CustInitSearchEiaNum;
	}
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement CustSearch;
	public WebElement getCustSearch(){
		return CustSearch;
	}
	
	@FindBy(id="scrollContainer1")
	private WebElement CustomScrollContainer1;
	public WebElement getCustomScrollContainer1(){
		return CustomScrollContainer1;
	}
	
	
	
	@FindBy(xpath="//label[@for='custInitSearchHasPrevPolicyNum']")
	private WebElement CustHasNoPrevPolicyNumCheckbox;
	public WebElement getCustHasNoPrevPolicyNum(){
		return CustHasNoPrevPolicyNumCheckbox;
	}	
	
	
	@FindBy(xpath="(//button[contains(text(),' Search')])[2]")
	private WebElement PrevPolicySearch;
	public WebElement getPrevPolicySearch(){
		return PrevPolicySearch;
	}	
	
	
	@FindBy(xpath="//label[@for='displayNewCustomerForm']")
	private WebElement AddNewCustomerRadio;
	public WebElement getAddNewCustomerRadio(){
		return AddNewCustomerRadio;
	}	
	
	@FindBy(name="customerTitle")
	private WebElement CustomerTitle;
	public WebElement getcustomerTitle(){
		return CustomerTitle;
	}
	
	@FindBy(id="insuredFirstName")
	private WebElement InsuredFirstName;
	public WebElement getInsuredFirstName(){
		return InsuredFirstName;
	}
	
	@FindBy(id="insuredMiddleName")
	private WebElement InsuredMiddleName;
	public WebElement getInsuredMiddleName(){
		return InsuredMiddleName;
	}		

	@FindBy(id="insuredSurname")
	private WebElement InsuredLastName;
	public WebElement getInsuredLastName(){
		return InsuredLastName;
	}	
	
	
	@FindBy(xpath="//label[@for='noCKYC']")
	private WebElement InsuredNoCKYCCheckBox;
	public WebElement getInsuredNoCKYC(){
		return InsuredNoCKYCCheckBox;
	}		
		
	@FindBy(name="ageProof")
	private WebElement InsuredAgeProof;
	public WebElement getInsuredAgeProof(){
		return InsuredAgeProof;
	}	
	
	@FindBy(name="identityProof")
	private WebElement InsuredIDProof;
	public WebElement getInsuredIDProof(){
		return InsuredIDProof;
	}	
	
	@FindBy(id="identityProofNo")
	private WebElement IdentityProofNo;
	public WebElement getIdentityProofNo(){
		return IdentityProofNo;
	}	
	
	@FindBy(id="spouseEducation")
	private WebElement InsuredEducation;
	public WebElement getInsuredEducation(){
		return InsuredEducation;
	}		

	
	@FindBy(id="marital")
	private WebElement InsuredMaritalStatus;
	public WebElement getInsuredMaritalStatus(){
		return InsuredMaritalStatus;
	}		
	
	
	@FindBy(id="fathersName")
	private WebElement InsuredFatherFN;
	public WebElement getInsuredFatherFN(){
		return InsuredFatherFN;
	}		

	@FindBy(id="fathersMiddleName")
	private WebElement InsuredFatherMN;
	public WebElement getInsuredFatherMN(){
		return InsuredFatherMN;
	}		

	@FindBy(id="fathersSurname")
	private WebElement InsuredFatherLN;
	public WebElement getInsuredFatherLN(){
		return InsuredFatherLN;
	}		
	
	
	@FindBy(id="mothersName")
	private WebElement InsuredMotherFN;
	public WebElement getInsuredMotherFN(){
		return InsuredMotherFN;
	}		

	@FindBy(id="mothersMiddleName")
	private WebElement InsuredMotherMN;
	public WebElement getInsuredMotherMN(){
		return InsuredMotherMN;
	}		

	@FindBy(id="mothersSurname")
	private WebElement InsuredMotherLN;
	public WebElement getInsuredMotherLN(){
		return InsuredMotherLN;
	}	
	
	@FindBy(id="nationalityValue")
	private WebElement InsuredNationality;
	public WebElement getInsuredNationality(){
		return InsuredNationality;
	}
	
	@FindBy(id="countryOfResidence")
	private WebElement InsuredCountryOfResidence;
	public WebElement getInsuredCountryOfResidence(){
		return InsuredCountryOfResidence;
	}	
	
	
	@FindBy(xpath="(//button[text()='Save and Proceed'])[1]")
	private WebElement CustomerSaveProceed;
	public WebElement getCustomerSaveProceed(){
		return CustomerSaveProceed;
	}	
	
	@FindBy(xpath="(//button[text()='Save as draft'])[1]")
	private WebElement CustomerSaveAsDraft;
	public WebElement getCustomerSaveAsDraft(){
		return CustomerSaveAsDraft;
	}	
	
	
	
	
/*	@FindBy(id="communicationAddress1")
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
	}	*/
	
	//-------------------------------------
	
/*	@FindBy(id="occupation")
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
	
		*/
	
	//Elements Locator For IncomeProofType
	
	
	WebDriver driver;
	
	public CustomerPersonalDetails(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
}
