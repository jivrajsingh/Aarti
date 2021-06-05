package com.meganexus.mis.stepLib;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.meganexus.mis.pageObjectLib.GenericPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.pages.PageObject;

public class GenericStep extends GenericPage{

	
	protected static WebDriver driver;
	protected String baseUrl= "https://vc2.mat.meganexus.com/neo_1_0/portal/index/";
	protected StringBuffer verificationErrors = new StringBuffer();
	long time = Calendar.getInstance().getTimeInMillis();
	Timestamp ts = new Timestamp(time);
	

	/** 
	 * setUp() method is used for the initial setup of the firefox browser which is used to launch the application.
	 * This method creates an instance of firefox driver called "driver" and uses that object to set size of the browser window and also to set the time for timeouts.
	 */
//	@Before
//	public void setUp() {
//	System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//	driver = new FirefoxDriver();
//	driver.manage().window().maximize();
//	}
//		
//	/**
//	 * tearDown() method is used for logging out of the application, quits this driver by closing every associated window.
//	 * and if the test //fails, the errors will be caught by the StringBuffer element "verificationErrors".
//	 *  
//	 */
//	@After
//	public void tearDown() throws Exception {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(".//*[@id='std-layout']/div[1]/div[1]/ul/li/a")).click();
//	try{
//		driver.getCurrentUrl().contains(baseUrl);
//	}
//	catch(Exception e)
//	{
//		driver.findElement(By.xpath(".//*[@id='std-layout']/div[1]/div[1]/ul/li/a")).click();
//	}
//	Thread.sleep(3000);
//	Assert.assertEquals(driver.getCurrentUrl(), baseUrl);
//	driver.quit();
//	String verificationErrorString = verificationErrors.toString();
//	if (!"".equals(verificationErrorString)) {
//       //fail(verificationErrorString);
//}
//	}

	
	/**
	 * Generic
	 * methods
	 * starting
	 * from
	 * here
	 * Refer
	 * all
	 * methods
	 * used
	 * from
	 * here
	 * only
	 * Author- Subhajit Ghosh */
	
	/**
	 * clickButton(String) is used to click on the specified save button.
	 * @param xpath is the HTML xpath of the save button.
	 */
	protected static void clickButton(final String xpath) throws InterruptedException{
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(5000);
	}
	
	/**
	 * sendKeys(String, String) is used to send the value to the textbox.
	 * @param xpath is the HTML xpath of the textbox.
	 * @param keys is the value to be passed into the textbox.
	 */
	protected static void sendKeys(final String xpath, final String keys ) {
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}
	
	/**
	 * selectFromDDL(String, String) is used to select the specified element in the DropDown list.
	 * @param xpath is the HTML xpath of the DropDown list.
	 * @param text is the element to be selected from the DropDown list.
	 */
	protected static void selectFromDDL(final String xpath, final String text ) {
		new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(text);
		try{
			Assert.assertEquals(new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText(), text);
		}
		catch(ElementNotVisibleException e)
		{
			new Select(driver.findElement(By.id(xpath))).selectByVisibleText(text);
		}
		Assert.assertEquals(new Select(driver.findElement(By.id(xpath))).getFirstSelectedOption().getText(), text);
	}
	
	/**
	 * clickRadio(String) is used to click on the RadioButton/CheckBox
	 * @param xpath is the HTML xpath of the RadioButton/CheckBox.
	 */
	protected void clickRadioOrChckBox(final String xpath) {
		WebElement radioOrCheckBox = driver.findElement(By.id(xpath));
		
		if(!radioOrCheckBox.isSelected())
			radioOrCheckBox.click();
		else
			Assert.assertEquals(radioOrCheckBox.isSelected(), true);
		
		Assert.assertEquals(radioOrCheckBox.isSelected(), true);
		System.out.println(radioOrCheckBox.getText()+" is selected");
		
		}
	
	/**
	 * checkDDLOptions(String, String) is used to check whether all the required options are present in the DropDown list or not.
	 * @param xpath is the HTML xpath of the DropDown list.
	 * @param text is the text having all the required options of the DropDown list. 
	 */
	protected static void checkDDLOptions(final String xpath, final String[] options ) {
		List<WebElement> list = new Select(driver.findElement(By.xpath(xpath))).getOptions();
		for ( int i=0; i < options.length; i++ ) {
			Assert.assertEquals(options[i].toString(), list.get(i).getText());
		}
     }
	
	/**
	 * mouseHover(String) is hover on element on webpage
	 * @param xpath is the HTML xpath of the DropDown list.
	 */
	protected static void mouseHover(final String xpath) {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(xpath));
		action.moveToElement(we).build().perform();
		}
	
	/**
	 * clickTab() is used to click on the specified tab.
	 * @param tabXpath is the XPath of the tab.
	 * @param waitForXpath is XPath of the element present in the next page .
	 */
	protected static void clickTab(final String tabXpath, final String waitForXpath){
		// Click Tab
	
	try{
		WebElement element = driver.findElement(By.xpath(tabXpath));
		element.click();
		waitForElement(waitForXpath);
		// Wait for tab to load
		long StartTime = System.currentTimeMillis();
		long CurTime = System.currentTimeMillis();
		while ( true ) {
			if ((CurTime - StartTime) >= 60000) fail("timeout");
			try { if (isElementPresent(By.xpath(waitForXpath))) break; } catch (Exception e) {}
			CurTime = System.currentTimeMillis();
		}
	}
	catch(ElementNotVisibleException e)
	{
		System.out.println("Element was not found/present");
	}
	}
	
	 public static String waitForElement(final String xpath) {
         WebDriverWait wait = new WebDriverWait(driver,90);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//visibilityOfElementLocated(By.xpath(xpath)));(instead we can use  visibilityOfElementLocated )
         return xpath;
     }
	 
	 /**
		 * isElementPresent() method verifies that the specified element is somewhere on the page and returns true/false accordingly.
		 * @param the "by" object passed is the element to be verified whether present or not.
		 * @return true if the element is present otherwise false.
		 * 
		 */
		protected static boolean isElementPresent(final By by) {
			try {
				driver.findElement(by);
				return true;
			} catch (NoSuchElementException e) {
				return false;
			}
		}
		
	 /**
	   * Fails a test with the given message.
	   * @param message the assertion error message
	   */
	  static public void fail(String message) {
	    throw new AssertionError(message);
	  }
	  
	    
	  /**
		 * selectFromDDLByIndex(String, int) is used to select the specified element in the DropDown list.
		 * @param id is the HTML ID of the DropDown list.
		 * @param text is the element to be selected from the DropDown list.
		 */
		protected void selectFromDDLByIndex(final String id, final int index) {
			new Select(driver.findElement(By.id(id))).selectByIndex(index);
		
		}	  

		/**
		 * getDate() method returns the current date.
		 * @return current date of type String.
		 */
		protected String getDate() {
	        Calendar cal = Calendar.getInstance();
	        int m = cal.get(Calendar.MONTH) +1;
	        String month = "" + m;
	        String today = "" + cal.get(Calendar.DAY_OF_MONTH) +"/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR);
	        if ( m < 10 ) {
	               month="0" + m;
	        }
	        today="" + cal.get(Calendar.DAY_OF_MONTH) +"/" + month + "/" + cal.get(Calendar.YEAR);
	        return today;
	     }
		
		/**
		 * getToday() returns today's date
		 * @return today's date of type String
		 */
		  protected String getToday() {
	        Calendar cal = Calendar.getInstance();
	        int m = cal.get(Calendar.MONTH) +1;
	        int d = cal.get(Calendar.DAY_OF_MONTH);
	        String month = "" + m;
	        String day = "" + d;
	        if ( d < 10 ) {
	               day ="0" + d;
	        }
	        if ( m < 10 ) {
	               month="0" + m;
	        }
	        String today="" + day +"/" + month + "/" + cal.get(Calendar.YEAR);
	        return today;
	      }
	 
		  /**
		   * getTomorrow() returns tomorrow's date.
		   * @return tomorrow's date of type String
		   */
	      protected String getTomorrow() {
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DAY_OF_MONTH, +1);
	        int m = cal.get(Calendar.MONTH) +1;
	        int d = cal.get(Calendar.DAY_OF_MONTH);
	        String month = "" + m;
	        String day = "" + d;
	        if ( d < 10 ) {
	               day ="0" + d;
	        }
	        if ( m < 10 ) {
	               month="0" + m;
	        }
	        String tomorrow="" + day +"/" + month + "/" + cal.get(Calendar.YEAR);
	        return tomorrow;
	       }
	 
	      /**
	       * getTodayPlus(int) adds the required number of days to today's date and returns that date.
	       * @param days is the number of days to be added to the today's date.
	       * @return a date whose value is (today's date+days)
	       */
	      protected String getTodayPlus(final int days) {
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DAY_OF_MONTH, +days);
	        int m = cal.get(Calendar.MONTH) +1;
	        int d = cal.get(Calendar.DAY_OF_MONTH);
	        String month = "" + m;
	        String day = "" + d;
	        if ( d < 10 ) {
	               day ="0" + d;
	        }
	        if ( m < 10 ) {
	               month="0" + m;
	        }
	        String date="" + day +"/" + month + "/" + cal.get(Calendar.YEAR);
	         return date;
	       }
	 	
}
