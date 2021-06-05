package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.ClientProfileSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsProfile {

	@Steps
	Loginstep loginstep;
	ClientProfileSteps act;

	@Given("^User is on Clients page$")
	public void user_is_on_Clients_page() throws Throwable {
		act.NavigateToCLIENTSMainPage();
		act.initialVerifiOfForm();
	}

	@When("^I Click on Add Client button$")
	public void i_Click_on_Add_Client_button() throws Throwable {
		act.clickADDClientSIDETAB();
	}

	@When("^It navigates to Add Client page$")
	public void it_navigates_to_Add_Client_page() throws Throwable {
		System.out.println("nxt step");
	}

	@Then("^I fill new client profile form$")
	public void i_fill_new_client_profile_form() throws Throwable {
		act.AddClient();
	}

	@Then("^I click on save button$")
	public void i_click_on_save_button() throws Throwable {
		System.out.println("nxt step");
	}

	@Given("^under clients sub top tab filter client name and surname under firstname and surname$")
	public void under_clients_sub_top_tab_filter_client_name_and_surname_under_firstname_and_surname()
			throws Throwable {
		act.filterByNameSurname("Add");
	}

	@When("^I Click on view button to view a client profile$")
	public void i_Click_on_view_button_to_view_a_client_profile() throws Throwable {
		System.out.println("nxt step");
	}

	@When("^It navigates to View Client page$")
	public void it_navigates_to_View_Client_page() throws Throwable {
		System.out.println("nxt step");
	}

	@Then("^I click Edit Client button to edit client profile$")
	public void i_click_Edit_Client_button_to_edit_client_profile() throws Throwable {
		System.out.println("nxt step");
	}

	@When("^verify the Client profile form on View Client page$")
	public void verify_the_Client_profile_form_on_View_Client_page() throws Throwable {
		act.VerifyARecordAfterAddEdit("Edit");

	}

	@When("^Click on Login button with Super user$")
	public void click_on_Login_button_with_Super_user() throws Throwable {

	}

	@Then("^I fill and save the client profile form$")
	public void i_fill_and_save_the_client_profile_form() throws Throwable {
		act.FillEditForm();
	}

}
