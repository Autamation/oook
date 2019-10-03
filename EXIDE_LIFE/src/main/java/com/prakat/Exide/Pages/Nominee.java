package com.prakat.Exide.Pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class Nominee 
	{

	//Elements locators for personal details
		@FindBy(xpath="//a[@class='nav-link active']")
		private WebElement personaldetailstxt;
		public WebElement getpersonaldetailstxt()
		{
		  return personaldetailstxt;
		}


		//Elements locators for personal details of Nominee1 
		@FindBy(name="title")
		private WebElement Nominee1text;
		public WebElement getNominee1text()
		{
		  return Nominee1text;
		}


		//Elements Locators for DOB(DD)
		@FindBy(name="day")
		private WebElement daytextbox;
		public WebElement getdaybox()
		{
		  return daytextbox;
		}

		//Elements Locators for DOB(MM)
		@FindBy(name="month")
		private WebElement monthtextbox;
		public WebElement getmonthtextbox()
		{
		  return monthtextbox;
		}


		//Elements Locators for DOB(year)
		@FindBy(name="year")
		private WebElement yeartextbox;
		public WebElement getyeartextbox()
		{
		  return yeartextbox;
		}

		//elements locator for permanent Account Number
		@FindBy(id="custInitSearchPAN")
		private WebElement pantextbox;
		public WebElement getpantextbox()
		{
		  return pantextbox;
		}


		//elements locator for Aadhar Number
		@FindBy(id="custInitSearchAadhaar")
		private WebElement Aadhartextbox;
		public WebElement getAadhartextbox()
		{
		  return Aadhartextbox;
		}


		//Elements locator for e insurance Account Number
		@FindBy(id="custInitSearchEiaNum")
		private WebElement insuranceacctextbox;
		public WebElement getinsuranceacctextbox()
		{
		  return insuranceacctextbox;
		}



		//Elements Locators for Gender(Male)
		@FindBy(xpath="(//label[@for='custInitSearchGenderMale'])[1]")
		private WebElement MaleRadiobtn1;
		public WebElement getMaleRadiobtn1()
		{
		  return MaleRadiobtn1;
		}



		//Elements Locators for Gender(feMale)
		@FindBy(xpath="(//label[@for='custInitSearchGenderFemale'])[1]")
		private WebElement FeMaleRadiobtn;
		public WebElement getFeMaleRadiobtn()
		{
		  return FeMaleRadiobtn;
		}


		//Elements locator for customer DOES NOT PAN checkbox
		@FindBy(xpath="//label[@for='custInitSearchHasPAN'][1]")
		private WebElement panchkbox;
		public WebElement getpanchkbox()
		{
		  return panchkbox;
		}


		//Elements locator for customer does not have aadhar chechbox
		@FindBy(xpath="//label[@for='custInitSearchHasAadhaar'][1]")
		private WebElement aadharchkbox;
		public WebElement getaadharchkbox()
		{
		  return aadharchkbox;
		}


		//Elements locator for customer has E insurance account number
		@FindBy(xpath="//label[@for='custInitSearchHasEiaNum'][1]")
		private WebElement einsurancechkbox;
		public WebElement geteinsurancechkbox()
		{
		  return einsurancechkbox;
		}




		


		//Elements locator for clear button
		@FindBy(xpath="//button[@class='_ngcontent-c20'][1]")
		private WebElement clearbutton;
		public WebElement getclearbutton()
		{
		  return clearbutton;
		}


		////////////////Nominees relation with insured/////////////////////////



		//Elements locator nominees relationship with insures
		@FindBy(name="proposerRelationship")
		private WebElement comborelation;
		public WebElement getcomborelation()
		{
		return comborelation;
		}


		//Elements locator for TItledropdown
		@FindBy(name="customerTitle")
		private WebElement TitleComboRelation;
		public WebElement getTitleComboRelation()
		{
		return TitleComboRelation;
		}


		//Elements locator for Nominees first Name
		@FindBy(name="insuredFirstName")
		private WebElement FirstNametxt;
		public WebElement getFirstNametxt()
		{
		return FirstNametxt;
		}



		//Elements locator for Nominees middleName
		@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][1]")
		private WebElement middleNametxt;
		public WebElement getmiddleNametxt()
		{
		return middleNametxt;
		}

		//Elements locator for Nominees LastName
		@FindBy(name="insuredSurname")
		private WebElement LastNametxt;
		public WebElement getLastNametxt()
		{
		return LastNametxt;
		}



		//Elements locator for DOB (date)
		@FindBy(name="day")
		private WebElement daytext;
		public WebElement getdaytext()
		{
		return daytext;
		}


		//Elements locator for DOB (month)
		@FindBy(name="month")
		private WebElement monthtext;
		public WebElement getmonthtext()
		{
		return monthtext;
		}



		//Elements locator for DOB (year)
		@FindBy(name="year")
		private WebElement yeartext;
		public WebElement getyeartext()
		{
		return yeartext;
		}


		//elements LOcator for Aadhar number
		@FindBy(name="aadharNo")
		private WebElement aadharnumtext;
		public WebElement getaadharnumtext()
		{
		return aadharnumtext;
		}


		//elements LOcator for passport number
		@FindBy(name="passportNumber")
		private WebElement passportnumtext;
		public WebElement getpassportnumtext()
		{
		return passportnumtext;
		}



		//elements LOcator for spousefirstname
		@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][2]")	
		private WebElement spousefirstnametext;
		public WebElement getspousefirstnametext()
		{
		return spousefirstnametext;
		}



		//elements locators for nationality drop down
		@FindBy(xpath="select[@id='nationalityValue'][1]")
		private WebElement nationalitydropdown;
		public WebElement getnationalitydropdown()
		{
		return nationalitydropdown;
		}

		

		//elements locators for customer does not have Aadhar card checkbox

		@FindBy(xpath="//[lable[@for='noAadhar0'][1]")
		private WebElement noAadharchkbox;
		public WebElement getnoAadharchkbox()
		{
		  return noAadharchkbox;
		}


		//Elements locators for martial status dropdown

		@FindBy(id="maritalStatus")
		private WebElement maritialstatdrop;
		public WebElement getmaritialstatdrop()
		{
		return maritialstatdrop;
		}


		//Elements locators for country of residence drop down


		@FindBy(name="countryOfResidence")
		private WebElement residencecountry;
		public WebElement getresidencecountry()
		{
		return residencecountry;
		}


		//elements locators for save as draft button
		@FindBy(xpath="//lable[@class='btn btn-default'][1]")
		private WebElement saveasdefaultbtn;
		public WebElement getsaveasdefaultbtn()
		{
		return saveasdefaultbtn;
		}


		//elements locators for save and proceed button
		@FindBy(xpath="//lable[@class='btn btn-primary'][2]")
		private WebElement savendproceedbtn;
		public WebElement savendproceedbtn()
		{
		return savendproceedbtn;
		}



		/////////////////////////////////Address and contact////////////////////////////////////

		//Address and contact details of nominee1
		//elements locators for YEs radio button


		@FindBy(xpath="//lable[@for='permanentAddrYes0'][1]")
		private WebElement Yesrdobtn;
		public WebElement getYesrdobtn()
		{
		  return Yesrdobtn;
		}



		//elements locators for permanent Address1 Textbox

		@FindBy(name="pAddressValue1")
		private WebElement permantAddr1;
		public WebElement getpermantAddr1()
		{
		return permantAddr1;
		}

		//elements locators for permanent Address2 textbox

		@FindBy(name="pAddressValue2")
		private WebElement permantAddr2;
		public WebElement getpermantAddr2()
		{
		return permantAddr2;
		}


		//elements locators for permanent Address3 textbox

		@FindBy(name="pAddressValue3")
		private WebElement permantAddr3;
		public WebElement getpermantAddr3()
		{
		return permantAddr3;
		}


		//elements locators for landmarktextbox

		@FindBy(name="pAddressValueLandmark")
		private WebElement landmarktxt;
		public WebElement getlandmarktxt()
		{
		return landmarktxt;
		}



		//elements locators for pincodetext

		@FindBy(name="pPincode")
		private WebElement pincodetext;
		public WebElement getpincodetext()
		{
		return pincodetext;
		}

	//elements locator for mobile number yes radio button
		@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][2]")
		private WebElement mobilenum;
		public WebElement getmobilenum()
		{
		  return mobilenum;
		}

		

		//elements locator for Alternate mobile number yes radio button
			@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][3]")
			private WebElement altmobilenum;
			public WebElement getaltmobilenum()
			{
			  return altmobilenum;
			}

		//elements locator for Home number yes radio button
		@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][3]")
		private WebElement Homenumber;
		public WebElement getHomenumber()
		{
		  return Homenumber;
		}



	////elements locator for Email yes radio button
		@FindBy(xpath="//input[@class='ng-pristine ng-valid ng-touched'][4]")
		private WebElement Emailtxt;
		public WebElement getEmailtxt()
		{
		  return Emailtxt;
		}




	////elements locator for occupation yes radio button
		@FindBy(xpath="//select[@class='ng-pristine ng-valid ng-touched'][2]")
		private WebElement occupationtxt;
		public WebElement getoccupationtxt()
		{
		  return occupationtxt;
		}

		//
		//elements locators for nominee share textboox

		@FindBy(name="nomShare")
		private WebElement Nomineesharetxt;
		public WebElement getNomineesharetxt()
		{
		return Nomineesharetxt;
		}
		
		//Elements locators for Save and draft for nominee relationship
		@FindBy(xpath="//button[@class='btn-btn-default'][2]")
		private WebElement saveanddraftnominee;
		public WebElement getsaveanddraftnominee()
		{
		  return saveanddraftnominee;
		}


		//Elements locators for Save and proceedfor nominee relationship
		@FindBy(xpath="//button[@class='btn-btn-primary'][3]")
		private WebElement saveandpro;
		public WebElement getsaveandpro()
		{
		  return saveandpro;
		}
		
		
		
		
		
		

		
		




	WebDriver driver;
		
		public void CustomerDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	}


