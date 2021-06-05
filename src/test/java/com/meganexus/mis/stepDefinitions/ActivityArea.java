package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;
import com.meganexus.mis.stepLib.ActivityAreaSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ActivityArea {
	@Steps
	Loginstep loginstep;
	ActivityAreaSteps act;
	XlsReader XlsReader;
	ActivityAreaPage AAP;

	@Given("^As an user i will open MIS login page$")
	public void as_an_user_i_will_open_MIS_login_page() throws Throwable {
		System.out.println("Open to app");
		loginstep.OpenApp();

	}

	@When("^I provide correct credentials$")
	public void i_provide_correct_credentials() throws Throwable {
		System.out.println("Crendetials to app");
	}

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("User is on landing page");
	}

	@When("^I Click on Activity Area top tab$")
	public void i_Click_on_Activity_Area_top_tab() throws Throwable {
		act.clickActivityAreaTopTab();
	}

	@When("^It navigates to Activity Area page$")
	public void it_navigates_to_Activity_Area_page() throws Throwable {
		act.clickActivityAreaSIDETab();
		act.intialVerificationForm();
	}

	@Then("^I click on Add Activity Area button to add Activity Area$")
	public void i_click_on_Add_Activity_Area_button_to_add_Activity_Area() throws Throwable {
		act.clickADDActivityAreaSIDETAB();
	}

	@Then("^I fill the add Activity Area form$")
	public void i_fill_the_add_Activity_Area_form() throws Throwable {
		act.FillAddForm();
	}

	@Then("^verify the newly added record under Activity Area table$")
	public void verify_the_newly_added_record_under_Activity_Area_table() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Add");
		System.out.println("SUCCESSFUL -verify the newly added record under Activity Area table");
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Activity Area table$")
	public void i_click_edit_button_on_row_of_Activity_Area_table(String arg1) throws Throwable {
		System.out.println("next step");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Activity Area table$")
	public void i_view_edit_button_on_row_of_Activity_Area_table(String arg1) throws Throwable {
		System.out.println("next step");
	}

	@Then("^I edit Activity Area form$")
	public void i_edit_Activity_Area_form() throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the edited record under Activity Area table$")
	public void verify_the_edited_record_under_Activity_Area_table() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	@Then("^verify the Activity Area form$")
	public void verify_the_Activity_Area_form() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	@Then("^verify the entire Activity Area table contents$")
	public void verify_the_entire_Activity_Area_table_contents() throws Throwable {
		act.verifyTable("Edit");
		// XlsReader.setCellData("ActArCourse", "Successfully updated?",
		// AAP.row, "Yes");
		// because Allocated client is dependent on this. Thats why cant 'yes'
		// this row because Allocated Client is dependent
	}

	@Then("^I click on JMESA to sort results for Activity Area$")
	public void i_click_on_JMESA_to_sort_results_for_Activity_Area() throws Throwable {
		act.clickOnJMESA();
	}

	@Then("^I click on Add Activity Area button to add Activity Area and return to home page of Activity Area$")
	public void i_click_on_Add_Activity_Area_button_to_add_Activity_Area_and_return_to_home_page_of_Activity_Area()
			throws Throwable {
		act.clickAddReturnToHomePage();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Activity Area table and return to home page of Activity Area$")
	public void i_click_edit_button_on_row_of_Activity_Area_table_and_return_to_home_page_of_Activity_Area(String arg1)
			throws Throwable {
		act.clickEditReturnToHomePage();
	}

	@Then("^I click view button on row \"([^\"]*)\" of Activity Area table and return to home page of Activity Area$")
	public void i_click_view_button_on_row_of_Activity_Area_table_and_return_to_home_page_of_Activity_Area(String arg1)
			throws Throwable {
		act.clickViewReturnToHomePage();
	}

}
