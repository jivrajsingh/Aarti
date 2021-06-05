package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityDirectorySpecialismPage;
import com.meganexus.mis.stepLib.ActivityDirectoryCertificationSteps;
import com.meganexus.mis.stepLib.ActivityDirectorySpecialismSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ActivityDirectorySpecialism {

	@Steps
	Loginstep loginstep;
	ActivityDirectorySpecialismSteps act;
	XlsReader XlsReader;
	ActivityDirectorySpecialismPage AAP;
	ActivityDirectoryCertificationSteps Cert;
	
	@When("^I Click on Activity Directory top tab$")
	public void i_Click_on_Activity_Directory_top_tab() throws Throwable {
		Cert.clickActivityDirectoryTopTab();
		System.out.println("Tab was clicked_ Subhajit");
	}

	@Then("^It navigates to Activity Directory page$")
	public void it_navigates_to_Activity_Directory_page() throws Throwable {
		act.clickActivityDirectorySIDETAB();
		act.intialVerificationForm();
	}

	@Then("^I click on Add Specialisms button to add Specialisms definition$")
	public void i_click_on_Add_Specialisms_button_to_add_Specialisms_definition() throws Throwable {
		act.clickADDSpecialismSIDETAB();
	}

	@Then("^I fill the add Specialisms definition form$")
	public void i_fill_the_add_Specialisms_definition_form() throws Throwable {
		act.FillAddForm();
	}

	@Then("^verify the newly added record under Specialisms definition table$")
	public void verify_the_newly_added_record_under_Specialisms_definition_table() throws Throwable {
		act.verifyTable("Add");
		XlsReader.setCellData("SPECIALISMS", "Record Added?", AAP.row, "Yes");
	}

	@Then("^I filter and click view button on row \"([^\"]*)\" of Specialisms definition table$")
	public void i_click_view_button_on_row_of_Specialisms_definition_table(String arg1) throws Throwable {
		act.sortByFilters("Edit");
	}

	@Then("^verify the Specialisms definition form$")
	public void verify_the_Specialisms_definition_form() throws Throwable {
		act.VerifyARecordAfterAdd("Add");
	}

	@Then("^I filter and click edit button on row \"([^\"]*)\" of Specialisms definition table$")
	public void i_click_edit_button_on_row_of_Specialisms_definition_table(String arg1) throws Throwable {
		act.sortByFilters("Add");
	}

	@Then("^I edit Specialisms definition form$")
	public void i_edit_Specialisms_definition_form() throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the edited record under Specialisms definition table$")
	public void verify_the_edited_record_under_Specialisms_definition_table() throws Throwable {
		act.verifyTable("Edit");
	}

	@Then("^verify the entire Specialisms definition table contents$")
	public void verify_the_entire_Specialisms_definition_table_contents() throws Throwable {
		act.verifyTable("Edit");
		XlsReader.setCellData("SPECIALISMS", "Successfully updated?", AAP.row, "Yes");
	}

}
