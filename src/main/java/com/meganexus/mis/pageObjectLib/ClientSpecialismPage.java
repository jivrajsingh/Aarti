package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ClientSpecialismPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("ClientSpecialism", 2, "No");

	public String ADDSpecialism = XlsReader.getCellData("ClientSpecialism", 0, row);
	public String ADDSkillLevel = XlsReader.getCellData("ClientSpecialism", 1, row);

	public String EDITSpecialism = "Cardiff Specialism 2";
	public String EDITSkillLevel = "ab";

	// Navigate To CLIENTS Main Page
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[1]/a[text()= 'Clients']")
	public WebElementFacade ClientsSubTopTab;

	public void NavigateToCLIENTSMainPage() {
		nt.NavigateToClientsMainTab();
		waitABit(3000);
		ClientsSubTopTab.click();
		waitABit(1000);
	}
	// Navigate to Qualifications sub-top tab page

	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[15]/a")
	public WebElementFacade QualificationsSubTopTab;

	public void clickOnQualificationsSubTopTab() {
		QualificationsSubTopTab.click();
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
	@FindBy(xpath = ".//*[@id='m17845_moduleElement']/h1")
	public WebElementFacade ClientSpecialismsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17845_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17845_s_0_specialism']")
	public WebElementFacade SpecialismTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17845_s_1_skillLevel']")
	public WebElementFacade SkillLevelsTable;

	@FindBy(xpath = ".//*[@id='misJmesa_17845']/div/table[2]/thead/tr/td[3]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17845']/div/table[2]/thead/tr/td[4]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		assertContaining("Client Specialisms", ClientSpecialismsTableHeader);// Activity
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

		assertContaining("Specialism", SpecialismTable);
		assertContaining("Skill Level", SkillLevelsTable);

		assertContaining("View", ViewTable);
		assertContaining("Edit", EditTable);

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Qualification SIDE TAB
	public void clickADDSpecialismSIDETAB() throws Exception {
		AddSpecialismSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17845_row1']/td[4]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17885_moduleElement']/h1")
	public WebElementFacade AddEditClientSpecialism;
	@FindBy(xpath = ".//*[@id='form_17595']/fieldset/div[1]/label")
	public WebElementFacade ClientSpecialismNameAddForm;
	@FindBy(xpath = ".//*[@id='form_17595']/fieldset/div[2]/label")
	public WebElementFacade SkillLevelAddForm;

	@FindBy(xpath = ".//*[@id='form_17595']/fieldset/div[4]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17595']/fieldset/div[4]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		assertContaining("Add/Edit Client Specialism", AddEditClientSpecialism);// Table
																								// title

		assertContaining("Client Specialism Name*", ClientSpecialismNameAddForm);
		assertContaining("Skill Level*", SkillLevelAddForm);

		assertContaining("Save", SaveAddForm);
		assertContaining("Cancel", CancelAddForm);
	}

	@FindBy(xpath = ".//*[@id='m17885_formElement_174175']")
	public WebElementFacade ClientSpecNameAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17885_formElement_174185']")
	public WebElementFacade SkillLevelAddFormDDL;

	public void FillAddEditSpecialismForm(String ClientSpecName, String SkillLevel) throws Exception {

		if (ClientSpecName.length() > 0) {
			selectFromDropdown(ClientSpecNameAddFormDDL, ClientSpecName);
		} else {
			System.out.println("No ClientSpecName");
		}

		if (SkillLevel.length() > 0) {
			selectFromDDL(SkillLevelAddFormDDL, SkillLevel,0);
		} else {
			System.out.println("No SkillLevel");
		}

		SaveAddForm.click();
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17845_row1']/td[3]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17915_moduleElement']/h1")
	public WebElementFacade ViewClientSpecialismPageHeader;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[1]/label")
	public WebElementFacade SpecialismNameVeriPg;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[2]/label")
	public WebElementFacade SkillLevelVeriPg;

	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[3]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[5]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[4]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[6]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[1]/p")
	public WebElementFacade SpcialismNameAddEdit;
	@FindBy(xpath = ".//*[@id='m17915_view-content']/div[2]/p")
	public WebElementFacade SkillLevelAddEdit;

	public void VerifyVIEWSpecialismPage(String ClientSpecName, String SkillLevel) throws Exception {
		assertContaining("View Client Specialism", ViewClientSpecialismPageHeader);
		assertContaining("Specialism Name", SpecialismNameVeriPg);
		assertContaining("Skill Level", SkillLevelVeriPg);

		assertContaining("Date Created", DateCreatedVeriPg);
		assertContaining("Date Modified", DateModifiedVeriPg);
		assertContaining("Created By", CreatedByVeriPg);
		assertContaining("Modified By", ModifiedByVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(ClientSpecName, SpcialismNameAddEdit);
		assertContaining(SkillLevel, SkillLevelAddEdit);

	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17845_row1']/td[1]")
	public WebElementFacade SpecialismTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17845_row1']/td[2]")
	public WebElementFacade SkillLevelTableEntry;

	public void VerifyContentsOfRowInTable(String ClientSpecName, String SkillLevel) throws Exception {
		assertContaining(ClientSpecName, SpecialismTableEntry);
		assertContaining(SkillLevel, SkillLevelTableEntry);
	}

	public void VerifyClientSpecialismList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDSpecialism, ADDSkillLevel);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITSpecialism, EDITSkillLevel);
		}
	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		SpecialismTable.click();
		SkillLevelsTable.click();
	}
}
