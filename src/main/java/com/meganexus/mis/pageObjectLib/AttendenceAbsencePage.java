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

public class AttendenceAbsencePage extends GenericPage {
	NavigateTabs nt;
	ActivityAreaPage aa;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActArReqSpecialism", 6, "No");

	public String AddActiArea = "regression testing";
	public String AddTeam = "";
	public String FirstName = "";
	public String LstName = "";
	public String AllocatedClient = LstName + " " + FirstName;
	public String ADDStartDate = "regression testing";
	public String ADDEndDate = "SubhajitBer4";
	public String AddAbsencePeriod = "GhoshBer4";
	public String ADDAbsenceCode = "";

	public String EDITStartDate = "regression testing";
	public String EDITEndDate = "SubhajitBer4";
	public String EDITAbsencePeriod = "GhoshBer4";
	public String EDITAbsenceCode = "";

	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade TeamAttendancePageHeader;

	public void NavigateToATTENDANCEPage() throws Exception {
		nt.NavigateToAttendanceMainTab();
		waitABit(1000);
		assertContaining("Team Attendance", TeamAttendancePageHeader);
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
	public WebElementFacade AbsenceTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_0_activityArea']")
	public WebElementFacade ActAreaTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_1_team']")
	public WebElementFacade TeamTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[2]/table[2]/thead/tr/td[3]")
	public WebElementFacade PrisonNoTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_3_learnerFirstName']")
	public WebElementFacade FrstNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_4_learnerSirname']")
	public WebElementFacade SurnameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_5_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_6_endDate']")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_7_absenceType']")
	public WebElementFacade AbsenceCodeTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_s_8_absencePeriod']")
	public WebElementFacade AbsencePeriodTable;

	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[2]/table[2]/thead/tr/td[10]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[2]/table[2]/thead/tr/td[11]")
	public WebElementFacade EditTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[2]/table[2]/thead/tr/td[12]")
	public WebElementFacade ArchieveTable;

	public void verifyForm() throws Exception {

		assertContaining("Team Attendance", TeamAttendancePageHeader);// Activity
																		// Area
																		// Sub
																		// Top
																		// Tab

		assertContaining("Absence", AbsenceTableHeader);// Activity
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
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("Absence Code", AbsenceCodeTable);
		assertContaining("Absence Period", AbsencePeriodTable);

		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);
		assertContaining("Archieve", ArchieveTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Absence SIDE TAB
	public void clickABSENCESIDETab() throws Exception {
		AddAbsenceSIDETab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[11]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[contains(@id,'_moduleElement')]/h1")
	public WebElementFacade AddEditAbsence;

	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[1]/label")
	public WebElementFacade ActAreaAddForm;
	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[2]/label")
	public WebElementFacade TeamAddForm;
	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[3]/label")
	public WebElementFacade AllocatedClientAddForm;
	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[4]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[5]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[6]/label")
	public WebElementFacade AbsencePeriodAddForm;
	@FindBy(xpath = ".//*[@id='m18685_formElement_177355']/div[1]/label")
	public WebElementFacade AllDayAddForm;
	@FindBy(xpath = ".//*[@id='m18685_formElement_177355']/div[2]/label")
	public WebElementFacade AMAddForm;
	@FindBy(xpath = ".//*[@id='m18685_formElement_177355']/div[3]/label")
	public WebElementFacade PMAddForm;
	@FindBy(xpath = ".//*[@id='m18685_formElement_177355']/div[4]/label")
	public WebElementFacade StatedAddForm;

	@FindBy(xpath = ".//*[@id='form_17775']/fieldset/div[7]/label")
	public WebElementFacade AbsenceCodeAddForm;

	@FindBy(xpath = ".//*[@id='form_17775']/fieldset//div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17775']/fieldset//div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm(String AddEdit) throws Exception {
		if (AddEdit == "Add") {
			assertContaining("Add Absence", AddEditAbsence);
		} else if (AddEdit == "Edit") {
			assertContaining("Edit Absence", AddEditAbsence);
		}

		assertContaining("Activity Area", ActAreaAddForm);
		assertContaining("Team", TeamAddForm);
		assertContaining("Allocated Clients*", AllocatedClientAddForm);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Absence Period*", AbsencePeriodAddForm);
		assertContaining("All Day", AllDayAddForm);
		assertContaining("AM", AMAddForm);
		assertContaining("PM", PMAddForm);
		assertContaining("Stated Time", StatedAddForm);

		assertContaining("Absence Code", AbsenceCodeAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[contains(@id,'_formElement_177305')]")
	public WebElementFacade ActAreaAddFormDDL;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177315')]")
	public WebElementFacade TeamAddFormDDL;
	String AllocatedClientAddFormChkBx = ".//*[contains(@id,'_formElement_177325')]/div/label[contains(text(), '"
			+ AllocatedClient + "')]/preceding-sibling::input";
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177335')]")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177345')]")
	public WebElementFacade EndDateAddFormTxtBx;

	@FindBy(xpath = ".//*[contains(@id,'_formElement_177355-1017175')]")
	public WebElementFacade AbsPeri_ALLDAY_ADDAddFormRadio;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177355-1017185')]")
	public WebElementFacade AbsPeri_AM_ADDAddFormRadio;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177355-1017195')]")
	public WebElementFacade AbsPeri_PM_ADDAddFormRadio;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177355-1017205')]")
	public WebElementFacade AbsPeri_StatedTime_ADDAddFormRadio;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177365')]")
	public WebElementFacade AbsPeri_StatedTime_StartTime_ADDAddFormTxtBx;
	@FindBy(xpath = ".//*[contains(@id,'_formElement_177375')]")
	public WebElementFacade AbsPeri_StatedTime_EndTime_ADDAddFormTxtBx;

	@FindBy(xpath = ".//*[@id='form_17815']/fieldset/div[3]/div/div[3]/ul/li/button")
	public WebElementFacade AbsenceCodeAddFormDDL;

	public void FillAddEditAllocateClientForm(String ActArea, String Team, String StartDate, String EndDate,
			String AbsencePeriod, String AbsenceCode) throws Exception {

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

		if (AbsencePeriod.length() > 0) {
			if (AbsencePeriod == "All Day") {
				AbsPeri_ALLDAY_ADDAddFormRadio.click();
			} else if (AbsencePeriod == "AM") {
				AbsPeri_AM_ADDAddFormRadio.click();
			} else if (AbsencePeriod == "PM") {
				AbsPeri_PM_ADDAddFormRadio.click();
			} else if (AbsencePeriod == "Stated Time") {
				AbsPeri_StatedTime_ADDAddFormRadio.click();

				{
					AbsPeri_StatedTime_StartTime_ADDAddFormTxtBx.clear();
					AbsPeri_StatedTime_StartTime_ADDAddFormTxtBx.sendKeys("11:00");
				}
				{
					AbsPeri_StatedTime_EndTime_ADDAddFormTxtBx.clear();
					AbsPeri_StatedTime_EndTime_ADDAddFormTxtBx.sendKeys("23:00");
				}
			}

		} else {
			System.out.println("No Absence Period");

		}
		if (AbsenceCode.length() > 0) {
			selectFromDDL(AbsenceCodeAddFormDDL, AbsenceCode, 0);
		} else {
			System.out.println("No AbsenceCode");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[10]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m18545_moduleElement']/h1")
	public WebElementFacade ViewAbsencePageHeader;

	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Activity Area')]")
	public WebElementFacade ActAreaVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Team')]")
	public WebElementFacade TeamVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Allocated Client')]")
	public WebElementFacade AllocatedClientVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Start Date')]")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'End Date')]")
	public WebElementFacade EndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Absence Period')]")
	public WebElementFacade AbsencePeriodVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Absence Code')]")
	public WebElementFacade AbsenceCodeVeriPg;

	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Date Created')]")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Date Modified')]")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Created By')]")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Modified By')]")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Activity Area')]/following-sibling::p")
	public WebElementFacade ActAreaEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Team')]")
	public WebElementFacade TeamEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Allocated Client')]")
	public WebElementFacade AllocatedClientEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Start Date')]")
	public WebElementFacade StartdateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'End Date')]")
	public WebElementFacade EnddateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Absence Period')]")
	public WebElementFacade AbsencePeriodEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m18695_view-content']//label[contains(text(), 'Absence Code')]")
	public WebElementFacade AbsenceCodeEntryAddEdit;

	public void VerifyVIEWClientAllocationPage(String ActArea, String Team, String StartDate, String EndDate,
			String AbsencePeriod, String AbsenceCode) throws Exception {
		assertContaining("Team Attendance", TeamAttendancePageHeader);
		assertContaining("View Absence", ViewAbsencePageHeader);

		assertContaining("Activity Area", ActAreaVeriPg);
		assertContaining("Team", TeamVeriPg);
		assertContaining("Allocated Client", AllocatedClientVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("End Date", EndDateVeriPg);
		assertContaining("Absence Period", AbsencePeriodVeriPg);
		assertContaining("Absence Code", AbsenceCodeVeriPg);

		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.

		assertContaining(ActArea, ActAreaEntryAddEdit);
		assertContaining(Team, TeamEntryAddEdit);
		assertContaining(FirstName + " " + LstName, AllocatedClientEntryAddEdit);
		assertContaining(StartDate, StartdateEntryAddEdit);
		assertContaining(EndDate, StartdateEntryAddEdit);
		assertContaining(AbsencePeriod, AbsencePeriodEntryAddEdit);
		assertContaining(AbsenceCode, AbsenceCodeEntryAddEdit);

	}

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
	public WebElementFacade StartDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[7]")
	public WebElementFacade EndDateTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[8]")
	public WebElementFacade AbsenceCodeTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[9]")
	public WebElementFacade AbsencePeriodTableEntry;

	public void VerifyContentsOfRowInTable(String ActArea, String Team, String StartDate, String EndDate,
			String AbsencePeriod, String AbsenceCode) throws Exception {
		assertContaining(ActArea, ActAreaTableEntry);
		assertContaining(Team, TeamTableEntry);
		assertContaining(FirstName, FrstNameTableEntry);
		assertContaining(LstName, SurnameTableEntry);
		assertContaining(StartDate, StartDateTableEntry);
		assertContaining(EndDate, EndDateTableEntry);
		assertContaining(AbsencePeriod, AbsenceCodeTableEntry);
		assertContaining(AbsenceCode, AbsencePeriodTableEntry);
	}

	public void VerifyAllocateClientList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(AddActiArea, AddTeam, ADDStartDate, ADDEndDate, AddAbsencePeriod,
					ADDAbsenceCode);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(AddActiArea, AddTeam, EDITStartDate, EDITEndDate, EDITAbsencePeriod,
					EDITAbsenceCode);
		}
	}

	// -------------------Filters and sorting-------------------------//

	public void ClickOnJMESA() throws Exception {
		ActAreaTable.click();
		TeamTable.click();
		FrstNameTable.click();
		SurnameTable.click();
		StartDateTable.click();
		EndDateTable.click();
		AbsenceCodeTable.click();
		AbsencePeriodTable.click();
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[1]/h3/span")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='learnerFirstName_misJmesa_18655']")
	public WebElementFacade FrstNameFilters;
	@FindBy(xpath = ".//*[@id='learnerSirname_misJmesa_18655']")
	public WebElementFacade SurnameFilters;
	@FindBy(xpath = ".//*[@id='startDate_misJmesa_18655']")
	public WebElementFacade StartDateFilters;
	@FindBy(xpath = ".//*[@id='endDate_misJmesa_18655']")
	public WebElementFacade EndDateFilters;
	@FindBy(xpath = ".//*[@id='absenceType_misJmesa_18655']")
	public WebElementFacade AbsenceCodeFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[1]/div/fieldset/div[9]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_18655']/div[1]/div/fieldset/div[9]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String FrstName, String Surname, String StartDate, String EndDate, String AbsCode)
			throws Exception {
		FILTERS.click();
		ResetFilterBtn.click();
		waitABit(1000);
		if (FrstName.length() > 0) {
			FrstNameFilters.clear();
			FrstNameFilters.sendKeys(FrstName);
		} else
			System.out.println("Not required");

		if (Surname.length() > 0) {
			SurnameFilters.clear();
			SurnameFilters.sendKeys(Surname);
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

		if (AbsCode.length() > 0) {
			selectFromDDL(AbsenceCodeFilters, AbsCode, 0);

		} else
			System.out.println("Not required");
		SearchFilterBtn.click();
	}

	// -------------------Archieve a record-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_18655_row1']/td[12]/a")
	public WebElementFacade ArchieveRow;

	public void clickARCHIEVEButton() throws Exception {
		ArchieveRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17735_moduleElement']/h1")
	public WebElementFacade DeleteAbsenceHeader;
	@FindBy(xpath = ".//*[@id='m17735_moduleElement']/div/form/fieldset/div/p")
	public WebElementFacade ArchieveTxt;
	@FindBy(xpath = ".//*[@id='m17735_moduleElement']/div/form/fieldset/div/div/button")
	public WebElementFacade YesButtn;
	@FindBy(xpath = ".//*[@id='m17735_moduleElement']/div/form/fieldset/div/div/a/span")
	public WebElementFacade NoBttn;

	public void archieveARecord() throws Exception {
		clickARCHIEVEButton();
		waitABit(3000);

		assertContaining("Delete Absence", DeleteAbsenceHeader);
		assertContaining("Are you sure you want to delete this absence?", ArchieveTxt);
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
