package com.prakat.Generic.Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;

public class BrowserHelper extends BaseTest {
	public void maximiseWindow() {
		driver.manage().window().maximize();
	}
	public void minimiseeWindow(int len,int wed) {
		driver.manage().window().setPosition(new Point(len,wed));
	}
	public void navigateToUrl(String Url) {
		driver.navigate().to(Url);		
	}
	public void getToUrl(String Url) {
		driver.navigate().to(Url);		
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();

	}
	public void ScroallDownPage() {
		// JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		// js.executeScript("window.scrollBy(0,250)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
	}
	
}
