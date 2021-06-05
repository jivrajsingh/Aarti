package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActivityAreaPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActivityArea", 5, "No");

	public String ADDActiArea = XlsReader.getCellData("ActivityArea", 0, row);
	public String ADDCap = XlsReader.getCellData("ActivityArea", 1, row);
	public String ADDStartDate = XlsReader.getCellData("ActivityArea", 2, row);
	public String ADDEndDate = XlsReader.getCellData("ActivityArea", 3, row);
	public String ADDSpeciReq = XlsReader.getCellData("ActivityArea", 4, row);

	public String EDITActiArea = "";
	public String EDITCap = "10";
	public String EDITStartDate = "01/06/2017";
	public String EDITEndDate = "01/06/2018";
	public String EDITSpeciReq = "edit rrq";

	@FindBy(xpath = ".//span[text()='Activity Area']")
	public WebElementFacade activityAreaSideTab;

	public void NavigateToActivityAREAMainPage() {
		nt.NavigateToActivityArea();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li/a/span")
	public WebElementFacade AddActivityAreaSIDETab;

	public void verifySidetabs() throws Exception {
		assertContaining("Activity Area", activityAreaSideTab);
		assertContaining("Add Activity Area", AddActivityAreaSIDETab);
	}

	// click Activity Area SIDE TAB

	public void clickActivityAreaSIDETAB() throws Exception {
		activityAreaSideTab.click();
		waitABit(1000);
	}

	/**
	 * Verification of all elements on Page.
	 */
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade ActivityAreaPageHeader;
	@FindBy(xpath = ".//*[@id='m18525_moduleElement']/h1")
	public WebElementFacade ActivityAreaTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_18525_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_18525_s_0_activityArea']")
	public WebElementFacade ActivityAreaTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18525']/div/table[2]/thead/tr/td[2]")
	public WebElementFacade CapacityTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18525']/div/table[2]/thead/tr/td[3]")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18525']/div/table[2]/thead/tr/td[4]")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18525']/div/table[2]/thead/tr/td[5]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18525']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Team Activity Area", ActivityAreaPageHeader);// Activity
																			// Area
																			// Sub
																			// Top
																			// Tab

		assertContaining("Team Activity Area", ActivityAreaTableHeader);// Activity
																			// Area
																			// Table
																			// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Activity Area", ActivityAreaTable);
		assertContaining("Capacity", CapacityTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Activity Area SIDE TAB
	public void clickADDActivityAreaSIDETAB() throws Exception {
		AddActivityAreaSIDETab.click();
	}

	/*
	 * @FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[6]/a") public
	 * WebElementFacade editRow;
	 * 
	 * public void clickEDITButton() throws Exception { editRow.click(); }
	 */
	public String editRow = ".//*[@id='misJmesa_18525_row3']/td[contains(text(), '" + ADDActiArea
			+ "')]/following-sibling::td[5]/a";

	public void clickEDITButton() throws Exception {
		clickButtonWhenCustomizedXPATH(editRow);
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17315_moduleElement']/h1")
	public WebElementFacade AddEditActivityArea;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[1]/label")
	public WebElementFacade ActivityAreaAddForm;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[3]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[5]/label")
	public WebElementFacade SpecificRRQAddForm;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[2]/label")
	public WebElementFacade CapacityAddForm;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[4]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[7]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17385']/fieldset/div[7]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Area", ActivityAreaPageHeader);// Sub
																	// Top
																	// Tab

		assertContaining("Add/Edit Activity Area", AddEditActivityArea);// Table
																		// title

		assertContaining("Activity Area*", ActivityAreaAddForm);
		assertContaining("Start Date", StartDateAddForm);
		assertContaining("Specific Requirements", SpecificRRQAddForm);
		assertContaining("Capacity", CapacityAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[@id='m17315_formElement_170215']")
	public WebElementFacade ActivityAreaAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17315_formElement_170245']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17315_formElement_170235']")
	public WebElementFacade SpecificRRQAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17315_formElement_170225']")
	public WebElementFacade CapacityAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17315_formElement_170255']")
	public WebElementFacade EndDateAddFormTxtBx;

	public void FillAddEditActivityAreaForm(String ActAre, String Cap, String StartDate, String SpecReq, String EndDate)
			throws Exception {
		if (ActAre.length() > 0) {
			ActivityAreaAddFormTxtBx.clear();
			ActivityAreaAddFormTxtBx.sendKeys(ActAre);
		} else {
			System.out.println("No ActAre");
		}

		if (Cap.length() > 0) {
			CapacityAddFormTxtBx.clear();
			CapacityAddFormTxtBx.sendKeys(Cap);
		} else {
			System.out.println("No Cap");
		}

		if (StartDate.length() > 0) {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDate);
		} else {
			System.out.println("No StartDate");
		}

		if (SpecReq.length() > 0) {
			SpecificRRQAddFormTxtBx.clear();
			SpecificRRQAddFormTxtBx.sendKeys(SpecReq);
		} else {
			System.out.println("No SpecReq");
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
	// @FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[5]/a")
	public String viewRow = ".//*[@id='misJmesa_18525_row3']/td[contains(text(), '" + ADDActiArea
			+ "')]/following-sibling::td[4]/a";

	public void clickVIEWButton() throws Exception {
		clickButtonWhenCustomizedXPATH(viewRow);
	}

	@FindBy(xpath = ".//*[@id='m17335_moduleElement']/h1")
	public WebElementFacade ViewActivityAreaPageHeader;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[1]/label")
	public WebElementFacade ActivityAreaVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[3]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[5]/label")
	public WebElementFacade SpecificRequirementsVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[7]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[9]/label")
	public WebElementFacade ModifiedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[2]/label")
	public WebElementFacade CapacityVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[4]/label")
	public WebElementFacade EndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[6]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[8]/label")
	public WebElementFacade DateModifiedVeriPg;

	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[1]/p")
	public WebElementFacade ActiAreaEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[2]/p")
	public WebElementFacade CapEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[3]/p")
	public WebElementFacade StartDateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[5]/p")
	public WebElementFacade SpeciReqEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17335_view-content']/div[4]/p")
	public WebElementFacade EndDateEntryAddEdit;

	public void VerifyVIEWActivityAreaPage(String ActAre, String Cap, String StartDate, String SpecReq, String EndDate)
			throws Exception {
		assertContaining("Activity Area", ActivityAreaPageHeader);
		assertContaining("View Activity Area", ViewActivityAreaPageHeader);
		assertContaining("Activity Area", ActivityAreaVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("Specific Requirements", SpecificRequirementsVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);
		assertContaining("Capacity", CapacityVeriPg);
		assertContaining("End Date", EndDateVeriPg);
		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(ActAre, ActiAreaEntryAddEdit);
		assertContaining(Cap, CapEntryAddEdit);
		assertContaining(StartDate, StartDateEntryAddEdit);
		assertContaining(SpecReq, SpeciReqEntryAddEdit);
		assertContaining(EndDate, EndDateEntryAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[1]")
	public WebElementFacade ActiAreaTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[2]")
	public WebElementFacade CapTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[3]")
	public WebElementFacade StartDateTableEntry;

	public void VerifyContentsOfRowInTable(String ActiArea, String Cap, String StartDate) throws Exception {
		assertContaining(ActiArea, ActiAreaTableEntry);
		assertContaining(Cap, CapTableEntry);
		assertContaining(StartDate, StartDateTableEntry);
	}

	public void VerifyActivityAreaList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDActiArea, ADDCap, ADDStartDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITActiArea, EDITCap, EDITStartDate);
		}
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA(int noOfClicks) throws Exception {
		if (noOfClicks % 2 == 0) {
			System.out.println("Decending order set");
		} else if (noOfClicks % 2 == 1) {
			System.out.println("Ascending order set");
		}

		for (int i = 0; i < noOfClicks; i++) {
			ActivityAreaTable.click();
			Thread.sleep(1000);
			int I =i;
			System.out.println("Click no :"+(I+1));
		}
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1345/2275");
	}
}
