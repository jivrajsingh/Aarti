package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ActivityDirectoryQualificationPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("QUALIFICATIONS", 11, "No");

	public String ADDCourseQ = XlsReader.getCellData("QUALIFICATIONS", 0, row);
	public String ADDQualificationQ = XlsReader.getCellData("QUALIFICATIONS", 1, row);
	public String ADDLevelQ = XlsReader.getCellData("QUALIFICATIONS", 2, row);
	public String ADDUnitQ = XlsReader.getCellData("QUALIFICATIONS", 3, row);
	public String ADDUnitStatusQ = XlsReader.getCellData("QUALIFICATIONS", 4, row);
	public String ADDUnitStartDateQ = XlsReader.getCellData("QUALIFICATIONS", 5, row);
	public String ADDUnitEndDateQ = XlsReader.getCellData("QUALIFICATIONS", 6, row);
	public String ADDAwardingBodyCodeQ = XlsReader.getCellData("QUALIFICATIONS", 7, row);
	public String ADDAwardingBodyQ = XlsReader.getCellData("QUALIFICATIONS", 8, row);
	public String ADDCreditQ = XlsReader.getCellData("QUALIFICATIONS", 9, row);
	public String ADDGLHQ = XlsReader.getCellData("QUALIFICATIONS", 10, row);

	public String EDITQualification = "koalification";
	public String EDITCourse = "JEE";
	public String EDITLevel = "Entry Level 1";
	public String EDITUnitStartDate = "01/06/2017";
	public String EDITUnitEndDate = "01/06/2018";
	public String EDITUnitStatus = "Active";

	@FindBy(xpath = ".//span[text()='Activity Area']")
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
		Assert.assertEquals("Activity Directory", ActivityDirectorySideTab.getText());
		Assert.assertEquals("Add Specialism", AddSpecialismSideTab.getText());
		Assert.assertEquals("Add Course", AddCourseSideTab.getText());
		Assert.assertEquals("Add Qualification", AddQualificationSideTab.getText());
		Assert.assertEquals("Add Certification", AddCertificationSideTab.getText());
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
	@FindBy(xpath = ".//*[@id='m17215_moduleElement']/h1")
	public WebElementFacade QualificationsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_0_qualification']")
	public WebElementFacade QualificationTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_1_course']")
	public WebElementFacade CourseTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_2_level']")
	public WebElementFacade LevelTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_3_unitStartDate']")
	public WebElementFacade UnitStartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_4_unitEndDate']")
	public WebElementFacade UnitDateDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215_s_5_status']")
	public WebElementFacade UnitStatusTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215']/div[2]/table[2]/thead/tr/td[7]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17215']/div[2]/table[2]/thead/tr/td[8]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		Assert.assertEquals("Activity Directory", ActivityDirectoryPageHeader.getText());// Activity
		// Area
		// Sub
		// Top
		// Tab

		Assert.assertEquals("Qualifications", QualificationsTableHeader.getText());// Activity
		// Area
		// Table
		// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		Assert.assertEquals("Qualification", QualificationTable.getText());
		Assert.assertEquals("Course", CourseTable.getText());
		Assert.assertEquals("Level", LevelTable.getText());
		Assert.assertEquals("Unit Start Date", UnitStartDateTable.getText());
		Assert.assertEquals("Unit End Date", UnitDateDateTable.getText());
		Assert.assertEquals("Unit Status", UnitStatusTable.getText());
		Assert.assertEquals("View", ViewTable.getText());
		Assert.assertEquals("Edit", EditTable.getText());

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Qualification SIDE TAB
	public void clickADDQualificationSIDETAB() throws Exception {
		AddQualificationSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17215_row1']/td[7]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17385_moduleElement']/h1")
	public WebElementFacade AddEditQualifications;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[1]/label")
	public WebElementFacade CourseAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[3]/label")
	public WebElementFacade LevelAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[5]/label")
	public WebElementFacade UnitStatusAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[7]/label")
	public WebElementFacade UnitEndDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[9]/label")
	public WebElementFacade AwardingBodyAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[11]/label")
	public WebElementFacade GLHAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[2]/label")
	public WebElementFacade QualificationAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[4]/label")
	public WebElementFacade UnitAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[6]/label")
	public WebElementFacade UnitStartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[8]/label")
	public WebElementFacade AwardingBodyCodeAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[10]/label")
	public WebElementFacade CreditAddForm;

	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[13]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[13]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		Assert.assertEquals("Activity Directory", ActivityDirectoryPageHeader.getText());// Sub
																							// Top
																							// Tab

		Assert.assertEquals("Add / Edit Qualifications", AddEditQualifications.getText());// Table
																							// title

		Assert.assertEquals("Course", CourseAddForm.getText());
		Assert.assertEquals("Level*", LevelAddForm.getText());
		Assert.assertEquals("Unit Status*", UnitStatusAddForm.getText());
		Assert.assertEquals("Unit End Date*", UnitEndDateAddForm.getText());
		Assert.assertEquals("Awarding Body", AwardingBodyAddForm.getText());
		Assert.assertEquals("GLH", GLHAddForm.getText());
		Assert.assertEquals("Qualification*", QualificationAddForm.getText());
		Assert.assertEquals("Unit", UnitAddForm.getText());
		Assert.assertEquals("Unit Start Date*", UnitStartDateAddForm.getText());
		Assert.assertEquals("Awarding Body Code", AwardingBodyCodeAddForm.getText());
		Assert.assertEquals("Credits", CreditAddForm.getText());

		Assert.assertEquals("Save", SaveAddForm.getText());
		Assert.assertEquals("Cancel", CancelAddForm.getText());
	}

	@FindBy(xpath = ".//*[@id='m17385_formElement_169795_search']")
	public WebElementFacade CourseSearchTxtBox;
	@FindBy(xpath = ".//*[@id='form_17335']/fieldset/div[1]/div/button")
	public WebElementFacade CourseSearchBtn;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169795']")
	public WebElementFacade CourseAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169815']")
	public WebElementFacade LevelAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169835-988935']")
	public WebElementFacade UnitAddFormACTIVERadioBut;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169835-988945']")
	public WebElementFacade UnitAddFormINACTIVERadioBut;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169855']")
	public WebElementFacade UnitEndDateAddFormTxtBox;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169875']")
	public WebElementFacade AwardingBodyAddFormTxtBox;
	@FindBy(xpath = ".//*[@id='m17385_formElement_170105']")
	public WebElementFacade GLHAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169805']")
	public WebElementFacade QualificationAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17385_formElement_170005']")
	public WebElementFacade UnitAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169845']")
	public WebElementFacade UnitStartDateAddFormTxtBox;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169865']")
	public WebElementFacade AwardingBodyCodeAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17385_formElement_169885']")
	public WebElementFacade CreditsAddFormTxtBx;

	public void FillAddEditQualificationForm(String CourseQ, String QualificationQ, String LevelQ, String UnitQ,
			String UnitStatusQ, String UnitStartDateQ, String UnitEndDateQ, String AwardingBodyCodeQ,
			String AwardingBodyQ, String CreditQ, String GLHQ) throws Exception {
		System.out.println("Data selected from excel :" + CourseQ + ":" + QualificationQ + ":" + LevelQ + ":" + UnitQ
				+ ":" + UnitStatusQ + ":" + UnitStartDateQ + ":" + UnitEndDateQ + ":" + AwardingBodyCodeQ + ":"
				+ AwardingBodyQ + ":" + CreditQ + ":" + GLHQ);
		if (CourseQ.length() > 0) {
			CourseSearchTxtBox.sendKeys(CourseQ);
			CourseSearchBtn.click();
			waitABit(2000);
			selectFromDDL(CourseAddFormDDL, CourseQ, 0);
		} else {
			System.out.println("No Course");
		}

		if (QualificationQ.length() > 0) {
			QualificationAddFormTxtBx.clear();
			QualificationAddFormTxtBx.sendKeys(QualificationQ);
		} else {
			System.out.println("No Qualification");
		}

		if (LevelQ.length() > 0) {
			selectFromDDL(LevelAddFormDDL, LevelQ, 0);
		} else {
			System.out.println("No Level");
		}

		if (UnitQ.length() > 0) {
			UnitAddFormTxtBx.clear();
			UnitAddFormTxtBx.sendKeys(UnitQ);
		} else {
			System.out.println("No UnitEndDate");
		}

		System.out.println("Status  : " + UnitStatusQ);
		if (UnitStatusQ == "Active") {
			UnitAddFormACTIVERadioBut.click();
		} else if (UnitStatusQ == "Inactive") {
			UnitAddFormINACTIVERadioBut.click();
		} else {
			System.out.println("No UnitStatus");
		}

		if (UnitStartDateQ.length() > 0) {
			UnitStartDateAddFormTxtBox.clear();
			UnitStartDateAddFormTxtBox.sendKeys(UnitStartDateQ);
		} else {
			System.out.println("No UnitStartDate");
		}

		if (UnitEndDateQ.length() > 0) {
			UnitEndDateAddFormTxtBox.clear();
			UnitEndDateAddFormTxtBox.sendKeys(UnitEndDateQ);
		} else {
			System.out.println("No UnitEndDate");
		}

		if (AwardingBodyCodeQ.length() > 0) {
			AwardingBodyCodeAddFormTxtBx.clear();
			AwardingBodyCodeAddFormTxtBx.sendKeys(AwardingBodyCodeQ);
		} else {
			System.out.println("No UnitEndDate");
		}

		if (AwardingBodyQ.length() > 0) {
			AwardingBodyAddFormTxtBox.clear();
			AwardingBodyAddFormTxtBox.sendKeys(AwardingBodyQ);
		} else {
			System.out.println("No UnitEndDate");
		}

		if (CreditQ.length() > 0) {
			CreditsAddFormTxtBx.clear();
			CreditsAddFormTxtBx.sendKeys(CreditQ);
		} else {
			System.out.println("No UnitEndDate");
		}

		if (GLHQ.length() > 0) {
			GLHAddFormTxtBx.clear();
			GLHAddFormTxtBx.sendKeys(GLHQ);
		} else {
			System.out.println("No UnitEndDate");
		}
		waitABit(2000);
		SaveAddForm.click();
		System.out.println("Form is saved successfully!!!!!!");
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17215_row1']/td[7]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17435_moduleElement']/h1")
	public WebElementFacade ViewQualificationPageHeader;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[1]/label")
	public WebElementFacade CourseVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[3]/label")
	public WebElementFacade LevelVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[5]/label")
	public WebElementFacade UnitStatusVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[7]/label")
	public WebElementFacade UnitEndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[9]/label")
	public WebElementFacade AwardingBodyVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[11]/label")
	public WebElementFacade GLHVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[13]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[15]/label")
	public WebElementFacade ModifiedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[2]/label")
	public WebElementFacade QualificationVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[4]/label")
	public WebElementFacade UnitVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[6]/label")
	public WebElementFacade UnitStartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[8]/label")
	public WebElementFacade AwardingBodyCodeByVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[10]/label")
	public WebElementFacade CreditVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[12]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[14]/label")
	public WebElementFacade DateModifiedVeriPg;

	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[1]/p")
	public WebElementFacade CourseEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17435_view-content']/div[3]/p")
	public WebElementFacade LevelEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[3]/p")
	public WebElementFacade UnitStatusEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[4]/p")
	public WebElementFacade UnitEndDateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[5]/p")
	public WebElementFacade QualificationEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[6]/p")
	public WebElementFacade UnitStartDateEntryAddEdit;

	public void VerifyVIEWQualificationPage(String Course, String Qualification, String Level, String UnitStartDate,
			String UnitEndDate, String UnitStatus) throws Exception {
		Assert.assertEquals("Activity Directory", ActivityDirectoryPageHeader.getText());
		Assert.assertEquals("View Qualification", ViewQualificationPageHeader.getText());
		Assert.assertEquals("Course", CourseVeriPg.getText());
		Assert.assertEquals("Level", LevelVeriPg.getText());
		Assert.assertEquals("Unit Status", UnitStatusVeriPg.getText());
		Assert.assertEquals("Unit End Date", UnitEndDateVeriPg.getText());
		Assert.assertEquals("Awarding Body", AwardingBodyVeriPg.getText());
		Assert.assertEquals("GLH", GLHVeriPg.getText());
		Assert.assertEquals("Created By", CreatedByVeriPg.getText());
		Assert.assertEquals("Modified By", ModifiedByVeriPg.getText());
		Assert.assertEquals("Qualification", QualificationVeriPg.getText());
		Assert.assertEquals("Unit", UnitVeriPg.getText());
		Assert.assertEquals("Unit Start Date", UnitStartDateVeriPg.getText());
		Assert.assertEquals("Awarding Body Code", AwardingBodyCodeByVeriPg.getText());
		Assert.assertEquals("Credits", CreditVeriPg.getText());
		Assert.assertEquals("Date Created", DateCreatedVeriPg.getText());
		Assert.assertEquals("Date Modified", DateModifiedVeriPg.getText());

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		Assert.assertEquals(Course, CourseEntryAddEdit.getText());
		Assert.assertEquals(Level, LevelEntryAddEdit.getText());
		Assert.assertEquals(UnitStatus, UnitStatusEntryAddEdit.getText());
		Assert.assertEquals(UnitEndDate, UnitEndDateEntryAddEdit.getText());
		Assert.assertEquals(Qualification, QualificationEntryAddEdit.getText());
		Assert.assertEquals(UnitStartDate, UnitStartDateEntryAddEdit.getText());

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[1]")
	public WebElementFacade QualificationTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[1]")
	public WebElementFacade CourseTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[2]")
	public WebElementFacade LevelTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[3]")
	public WebElementFacade UnitStartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[4]")
	public WebElementFacade UnitEndDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[5]")
	public WebElementFacade UnitStatusTableEntry;

	public void VerifyContentsOfRowInTable(String Course, String Qualification, String Level, String UnitStartDate,
			String UnitEndDate, String UnitStatus) throws Exception {
		Assert.assertEquals(Qualification, QualificationTableEntry.getText());
		Assert.assertEquals(Course, CourseTableEntry.getText());
		Assert.assertEquals(Level, LevelTableEntry.getText());
		Assert.assertEquals(UnitStartDate, UnitStartDateTableEntry.getText());
		Assert.assertEquals(UnitEndDate, UnitEndDateTableEntry.getText());
		Assert.assertEquals(UnitStatus, UnitStatusTableEntry.getText());
	}

	public void VerifyActivityDirectoryQualificationList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDQualificationQ, ADDCourseQ, ADDLevelQ, ADDUnitStartDateQ, ADDUnitEndDateQ,
					ADDUnitStatusQ);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITQualification, EDITCourse, EDITLevel, EDITUnitStartDate, EDITUnitEndDate,
					EDITUnitStatus);
		}
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17215']/div[1]/h3")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='qualification_misJmesa_17215']")
	public WebElementFacade QualificationFilters;
	@FindBy(xpath = ".//*[@id='course_misJmesa_17215']")
	public WebElementFacade CourseFilters;
	@FindBy(xpath = ".//*[@id='level_misJmesa_17215']")
	public WebElementFacade LevelFilters;
	@FindBy(xpath = ".//*[@id='unitStartDate_misJmesa_17215']")
	public WebElementFacade UnitStartDateFilters;
	@FindBy(xpath = ".//*[@id='unitEndDate_misJmesa_17215']")
	public WebElementFacade UnitEnddateFilters;
	@FindBy(xpath = ".//*[@id='status_misJmesa_17215']")
	public WebElementFacade UnitStatusFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_17215']/div[1]/div/fieldset/div[7]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_17215']/div[1]/div/fieldset/div[7]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String Course, String Qualification, String Level, String UnitStartDate,
			String UnitEndDate, String UnitStatus) throws Exception {
		System.out.println("Filtering data :" + Course + ":" + Qualification + ":" + Level + ":" + UnitStartDate + ":"
				+ UnitEndDate + ":" + UnitStatus);
		FILTERS.click();

		if (Qualification.length() > 0) {
			QualificationFilters.selectByVisibleText(Qualification);
		} else
			System.out.println("Not required");

		if (Course.length() > 0) {
			CourseFilters.selectByVisibleText(Course);

		} else
			System.out.println("Not required");

		if (Level.length() > 0) {
			LevelFilters.selectByVisibleText(Level);

		} else
			System.out.println("Not required");

		if (UnitStartDate.length() > 0) {
			UnitStartDateFilters.clear();
			UnitStartDateFilters.sendKeys(UnitStartDate);

		} else
			System.out.println("Not required");

		if (UnitEndDate.length() > 0) {
			UnitEnddateFilters.clear();
			UnitEnddateFilters.sendKeys(UnitEndDate);

		} else
			System.out.println("Not required");

		if (UnitStatus.length() > 0) {
			UnitStatusFilters.selectByVisibleText(UnitStatus);

		} else
			System.out.println("Not required");
		SearchFilterBtn.click();
		waitABit(1000);
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		QualificationTable.click();
		CourseTable.click();
		LevelTable.click();
		UnitStartDateTable.click();
		UnitDateDateTable.click();
		UnitStatusTable.click();
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1335/");
	}
}
