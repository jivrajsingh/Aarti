package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryCertificationPage;
import com.meganexus.mis.pageObjectLib.ActivityDirectoryCoursesPage;
import com.meganexus.mis.stepLib.ActivityAreaTeamSteps;
import com.meganexus.mis.stepLib.ActivityDirectoryCertificationSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ActivityDirectoryCertification {
	@Steps
	Loginstep loginstep;
	ActivityDirectoryCertificationSteps act;
	XlsReader XlsReader;
	ActivityDirectoryCertificationPage AAP;

	@Then("^I click on Add Certifications button to add Certifications definition$")
	public void i_click_on_Add_Certifications_button_to_add_Certifications_definition() throws Throwable {
		act.clickADDCertificationSIDETAB();
	}

	@Then("^I fill the add Certifications form$")
	public void i_fill_the_add_Certifications_form() throws Throwable {
		act.FillAddForm();
	}

	@Then("^verify the newly added record under Certification table$")
	public void verify_the_newly_added_record_under_Certification_table() throws Throwable {
		act.FilterResults("Add");
		act.verifyTable("Add");
		XlsReader.setCellData("CERTIFICATIONS", "Record Added?", AAP.row, "Yes");
	}

	@Then("^I filter and click view button on row \"([^\"]*)\" of Certification table$")
	public void i_click_view_button_on_row_of_Certification_table(String arg1) throws Throwable {
		act.FilterResults("Edit");
	}

	@Then("^verify the Certifications form$")
	public void verify_the_Certifications_form() throws Throwable {
		act.VerifyARecordAfterAdd("Add");
	}

	@Then("^I filter and click edit button on row \"([^\"]*)\" of Certifications table$")
	public void i_click_edit_button_on_row_of_Certifications_table(String arg1) throws Throwable {
		act.FilterResults("Add");
	}

	@Then("^I edit Certifications form$")
	public void i_edit_Certifications_form() throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the edited record under Certification table$")
	public void verify_the_edited_record_under_Certification_table() throws Throwable {
		act.verifyTable("Edit");
	}

	@Then("^verify the entire Certification table contents$")
	public void verify_the_entire_Certification_table_contents() throws Throwable {
		act.verifyTable("Edit");
		XlsReader.setCellData("CERTIFICATIONS", "Successfully updated?", AAP.row, "Yes");
	}

	@Then("^I select values to filter results for Certification$")
	public void i_select_values_to_filter_results_for_Certification() throws Throwable {
		act.FilterResults("");
	}

	@Then("^I click on JMESA to sort results for Certification$")
	public void i_click_on_JMESA_to_sort_results_for_Certification() throws Throwable {
		act.clickJMESA();
	}

}
