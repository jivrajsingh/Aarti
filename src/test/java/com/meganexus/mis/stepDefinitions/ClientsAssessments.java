package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ClientsPasswordPage;
import com.meganexus.mis.stepLib.ClientsAssessmentSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsAssessments {

	@Steps
	Loginstep loginstep;
	ClientsAssessmentSteps act;
	ClientsPasswordPage cpp;
	
	@When("^Click on Login button with MIS Wales supervisor$")
	public void click_on_Login_button_with_Wales_supervisor() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^under partner sub top tab filter with a \"([^\"]*)\" partner and click on select button$")
	public void under_partner_sub_top_tab_filter_with_a_partner_and_click_on_select_button(String arg1)
			throws Throwable {
		act.JustSearchAClient();
		act.ViewAClient();
	}

	@When("^I Click on Assessments sub-tab$")
	public void i_Click_on_Assessments_sub_tab() throws Throwable {
		act.NavigateToAssessmentsSubTopTab();
	}

	@When("^It navigates to Assessments page$")
	public void it_navigates_to_Assessments_page() throws Throwable {
		act.initialVerifiOfForm();
	}

	@Then("^I click on Add Assessments button to fill form$")
	public void i_click_on_Add_Assessments_button_to_fill_form() throws Throwable {
		act.clickADDAssessmentSIDETAB();
	}

	@Then("^I fill the add Assessments form$")
	public void i_fill_the_add_Assessments_form() throws Throwable {
		act.FillAddAssessmentForm();
	}

	@Then("^verify the Assessments form after add$")
	public void verify_the_Assessments_form_after_add() throws Throwable {
		act.VerifyARecordAfterAddOrEdit("Add");
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Assessments table and fill it$")
	public void i_click_edit_button_on_row_of_Assessments_table(String arg1) throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the Assessments form after edit$")
	public void verify_the_Assessments_form_after_edit() throws Throwable {
		act.VerifyARecordAfterAddOrEdit("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Assessments table$")
	public void i_click_view_button_on_row_of_Assessments_table(String arg1) throws Throwable {
		System.out.println("nxt step");
	}

	@Then("^verify the Assessments form$")
	public void verify_the_Assessments_form() throws Throwable {
		act.VerifyARecordAfterAddOrEdit("Edit");
	}

	@Then("^verify the entire Assessments table contents$")
	public void verify_the_entire_Assessments_table_contents() throws Throwable {
		act.verifyTable("Edit");
	}

	@When("^click on JMESA and filters and test it for MW Assessments$")
	public void i_click_on_JMESA_to_sort_results_for_MW_Assessments() throws Throwable {
		act.sortByFilters("Edit");
		act.clickJMESA();
	}

}
