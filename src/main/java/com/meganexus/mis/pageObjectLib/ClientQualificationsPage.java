package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TakeScreenshots;
import net.thucydides.core.pages.components.Dropdown;

public class ClientQualificationsPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = 1;

	public String ADDPathway = XlsReader.getCellData("CLIENT QUALIFICATIONS", 3, row);
	public String ADDCourse = XlsReader.getCellData("CLIENT QUALIFICATIONS", 4, row);
	public String ADDQualification = XlsReader.getCellData("CLIENT QUALIFICATIONS", 5, row);
	public String ADDLevel = XlsReader.getCellData("CLIENT QUALIFICATIONS", 6, row);
	public String ADDAwardingBodyCODE = XlsReader.getCellData("CLIENT QUALIFICATIONS", 7, row);
	public String ADDAwardingBody = XlsReader.getCellData("CLIENT QUALIFICATIONS", 8, row);
	public String ADDStartDate = XlsReader.getCellData("CLIENT QUALIFICATIONS", 9, row);
	public String ADDExpectedEndDate = XlsReader.getCellData("CLIENT QUALIFICATIONS", 10, row);
	public String ADDInternallyVerified = XlsReader.getCellData("CLIENT QUALIFICATIONS", 11, row);
	public String ADDInternallyVerifiedDate = XlsReader.getCellData("CLIENT QUALIFICATIONS", 12, row);
	public String ADDIVBy = XlsReader.getCellData("CLIENT QUALIFICATIONS", 13, row);
	public String ADDQualifiStat = XlsReader.getCellData("CLIENT QUALIFICATIONS", 14, row);
	public String ADDReasonFrWithDrwl = XlsReader.getCellData("CLIENT QUALIFICATIONS", 15, row);
	public String ADDQualiStatDate = XlsReader.getCellData("CLIENT QUALIFICATIONS", 16, row);
	public String ADDCertificateStat = XlsReader.getCellData("CLIENT QUALIFICATIONS", 17, row);
	public String ADDIfOther = XlsReader.getCellData("CLIENT QUALIFICATIONS", 18, row);
	public String ADDComments = XlsReader.getCellData("CLIENT QUALIFICATIONS", 19, row);
	public String ADDProgression = XlsReader.getCellData("CLIENT QUALIFICATIONS", 20, row);
	public String ADDPlsProvideDetails = XlsReader.getCellData("CLIENT QUALIFICATIONS", 21, row);
	public String ADDCertificateDeliMeth = XlsReader.getCellData("CLIENT QUALIFICATIONS", 22, row);
	public String ADDCertificateDate = XlsReader.getCellData("CLIENT QUALIFICATIONS", 23, row);

	public String EDITPathway;
	public String EDITCourse;
	public String EDITQualification;
	public String EDITLevel;
	public String EDITAwardingBodyCODE;
	public String EDITAwardingBody;
	public String EDITStartDate;
	public String EDITExpectedEndDate;
	public String EDITInternallyVerified;
	public String EDITInternallyVerifiedDate;
	public String EDITIVBy;
	public String EDITQualifiStat;
	public String EDITReasonFrWithDrwl;
	public String EDITQualiStatDate;
	public String EDITCertificateStat;
	public String EDITIfOther;
	public String EDITComments;
	public String EDITProgression;
	public String EDITPlsProvideDetails;
	public String EDITCertificateDeliMeth;
	public String EDITCertificateDate;

	// Navigate to Qualifications sub-top tab page


	public void clickOnQualificationsSubTopTab() {
		nt.NavigateToQualificationsSubTab();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade AddCourseQualificationSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade AddGeneralQualificationSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[3]/a/span")
	public WebElementFacade AddSpecialismSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[4]/a/span")
	public WebElementFacade AddSupportDocumentSideTab;

	public void verifySidetabs() throws Exception {
		assertContaining("Clients", ClientsSideTab);
		assertContaining("Add Course Qualification", AddCourseQualificationSideTab);
		assertContaining("Add General Qualification", AddGeneralQualificationSideTab);
		assertContaining("Add Specialism", AddSpecialismSideTab);
		assertContaining("Add Support Document", AddSupportDocumentSideTab);
	}

	/**
	 * Verification of all elements on Qualification Table.
	 */
	@FindBy(xpath = ".//*[@id='m17465_moduleElement']/h1")
	public WebElementFacade QualificationsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17465_s_0_course']")
	public WebElementFacade CourseTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_s_1_qualification']")
	public WebElementFacade QualificationTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_s_2_level']")
	public WebElementFacade LevelTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_s_3_educationStartDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_s_4_educationExpectedEndDate']")
	public WebElementFacade ExpectedEndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17465']/div/table[2]/thead/tr/td[7]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Course Qualifications", QualificationsTableHeader);// Activity
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

		assertContaining("Course", CourseTable);
		assertContaining("Qualification", QualificationTable);
		assertContaining("Level", LevelTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("Expected End Date", ExpectedEndDateTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Qualification SIDE TAB
	public void clickADDQualificationSIDETAB() throws Exception {
		AddCourseQualificationSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[7]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17565_moduleElement']/h1")
	public WebElementFacade AddEditQualifications;

	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[1]/label")
	public WebElementFacade PathwayAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[2]/label")
	public WebElementFacade CourseAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[3]/label")
	public WebElementFacade QualificationAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[4]/label")
	public WebElementFacade LevelAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[5]/label")
	public WebElementFacade AwardingBoardCodeAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[6]/label")
	public WebElementFacade AwardingBoardAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[7]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[8]/label")
	public WebElementFacade ExpectedEndDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[9]/label")
	public WebElementFacade InternallyVerifiedAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[10]/label")
	public WebElementFacade InternallyVeriDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[11]/label")
	public WebElementFacade QualificationStatusAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[12]/label")
	public WebElementFacade QualificationStatusDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[13]/label")
	public WebElementFacade CertificateStatusAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[14]/label")
	public WebElementFacade CommentsAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[15]/label")
	public WebElementFacade ProgressionAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[16]/label")
	public WebElementFacade CertificateDeliveryMethodAddForm;

	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[17]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17515']/fieldset/div[17]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Add / Edit Qualifications", AddEditQualifications);// Table
																				// title

		assertContaining("Pathway*: ", PathwayAddForm);
		assertContaining("Course*: ", CourseAddForm);
		assertContaining("Qualification*: ", QualificationAddForm);
		assertContaining("Level*: ", LevelAddForm);
		assertContaining("Awarding Board Code: ", AwardingBoardCodeAddForm);
		assertContaining("Awarding Board: ", AwardingBoardAddForm);
		assertContaining("Start Date*:", StartDateAddForm);
		assertContaining("Expected End Date*: ", ExpectedEndDateAddForm);
		assertContaining("Internally Verified: ", InternallyVerifiedAddForm);
		assertContaining("Internally Verified Date: ", InternallyVeriDateAddForm);
		assertContaining("Qualification Status*: ", QualificationStatusAddForm);
		assertContaining("Qualification Status Date*: ", QualificationStatusDateAddForm);
		assertContaining("Certificate Status: ", CertificateStatusAddForm);
		assertContaining("Comments: ", CommentsAddForm);
		assertContaining("Progression: ", ProgressionAddForm);
		assertContaining("Certificate Delivery Method: ", CertificateDeliveryMethodAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17565_formElement_171355']")
	public WebElementFacade PathwayAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171365']")
	public WebElementFacade CourseAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171375']")
	public WebElementFacade QualificationAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171385']")
	public WebElementFacade LevelAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171375']")
	public WebElementFacade AwardingBodyCodeAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171385']")
	public WebElementFacade AwardingBodyAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171415']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171425']")
	public WebElementFacade ExpectedEndDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171385']")
	public WebElementFacade InternallyVeriAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171415']")
	public WebElementFacade InternallyVeriDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171425']")
	public WebElementFacade IVByAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171455']")
	public WebElementFacade QualificationStatusAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171505']")
	public WebElementFacade ReasonsForWithdrwlAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade QualiStatusDateAddFormTxtBX;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade CertifiStatAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade IfOtherAddFormTxtBX;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade CommentsAddFormTxtBX;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade ProgressionAddFormRadioBttn;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade PlsProvideDetAddFormTxtBX;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade CertifiDelMethodAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17565_formElement_171475']")
	public WebElementFacade CertifiDateAddFormTxtBx;

	public void FillAddEditQualificationForm(String Pathway, String Course, String Qualification, String Level,
			String StartDate, String ExpectedEndDate, String QualifiStat, String ReasonFrWithDrwl, String QualiStatDate)
			throws Exception {

		if (Pathway != "No") {
			selectFromDropdown(PathwayAddFormDDL, Pathway);
		} else {
			System.out.println("No Pathway");
		}

		if (Course != "No") {
			selectFromDDL(CourseAddFormDDL, Course,0);
		} else {
			System.out.println("No Course");
		}

		if (Qualification != "No") {
			selectFromDDL(QualificationAddFormDDL, Qualification,0);
		} else {
			System.out.println("No Qualification");
		}

		if (Level != "No") {
			selectFromDDL(LevelAddFormDDL, Level,0);
		} else {
			System.out.println("No Level");
		}

		if (StartDate != "No") {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDate);
		} else {
			System.out.println("No StartDate");
		}

		if (ExpectedEndDate != "No") {
			ExpectedEndDateAddFormTxtBx.clear();
			ExpectedEndDateAddFormTxtBx.sendKeys(ExpectedEndDate);
		} else {
			System.out.println("No ExpectedEndDate");
		}

		if (QualifiStat != "No") {
			selectFromDDL(QualificationStatusAddFormDDL, QualifiStat,0);
		} else {
			System.out.println("No QualifiStat");
		}

		if (QualifiStat == "Withdrawal") {
			selectFromDDL(ReasonsForWithdrwlAddFormDDL, ReasonFrWithDrwl,0);
		} else {
			System.out.println("No ReasonFrWithDrwl");
		}

		if (QualiStatDate != "No") {
			QualiStatusDateAddFormTxtBX.clear();
			QualiStatusDateAddFormTxtBX.sendKeys(QualiStatDate);
		} else {
			System.out.println("No QualiStatDate");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[6]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17665_moduleElement']/h1")
	public WebElementFacade ViewQualificationPageHeader;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[1]/label")
	public WebElementFacade PathwayVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[2]/label")
	public WebElementFacade CourseVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[3]/label")
	public WebElementFacade QualificationVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[4]/label")
	public WebElementFacade LevelVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[5]/label")
	public WebElementFacade AwardingBoardCodeVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[6]/label")
	public WebElementFacade AwardingBoardVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[7]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[8]/label")
	public WebElementFacade ExpEndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[9]/label")
	public WebElementFacade InternallyVerifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[10]/label")
	public WebElementFacade InternallyVeriDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[11]/label")
	public WebElementFacade QualificationStatusVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[12]/label")
	public WebElementFacade ReasonsForWithdrwlByVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[13]/label")
	public WebElementFacade QualifiStatusdateVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[14]/label")
	public WebElementFacade CertificateStatusVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[15]/label")
	public WebElementFacade CommentsVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[16]/label")
	public WebElementFacade ProgressionVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[17]/label")
	public WebElementFacade CertificateDeliMethVeriPg;

	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[18]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[20]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[19]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[21]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[1]/p")
	public WebElementFacade PathwaysAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[2]/p")
	public WebElementFacade CourseAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[3]/p")
	public WebElementFacade QualificationAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[4]/p")
	public WebElementFacade LevelAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[7]/p")
	public WebElementFacade StartDateAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[8]/p")
	public WebElementFacade ExpectedEndDateAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[11]/p")
	public WebElementFacade QualifiStatAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[12]/p")
	public WebElementFacade ReasonFrWithDrwlAddEdit;
	@FindBy(xpath = ".//*[@id='m17665_view-content']/div[13]/p")
	public WebElementFacade QualiStatDateAddEdit;

	public void VerifyVIEWQualificationPage(String Pathway, String Course, String Qualification, String Level,
			String StartDate, String ExpectedEndDate, String QualifiStat, String ReasonFrWithDrwl, String QualiStatDate)
			throws Exception {
		assertContaining("View Qualification", ViewQualificationPageHeader);
		assertContaining("Pathway", PathwayVeriPg);
		assertContaining("Course", CourseVeriPg);
		assertContaining("Qualification", QualificationVeriPg);
		assertContaining("Level", LevelVeriPg);
		assertContaining("Awarding Board Code", AwardingBoardCodeVeriPg);
		assertContaining("Awarding Board", AwardingBoardVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("Expected End Date", ExpEndDateVeriPg);
		assertContaining("Internally Verified", InternallyVerifiedVeriPg);
		assertContaining("Internally Verified Date", InternallyVeriDateVeriPg);
		assertContaining("Qualification Status", QualificationStatusVeriPg);
		assertContaining("Reasons for withdrawal", ReasonsForWithdrwlByVeriPg);
		assertContaining("Qualification Status Date", QualifiStatusdateVeriPg);
		assertContaining("Certificate Status", CertificateStatusVeriPg);
		assertContaining("Comments", CommentsVeriPg);
		assertContaining("Progression", ProgressionVeriPg);
		assertContaining("Certificate Delivery Method", CertificateDeliMethVeriPg);

		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", DateModifiedVeriPg);
		assertContaining("Modified By", DateModifiedVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(Pathway, PathwaysAddEdit);
		assertContaining(Course, CourseAddEdit);
		assertContaining(Qualification, QualificationAddEdit);
		assertContaining(Level, LevelAddEdit);
		assertContaining(StartDate, StartDateAddEdit);
		assertContaining(ExpectedEndDate, ExpectedEndDateAddEdit);
		assertContaining(QualifiStat, QualifiStatAddEdit);

		if (QualifiStat == "Withdrawal") {
			assertContaining(ReasonFrWithDrwl, ReasonFrWithDrwlAddEdit);
		}
		assertContaining(QualiStatDate, QualiStatDateAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[1]")
	public WebElementFacade CourseTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[2]")
	public WebElementFacade QualificationTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[3]")
	public WebElementFacade LevelTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[4]")
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17465_row1']/td[5]")
	public WebElementFacade ExpeEndDateTableEntry;

	public void VerifyContentsOfRowInTable(String Course, String Qualification, String Level, String StartDate,
			String ExpEndDate) throws Exception {
		assertContaining(Course, CourseTableEntry);
		assertContaining(Qualification, QualificationTableEntry);
		assertContaining(Level, LevelTableEntry);
		assertContaining(StartDate + " 00:00:00.0", StartDateTableEntry);
		assertContaining(ExpEndDate + " 00:00:00.0", ExpeEndDateTableEntry);
	}

	public void VerifyActivityDirectoryQualificationList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDCourse, ADDQualification, ADDLevel, ADDStartDate, ADDExpectedEndDate);

		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITCourse, EDITQualification, EDITLevel, EDITStartDate, EDITExpectedEndDate);
		}
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		CourseTable.click();
		QualificationTable.click();
		LevelTable.click();
		StartDateTable.click();
		ExpectedEndDateTable.click();
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl()
				.contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/14/24/3415?managedClientId=409303");
	}
}
