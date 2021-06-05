package com.meganexus.mis.pageObjectLib;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActivityDirectoryCertificationPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("CERTIFICATIONS", 8, "No");

	public String ADDPathways = XlsReader.getCellData("CERTIFICATIONS", 0, row);
	public String ADDCourse = XlsReader.getCellData("CERTIFICATIONS", 1, row);
	public String ADDQualification = XlsReader.getCellData("CERTIFICATIONS", 2, row);

	public String ADDStatus = "Certificate not received";
	// pls dont change else client doesnot appear. It will always be the same.

	public String FrstName = "";
	public String LastName = "";
	public String ADDClient = FrstName + " " + LastName;
	public String ADDDate = XlsReader.getCellData("CERTIFICATIONS", 5, row);
	public String ADDCertiStat = XlsReader.getCellData("CERTIFICATIONS", 6, row);
	public String ADDIfOther = XlsReader.getCellData("CERTIFICATIONS", 7, row);

	public String EDITDate = "30/12/2020";
	public String EDITCertiStat = "Handed over to external organisation";
	public String EDITIfOther = "";

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
	@FindBy(xpath = ".//*[@id='m17455_moduleElement']/h1")
	public WebElementFacade CertificationTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17455_s_0_pathway']")
	public WebElementFacade PathwayTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_s_1_course']")
	public WebElementFacade CourseTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_s_2_qualification']")
	public WebElementFacade QualificationTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_s_3_certificationStatus']")
	public WebElementFacade StatusTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_s_4_date']")
	public WebElementFacade DateTable;

	@FindBy(xpath = ".//*[@id='misJmesa_17455']/div[2]/table[2]/thead/tr/td[6]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17455']/div[2]/table[2]/thead/tr/td[7]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Activity
																			// Area
																			// Sub
																			// Top
																			// Tab

		assertContaining("Certification", CertificationTableHeader);// Activity
																	// Area
																	// Table
																	// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-
		assertContaining("Pathway", PathwayTable);
		assertContaining("Course", CourseTable);
		assertContaining("Qualification", QualificationTable);
		assertContaining("Date", DateTable);
		assertContaining("Status", StatusTable);

		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[7]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	// click ADD EDIT Courses SIDE TAB
	public void clickADDCertificationSIDETAB() throws Exception {
		AddCertificationSideTab.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17475_moduleElement']/h1")
	public WebElementFacade AddEditCertification;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[1]/label")
	public WebElementFacade PathwayAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[2]/label")
	public WebElementFacade CourseAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[3]/label")
	public WebElementFacade QualificationAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[4]/label")
	public WebElementFacade StatusAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[5]/label")
	public WebElementFacade ClientAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[6]/label")
	public WebElementFacade DateAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset/div[7]/label")
	public WebElementFacade CertiStatAddForm;

	@FindBy(xpath = ".//*[@id='form_17495']/fieldset//div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17495']/fieldset//div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Sub
																			// Top
																			// Tab

		assertContaining("Add Certification", AddEditCertification);// Table
																	// title

		assertContaining("Pathway", PathwayAddForm);
		assertContaining("Course", CourseAddForm);
		assertContaining("Qualification", QualificationAddForm);
		assertContaining("Status", StatusAddForm);
		assertContaining("Clients*", ClientAddForm);
		assertContaining("Date", DateAddForm);
		assertContaining("Certificate Status", CertiStatAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17475_formElement_171235']")
	public WebElementFacade PathwayAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17475_formElement_171245']")
	public WebElementFacade CourseAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17475_formElement_171255']")
	public WebElementFacade QualificationAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17475_formElement_171265']")
	public WebElementFacade StatusAddFormDDL;

	public String ClientAddFormChkBx = ".//*[@id='m17475_formElement_171275']/div/label[contains(text(), '" + ADDClient
			+ "')]/preceding-sibling::input";

	@FindBy(xpath = ".//*[@id='m17475_formElement_171285']")
	public WebElementFacade DateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17475_formElement_171295']")
	public WebElementFacade CertiStatAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17475_formElement_171515']")
	public WebElementFacade IfOtherFormTxtBx;

	public void FillAddEditCertificateForm(String Pathways, String Course, String Qualification, String Status,
			String Date, String CertiStat, String IfOther) throws Exception {

		System.out.println("Pathways :" + Pathways);
		if (Pathways.length() > 0) {
			selectFromDDL(PathwayAddFormDDL, Pathways, 0);
		} else {
			System.out.println("No Pathways");
		}
		System.out.println("Course :" + Course);
		if (Course.length() > 0) {
			selectFromDDL(CourseAddFormDDL, Course, 0);
		} else {
			System.out.println("No Course");
		}
		System.out.println("Qualification :" + Qualification);
		if (Qualification.length() > 0) {
			selectFromDDL(QualificationAddFormDDL, Qualification, 0);
		} else {
			System.out.println("No Qualification");
		}
		System.out.println("Status :" + Status);
		if (Status.length() > 0) {
			selectFromDDL(StatusAddFormDDL, Status, 0);
		} else {
			System.out.println("No Status");
		}

		clickButtonWhenCustomizedXPATH(ClientAddFormChkBx);

		System.out.println("Date :" + Date);
		if (Date.length() > 0) {
			DateAddFormTxtBx.clear();
			DateAddFormTxtBx.sendKeys(Date);
		} else {
			System.out.println("No Date");
		}
		System.out.println("CertiStat :" + CertiStat);
		if (CertiStat.length() > 0) {
			selectFromDDL(CertiStatAddFormDDL, Status, 0);
		} else {
			System.out.println("No CertiStat");
		}
		waitABit(1000);
		System.out.println("IfOther :" + IfOther);
		if (IfOther.length() > 0) {
			IfOtherFormTxtBx.clear();
			IfOtherFormTxtBx.sendKeys(IfOther);
		} else {
			System.out.println("No IfOther");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[6]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17585_moduleElement']/h1")
	public WebElementFacade ViewCertificationPageHeader;

	@FindBy(xpath = "	")
	public WebElementFacade PathwayVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Course')]")
	public WebElementFacade CourseVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Qualification')]")
	public WebElementFacade QualificationVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Status')]")
	public WebElementFacade StatusVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Clients')]")
	public WebElementFacade ClientsVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Date')]")
	public WebElementFacade DateVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Certificate Status')]")
	public WebElementFacade CertiStatVeriPg;

	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Date Created')]")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Date Modified')]")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Created By')]")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Modified By')]")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Pathway')]/following-sibling::p")
	public WebElementFacade PathwayAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Course')]/following-sibling::p")
	public WebElementFacade CourseAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Qualification')]/following-sibling::p")
	public WebElementFacade QualificationAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Status')]/following-sibling::p")
	public WebElementFacade StatusAddEdit;;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Clients')]/following-sibling::p")
	public WebElementFacade ClientsAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Date')]/following-sibling::p")
	public WebElementFacade DateAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'Certificate Status')]/following-sibling::p")
	public WebElementFacade CertiStatSourceAddEdit;
	@FindBy(xpath = ".//*[@id='m17585_view-content']//label[contains(text(), 'If other,')]/following-sibling::p")
	public WebElementFacade IfOtherAddEdit;

	public void VerifyVIEWActivityAreaPage(String Pathways, String Course, String Qualification, String Status,
			String Date, String CertiStat, String IfOther) throws Exception {
		assertContaining("Activity Directory", ActivityDirectoryPageHeader);
		assertContaining("View Certification", ViewCertificationPageHeader);
		assertContaining("Pathway", PathwayVeriPg);
		assertContaining("Course", CourseVeriPg);
		assertContaining("Qualification", QualificationVeriPg);
		assertContaining("Status", StatusVeriPg);
		assertContaining("Clients", ClientsVeriPg);
		assertContaining("Date", DateVeriPg);
		assertContaining("Certificate Status", CertiStatVeriPg);

		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.

		assertContaining(Pathways, PathwayAddEdit);
		assertContaining(Course, CourseAddEdit);
		assertContaining(Qualification, QualificationAddEdit);
		assertContaining(Status, StatusAddEdit);
		assertContaining(ADDClient, ClientsAddEdit);
		assertContaining(Date, DateAddEdit);
		assertContaining(CertiStat, CertiStatSourceAddEdit);
		if (IfOther.length() > 0) {
			assertContaining(IfOther, IfOtherAddEdit);
		}

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[1]")
	public WebElementFacade PathwayTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[2]")
	public WebElementFacade CourseTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[3]")
	public WebElementFacade QualifTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[4]")
	public WebElementFacade StatusTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17455_row1']/td[5]")
	public WebElementFacade DateTableEntry;

	public void VerifyContentsOfRowInTable(String Pathways, String Course, String Qualification, String Status,
			String Date) throws Exception {
		assertContaining(Pathways, PathwayTableEntry);
		assertContaining(Course, CourseTableEntry);
		assertContaining(Qualification, QualifTableEntry);
		assertContaining(Status, StatusTableEntry);
		assertContaining(Date, DateTableEntry);
	}

	public void VerifyActivityDirectoryCertificationList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDPathways, ADDCourse, ADDQualification, ADDStatus, ADDDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(ADDPathways, ADDCourse, ADDQualification, ADDStatus, EDITDate);
		}
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17455']/div[1]/h3")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='pathway_misJmesa_17455']")
	public WebElementFacade PathwayFilters;
	@FindBy(xpath = ".//*[@id='course_misJmesa_17455']")
	public WebElementFacade CourseFilters;
	@FindBy(xpath = ".//*[@id='qualification_misJmesa_17455']")
	public WebElementFacade QualiFilters;
	@FindBy(xpath = ".//*[@id='certificationStatus_misJmesa_17455']")
	public WebElementFacade StatusFilters;
	@FindBy(xpath = ".//*[@id='date_misJmesa_17455']")
	public WebElementFacade DateFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_17455']/div[1]/div/fieldset/div[6]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_17455']/div[1]/div/fieldset/div[6]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String Pathway, String Course, String Quali, String Status, String Date)
			throws Exception {

		FILTERS.click();
		ResetFilterBtn.click();
		waitABit(1000);
		System.out.println("filters used are :" + Pathway + " :" + Course + " :" + Quali + " :" + Status + " :" + Date);
		if (Pathway.length() > 0) {
			selectFromDDL(PathwayFilters, Pathway, 0);

		} else
			System.out.println("Not required");

		if (Course.length() > 0) {
			selectFromDDL(CourseFilters, Course, 0);

		} else
			System.out.println("Not required");

		if (Quali.length() > 0) {
			selectFromDDL(QualiFilters, Quali, 0);

		} else
			System.out.println("Not required");

		if (Status.length() > 0) {
			selectFromDDL(StatusFilters, Status, 0);

		} else
			System.out.println("Not required");

		if (Date.length() > 0) {
			DateFilters.clear();
			DateFilters.sendKeys(Date);

		} else
			System.out.println("Not required");
		SearchFilterBtn.click();
		waitABit(2000);
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		CourseTable.click();
		PathwayTable.click();
		QualificationTable.click();
		DateTable.click();
		StatusTable.click();
	}

}
