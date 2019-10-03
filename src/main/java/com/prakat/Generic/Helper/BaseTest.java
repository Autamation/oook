package com.prakat.Generic.Helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.prakat.Exide.Pages.CreditcardDetails;
import com.prakat.Exide.Pages.CustomerAddressDetails;
import com.prakat.Exide.Pages.CustomerOccupationDetails;
import com.prakat.Exide.Pages.CustomerPersonalDetails;
import com.prakat.Exide.Pages.HomePage;
import com.prakat.Exide.Pages.LoggedInHomePage;
import com.prakat.Exide.Pages.LoginPage;
import com.prakat.Exide.Pages.NomineeDetails;
import com.prakat.Exide.Pages.NonebillingDetails;
import com.prakat.Exide.Pages.PlanDetails;
import com.prakat.Exide.Pages.ProductSelection;
import com.prakat.Exide.Pages.Questionnarie;
import com.prakat.Exide.Pages.ReceiptCash;
import com.prakat.Exide.Pages.ReceiptCheque;
import com.prakat.Exide.Pages.ReceiptCreditCard;
import com.prakat.Exide.Pages.Summary;

public class BaseTest {
	public static WebDriver driver;
	public  ExcelHelper xlib;
	public  WaitHelper waithelp;
	public  BrowserHelper browhelp;
	public HomePage homePage;
	public LoginPage loginPage;
	public LoggedInHomePage logout;
	public ProductSelection prodSel;
	public DropdownHelper drop;
	public ExcelDataProvider excel;
	public CustomerPersonalDetails cpdetail;
	public CustomerAddressDetails  cadetail;
	public CustomerOccupationDetails codetails;
	public NomineeDetails nomdetails;
	public PlanDetails plndetails;
	public CreditcardDetails credcarddetails;
	public Questionnarie questionnarie;
	public ReceiptCash receiptcash;
	public Summary summary;
	public ReceiptCheque receiptcheque;
	public NonebillingDetails nonebilling;
	public ReceiptCreditCard receiptcreditcard;
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	//public static ExtentTest logger1;
	//public static ExtentTest logger2;
	static String browserName = ConstantHelper.BrowserType;
	static String applicationURl = ConstantHelper.AppURL;
	
	@BeforeSuite
	public void setUpSuite() {
		htmlReporter= new ExtentHtmlReporter("Resources\\Reports\\Report.html");
		htmlReporter.config().setDocumentTitle("EXIDE AUTOMATION REPORT");
		htmlReporter.config().setReportName("EXIDE AUTOMATION TESTING SUMMARY REPORT");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Browser", "Chrome");
	}	
	@AfterMethod
	public static ITestResult getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL,"TEST CASE FAILED IS:"+result.getName());
			test.log(Status.FAIL,"TEST CASE FAILED IS:"+result.getThrowable());
		}else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS,"TEST CASE PASSED IS:"+result.getName());
		} else {
			test.log(Status.SKIP,"TEST CASE SKIPPED IS:"+result.getName());
					
		}
		
	return result;
	}
/*	public static ITestResult getResult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			logger1.log(Status.FAIL, MarkupHelper.createLabel(result.getName() ,
					ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			logger2.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			logger2.skip(result.getThrowable());
		}
		return result;
	

	}	*/	
	
	@BeforeTest
	public void beforeTest() throws IOException, Throwable {
		xlib=new ExcelHelper();
		waithelp=new WaitHelper();
		browhelp= new BrowserHelper();
		//homePage= new HomePage(driver);
		// loginPage=new LoginPage(driver);
		//To get the browser type i.e chrome for this
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Resources/drivers/IEDriverServer.exe");
			driver = new FirefoxDriver();
		}
	
		
		//To get the URL from excel
		//String applicationURl=xlib.getExcelData("Exide", 2, 1);
		browhelp.navigateToUrl(applicationURl);
		waithelp.implicitWait(20);
		browhelp.maximiseWindow();

	}
	
	@AfterSuite
	public void endReport(){
		extent.flush();
}		

}
