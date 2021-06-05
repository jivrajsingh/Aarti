package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ClientsIncentivesPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("Incentives", 6, "No");

	public String ADDIncentiveType = XlsReader.getCellData("Incentives", 0, row);
	public String ADDDate = XlsReader.getCellData("Incentives", 1, row);
	public String ADDTime = XlsReader.getCellData("Incentives", 2, row);
	public String ADDActiArea = XlsReader.getCellData("Incentives", 3, row);
	public String ADDCourse = XlsReader.getCellData("Incentives", 4, row);
	public String ADDSupervisor = XlsReader.getCellData("Incentives", 5, row);

	public String EDITIncentiveType = "Red Card";
	public String EDITDate = "05/05/2018";
	public String EDITTime = "05:00";

	// Navigate to Incentives sub-top tab page

	public void clickOnIncentivesSubTopTab() {
		nt.NavigateToIncentivesSubTab();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li/a/span")
	public WebElementFacade AddIncentivesSideTab;

	public void verifySidetabs() throws Exception {
		assertContaining("Clients", ClientsSideTab);
		assertContaining("Add Incentive", AddIncentivesSideTab);
	}

	/**
	 * Verification of all elements on Incentive Table.
	 */
	@FindBy(xpath = ".//*[@id='m17695_moduleElement']/h1")
	public WebElementFacade IncentivesTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17695_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[1]")
	public WebElementFacade IncentiveTypesTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[2]")
	public WebElementFacade DateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695_s_2_activityArea']")
	public WebElementFacade ActivityAreaTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[4]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[5]")
	public WebElementFacade EditTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade ArchieveTable;

	public void verifyForm() throws Exception {

		assertContaining("Incentives", IncentivesTableHeader);// Activity
																// Area
																// Sub
																// Top
																// Tab

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Incentive Type", IncentiveTypesTable);
		assertContaining("Date", DateTable);
		assertContaining("Activity Area", ActivityAreaTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);
		assertContaining("Archive", ArchieveTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Incentives SIDE TAB
	public void clickADDIncentivesSIDETAB() throws Exception {
		AddIncentivesSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[5]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17705_moduleElement']/h1")
	public WebElementFacade AddEditIncentive;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[1]/label")
	public WebElementFacade IncentiveTypeAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[2]/label")
	public WebElementFacade DateAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[3]/label")
	public WebElementFacade TimeAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[4]/label")
	public WebElementFacade ActivityAreaAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[5]/label")
	public WebElementFacade TeamAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[6]/label")
	public WebElementFacade SupervisorAddForm;

	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[8]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17565']/fieldset/div[8]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Add / Edit Incentive", AddEditIncentive);// Table
																	// title

		assertContaining("Incentive Type*", IncentiveTypeAddForm);
		assertContaining("Date*", DateAddForm);
		assertContaining("Time*", TimeAddForm);
		assertContaining("Activity Area", ActivityAreaAddForm);
		assertContaining("Course", TeamAddForm);
		assertContaining("Supervisor", SupervisorAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17705_formElement_173295']")
	public WebElementFacade IncentiveTypeAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17705_formElement_173305']")
	public WebElementFacade DateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17705_formElement_173315']")
	public WebElementFacade TimeAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17705_formElement_173325']")
	public WebElementFacade ActivityAreaAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17705_formElement_173335']")
	public WebElementFacade TeamAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17705_formElement_173345']")
	public WebElementFacade SupervisorAddFormDDL;

	public void FillAddEditIncentivesForm(String IncentiveType, String Date, String Time, String ActArea, String Course,
			String Supervisor) throws Exception {
		System.out.println("values are :" + IncentiveType + ":" + Date + ":" + Time + ":" + ActArea + ":" + Course + ":"
				+ Supervisor);
		if (IncentiveType.length() > 0) {
			selectFromDropdown(IncentiveTypeAddFormDDL, IncentiveType);
		} else {
			System.out.println("No IncentiveType");
		}

		if (Date.length() > 0) {
			DateAddFormTxtBx.clear();
			DateAddFormTxtBx.sendKeys(Date);
		} else {
			System.out.println("No Date");
		}

		if (Time.length() > 0) {
			TimeAddFormTxtBx.clear();
			TimeAddFormTxtBx.sendKeys(Time);
		} else {
			System.out.println("No Time");
		}

		if (ActArea.length() > 0) {
			selectFromDropdown(ActivityAreaAddFormDDL, ActArea);
		} else {
			System.out.println("No ActArea");
		}
		waitABit(500);
		if (Course.length() > 0) {
			selectFromDropdown(TeamAddFormDDL, Course);
		} else {
			System.out.println("No Course");
		}

		if (Supervisor.length() > 0) {
			selectFromDropdown(SupervisorAddFormDDL, Supervisor);
		} else {
			System.out.println("No Supervisor");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[4]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17715_moduleElement']/h1")
	public WebElementFacade ViewIncentivePageHeader;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[1]/label")
	public WebElementFacade IncentiveTypeVeriPg;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[2]/label")
	public WebElementFacade DateVeriPg;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[3]/label")
	public WebElementFacade TimeVeriPg;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[4]/label")
	public WebElementFacade ActiAreaVeriPg;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[5]/label")
	public WebElementFacade TeamVeriPg;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[6]/label")
	public WebElementFacade SupervisorVeriPg;

	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[1]")
	public WebElementFacade IncentiveTypeAddEdit;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[2]")
	public WebElementFacade DateAddEdit;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[3]")
	public WebElementFacade TimeAddEdit;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[4]")
	public WebElementFacade ActivityAreaAddEdit;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[5]")
	public WebElementFacade TeamAddEdit;
	@FindBy(xpath = ".//*[@id='m17715_view-content']/div[6]")
	public WebElementFacade SupervisorAddEdit;

	public void VerifyVIEWIncentivesPage(String IncentiveType, String Date, String Time, String ActArea, String Course,
			String Supervisor) throws Exception {
		assertContaining("View Incentive", ViewIncentivePageHeader);
		assertContaining("Incentive Type", IncentiveTypeVeriPg);
		assertContaining("Date", DateVeriPg);
		assertContaining("Time", TimeVeriPg);
		assertContaining("Activity Area", ActiAreaVeriPg);
		assertContaining("Course", TeamVeriPg);
		assertContaining("Supervisor", SupervisorVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(IncentiveType, IncentiveTypeAddEdit);
		assertContaining(Date, DateAddEdit);
		assertContaining(Time, TimeAddEdit);
		assertContaining(ActArea, ActivityAreaAddEdit);
		assertContaining(Course, TeamAddEdit);
		assertContaining(Supervisor, SupervisorAddEdit);
	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[1]")
	public WebElementFacade IncentiveTypeTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[2]")
	public WebElementFacade DateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[3]")
	public WebElementFacade ActAreaTableEntry;

	public void VerifyContentsOfRowInTable(String IncentiveType, String Date, String ActArea) throws Exception {
		assertContaining(IncentiveType, IncentiveTypeTableEntry);
		assertContaining(Date, DateTableEntry);
		assertContaining(ActArea, ActAreaTableEntry);
	}

	public void VerifyClientIncentivesList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDIncentiveType, ADDDate, "");
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITIncentiveType, EDITDate, "");
		} else
			VerifyContentsOfRowInTable("", "", "");
	}

	// -------------------Archieve a record-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17695_row1']/td[6]/a")
	public WebElementFacade archieveRow;

	public void clickARCHIEVEButton() throws Exception {
		archieveRow.click();
	}

	@FindBy(xpath = ".//*[@id='ui-dialog-title-1']")
	public WebElementFacade ArchiveHeader;
	@FindBy(xpath = "html/body/div[5]/div[2]/form/fieldset/div/p")
	public WebElementFacade ArchieveTxt;
	@FindBy(xpath = "html/body/div[5]/div[2]/form/fieldset/div/div/button")
	public WebElementFacade YesButtn;
	@FindBy(xpath = "html/body/div[5]/div[2]/form/fieldset/div/div/a/span")
	public WebElementFacade NoBttn;

	public void archieveARecord() throws Exception {
		clickARCHIEVEButton();
		waitABit(1000);

		assertContaining("Archive Incentive", ArchiveHeader);
		assertContaining("Are you sure you want to archive?", ArchieveTxt);
		assertContaining("Yes", YesButtn);
		assertContaining("No", NoBttn);
		waitABit(1000);
		NoBttn.click();
		waitABit(1000);
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl()
				.contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/14/24/3445?managedClientId=409803");
	}

	// -------------------Sorting-------------------------//
	public void Sorting() throws Exception {
		// Click twice so that u get the latest record in the list. Here because
		// we have no filters i am doing this. Latest record Comes with an
		// inverted Pyramid
		waitABit(500);
		ActivityAreaTable.click();
		waitABit(200);
		ActivityAreaTable.click();
		waitABit(500);
	}

}
