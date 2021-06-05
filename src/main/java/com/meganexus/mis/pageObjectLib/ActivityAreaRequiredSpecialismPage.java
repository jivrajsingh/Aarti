package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActivityAreaRequiredSpecialismPage extends GenericPage {
	ActivityAreaPage aa;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActArReqSpecialism", 6, "No");
	public String filterTeam = XlsReader.getCellData("ActArReqSpecialism", 0, row);

	public String ActiArea = "";//XlsReader.getCellData("ActivityArea", 0, row);
	
	public String ADDSpecialism = XlsReader.getCellData("ActArReqSpecialism", 1, row);
	public String ADDSkillLevel = XlsReader.getCellData("ActArReqSpecialism", 2, row);
	public String ADDReqQuantity = XlsReader.getCellData("ActArReqSpecialism", 3, row);
	public String ADDStartDate = XlsReader.getCellData("ActArReqSpecialism", 4, row);
	public String ADDEndDate = XlsReader.getCellData("ActArReqSpecialism", 5, row);

	public String EDITSpecialism = "";
	public String EDITSkillLevel = "";
	public String EDITReqQuantity = "5";
	public String EDITStartDate = "11/10/2017";
	public String EDITEndDate = "11/06/2020";

	public String viewRowAActArea = ".//*[contains(@id,'misJmesa_18525_')]//td[contains(text(), 'regression testing')]/following-sibling::td[4]/a";

	public void NavigateToViewActArea() throws Exception {
		aa.clickOnJMESA(2);
		Thread.sleep(500);
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
	public WebElementFacade AddRequiredSpecialismSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade AllocateClientSIDETab;

	public void verifySidetabs() throws Exception {
		assertContaining("Activity Area", ActivityAreaSIDETab);
		assertContaining("Allocate Client", AllocateClientSIDETab);
		assertContaining("Add Required Specialism", AddRequiredSpecialismSIDETab);
	}

	/**
	 * Verification of all elements on Page(esp. Required Specialisms table
	 * elements).
	 */
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade ActivityAreaPageHeader;
	@FindBy(xpath = ".//*[@id='m17985_moduleElement']/h1")
	public WebElementFacade ReqSpecialismTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17985_s_0_specialism']")
	public WebElementFacade SpecialismTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985']/div/table[2]/thead/tr/td[2]")
	public WebElementFacade SkillLevelTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985']/div/table[2]/thead/tr/td[3]")
	public WebElementFacade ReqQuantityTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_s_3_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985']/div/table[2]/thead/tr/td[5]")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17985']/div/table[2]/thead/tr/td[7]")
	public WebElementFacade EditTable;

	public void verifyForm() {

		assertContaining("Activity Area", ActivityAreaPageHeader);// Activity
																	// Area Sub
																	// Top Tab

		assertContaining("Required Specialisms", ReqSpecialismTableHeader);// Activity
																			// Area
																			// Table
																			// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Specialism", SpecialismTable);
		assertContaining("Skill Level", SkillLevelTable);
		assertContaining("Required Quantity", ReqQuantityTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Required Specialism SIDE TAB
	public void clickADDReqSpecialismSIDETAB() throws Exception {
		AddRequiredSpecialismSIDETab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[7]/a")
	public WebElementFacade EditRow;

	public void clickEDITButton() throws Exception {
		EditRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m18035_moduleElement']/h1")
	public WebElementFacade AddEditReqSpecialism;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[1]/label")
	public WebElementFacade SpecialismAddForm;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[2]/label")
	public WebElementFacade SkillLevelAddForm;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[3]/label")
	public WebElementFacade ReqQuantityAddForm;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[4]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[5]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[7]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17615']/fieldset/div[7]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Area", ActivityAreaPageHeader);// Sub Top Tab

		assertContaining("Add/Edit Required Specialism", AddEditReqSpecialism);// Table
																				// title

		assertContaining("Specialism*", SpecialismAddForm);
		assertContaining("Skill Level*", SkillLevelAddForm);
		assertContaining("Required Quantity", ReqQuantityAddForm);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[@id='m18035_formElement_174265']")
	public WebElementFacade SpecialismAddFormDDL;
	@FindBy(xpath = ".//*[@id='m18035_formElement_174275']")
	public WebElementFacade SkillLevelAddFormDDL;
	@FindBy(xpath = ".//*[@id='m18035_formElement_174285']")
	public WebElementFacade ReqQuantityAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m18035_formElement_174295']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m18035_formElement_174305']")
	public WebElementFacade EndDateAddFormTxtBx;

	public void FillAddEditReqSpecialismForm(String Specialism, String SkillLevel, String ReqQuantity, String StartDate,
			String EndDate) throws Exception {
		if (Specialism.length() > 0) {
			selectFromDDL(SpecialismAddFormDDL, Specialism,0);
		} else {
			System.out.println("No Specialism");
		}

		if (SkillLevel.length() > 0) {
			selectFromDDL(SkillLevelAddFormDDL, SkillLevel,0);
		} else {
			System.out.println("No SkillLevel");
		}

		if (ReqQuantity.length() > 0) {
			ReqQuantityAddFormTxtBx.clear();
			ReqQuantityAddFormTxtBx.sendKeys(ReqQuantity);
		} else {
			System.out.println("No ReqQuantity");
		}

		if (StartDate != "No") {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDate);
		} else {
			System.out.println("No StartDate");
		}

		if (EndDate != "No") {
			EndDateAddFormTxtBx.clear();
			EndDateAddFormTxtBx.sendKeys(EndDate);
		} else {
			System.out.println("No EndDate");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[6]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m18025_moduleElement']/h1")
	public WebElementFacade ViewReqSpecialismPageHeader;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[1]/label")
	public WebElementFacade SpecialismVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[2]/label")
	public WebElementFacade SkillLevelVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[3]/label")
	public WebElementFacade ReqQuantityVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[4]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[5]/label")
	public WebElementFacade EndDateVeriPg;

	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[6]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[8]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[7]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[9]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[1]/p")
	public WebElementFacade SpecialismEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[2]/p")
	public WebElementFacade SkillLevelEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[3]/p")
	public WebElementFacade ReqQuantityEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[4]/p")
	public WebElementFacade StartdateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18025_view-content']/div[5]/p")
	public WebElementFacade EnddateEntryAddEdit;

	public void VerifyVIEWReqSpecialismPage(String Specialism, String SkillLevel, String ReqQuantity, String StartDate,
			String EndDate) throws Exception {
		assertContaining("Activity Area", ActivityAreaPageHeader);
		assertContaining("View Required Specialism", ViewReqSpecialismPageHeader);
		assertContaining("Specialism", SpecialismVeriPg);
		assertContaining("Skill Level", SkillLevelVeriPg);
		assertContaining("Required Quantity", ReqQuantityVeriPg);
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
		assertContaining(ReqQuantity, ReqQuantityEntryAddEdit);
		assertContaining(StartDate, StartdateEntryAddEdit);
		assertContaining(EndDate, EnddateEntryAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[1]")
	public WebElementFacade SpecialismTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[2]")
	public WebElementFacade SkillLevelTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[3]")
	public WebElementFacade ReqQuantityTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[4]")
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17985_row1']/td[5]")
	public WebElementFacade EndDateTableEntry;

	public void VerifyContentsOfRowInTable(String Specialism, String SkillLevel, String ReqQuantity, String StartDate,
			String EndDate) throws Exception {
		assertContaining(Specialism, SpecialismTableEntry);
		assertContaining(SkillLevel, SkillLevelTableEntry);
		assertContaining(ReqQuantity, ReqQuantityTableEntry);
		System.out.println("StartDate =" + StartDate);
		System.out.println("EndDate =" + EndDate);
		assertContaining(StartDate, StartDateTableEntry);
		assertContaining(EndDate, EndDateTableEntry);
	}

	public void VerifyActivityAreaReqSpecialismList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDSpecialism, ADDSkillLevel, ADDReqQuantity, ADDStartDate, ADDEndDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITSpecialism, EDITSkillLevel, EDITReqQuantity, EDITStartDate, EDITEndDate);
		}
	}

	// -------------------JMESA-------------------------//
	public void clickOnJMESA() throws Exception {
		SpecialismTable.click();
		StartDateTable.click();
	}
}
