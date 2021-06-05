package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.AttendanceAbsenceSteps;
import com.meganexus.mis.stepLib.CheckInSteps;
import com.meganexus.mis.stepLib.CheckOutSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AttendanceAbsence {

	@Steps
	AttendanceAbsenceSteps act;
	CheckInSteps ci;
	CheckOutSteps co;

	@Then("^Navigate to Attendance main top-tab$")
	public void navigate_to_Attendance_main_top_tab() throws Throwable {
		act.NavigateToATTENDANCEPage();
	}

	@Given("^User is on Attendance page$")
	public void user_is_on_Attendance_page() throws Throwable {
		act.VerifySIDETab();
		act.intialVerificationForm();
		ci.intialVerificationForm();
		co.intialVerificationForm();
	}

	@When("^I Click on Add Absence Side Tab$")
	public void i_Click_on_Add_Absence_Side_Tab() throws Throwable {
		act.clickABSENCESIDETab();
	}

	@When("^It navigates to Add Absence page$")
	public void it_navigates_to_Add_Absence_page() throws Throwable {
		System.out.println("Next step");
	}

	@Then("^I fill Add Absence form$")
	public void i_fill_Add_Absence_form() throws Throwable {
		act.FillAddForm();
	}

	@When("^I Click to edit on record \"([^\"]*)\" under Absence table$")
	public void i_Click_to_edit_on_record_under_Absence_table(String arg1) throws Throwable {
		act.ClickEditButton();
	}

	@When("^It navigates to edit Absence page$")
	public void it_navigates_to_edit_Absence_page() throws Throwable {
		System.out.println("Next step");
	}

	@Then("^I fill Edit Absence form$")
	public void i_fill_Edit_Absence_form() throws Throwable {
		act.FillEditForm();
	}

	@When("^I Click to view on record \"([^\"]*)\" under Absence table$")
	public void i_Click_to_view_on_record_under_Absence_table(String arg1) throws Throwable {
		System.out.println("Next step");
	}

	@When("^It navigates to view Absence page$")
	public void it_navigates_to_view_Absence_page() throws Throwable {
		System.out.println("Next step");
	}

	@Then("^I verify the view Absence page$")
	public void i_verify_the_view_Absence_page() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	@When("^I Click to archieve on record \"([^\"]*)\" under Absence table$")
	public void i_Click_to_archieve_on_record_under_Absence_table(String arg1) throws Throwable {
		act.ClickArchieveButton();
	}

	@Then("^the record \"([^\"]*)\" under Absence table gets archieved$")
	public void the_record_under_Absence_table_gets_archieved(String arg1) throws Throwable {
		act.ArchiveARecord();
	}

	@Then("^verify the entire Absence table contents$")
	public void verify_the_entire_Absence_table_contents() throws Throwable {
		act.verifyTable("Edit");
	}

	@Then("^It navigates to Add Absence page and return to home page of attendance$")
	public void it_navigates_to_Add_Absence_page_and_return_to_home_page_of_attendance() throws Throwable {
		act.clickAddReturnToHomePage();
	}

	@Then("^I Click to edit on record \"([^\"]*)\" under Absence table and return to home page of attendance$")
	public void i_Click_to_edit_on_record_under_Absence_table_and_return_to_home_page_of_attendance(String arg1)
			throws Throwable {
		act.clickEditReturnToHomePage();
	}

	@Then("^Verify the newly added record in Absence form$")
	public void verify_the_newly_added_record_in_Absence_form() throws Throwable {
		act.filter("Add");
		act.VerifyARecordAfterAddorEdit("Add");
	}

	@Then("^Verify the newly edited record in Absence form$")
	public void verify_the_newly_edited_record_in_Absence_form() throws Throwable {
		act.filter("Edit");
		act.VerifyARecordAfterAddorEdit("Edit");
	}

}
