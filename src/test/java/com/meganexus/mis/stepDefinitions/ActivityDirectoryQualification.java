package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryQualificationPage;
import com.meganexus.mis.stepLib.ActivityDirectoryQualificationSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ActivityDirectoryQualification {

	@Steps
	Loginstep loginstep;
	ActivityDirectoryQualificationSteps act;
	XlsReader XlsReader;
	ActivityDirectoryQualificationPage AAP;
	
	@Then("^I click on Add Qualifications definition button to add Qualifications definition$")
	public void i_click_on_Add_Qualifications_definition_button_to_add_Qualifications_definition() throws Throwable {
		act.clickADDQualificationSIDETAB();
	}

	@Then("^I fill the add Qualifications definition form$")
	public void i_fill_the_add_Qualifications_definition_form() throws Throwable {
		act.FillAddForm();
	}

	@Then("^verify the newly added record under Qualifications definition table$")
	public void verify_the_newly_added_record_under_Qualifications_definition_table() throws Throwable {
		act.sortByFilters("Add");
		act.verifyTable("Add");
		XlsReader.setCellData("QUALIFICATIONS","Record Added?", AAP.row, "Yes");
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Qualifications definition table$")
	public void i_click_edit_button_on_row_of_Qualifications_definition_table(String arg1) throws Throwable {
		System.out.println("next step");
	}

	@Then("^I edit Qualifications definition form$")
	public void i_edit_Qualifications_definition_form() throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the edited record under Qualifications definition table$")
	public void verify_the_edited_record_under_Qualifications_definition_table() throws Throwable {
		act.verifyTable("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Qualifications definition table$")
	public void i_click_view_button_on_row_of_Qualifications_definition_table(String arg1) throws Throwable {
		act.VerifyARecordAfterAdd("Edit");
	}

	@Then("^verify the Qualifications definition form$")
	public void verify_the_Qualifications_definition_form() throws Throwable {
		System.out.println("next step");
	}

	@Then("^verify the entire Qualifications definition table contents$")
	public void verify_the_entire_Qualifications_definition_table_contents() throws Throwable {
		act.verifyTable("Edit");
		XlsReader.setCellData("QUALIFICATIONS","Successfully updated?", AAP.row, "Yes");
	}

}
