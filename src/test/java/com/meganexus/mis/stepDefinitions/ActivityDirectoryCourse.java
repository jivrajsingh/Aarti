package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryCoursesPage;
import com.meganexus.mis.stepLib.ActivityDirectoryCertificationSteps;
import com.meganexus.mis.stepLib.ActivityDirectoryCourseSteps;
import com.meganexus.mis.stepLib.ActivityDirectoryQualificationSteps;
import com.meganexus.mis.stepLib.ActivityDirectorySpecialismSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ActivityDirectoryCourse {

	@Steps
	Loginstep loginstep;
	ActivityDirectoryCourseSteps act;
	ActivityDirectoryQualificationSteps QuaSt;
	ActivityDirectorySpecialismSteps SpecSt;
	ActivityDirectoryCertificationSteps Cert;
	XlsReader XlsReader;
	ActivityDirectoryCoursesPage AAP;

	@When("^I Click on Activity directory top tab$")
	public void i_Click_on_Activity_directory_top_tab() throws Throwable {
		Cert.clickActivityDirectoryTopTab();
	}

	@When("^It navigates to Activity directory page$")
	public void it_navigates_to_Activity_directory_page() throws Throwable {
		act.clickActivityDirectorySIDETAB();
		QuaSt.intialVerificationForm();
		SpecSt.intialVerificationForm();
		Cert.intialVerificationForm();
		act.intialVerificationForm();
	}

	@Then("^I click on Add Courses button to add Courses$")
	public void i_click_on_Add_Courses_button_to_add_Courses() throws Throwable {
		act.clickADDCourseSIDETAB();
	}

	@Then("^I fill the add Courses form$")
	public void i_fill_the_add_Courses_form() throws Throwable {
		act.FillAddForm();
	}

	@Then("^verify the newly added record under Courses table$")
	public void verify_the_newly_added_record_under_Courses_table() throws Throwable {
		act.verifyTable("Add");
		XlsReader.setCellData("COURSES", "Record Added?", AAP.row, "Yes");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Courses table$")
	public void i_click_view_button_on_row_of_Courses_table(String arg1) throws Throwable {
		act.sortByFilters("Edit");
	}

	@Then("^verify the Courses form$")
	public void verify_the_Courses_form() throws Throwable {
		act.VerifyARecordAfterAdd("Edit");
	}

	@Then("^I filter and click edit button on row \"([^\"]*)\" of Courses table$")
	public void i_click_edit_button_on_row_of_Courses_table(String arg1) throws Throwable {
		act.sortByFilters("Add");
	}

	@Then("^I edit Courses form$")
	public void i_edit_Courses_form() throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the edited record under Courses table$")
	public void verify_the_edited_record_under_Courses_table() throws Throwable {
		act.verifyTable("Edit");
	}

	@Then("^verify the entire Courses table contents$")
	public void verify_the_entire_Courses_table_contents() throws Throwable {
		act.verifyTable("Edit");
		XlsReader.setCellData("COURSES", "Successfully updated?", AAP.row, "Yes");
	}

	@Then("^I select values to filter results for Courses$")
	public void i_select_values_to_filter_results_for_Courses() throws Throwable {
		act.sortByFilters("Add");
	}

	@Then("^I click on JMESA to sort results for Courses$")
	public void i_click_on_JMESA_to_sort_results_for_Courses() throws Throwable {
		act.clickJMESA();
	}

	@Then("^I select values to filter results for Qualifications$")
	public void i_select_values_to_filter_results_for_Qualifications() throws Throwable {
		QuaSt.sortByFilters("Add");
	}

	@Then("^I click on JMESA to sort results for Qualifications$")
	public void i_click_on_JMESA_to_sort_results_for_Qualifications() throws Throwable {
		QuaSt.clickJMESA();
	}

	@Then("^I select values to filter results for Specialisms definition$")
	public void i_select_values_to_filter_results_for_Specialisms_definition() throws Throwable {
		SpecSt.sortByFilters("");// Just verify table and not the entries
	}

	@Then("^I click on JMESA to sort results for Specialisms definition$")
	public void i_click_on_JMESA_to_sort_results_for_Specialisms_definition() throws Throwable {
		SpecSt.clickJMESA();
	}

	@Then("^I click on Add Specialisms, Add Course and Add Qualification button an return to Activity directory home page after evry activity$")
	public void i_click_on_Add_Specialisms_Add_Course_and_Add_Qualification_button_an_return_to_Activity_directory_home_page_after_evry_activity()
			throws Throwable {
		act.clickADDRetunHomepage();
		QuaSt.clickADDRetunHomepage();
		SpecSt.clickADDRetunHomepage();
	}
}
