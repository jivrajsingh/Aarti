package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ClientsAssessmentPage extends GenericPage {

	// read from excel sheet

	public String ADDAssessType = "Activities Assessment";
	public String ADDAssessComplDate = "27/06/2017";

	public String EDITAssessType = "Activities Assessment";
	public String EDITAssessComplDate = "27/06/2020";

	// Navigate to Assessment sub-top tab page

	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[17]/a")
	public WebElementFacade MWAssessmentsSubTopTab;

	public void clickOnAssessmentsSubTopTab() {
		MWAssessmentsSubTopTab.click();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li/a/span")
	public WebElementFacade AddAssessmentSideTab;

	public void verifySidetabs() throws Exception {
		Assert.assertEquals("Clients", ClientsSideTab.getText());
		Assert.assertEquals("Add Assessment", AddAssessmentSideTab.getText());
	}

	/**
	 * Verification of all elements on Assessment Table.
	 */
	@FindBy(xpath = ".//*[@id='m17645_moduleElement']/h1")
	public WebElementFacade AllAssessmentsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17645_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[1]")
	public WebElementFacade AssessmentNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[2]")
	public WebElementFacade DateCompletedTable;

	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[4]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17695']/div/table[2]/thead/tr/td[5]")
	public WebElementFacade EditTable;

	public void verifyForm() throws Exception {

		Assert.assertEquals("All Assessments", AllAssessmentsTableHeader.getText());// Activity
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

		Assert.assertEquals("Assessment Name", AssessmentNameTable.getText());
		Assert.assertEquals("Date Completed", DateCompletedTable.getText());

		Assert.assertEquals("View", ViewTable.getText());
		Assert.assertEquals("Edit", EditTable.getText());

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Assessment SIDE TAB
	public void clickADDAssessmentSIDETAB() throws Exception {
		AddAssessmentSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='misJmesa_17645_row1']/td[4]/a")
	public WebElementFacade editRow;

	public void clickEDITButton() throws Exception {
		editRow.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17655_moduleElement']/h1")
	public WebElementFacade AddModifyAllocation;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[1]/label")
	public WebElementFacade SelectAssessmentTypeAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[2]/label")
	public WebElementFacade AssessmentCompletedDateAddForm;

	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[4]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[4]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		Assert.assertEquals("Add/Modify Assessment", AddModifyAllocation.getText());// Table
																					// title

		Assert.assertEquals("Select Assessment Type*", SelectAssessmentTypeAddForm.getText());
		Assert.assertEquals("Assessment Completed Date", AssessmentCompletedDateAddForm.getText());

		Assert.assertEquals("Save", SaveAddForm.getText());
		Assert.assertEquals("Cancel", CancelAddForm.getText());
	}

	@FindBy(xpath = ".//*[@id='m17655_formElement_171755']")
	public WebElementFacade SelectAssessmentTypeAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_173285']")
	public WebElementFacade AssessmentCompletedDateAddFormDDL;

	public void FillAddEditAssessmentForm(String AssessType, String AssessComplDate) throws Exception {

		if (AssessType.length() > 0) {
			selectFromDropdown(SelectAssessmentTypeAddFormDDL, AssessType);

			if (AssessType.contains("Activities Assessment"))
				AssessmentTypeACTIVITIES_ExtendedForm();

			else if (AssessType.contains("BKSB"))
				AssessmentTypeBSKB_ExtendedForm();

			else if (AssessType.contains("Do-It Profiler"))
				AssessmentTypeDOitPROFILER_ExtendedForm();
		} else {
			System.out.println("No IncentiveType");
		}

		if (AssessComplDate != "No") {
			AssessmentCompletedDateAddFormDDL.clear();
			AssessmentCompletedDateAddFormDDL.sendKeys(AssessComplDate);
		} else {
			System.out.println("No AssessComplDate");
		}

		SaveAddForm.click();
	}

	// Assessment Types -

	// 1.Activities Assessment
	@FindBy(xpath = ".//*[@id='m17655_formElement_171885']")
	public WebElementFacade ActivitiesAssessmentAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[3]/label")
	public WebElementFacade LearningStyleAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[4]/label")
	public WebElementFacade LITScoreAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[5]/label")
	public WebElementFacade NUMScoreAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[6]/label")
	public WebElementFacade DyslexiaScoreAddForm;

	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[1]/p")
	public WebElementFacade LearningStyleAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[2]/p")
	public WebElementFacade LITScoreAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[3]/p")
	public WebElementFacade NUMScoreAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[4]/p")
	public WebElementFacade DyslexiaScoreAddFormDDL;

	public void AssessmentTypeACTIVITIES_ExtendedForm() {

		Assert.assertEquals("Learning Style", ActivitiesAssessmentAddForm.getText());
		Assert.assertEquals("Initial Assessment LIT Score", LearningStyleAddForm.getText());
		Assert.assertEquals("Initial Assessment NUM Score", LITScoreAddForm.getText());
		Assert.assertEquals("Select Assessment Type*", NUMScoreAddForm.getText());
		Assert.assertEquals("Initial Assessment Dyslexia Score", DyslexiaScoreAddForm.getText());

		selectFromDropdown(LearningStyleAddFormDDL, "V");
		selectFromDropdown(LITScoreAddFormDDL, "PE");
		selectFromDropdown(NUMScoreAddFormDDL, "E1");
		selectFromDropdown(DyslexiaScoreAddFormDDL, "1");

	}

	// 2.BKSB
	// BSKB
	@FindBy(xpath = ".//*[@id='m17655_formElement_172695']")
	public WebElementFacade BKSBAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[3]/label")
	public WebElementFacade MathsAssessAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[4]/label")
	public WebElementFacade EnglishAssessAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[5]/label")
	public WebElementFacade EnglishWalesAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[6]/label")
	public WebElementFacade MathsWalesAddForm;

	@FindBy(xpath = ".//*[@id='m17655_formElement_172715']")
	public WebElementFacade MathsAssessAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_172725']")
	public WebElementFacade EnglishAssessAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_172745']")
	public WebElementFacade EnglishWalesAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_172755']")
	public WebElementFacade MathsWalesAddFormDDL;

	// ESOL
	@FindBy(xpath = ".//*[@id='m17655_formElement_172765']")
	public WebElementFacade ESOLAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[8]/label")
	public WebElementFacade ListeningAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[9]/label")
	public WebElementFacade ReadingAddForm;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[10]/label")
	public WebElementFacade WritingAddForm;

	@FindBy(xpath = ".//*[@id='m17655_formElement_172785']")
	public WebElementFacade ListeningAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_172815']")
	public WebElementFacade ReadingAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_172835']")
	public WebElementFacade WritingAddFormDDL;

	public void AssessmentTypeBSKB_ExtendedForm() {
		// BSKB
		Assert.assertEquals("BKSB", BKSBAddForm.getText());
		Assert.assertEquals("Maths Initial Assessment", MathsAssessAddForm.getText());
		Assert.assertEquals("English Initial Assessment", EnglishAssessAddForm.getText());
		Assert.assertEquals("English (Wales)", EnglishWalesAddForm.getText());
		Assert.assertEquals("Maths (Wales)", MathsWalesAddForm.getText());

		selectFromDropdown(MathsAssessAddFormDDL, "E1");
		selectFromDropdown(EnglishAssessAddFormDDL, "E1");
		selectFromDropdown(EnglishWalesAddFormDDL, "E1");
		selectFromDropdown(MathsWalesAddFormDDL, "E1");

		// ESOL
		Assert.assertEquals("ESOL", ESOLAddForm.getText());
		Assert.assertEquals("ESOL Listening", ListeningAddForm.getText());
		Assert.assertEquals("ESOL Reading", ReadingAddForm.getText());
		Assert.assertEquals("ESOL Writing", WritingAddForm.getText());

		selectFromDropdown(ListeningAddFormDDL, "E1");
		selectFromDropdown(ReadingAddFormDDL, "E1");
		selectFromDropdown(WritingAddFormDDL, "E1");

	}
	// 3. WEST

	// 4.Do it Profiler
	@FindBy(xpath = ".//*[@id='m17655_formElement_173175']")
	public WebElementFacade DoitProfilerVeriPg;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[3]/label")
	public WebElementFacade ReadWriteSkillsVeriPg;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[4]/label")
	public WebElementFacade SocialCommunSkillsVeriPg;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[5]/label")
	public WebElementFacade AttentionCommunSkillsVeriPg;
	@FindBy(xpath = ".//*[@id='form_17545']/fieldset/div[6]/label")
	public WebElementFacade CoordiOrginztnSkillsVeriPg;

	@FindBy(xpath = ".//*[@id='m17655_formElement_173185']")
	public WebElementFacade ReadWriteSkillsAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_173195']")
	public WebElementFacade SocialCommunSkillsAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_173205']")
	public WebElementFacade AttentionCommunSkillsAddFormDDL;
	@FindBy(xpath = ".//*[@id='m17655_formElement_173215']")
	public WebElementFacade CoordiOrginztnSkillsAddFormDDL;

	public void AssessmentTypeDOitPROFILER_ExtendedForm() {

		Assert.assertEquals("Do-It Profiler", DoitProfilerVeriPg.getText());
		Assert.assertEquals("Reading and Writing Skills", ReadWriteSkillsVeriPg.getText());
		Assert.assertEquals("Social and Communication Skills", SocialCommunSkillsVeriPg.getText());
		Assert.assertEquals("Attention and Communication Skills", AttentionCommunSkillsVeriPg.getText());
		Assert.assertEquals("Coordination and Organisational Skills", CoordiOrginztnSkillsVeriPg.getText());

		selectFromDropdown(ReadWriteSkillsAddFormDDL, "1");
		selectFromDropdown(SocialCommunSkillsAddFormDDL, "1");
		selectFromDropdown(AttentionCommunSkillsAddFormDDL, "1");
		selectFromDropdown(CoordiOrginztnSkillsAddFormDDL, "1");

	}

	// 5. Target Skills

	// 6. Self-smart

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17645_row1']/td[3]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		viewRow.click();
	}

	@FindBy(xpath = ".//*[@id='m17765_moduleElement']/h1")
	public WebElementFacade ViewAssessmentPageHeader;

	// 1.Activities Assessment
	@FindBy(xpath = "")
	public WebElementFacade ActiAssessTitleVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[2]/label")
	public WebElementFacade AssessNameVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[3]/label")
	public WebElementFacade LearningStyleVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[4]/label")
	public WebElementFacade LITScoreVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[5]/label")
	public WebElementFacade NUMScoreVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[6]/label")
	public WebElementFacade DyslexiaScoreVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[7]/label")
	public WebElementFacade DateCompleteVeriPg;

	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[8]/label")
	public WebElementFacade DateCreatedVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[10]/label")
	public WebElementFacade DateModifiedVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[9]/label")
	public WebElementFacade CreatedByVeriPg;
	@FindBy(xpath = ".//*[@id='m17685_view-content']/div[11]/label")
	public WebElementFacade ModifiedByVeriPg;

	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[1]/p")
	public WebElementFacade AssessNameAddEdit;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[2]/p")
	public WebElementFacade LearningStyleAddEdit;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[3]/p")
	public WebElementFacade LITScoreAddEdit;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[4]/p")
	public WebElementFacade NUMScoreAddEdit;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[5]/p")
	public WebElementFacade DyslexiaScoreAddEdit;
	@FindBy(xpath = ".//*[@id='m17765_view-content']/div[6]/p")
	public WebElementFacade DateCompleteAddEdit;

	public void VerifyVIEWAssessmentPage(String AssessType, String AssessComplDate) throws Exception {
		Assert.assertEquals("View Assessment", ViewAssessmentPageHeader.getText());
		Assert.assertEquals("Activities Assessment", ActiAssessTitleVeriPg.getText());
		Assert.assertEquals("Assessment Name", AssessNameVeriPg.getText());
		Assert.assertEquals("Learning Style", LearningStyleVeriPg.getText());
		Assert.assertEquals("Initial Assessment LIT Score", LITScoreVeriPg.getText());
		Assert.assertEquals("Initial Assessment NUM Score", NUMScoreVeriPg.getText());
		Assert.assertEquals("Initial Assessment Dyslexia Score", DyslexiaScoreVeriPg.getText());
		Assert.assertEquals("Date Completed", DateCompleteVeriPg.getText());

		Assert.assertEquals("Date Created", DateCreatedVeriPg.getText());
		Assert.assertEquals("Date Modified", DateModifiedVeriPg.getText());
		Assert.assertEquals("Created By", DateModifiedVeriPg.getText());
		Assert.assertEquals("Modified By", DateModifiedVeriPg.getText());

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		if (AssessType.contains("Activities Assessment")) {
			Assert.assertEquals(AssessType, AssessNameAddEdit.getText());
			Assert.assertEquals("V", LearningStyleAddEdit.getText());
			Assert.assertEquals("PE", LITScoreAddEdit.getText());
			Assert.assertEquals("E1", NUMScoreAddEdit.getText());
			Assert.assertEquals("1", DyslexiaScoreAddEdit.getText());
		}
		Assert.assertEquals(AssessComplDate, DateCompleteAddEdit.getText());
	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17645_row1']/td[1]")
	public WebElementFacade AssessNameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17645_row1']/td[2]")
	public WebElementFacade DateCompletedTableEntry;

	public void VerifyContentsOfRowInTable(String AssessType, String AssessComplDate) throws Exception {
		Assert.assertEquals(AssessType, AssessNameTableEntry.getText());
		Assert.assertEquals(AssessComplDate, DateCompletedTableEntry.getText());
	}

	public void VerifyClientAssessmentList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDAssessType, ADDAssessComplDate);
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITAssessType, EDITAssessComplDate);
		}
	}

	// -------------------Filters-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_17645']/div[1]/h3")
	public WebElementFacade FILTERS;
	@FindBy(xpath = ".//*[@id='assessmentName_misJmesa_17645']")
	public WebElementFacade AssessmentNameFilters;
	@FindBy(xpath = ".//*[@id='dateCompleted_misJmesa_17645']")
	public WebElementFacade DateCompletedFilters;

	@FindBy(xpath = ".//*[@id='misJmesa_17645']/div[1]/div/fieldset/div[3]/div/button[1]")
	public WebElementFacade SearchFilterBtn;
	@FindBy(xpath = ".//*[@id='misJmesa_17645']/div[1]/div/fieldset/div[3]/div/button[2]")
	public WebElementFacade ResetFilterBtn;

	public void sortWithFilters(String AddOrEdit, String AssessmentName, String DateCompl) throws Exception {
		FILTERS.click();

		if (AssessmentName.length() > 0) {
			AssessmentNameFilters.clear();
			AssessmentNameFilters.sendKeys(AssessmentName);
			SearchFilterBtn.click();
			waitABit(3000);
			VerifyClientAssessmentList(AddOrEdit);
			ResetFilterBtn.click();
		} else
			System.out.println("Not required");

		if (DateCompl.length() > 0) {
			DateCompletedFilters.clear();
			DateCompletedFilters.sendKeys(DateCompl);
			SearchFilterBtn.click();
			waitABit(3000);
			VerifyClientAssessmentList(AddOrEdit);
			ResetFilterBtn.click();
		} else
			System.out.println("Not required");

	}

	// -------------------JMESA-------------------------//

	public void clickOnJMESA() throws Exception {
		AssessmentNameTable.click();
		DateCompletedTable.click();
	}

}
