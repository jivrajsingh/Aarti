package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.ActivityAreaAllocateClientSteps;
import com.meganexus.mis.stepLib.ActivityAreaRequiredSpecialismSteps;
import com.meganexus.mis.stepLib.ActivityAreaTeamSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ActivityAreaAllocatedClient {

	@Steps
	Loginstep loginstep;
	ActivityAreaAllocateClientSteps act;
	ActivityAreaTeamSteps AATS;
	ActivityAreaRequiredSpecialismSteps reqSp;
	
	@Then("^I click on Activity Area view button and view a record for Allocated Client purpose only$")
	public void i_click_on_Activity_Area_view_button_and_view_a_record_for_Allocated_Client_purpose_only()
			throws Throwable {
		act.NavigateToViewActivityAREA();

	}

	@Given("^User is on Team of Activity Area page$")
	public void user_is_on_Team_of_Activity_Area_page() throws Throwable {
		AATS.intialVerificationForm();
	}

	@When("^It navigates to Team view page$")
	public void it_navigates_to_Team_view_page() throws Throwable {
		reqSp.intialVerificationForm();
		act.intialVerificationForm();
	}

	@Then("^I click to add Allocated Client under the view page$")
	public void i_click_to_add_Allocated_Client_under_the_view_page() throws Throwable {

		act.clickAllocateClientSIDETab();
	}

	@Then("^I add the Allocated Client page$")
	public void i_add_the_Allocated_Client_page() throws Throwable {

		act.FillAddForm();
	}

	@Then("^verify the newly added record under Allocated Client table$")
	public void verify_the_newly_added_record_under_Allocated_Client_table() throws Throwable {

		act.VerifyARecordAfterAdd("Add");
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Allocated Client table$")
	public void i_click_edit_button_on_row_of_Allocated_Client_table(String arg1) throws Throwable {

	}

	@Then("^I edit Allocated Client form$")
	public void i_edit_Allocated_Client_form() throws Throwable {

		act.FillEditForm();
	}

	@Then("^verify the edited record under Allocated Client table$")
	public void verify_the_edited_record_under_Allocated_Client_table() throws Throwable {

		act.VerifyARecordAfterAdd("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Allocated Client table$")
	public void i_click_view_button_on_row_of_Allocated_Client_table(String arg1) throws Throwable {

	}

	@Then("^verify the Allocated Client view form$")
	public void verify_the_Allocated_Client_view_form() throws Throwable {

		act.VerifyARecordAfterAdd("Edit");
	}

	@Then("^verify the entire Allocated Client table contents$")
	public void verify_the_entire_Allocated_Client_table_contents() throws Throwable {

		act.verifyTable("Add");
	}

	@Then("^I select values to filter results for Allocated Client$")
	public void i_select_values_to_filter_results_for_Allocated_Client() throws Throwable {

		System.out.println("No Filters as per the spec doc needed");
	}

	@Then("^I click on JMESA to sort results for Allocated Client$")
	public void i_click_on_JMESA_to_sort_results_for_Allocated_Client() throws Throwable {

		act.clickJMESA();
	}

	@Then("^I filter and archieve record of Allocated Client table$")
	public void I_filter_and_archieve_record_of_Allocated_Client_table() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Take a screenshot$")
	public void take_a_screenshot() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
