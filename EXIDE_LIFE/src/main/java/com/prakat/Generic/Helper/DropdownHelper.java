package com.prakat.Generic.Helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {
	Select sel;
	public void getSelectByIndex(WebElement mElement, int indexNo) {
		sel = new Select(mElement);
		sel.selectByIndex(indexNo);
	}
 
	public void getSelectByValue(WebElement mElement, String Value) {
		sel = new Select(mElement);
		sel.selectByValue(Value);
	}

	public void getSelectByVisibleText(WebElement mElement, String visibleText) {
		sel = new Select(mElement);
		sel.selectByVisibleText(visibleText);
	}

	public List<WebElement> getAllSelectedOptions(WebElement mElement) {
		sel = new Select(mElement);
		List<WebElement> lst = sel.getAllSelectedOptions();
		return lst;
	}

	public List<WebElement> getOptions(WebElement mElement) {
		sel = new Select(mElement);
		List<WebElement> lst = sel.getOptions();
		return lst;
	}

	public void getDeSelectByIndex(WebElement mElement, int indexNo) {
		sel = new Select(mElement);
		sel.deselectByIndex(indexNo);
	}

	public void getDeSelectByValue(WebElement mElement, String Value) {
		sel = new Select(mElement);
		sel.deselectByValue(Value);
	}

	public void getDeSelectByVisibleText(WebElement mElement, String visibleText) {
		sel = new Select(mElement);
		sel.deselectByVisibleText(visibleText);
	}

}
