package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ActivityDirectoryCoursesPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("COURSES", 10, "No");

	public String ADDPathways = XlsReader.getCellData("COURSES", 0, row);
	public String ADDActArea = XlsReader.getCellData("COURSES", 1, row);
	public String ADDCourse = XlsReader.getCellData("COURSES", 2, row);
	public String ADDStatus = XlsReader.getCellData("COURSES", 3, row);
	public String ADDStartDate = XlsReader.getCellData("COURSES", 4, row);
	public String ADDEndDate = XlsReader.getCellData("COURSES", 5, row);
	public String ADDProvider = XlsReader.getCellData("COURSES", 6, row);
	public String ADDIfOtherPro = XlsReader.getCellData("COURSES", 7, row);
	public String ADDFundingSource = XlsReader.getCellData("COURSES", 8, row);
	public String ADDPriorityArea = XlsReader.getCellData("COURSES", 9, row);

	public String EDITPathways = ADDPathways; // Cant change this because rest
												// modules are interdependent
	public String EDITActArea = ADDActArea;// Cant change this because rest
											// modules are interdependent
	public String EDITCourse = ADDCourse;// Cant change this because rest
											// modules are interdependent
	public String EDITStatus = "Active";
	public String EDITStartDate = "01/06/2017";
	public String EDITEndDate = "01/06/2018";
	public String EDITProvider = "";
	public String EDITFundingSource = "";
	public String EDITPriorityArea = "2";

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ActivityDirectorySideTab;

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
	@FindBy(xpath = ".//*[@id='m17195_moduleElement']/h1")
	public WebElementFacade CoursesTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17195_s_0_course']")
	public WebElementFacade CourseTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_s_1_pathway']")
	public WebElementFacade PathwayTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_s_2_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_s_3_endDate']")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_s_4_status']")
	public WebElementFacade StatusTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195']/div/table[2]/thead/tr/td[6]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17195']/div/table[2]/thead/tr/td[7]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Activity
		// Area
		// Sub
		// Top
		// Tab

		assertContaining("Courses", CoursesTableHeader);// Activity
														// Area
														// Table
														// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Course", CourseTable);
		assertContaining("Pathway", PathwayTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("Status", StatusTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Courses SIDE TAB
	public void clickADDCourseSIDETAB() throws Exception {
		AddCourseSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[7]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17235_moduleElement']/h1")
	public WebElementFacade AddEditCourse;

	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[1]/label")
	public WebElementFacade PathwayAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[2]/label")
	public WebElementFacade ActivityAreaAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[3]/label")
	public WebElementFacade CourseAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[4]/label")
	public WebElementFacade StatusAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[5]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[6]/label")
	public WebElementFacade EndDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[7]/label")
	public WebElementFacade ProviderAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[8]/label")
	public WebElementFacade FundingSourceAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[9]/label")
	public WebElementFacade PriorityAreaAddForm;

	@FindBy(xpath = ".//*[@id='form_17305']/fieldset//div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17305']/fieldset/div[11]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Activity Directory", ActivityDirectoryPageHeader);// Sub
																			// Top
																			// Tab

		assertContaining("Add/Edit Course", AddEditCourse);// Table
															// title

		assertContaining("Pathway*", PathwayAddForm);
		assertContaining("Activity Area*", ActivityAreaAddForm);
		assertContaining("Course*", CourseAddForm);
		assertContaining("Status*", StatusAddForm);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("End Date*", EndDateAddForm);
		assertContaining("Provider*", ProviderAddForm);
		assertContaining("Funding Source", FundingSourceAddForm);
		assertContaining("Priority Area", PriorityAreaAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17235_formElement_169485']")
	public WebElementFacade PathwayAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169495']")
	public WebElementFacade ActivityAreaAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169375']")
	public WebElementFacade CourseAddFormTxtBx;

	@FindBy(xpath = ".//*[@id='m17235_formElement_169385-988015' and @type= 'radio']")
	public WebElementFacade StatusAddFormACTIVERadioBut;

	@FindBy(xpath = ".//*[@id='m17235_formElement_169385-988025' and @type = 'radio']")
	public WebElementFacade StatusAddFormINACTIVERadioBut;

	@FindBy(xpath = ".//*[@id='m17235_formElement_169505']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169515']")
	public WebElementFacade EndDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169525']")
	public WebElementFacade ProviderAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17235_formElement_176545']")
	public WebElementFacade IfOtherProviderAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169535']")
	public WebElementFacade FundingSourceAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17235_formElement_169545']")
	public WebElementFacade PriorityAreaAddFormDDL;

	public void FillAddEditCoursesForm(String PathwaysC, String ActAreaC, String CourseC, String StatusC,
			String StartDateC, String EndDateC, String ProviderC, String IFOtherProC, String FundingSourceC,
			String PriorityAreaC) throws Exception {

		if (PathwaysC.length() > 0) {
			selectFromDropdown(PathwayAddFormDDL, PathwaysC);
		} else {
			System.out.println("No Pathways");
		}

		if (ActAreaC.length() > 0) {
			selectFromDropdown(ActivityAreaAddFormDDL, ActAreaC);
		} else {
			System.out.println("No ActArea");
		}
		System.out.println("Course is :" + CourseC);
		if (CourseC.length() > 0) {
			CourseAddFormTxtBx.clear();
			CourseAddFormTxtBx.sendKeys(CourseC);
		} else {
			System.out.println("No Course");
		}
		waitABit(1000);
		System.out.println("status is : " + StatusC);
		if (StatusC == "Active") {
			StatusAddFormACTIVERadioBut.click();
		} else if (StatusC == "Inactive") {
			StatusAddFormINACTIVERadioBut.click();
		}

		if (StartDateC.length() > 0) {
			StartDateAddFormTxtBx.clear();
			StartDateAddFormTxtBx.sendKeys(StartDateC);
		} else {
			System.out.println("No EndDate");
		}

		if (EndDateC.length() > 0) {
			EndDateAddFormTxtBx.clear();
			EndDateAddFormTxtBx.sendKeys(EndDateC);
		} else {
			System.out.println("No EndDate");
		}

		if (ProviderC.length() > 0) {
			selectFromDropdown(ProviderAddFormDDL, ProviderC);
		} else {
			System.out.println("No Provider");
		}

		int count;
		if (IFOtherProC.length() > 0) {
			IfOtherProviderAddFormTxtBx.clear();
			IfOtherProviderAddFormTxtBx.sendKeys(IFOtherProC);
			count = 2;
		} else {
			System.out.println("No IFOtherProC");
			count = 1;
		}
		System.out.println("Count is : " + count);

		if (FundingSourceC.length() > 0) {
			selectFromDropdown(FundingSourceAddFormDDL, FundingSourceC);
		} else {
			System.out.println("No FundingSource");
		}
		waitABit(5000);

		if (PriorityAreaC.length() > 0) {
			selectFromDropdown(PriorityAreaAddFormDDL, PriorityAreaC);
		} else {
			System.out.println("No PriorityArea");
		}

		SaveAddForm.click();

		System.out.println("Form is saved successfully!!!!!!");
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[6]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17285_moduleElement']/h1")
	public WebElementFacade ViewCoursePageHeader;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[1]/label")
	public WebElementFacade PathwayVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[2]/label")
	public WebElementFacade ActivityAreaVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[3]/label")
	public WebElementFacade CourseVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[4]/label")
	public WebElementFacade StatusVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[5]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[6]/label")
	public WebElementFacade EndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[7]/label")
	public WebElementFacade CourseProviderVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[8]/label")
	public WebElementFacade FundingSourceVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[9]/label")
	public WebElementFacade PrioAreaVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[10]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[12]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[11]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[13]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[1]/p")
	public WebElementFacade PathwayAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[2]/p")
	public WebElementFacade ActAreaEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[3]/p")
	public WebElementFacade CourseAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[4]/p")
	public WebElementFacade StatusEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[5]/p")
	public WebElementFacade StartDateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[6]/p")
	public WebElementFacade EndDateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[7]/p")
	public WebElementFacade ProviderAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[8]/p")
	public WebElementFacade FundingSourceAddEdit;
	@FindBy(xpath = ".//*[@id='m17285_view-content']/div[9]/p")
	public WebElementFacade PriorityAreaAddEdit;

	public void VerifyVIEWCoursesPage(String Pathway, String ActArea, String Course, String Status, String StartDate,
			String EndDate, String Provider, String FundingSource, String PriorityArea) throws Exception {
		assertContaining("Activity Directory", ActivityDirectoryPageHeader);
		assertContaining("View Course", ViewCoursePageHeader);
		assertContaining("Pathway", PathwayVeriPg);
		assertContaining("Activity Area", ActivityAreaVeriPg);
		assertContaining("Course", CourseVeriPg);
		assertContaining("Status", StatusVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("End Date", EndDateVeriPg);
		assertContaining("Course Provider", CourseProviderVeriPg);
		assertContaining("Funding Source", FundingSourceVeriPg);
		assertContaining("Priority Area", PrioAreaVeriPg);
		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(Pathway, PathwayAddEdit);
		assertContaining(ActArea, ActAreaEntryAddEdit);
		assertContaining(Course, CourseAddEdit);
		assertContaining(Status, StatusEntryAddEdit);
		assertContaining(StartDate, StartDateEntryAddEdit);
		assertContaining(EndDate, EndDateEntryAddEdit);
		assertContaining(Provider, ProviderAddEdit);
		assertContaining(FundingSource, FundingSourceAddEdit);
		assertContaining(PriorityArea, PriorityAreaAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[1]")
	public WebElementFacade CourseTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[2]")
	public WebElementFacade PathwayTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[3]")
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[4]")
	public WebElementFacade EndDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17195_row1']/td[5]")
	public WebElementFacade StatusTableEntry;

	public void VerifyContentsOfRowInTable(String Course, String Pathway, String StartDate, String EndDate,
			String Status) throws Exception {
		assertContaining(Course, CourseTableEntry);
		assertContaining(Pathway, PathwayTableEntry);
		assertContaining(StartDate, StartDateTableEntry);
		assertContaining(EndDate, EndDateTableEntry);
		assertContaining(Status, StatusTableEntry);
	}

	public void VerifyActivityAreaCoursesList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDCourse, ADDPathways, ADDStartDate, ADDEndDate, ADDStatus);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITCourse, EDITPathways, EDITStartDate, EDITEndDate, EDITStatus);
		}
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17195']/div[1]/h3")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='course_misJmesa_17195']")
	public WebElementFacade CourseFilters;
	@FindBy(xpath = ".//*[@id='pathway_misJmesa_17195']")
	public WebElementFacade PathwayFilters;
	@FindBy(xpath = ".//*[@id='startDate_misJmesa_17195']")
	public WebElementFacade StartDateFilters;
	@FindBy(xpath = ".//*[@id='endDate_misJmesa_17195']")
	public WebElementFacade EndDateFilters;
	@FindBy(xpath = ".//*[@id='status_misJmesa_17195']")
	public WebElementFacade StatusFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_17195']/div[1]/div/fieldset/div[6]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_17195']/div[1]/div/fieldset/div[6]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String Course, String Pathway, String StartDate, String EndDate, String Status)
			throws Exception {
		waitABit(2000);
		FILTERS.click();
		ResetFilterBtn.click();
		waitABit(1000);
		if (Course.length() > 0) {
			CourseFilters.clear();
			CourseFilters.sendKeys(Course);
		} else
			System.out.println("Not required");

		if (Pathway.length() > 0) {
			selectFromDDL(PathwayFilters, Pathway,0);
		} else
			System.out.println("Not required");

		if (StartDate.length() > 0) {
			StartDateFilters.clear();
			StartDateFilters.sendKeys(StartDate);
		} else
			System.out.println("Not required");

		if (EndDate.length() > 0) {
			EndDateFilters.clear();
			EndDateFilters.sendKeys(EndDate);
		} else
			System.out.println("Not required");

		if (Status.length() > 0) {
			selectFromDDL(StatusFilters, Status,0);
		} else
			System.out.println("Not required");
		SearchFilterBtn.click();
		waitABit(2000);
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		CourseTable.click();
		PathwayTable.click();
		StartDateTable.click();
		EndDateTable.click();
		StatusTable.click();
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1335/");
	}
}
