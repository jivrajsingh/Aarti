package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ActivityAreaTeamPage extends GenericPage {
	NavigateTabs nt;
	ActivityAreaPage aa;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ActArTeam", 5, "No");

	public String ActiArea = XlsReader.getCellData("ActivityArea", 0, row);

	public String ADDTeam = XlsReader.getCellData("ActArTeam", 0, row);
	public String ADDCapacity = XlsReader.getCellData("ActArTeam", 1, row);
	public String ADDPurpose = XlsReader.getCellData("ActArTeam", 2, row);
	public String ADDStartDate = XlsReader.getCellData("ActArTeam", 3, row);
	public String ADDEndDate = XlsReader.getCellData("ActArTeam", 4, row);

	public String EDITTeam = "";
	public String EDITPurpose = "Edited Purpose";
	public String EDITCapacity = "10";
	public String EDITStartDate = "02/06/2017";
	public String EDITEndDate = "01/06/2019";

	public String viewRowAActArea = ".//*[@id='misJmesa_18525_row3']/td[contains(text(), '" + ActiArea
			+ "')]/following-sibling::td[4]/a";

	public void NavigateToViewActArea() throws Exception {
		aa.clickOnJMESA(2);
		Thread.sleep(1000);
		clickButtonWhenCustomizedXPATH(viewRowAActArea);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ActivityAreaSIDETab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li/a/span")
	public WebElementFacade AddTeamSIDETab;

	public void verifySidetabs() throws Exception {
		assertContaining("Activity Area", ActivityAreaSIDETab);
		assertContaining("Add Team", AddTeamSIDETab);
	}

	/**
	 * Verification of all elements on Page(esp. Team table elements).
	 */
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li/a")
	public WebElementFacade ActivityAreaPageHeader;
	@FindBy(xpath = ".//*[@id='m18505_moduleElement']/h1")
	public WebElementFacade TeamsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_18505_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_18505_s_0_team']")
	public WebElementFacade TeamTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[2]/table[2]/thead/tr/td[2]")
	public WebElementFacade CapacityTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[2]/table[2]/thead/tr/td[3]")
	public WebElementFacade PurposeTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505_s_3_startDate']")
	public WebElementFacade StartDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505_s_4_endDate']")
	public WebElementFacade EndDateTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[2]/table[2]/thead/tr/td[6]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[2]/table[2]/thead/tr/td[7]")
	public WebElementFacade EditTable;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[2]/table[2]/thead/tr/td[8]")
	public WebElementFacade DeleteTable;

	public void verifyForm() {

		assertContaining("Team Activity Area", ActivityAreaPageHeader);// Activity
																			// Area
																			// Sub
																			// Top
																			// Tab

		assertContaining("Teams", TeamsTableHeader);// Activity Area Table
														// title

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Team", TeamTable);
		assertContaining("Capacity", CapacityTable);
		assertContaining("Purpose", PurposeTable);
		assertContaining("Start Date", StartDateTable);
		assertContaining("End Date", EndDateTable);
		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);
		assertContaining("Delete", DeleteTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Activity Area SIDE TAB
	public void clickADDTeamSIDETAB() throws Exception {
		AddTeamSIDETab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_18505_row1']/td[7]/a")
	public WebElementFacade EditRow;

	public void clickEDITButton() throws Exception {
		EditRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17365_moduleElement']/h1")
	public WebElementFacade AddEditTeam;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[1]/label")
	public WebElementFacade TeamAddForm;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[2]/label")
	public WebElementFacade CapacityAddForm;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[3]/label")
	public WebElementFacade PurposeAddForm;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[4]/label")
	public WebElementFacade StartDateAddForm;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[5]/label")
	public WebElementFacade EndDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[7]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[7]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Team Activity Area", ActivityAreaPageHeader);// Sub
																			// Top
																			// Tab

		assertContaining("Add / Edit Team", AddEditTeam);// Table title

		assertContaining("Team*", TeamAddForm);
		assertContaining("Capacity", CapacityAddForm);
		assertContaining("Purpose*", PurposeAddForm);
		assertContaining("Start Date*", StartDateAddForm);
		assertContaining("End Date", EndDateAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	/*
	 * public void FillForm1(String Partner) throws Exception{ selectFromDDL("",
	 * Partner); clickButton(""); //Select button }
	 */

	@FindBy(xpath = ".//*[@id='m17365_formElement_171305_search']")
	public WebElementFacade TeamAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='form_17505']/fieldset/div[1]/div/button")
	public WebElementFacade SearchButton;
	@FindBy(xpath = ".//*[@id='m17365_formElement_171305']")
	public WebElementFacade TeamAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17365_formElement_171315']")
	public WebElementFacade CapacityAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17365_formElement_171325']")
	public WebElementFacade PurposeAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17365_formElement_171335']")
	public WebElementFacade StartDateAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17365_formElement_171345']")
	public WebElementFacade EndDateAddFormTxtBx;

	public void FillAddEditTeamForm(String Team, String Cap, String Purpose, String StartDate, String EndDate)
			throws Exception {
		if (Team.length() > 0) {
			TeamAddFormTxtBx.clear();
			TeamAddFormTxtBx.sendKeys(Team);
			SearchButton.click();
			waitABit(2000);
			selectFromDDL(TeamAddFormDDL, Team,0);
		} else {
			System.out.println("No Team");
		}

		if (Cap.length() > 0) {
			CapacityAddFormTxtBx.clear();
			CapacityAddFormTxtBx.sendKeys(Cap);
		} else {
			System.out.println("No Cap");
		}

		if (Purpose.length() > 0) {
			PurposeAddFormTxtBx.clear();
			PurposeAddFormTxtBx.sendKeys(Purpose);
		} else {
			System.out.println("No Purpose");
		}

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
	@FindBy(xpath = ".//*[@id='misJmesa_18505_row1']/td[7]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		waitABit(5000);
		System.out.println("Click view button");
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17615_moduleElement']/h1")
	public WebElementFacade ViewTeamPageHeader;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[1]/label")
	public WebElementFacade TeamVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[2]/label")
	public WebElementFacade CapacityVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[3]/label")
	public WebElementFacade PurposeVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[4]/label")
	public WebElementFacade StartDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[5]/label")
	public WebElementFacade EndDateVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[6]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[8]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[7]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[9]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[1]/p")
	public WebElementFacade TeamEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[2]/p")
	public WebElementFacade CapEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[3]/p")
	public WebElementFacade PurposeEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[4]/p")
	public WebElementFacade StartdateEntryAddEdit;
	@FindBy(xpath = ".//*[@id='m17615_view-content']/div[5]/p")
	public WebElementFacade EnddateEntryAddEdit;

	public void VerifyVIEWTeamPage(String Team, String Cap, String Purpose, String StartDate, String EndDate)
			throws Exception {
		assertContaining("Team Activity Area", ActivityAreaPageHeader);
		assertContaining("View Team", ViewTeamPageHeader);
		assertContaining("Team", TeamVeriPg);
		assertContaining("Capacity", CapacityVeriPg);
		assertContaining("Purpose", PurposeVeriPg);
		assertContaining("Start Date", StartDateVeriPg);
		assertContaining("End Date", EndDateVeriPg);
		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified by", ModifiedByVeriPg);

		waitABit(1000);
		assertContaining(Team, TeamEntryAddEdit);
		assertContaining(Cap, CapEntryAddEdit);
		assertContaining(Purpose, PurposeEntryAddEdit);
		assertContaining(StartDate, StartdateEntryAddEdit);
		assertContaining(EndDate, EnddateEntryAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[1]")
	public WebElementFacade TeamTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[2]")
	public WebElementFacade PurposeTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[2]")
	public WebElementFacade CapacityTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17305_row1']/td[3]")
	public WebElementFacade StartDateTableEntry;

	public void VerifyContentsOfRowInTable(String Team, String Purpose, String Capacity, String StartDate)
			throws Exception {
		assertContaining(Team, TeamTableEntry);
		assertContaining(Purpose, PurposeTableEntry);
		assertContaining(Capacity, CapacityTableEntry);
		assertContaining("", StartDateTableEntry);
	}

	public void VerifyActivityAreaTeamList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDTeam, ADDPurpose, ADDCapacity, ADDStartDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITTeam, EDITPurpose, EDITCapacity, EDITStartDate);
		}
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains(
				"https://vcmis.mat.meganexus.com/neo_1_0/mis/index/1345/2275/3385/activityArea/view?mobjectId=195153");
	}

	// -------------------sorting-------------------------//

	public void ClickOnJMESA() throws Exception {
		TeamTable.click();
		StartDateTable.click();
		EndDateTable.click();
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[1]/h3")
	public WebElementFacade Filters;

	@FindBy(xpath = ".//*[@id='team_misJmesa_18505']")
	public WebElementFacade TeamFilter;
	@FindBy(xpath = ".//*[@id='startDate_misJmesa_18505']")
	public WebElementFacade StartDateFilter;

	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[1]/div/fieldset/div[3]/div/button[1]")
	public WebElementFacade SearchBttnFilter;
	@FindBy(xpath = ".//*[@id='misJmesa_18505']/div[1]/div/fieldset/div[3]/div/button[2]")
	public WebElementFacade ResetBttnFilter;

	public void FilterResults(String Team, String StartDate) throws Exception {
		Filters.click();
		if (Team.length() > 0) {
			System.out.println("Filter for Team set");
			TeamFilter.clear();
			TeamFilter.sendKeys(Team);
		}
		if (StartDate.length() > 0) {
			System.out.println("Filter for Start date set");
			StartDateFilter.clear();
			StartDateFilter.sendKeys(StartDate);
		}
		SearchBttnFilter.click();
		waitABit(2000);

	}

}
