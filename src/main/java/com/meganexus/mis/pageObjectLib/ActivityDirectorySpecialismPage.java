package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;
import com.thoughtworks.selenium.Wait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActivityDirectorySpecialismPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("SPECIALISMS", 4, "No");

	public String ADDSpecialismNameSpcl = XlsReader.getCellData("SPECIALISMS", 0, row);
	public String ADDSkillLevelSpcl = XlsReader.getCellData("SPECIALISMS", 1, row);
	public String ADDStartDateSpcl = XlsReader.getCellData("SPECIALISMS", 2, row);
	public String ADDEndDateSpcl = XlsReader.getCellData("SPECIALISMS", 3, row);

	public String EDITSpecialismName = ADDSpecialismNameSpcl;
	public String EDITSkillLevel = ADDSkillLevelSpcl;
	public String EDITStartDate = "";
	public String EDITEndDate = "";

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ActivityDirectorySideTab;

	public void NavigateToActivityDIRECTORYMainPage() {
		nt.NavigateToActivityDirectoryMainTab();
		waitABit(3000);
		ActivityDirectorySideTab.click();
		waitABit(1000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade AddSpecialismSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade AddCourseSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[3]/a/span")
	public WebElementFacade AddQualificationSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[4]/a/span")
	public WebElementFacade AddCertificationSideTab;

	public void verifySidetabs() throws Exception {
		assertContaining("Activity Directory", ActivityDirectorySideTab);
		assertContaining("Add Specialism", AddSpecialismSideTab);
		assertContaining("Add Course", AddCourseSideTab);
		assertContaining("Add Qualification", AddQualificationSideTab);
		assertContaining("Add Certification", AddCertificationSideTab);
	}

	// click Activity Directory SIDE TAB

	public void clickActivityDirectorySIDETAB() throws Exception {
		ActivityDirectorySideTab.click();
	}

	/**
	 * Verification of all elements on Page.
	 */
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade ActivityDirectoryPageHeader;
	@FindBy(xpath = ".//*[@id='m17205_moduleElement']/h1")
	public WebElementFacade SpecialismsDefinitionTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17205_s_0_specialism']")
	public WebElementFacade SpecialismTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_s_1_skillLevel']")
	public WebElementFacade SkillLevelTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_s_2_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_s_3_endDate']")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17205']/div/table[2]/thead/tr/td[5]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17205']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Activity
		// Area
		// Sub
		// Top
		// Tab

		assertContaining("Specialisms Definition", SpecialismsDefinitionTableHeader);// Activity
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
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Specialism SIDE TAB
	public void clickADDSpecialismSIDETAB() throws Exception {
		AddSpecialismSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[6]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17225_moduleElement']/h1")
	public WebElementFacade AddEditSpecialism;
	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[1]/label")
	public WebElementFacade SpecialismNameAddForm;
	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[3]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[2]/label")
	public WebElementFacade SkillLevelAddForm;
	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[4]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[6]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17235']/fieldset/div[6]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Sub
																			// Top
																			// Tab

		assertContaining("Add/Edit Specialism", AddEditSpecialism);// Table
																	// title

		assertContaining("Specialism Name *", SpecialismNameAddForm);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("Skill Level*", SkillLevelAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17225_formElement_169075']")
	public WebElementFacade AddEditSpecialismNameTxtBx;
	@FindBy(xpath = ".//*[@id='m17225_formElement_169435']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17225_formElement_169085']")
	public WebElementFacade SkillLevelAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17225_formElement_169445']")
	public WebElementFacade EndDateAddFormTxtBx;

	public void FillAddEditSpecialismForm(String SpeclsmName, String StartDate, String SkillLevel, String EndDate)
			throws Exception {

		if (SpeclsmName.length() > 0) {
			AddEditSpecialismNameTxtBx.clear();
			AddEditSpecialismNameTxtBx.sendKeys(SpeclsmName);
		} else {
			System.out.println("No SpeclsmName");
		}
		System.out.println("vishal");
		if (StartDate.length() > 0) {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDate);
		} else {
			System.out.println("No StartDate");
		}

		if (SkillLevel.length() > 0) {
			SkillLevelAddFormTxtBx.clear();
			SkillLevelAddFormTxtBx.sendKeys(SkillLevel);
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

		XlsReader.setCellData("SPECIALISMS", "Record Added?", row, "Yes");
		System.out.println("Form is saved successfully!!!!!!");
		waitABit(3000);
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[5]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17245_moduleElement']/h1")
	public WebElementFacade ViewSpecialismPageHeader;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[1]/label")
	public WebElementFacade SpecialismnameVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[3]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[5]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[7]/label")
	public WebElementFacade DateModifiedyVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[2]/label")
	public WebElementFacade SkillLevelVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[4]/label")
	public WebElementFacade EndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[6]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[8]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[1]/p")
	public WebElementFacade SpecialismnameEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[3]/p")
	public WebElementFacade StartDateAddEdit;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[2]/p")
	public WebElementFacade SkillLevelEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17245_view-content']/div[4]/p")
	public WebElementFacade EndDateEntryAddEdit;

	public void VerifyVIEWSpecialismPage(String SpeclsmName, String StartDate, String SkillLevel, String EndDate)
			throws Exception {
		assertContaining("Activity Directory", ActivityDirectoryPageHeader);
		assertContaining("View Specialism", ViewSpecialismPageHeader);
		assertContaining("Specialism name", SpecialismnameVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedyVeriPg);
		assertContaining("Skill Level", SkillLevelVeriPg);
		assertContaining("End Date", EndDateVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(SpeclsmName, SpecialismnameEntryAddEdit);
		assertContaining(StartDate, StartDateAddEdit);
		assertContaining(SkillLevel, SkillLevelEntryAddEdit);
		assertContaining(EndDate, EndDateEntryAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[1]")
	public WebElementFacade SpecialismTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[2]")
	public WebElementFacade SkillLevelTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[3]")
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17205_row1']/td[4]")
	public WebElementFacade EndDateTableEntry;

	public void VerifyContentsOfRowInTable(String SpeclsmName, String SkillLevel, String StartDate, String EndDate)
			throws Exception {
		assertContaining(SpeclsmName, SpecialismTableEntry);
		assertContaining(SkillLevel, SkillLevelTableEntry);
		assertContaining(StartDate, StartDateTableEntry);
		assertContaining(EndDate, EndDateTableEntry);
	}

	public void VerifyActivityDirectorySpecialismList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDSpecialismNameSpcl, ADDSkillLevelSpcl, ADDStartDateSpcl, ADDEndDateSpcl);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITSpecialismName, EDITSkillLevel, EDITStartDate, EDITEndDate);
		}
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		SpecialismTable.click();
		SkillLevelTable.click();
		StartDateTable.click();
		EndDateTable.click();
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1335/");
	}

	// -------------------Filter Results-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17205']/div[1]/h3")
	public WebElementFacade FiltersTitle;
	@FindBy(xpath = ".//*[@id='specialism_misJmesa_17205']")
	public WebElementFacade SpecialismFilter;
	@FindBy(xpath = ".//*[@id='skillLevel_misJmesa_17205']")
	public WebElementFacade SkillLevelFilter;
	@FindBy(xpath = ".//*[@id='startDate_misJmesa_17205']")
	public WebElementFacade StartDateFilter;
	@FindBy(xpath = ".//*[@id='endDate_misJmesa_17205']")
	public WebElementFacade EndDateFilter;

	@FindBy(xpath = ".//*[@id='misJmesa_17205']/div[1]/div/fieldset/div[5]/div/button[1]")
	public WebElementFacade SearchFilter;
	@FindBy(xpath = ".//*[@id='misJmesa_17205']/div[1]/div/fieldset/div[5]/div/button[2]")
	public WebElementFacade ResetFilter;

	public void FilterResults(String Specialism, String SkillLevel, String StartDate, String Enddate) throws Exception {
		waitABit(3000);
		FiltersTitle.click();
		if (Specialism.length() > 0) {
			SpecialismFilter.clear();
			SpecialismFilter.sendKeys(Specialism);
		}
		if (SkillLevel.length() > 0) {
			SkillLevelFilter.clear();
			SkillLevelFilter.sendKeys(SkillLevel);
		}
		if (StartDate.length() > 0) {
			StartDateFilter.clear();
			StartDateFilter.sendKeys(StartDate);
		}
		if (Enddate.length() > 0) {
			EndDateFilter.clear();
			EndDateFilter.sendKeys(Enddate);
		}
		SearchFilter.click();
		waitABit(2000);
	}
}
