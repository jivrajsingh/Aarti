package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ActivityAreaAllocateClientPage extends GenericPage {
	NavigateTabs nt;
	ActivityAreaPage aa;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActArReqSpecialism", 6, "No");

	public String ActiArea = "regression testing";// XlsReader.getCellData("ActivityArea",
													// 0, row);

	public String filterTeam = "";

	public String ADDSpecialism = "regression testing";
	public String ADDSkillLevel = "regression testing";
	public String FirstName = "SubhajitBer4";
	public String LstName = "GhoshBer4";
	public String ADDClientName = FirstName + " " + LstName;
	public String ADDStartDate = "01/12/2018";
	public String ADDEndDate = "";

	public String EDITClientName = "";
	public String EDITStartDate = "";
	public String EDITEndDate = "";

	public String viewRowAActArea = ".//*[@id='misJmesa_18525_row3']/td[contains(text(), '" + ActiArea
			+ "')]/following-sibling::td[4]/a";

	public void NavigateToViewActArea() throws Exception {
		aa.clickOnJMESA(2);
		waitABit(1000);
		clickButtonWhenCustomizedXPATH(viewRowAActArea);
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17375_row1']/td[6]/a")
	public WebElementFacade viewButtonRowOneOfTEAMTable;

	public void NavigateToViewTEAM() {
		viewButtonRowOneOfTEAMTable.click();
		waitABit(1000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ActivityAreaSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade AllocateClientSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade AddRequiredSpecialismSIDETab;

	public void verifySidetabs() throws Exception {
		assertContaining("Activity Area", ActivityAreaSIDETab);
		assertContaining("Allocate Client", AllocateClientSIDETab);
		assertContaining("Add Required Specialism", AddRequiredSpecialismSIDETab);
	}

	/**
	 * Verification of all elements on Page(esp. Allocated Clients table
	 * elements).
	 */
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade ActivityAreaPageHeader;
	@FindBy(xpath = ".//*[@id='m17505_moduleElement']/h1")
	public WebElementFacade AllocatedClientsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div/table[2]/thead/tr/td[1]")
	public WebElementFacade PrisonNoTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_s_1_lastName']")
	public WebElementFacade SurnameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_s_2_firstName']")
	public WebElementFacade FirstNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[2]/table[2]/thead/tr/td[4]")
	public WebElementFacade SpecialismTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[2]/table[2]/thead/tr/td[5]")
	public WebElementFacade SkillLevelTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_s_5_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_s_6_endDate']")
	public WebElementFacade EndDateTable;

	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[2]/table[2]/thead/tr/td[8]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[2]/table[2]/thead/tr/td[9]")
	public WebElementFacade EditTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[2]/table[2]/thead/tr/td[10]")
	public WebElementFacade DeleteTable;

	public void verifyForm() throws Exception {

		assertContaining("Activity Area", ActivityAreaPageHeader);// Activity
																	// Area
																	// Sub
																	// Top
																	// Tab

		assertContaining("Allocated Clients", AllocatedClientsTableHeader);// Activity
																			// Area
																			// Table
																			// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Prison Number", PrisonNoTable);
		assertContaining("Surname", SurnameTable);
		assertContaining("First Name", FirstNameTable);
		assertContaining("Specialism", SpecialismTable);
		assertContaining("Skill Level", SkillLevelTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);

		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);
		assertContaining("Delete", DeleteTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Activity Area SIDE TAB
	public void clickAllocateClientSIDETab() throws Exception {
		AllocateClientSIDETab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[9]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m18625_moduleElement']/h1")
	public WebElementFacade AddEditAllocateClients;

	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[1]/label")
	public WebElementFacade SpecialismAddForm;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[2]/label")
	public WebElementFacade SkillLevelAddForm;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[3]/label")
	public WebElementFacade ClientNameAddForm;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[3]/div/div[1]/button")
	public WebElementFacade SearchAddFormbttn;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[3]/div/div[2]/button")
	public WebElementFacade ADDAddFormbttn;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[4]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[5]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[7]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[7]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Area", ActivityAreaPageHeader);// Sub Top
																	// Tab

		assertContaining("Allocate Clients", AddEditAllocateClients);// Table
																		// title

		assertContaining("Specialism", SpecialismAddForm);
		assertContaining("Skill Level", SkillLevelAddForm);
		assertContaining("Client Name*", ClientNameAddForm);
		assertContaining("Search", SearchAddFormbttn);
		assertContaining("Add", ADDAddFormbttn);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[@id='m18625_formElement_177695']")
	public WebElementFacade SpecialismAddFormDDL;
	@FindBy(xpath = ".//*[@id='m18625_formElement_177705']")
	public WebElementFacade SkillLevelAddFormDDL;
	@FindBy(xpath = ".//*[@id='m18625_formElement_177715_search']")
	public WebElementFacade ClientNameSearchAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m18625_formElement_177715']")
	public WebElementFacade ClientNameADDAddFormDDL;

	@FindBy(xpath = ".//*[@id='m18625_formElement_177725']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m18625_formElement_177735']")
	public WebElementFacade EndDateAddFormTxtBx;

	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[3]/div/div[3]/ul/li/button")
	public WebElementFacade REMOVEbttnAppears;

	public void FillAddEditAllocateClientForm(String Specialism, String SkillLevel, String ClientName, String StartDate,
			String EndDate) throws Exception {

		if (Specialism.length() > 0) {
			selectFromDDL(SpecialismAddFormDDL, Specialism, 0);
		} else {
			System.out.println("No Team");
		}
		waitABit(1000);

		if (SkillLevel.length() > 0) {
			selectFromDDL(SkillLevelAddFormDDL, SkillLevel, 0);
		} else {
			System.out.println("No SkillLevel");
		}
		waitABit(1000);

		if (ClientName.length() > 0) {
			ClientNameSearchAddFormTxtBx.sendKeys(ClientName);
			SearchAddFormbttn.click();
			waitABit(1000);
			selectFromDDL(ClientNameADDAddFormDDL, SkillLevel, 1);
			ADDAddFormbttn.click();
			waitABit(1000);
			assertContaining("Remove", REMOVEbttnAppears);

		} else {
			System.out.println("No ClientName");
		}
		waitABit(1000);

		if (StartDate.length() > 0) {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDate);
		} else {
			System.out.println("No StartDate");
		}

		if (EndDate.length() > 0) {
			EndDateAddFormTxtBx.clear();
			EndDateAddFormTxtBx.sendKeys(EndDate);
		} else {
			System.out.println("No EndDate");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[8]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m18545_moduleElement']/h1")
	public WebElementFacade ViewClientAllocationPageHeader;

	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[1]/label")
	public WebElementFacade SpecialismVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[2]/label")
	public WebElementFacade SkillLevelVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[3]/label")
	public WebElementFacade ClientNameVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[4]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[5]/label")
	public WebElementFacade EndDateVeriPg;

	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[6]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[8]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[7]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[9]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[1]/p")
	public WebElementFacade SpecialismEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[2]/p")
	public WebElementFacade SkillLevelEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[3]/p")
	public WebElementFacade ClientNameEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[4]/p")
	public WebElementFacade StartdateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18545_view-content']/div[5]/p")
	public WebElementFacade EnddateEntryAddEdit;

	public void VerifyVIEWClientAllocationPage(String Specialism, String SkillLevel, String ClientName,
			String StartDate, String EndDate) throws Exception {
		assertContaining("Activity Area", ActivityAreaPageHeader);
		assertContaining("View Client Allocation", ViewClientAllocationPageHeader);

		assertContaining("Specialism", SpecialismVeriPg);
		assertContaining("Skill Level", SkillLevelVeriPg);
		assertContaining("Client Name", ClientNameVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("End Date", EndDateVeriPg);

		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.

		assertContaining(Specialism, SpecialismEntryAddEdit);
		assertContaining(SkillLevel, SkillLevelEntryAddEdit);
		assertContaining(ClientName, ClientNameEntryAddEdit);
		assertContaining(StartDate, StartdateEntryAddEdit);
		if (EndDate.length() > 0) {
			assertContaining(EndDate, EnddateEntryAddEdit);
		}
	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[2]")
	public WebElementFacade ClientNameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[5]")
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[6]")
	public WebElementFacade EndDateTableEntry;

	public void VerifyContentsOfRowInTable(String ClientName, String StartDate, String EndDate) throws Exception {
		assertContaining(ClientName, ClientNameTableEntry);
		assertContaining(StartDate, StartDateTableEntry);
		assertContaining(EndDate, EndDateTableEntry);
	}

	public void VerifyAllocateClientList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDClientName, ADDStartDate, ADDEndDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITClientName, EDITStartDate, EDITEndDate);
		}
	}

	// -------------------Filters and sorting-------------------------//

	public void ClickOnJMESA() throws Exception {
		SurnameTable.click();
		FirstNameTable.click();
		StartDateTable.click();
		EndDateTable.click();
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[1]/h3")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='firstName_misJmesa_17505']")
	public WebElementFacade FrstNameFilters;
	@FindBy(xpath = ".//*[@id='lastName_misJmesa_17505']")
	public WebElementFacade LstNameFilters;
	@FindBy(xpath = ".//*[@id='clientPrnNumber_misJmesa_17505']")
	public WebElementFacade PrisonNoFilters;
	@FindBy(xpath = ".//*[@id='startDate_misJmesa_17505']")
	public WebElementFacade StartDateFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[1]/div/fieldset/div[5]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_17505']/div[1]/div/fieldset/div[5]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String FrstName, String Surname, String PrisonNo, String StartDate) throws Exception {
		FILTERS.click();
		ResetFilterBtn.click();
		waitABit(1000);
		if (FrstName.length() > 0) {
			FrstNameFilters.clear();
			FrstNameFilters.sendKeys(FrstName);
		} else
			System.out.println("Not required");

		if (Surname.length() > 0) {
			LstNameFilters.clear();
			LstNameFilters.sendKeys(Surname);
		} else
			System.out.println("Not required");

		if (PrisonNo.length() > 0) {
			PrisonNoFilters.clear();
			PrisonNoFilters.sendKeys(PrisonNo);
		} else
			System.out.println("Not required");

		if (StartDate.length() > 0) {
			StartDateFilters.clear();
			StartDateFilters.sendKeys(StartDate);

		} else
			System.out.println("Not required");
		SearchFilterBtn.click();
	}

	// -------------------Archieve a record-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17505_row1']/td[10]/a")
	public WebElementFacade deleteRow;

	public void clickDELETEButton() throws Exception {
		deleteRow.click();
	}

	@FindBy(xpath = ".//*[@id='ui-dialog-title-3']")
	public WebElementFacade ArchiveHeader;
	@FindBy(xpath = "html/body/div[7]/div[2]/form/fieldset/div/p")
	public WebElementFacade ArchieveTxt;
	@FindBy(xpath = "html/body/div[7]/div[2]/form/fieldset/div/div/button")
	public WebElementFacade YesButtn;
	@FindBy(xpath = "html/body/div[7]/div[2]/form/fieldset/div/div/a/span")
	public WebElementFacade NoBttn;

	public void archieveARecord() throws Exception {
		clickDELETEButton();
		waitABit(3000);

		assertContaining("Delete Client Allocation", ArchiveHeader);
		assertContaining("Are you sure you want to delete this client allocation?", ArchieveTxt);
		assertContaining("Yes", YesButtn);
		assertContaining("No", NoBttn);

		YesButtn.click();
	}

}
