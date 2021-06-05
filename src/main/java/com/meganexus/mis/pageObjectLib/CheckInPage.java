package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class CheckInPage extends GenericPage {
	NavigateTabs nt;
	ActivityAreaPage aa;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActArReqSpecialism", 6, "No");

	public String AddActiArea = "regression testing";
	public String AddTeam = "";
	public String FirstName = "";
	public String LstName = "";
	public String AllocatedClient = LstName + " " + FirstName;
	public String AddDate = "";
	public String AddTime = "";

	@FindBy(xpath = ".//*[@id='m18665_moduleElement']/h1")
	public WebElementFacade CheckInPageHeader;

	public void NavigateToATTENDANCEPage() throws Exception {
		nt.NavigateToAttendanceMainTab();
		waitABit(1000);
		assertContaining("Clients - Checked In", CheckInPageHeader);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade AttendanceSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade AddAbsenceSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade CheckInSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[3]/a/span")
	public WebElementFacade CheckOutSIDETab;

	public void verifySidetabs() throws Exception {
		assertContaining("Attendance", AttendanceSIDETab);
		assertContaining("Add Absence", AddAbsenceSIDETab);
		assertContaining("Check-In", CheckInSIDETab);
		assertContaining("Check-Out", CheckOutSIDETab);
	}

	/**
	 * Verification of all elements on Page(esp. Absence table elements).
	 */

	@FindBy(xpath = ".//*[@id='m18655_moduleElement']/h1")
	public WebElementFacade TeamAttendancePageHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_18665_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_18665_s_0_activityArea']")
	public WebElementFacade ActAreaTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665_s_1_team']")
	public WebElementFacade TeamTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[2]/table[2]/thead/tr/td[3]")
	public WebElementFacade PrisonNoTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665_s_3_firstName']")
	public WebElementFacade FrstNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665_s_4_surname']")
	public WebElementFacade SurnameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665_s_5_date']")
	public WebElementFacade DateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[2]/table[2]/thead/tr/td[7]")
	public WebElementFacade TimeTable;

	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[2]/table[2]/thead/tr/td[8]")
	public WebElementFacade DeleteTable;

	public void verifyForm() throws Exception {

		assertContaining("Team Attendance", TeamAttendancePageHeader);// Activity
																		// Area
																		// Sub
																		// Top
																		// Tab

		assertContaining("Clients - Checked In", CheckInPageHeader);// Activity
		// Area
		// Table
		// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Activity Area", ActAreaTable);
		assertContaining("Team", TeamTable);
		assertContaining("Prison Number", PrisonNoTable);
		assertContaining("First Name", FrstNameTable);
		assertContaining("Surname", SurnameTable);
		assertContaining("Date", DateTable);
		assertContaining("Time", TimeTable);

		assertContaining("Delete", DeleteTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Absence SIDE TAB
	public void clickCheckINSIDETab() throws Exception {
		CheckInSIDETab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[11]/a")
	public WebElementFacade editRow;

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m18715_moduleElement']/h1")
	public WebElementFacade AddEditClientCheckIn;

	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[1]/label")
	public WebElementFacade DateAddForm;
	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[2]/label")
	public WebElementFacade TimeAddForm;
	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[3]/label")
	public WebElementFacade ActAreaAddForm;
	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[4]/label")
	public WebElementFacade TeamAddForm;

	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[5]/label")
	public WebElementFacade AllocatedClientAddForm;

	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[7]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17785']/fieldset/div[7]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm(String AddEdit) throws Exception {
		assertContaining("Add Client Check-In", AddEditClientCheckIn);

		assertContaining("Date*", ActAreaAddForm);
		assertContaining("Time*", TeamAddForm);
		assertContaining("Activity Area*", ActAreaAddForm);
		assertContaining("Team*", TeamAddForm);
		assertContaining("Allocated Clients*", AllocatedClientAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[@id='m18715_formElement_177455']")
	public WebElementFacade DateAddFormTxtBx;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177315')]")
	public WebElementFacade TimeAddFormTxtBx;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177335')]")
	public WebElementFacade ActAreaAddFormDDL;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177345')]")
	public WebElementFacade TeamAddFormDDL;
	String AllocatedClientAddFormChkBx = ".//*[@id='m18715_formElement_177475']/div/label[contains(text(), '"
			+ AllocatedClient + "')]/preceding-sibling::input";

	public void FillAddEditCheckInForm(String Date, String Time, String ActArea, String Team) throws Exception {

		if (Date.length() > 0) {
			DateAddFormTxtBx.clear();
			DateAddFormTxtBx.sendKeys(Date);
		} else {
			System.out.println("No Date");
		}
		waitABit(1000);

		if (Time.length() > 0) {
			DateAddFormTxtBx.clear();
			DateAddFormTxtBx.sendKeys(Time);
		} else {
			System.out.println("No Time");
		}
		waitABit(1000);

		if (ActArea.length() > 0) {
			selectFromDDL(ActAreaAddFormDDL, ActArea, 0);
		} else {
			System.out.println("No ActArea");
		}
		waitABit(1000);

		if (Team.length() > 0) {
			selectFromDDL(TeamAddFormDDL, Team, 0);
		} else {
			System.out.println("No Team");
		}
		waitABit(1000);

		clickButtonWhenCustomizedXPATH(AllocatedClientAddFormChkBx);

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//

	/**
	 * NA for Check-In
	 */

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[1]")
	public WebElementFacade ActAreaTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[2]")
	public WebElementFacade TeamTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[4]")
	public WebElementFacade FrstNameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[5]")
	public WebElementFacade SurnameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[6]")
	public WebElementFacade DateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[7]")
	public WebElementFacade TimeTableEntry;

	public void VerifyContentsOfRowInTable(String Date, String Time, String ActArea, String Team) throws Exception {
		assertContaining(ActArea, ActAreaTableEntry);
		assertContaining(Team, TeamTableEntry);
		assertContaining(FirstName, FrstNameTableEntry);
		assertContaining(LstName, SurnameTableEntry);
		assertContaining(Date, DateTableEntry);
		assertContaining(Time, TimeTableEntry);
	}

	public void VerifyAllocateClientList(String AddorEdit) throws Exception {
		verifyForm();
		VerifyContentsOfRowInTable(AddDate, AddTime, AddActiArea, AddTeam);

	}

	// -------------------Filters and sorting-------------------------//

	public void ClickOnJMESA() throws Exception {
		ActAreaTable.click();
		TeamTable.click();
		FrstNameTable.click();
		SurnameTable.click();
		DateTable.click();
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[1]/h3/span")
	public WebElementFacade FILTERS;

	@FindBy(xpath = ".//*[@id='activityArea_misJmesa_18665']")
	public WebElementFacade ActAreaFilters;
	@FindBy(xpath = ".//*[@id='team_misJmesa_18665']")
	public WebElementFacade TeamFilters;
	@FindBy(xpath = ".//*[@id='prisonNumber_misJmesa_18665']")
	public WebElementFacade PrisonNoFilters;
	@FindBy(xpath = ".//*[@id='firstName_misJmesa_18665']")
	public WebElementFacade FrstNameFilters;
	@FindBy(xpath = ".//*[@id='surname_misJmesa_18665']")
	public WebElementFacade SurnameFilters;
	@FindBy(xpath = ".//*[@id='date_misJmesa_18665']")
	public WebElementFacade DateFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[1]/div/fieldset/div[7]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_18665']/div[1]/div/fieldset/div[7]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String ActArea, String Team, String PrisonNo, String FrstName, String LastName,
			String Date) throws Exception {
		FILTERS.click();
		ResetFilterBtn.click();
		waitABit(1000);

		if (ActArea.length() > 0) {
			ActAreaFilters.clear();
			ActAreaFilters.sendKeys(ActArea);
		} else
			System.out.println("No ActArea");

		if (Team.length() > 0) {
			TeamFilters.clear();
			TeamFilters.sendKeys(Team);
		} else
			System.out.println("No Team");

		if (PrisonNo.length() > 0) {
			PrisonNoFilters.clear();
			PrisonNoFilters.sendKeys(PrisonNo);
		} else
			System.out.println("No PrisonNo");

		if (FrstName.length() > 0) {
			FrstNameFilters.clear();
			FrstNameFilters.sendKeys(FrstName);
		} else
			System.out.println("No FrstName");

		if (LastName.length() > 0) {
			SurnameFilters.clear();
			SurnameFilters.sendKeys(LastName);
		} else
			System.out.println("No LastName");

		if (Date.length() > 0) {
			DateFilters.clear();
			DateFilters.sendKeys(Date);
		} else
			System.out.println("No Date");

		SearchFilterBtn.click();
	}

	// -------------------Delete a record-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_18665_row1']/td[8]/a")
	public WebElementFacade DeleteRow;

	public void clickARCHIEVEButton() throws Exception {
		DeleteRow.click();
	}

	@FindBy(xpath = ".//*[@id='m18445_moduleElement']/h1")
	public WebElementFacade DeleteAbsenceHeader;
	@FindBy(xpath = ".//*[@id='m18445_moduleElement']/div/form/fieldset/div/p")
	public WebElementFacade DeleteTxt;
	@FindBy(xpath = ".//*[@id='m18445_moduleElement']/div/form/fieldset/div/div/button")
	public WebElementFacade YesButtn;
	@FindBy(xpath = ".//*[@id='m18445_moduleElement']/div/form/fieldset/div/div/a/span")
	public WebElementFacade NoBttn;

	public void archieveARecord() throws Exception {
		clickARCHIEVEButton();
		waitABit(3000);

		assertContaining("Delete Check-In", DeleteAbsenceHeader);
		assertContaining("Are you sure you want to delete this Check-In?", DeleteTxt);
		assertContaining("Yes", YesButtn);
		assertContaining("No", NoBttn);

		NoBttn.click();
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1365/");
	}

}
