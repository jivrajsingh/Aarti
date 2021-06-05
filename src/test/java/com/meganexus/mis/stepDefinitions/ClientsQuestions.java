package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.ClientQuestionsSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsQuestions {

	@Steps
	Loginstep loginstep;
	ClientQuestionsSteps act;

	@When("^I Click on Questions sub-tab$")
	public void i_Click_on_Questions_sub_tab() throws Throwable {
		act.NavigateToQualificationsSubTopTab();
	}

	@When("^It navigates to Questions page$")
	public void it_navigates_to_Questions_page() throws Throwable {
		act.initialVerifiOfForm();
	}

	@Then("^I click Edit Client button to edit client Questions page$")
	public void i_click_Edit_Client_button_to_edit_client_Questions_page() throws Throwable {
		act.clickEDITQuestions();
	}

	@Then("^then I fill and save the client Questions form$")
	public void then_I_fill_and_save_the_client_Questions_form() throws Throwable {
		act.FillQuestionsForm();
	}

	@Then("^I click Show Client button to view client Questions page$")
	public void i_click_Show_Client_button_to_view_client_Questions_page() throws Throwable {
		System.out.println("nt step");
	}

	@Then("^verify the client Questions page$")
	public void verify_the_client_Questions_page() throws Throwable {
		act.VerifyFormAfterEditing();
	}

	@Then("^I click Edit Client button to edit client Questions page and navigates backwards$")
	public void i_click_Edit_Client_button_to_edit_client_Questions_page_and_navigates_backwards() throws Throwable {
		act.clickEDITRetunHomepage();
	}
}
