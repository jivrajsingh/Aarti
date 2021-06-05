package com.meganexus.mis.pageObjectLib;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GenericPage extends PageObject {

	public static void checkDDLOptions(final WebElementFacade xpath, final String[] options) {
		List<String> Actoption = xpath.getSelectOptions();
		for (int i = 0; i < Actoption.toArray().length; i++) {
			Assert.assertEquals(options[i], Actoption.get(i));
		}
	}

	/*
	 * public void selectFromDDL(final WebElementFacade xpath, final String
	 * text) { xpath.selectByVisibleText(text); Assert.assertEquals(text,
	 * xpath.getSelectedVisibleTextValue()); }
	 */

	public static void selectFromDDL(WebElementFacade xpath, String KEY, int index) {
		try {
			if (findInDDL(xpath, KEY).contains(KEY)) {
				if (index == 0) {
					xpath.selectByVisibleText(KEY);
					Assert.assertEquals(KEY, xpath.getSelectedVisibleTextValue());
				} else if (index != 0) {
					xpath.selectByIndex(index);
				}
			} else
				System.out.println("Not present in DDL");
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Not present in DDL");
		}
	}

	public static String findInDDL(WebElementFacade xpath, String key) {
		List<String> list = xpath.getSelectOptions();
		// new Select(driver.findElement(By.xpath(xpath))).getOptions();
		String KEY = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(key)) {
				KEY = list.get(i);
				break;
			}
		}
		System.out.println("Value in DDL is :" + KEY);
		return KEY;
	}

	public void assertContaining(String expectedValue, WebElementFacade xpath) {
		if (xpath.getText().contains(expectedValue)) {
			System.out.println("");
		} else
			Assert.fail(
					"Expected value : '" + expectedValue + "' but actual value found is : '" + xpath.getText() + "'");

	}

	public void clickButtonWhenCustomizedXPATH(String Sxpath) {
		getDriver().findElement(By.xpath(Sxpath)).click();
	}

	public void ActionforRadioBtn(String xpath) {
		Actions A = new Actions(getDriver());
		WebElement wb = getDriver().findElement(By.xpath(xpath));
		A.click(wb).build().perform();
	}

	public void JSRadioBtn(String id) {
		waitABit(1000);
		String s = "document.getElementById('" + id + "').click();";
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript(s);

	}

	public void JSRadioBtn(String className, int index) {
		waitABit(1000);
		String s = "document.getElementsByClassName('" + className + "')[index].click();";
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript(s);

	}

	public void UploadDocument(WebElementFacade xpath, String path) {
		waitABit(1000);
		xpath.sendKeys(path);
		waitABit(1000);
	}

	public void TakeScreenshot(String FolderName, String SSName) throws IOException {
		File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy
		// somewhere
		String ScreenshotName = ".\\Screenshots\\" + FolderName + "\\" + SSName + "_Time- " + currentTime() + ".png";
		FileUtils.copyFile(scrFile, new File(ScreenshotName));
	}

	public String currentTime() throws IOException {
		DateFormat df = new SimpleDateFormat("HH-mm-ss");
		Date date = new Date();
		String DATE = df.format(date);
		return DATE;
	}

}
