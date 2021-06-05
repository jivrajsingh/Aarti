package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.ClientQualificationsSteps;
import com.meganexus.mis.stepLib.ClientSpecialismSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class ClientQualification extends PageObject {

	@Steps
	Loginstep loginstep;
	ClientQualificationsSteps act;
	ClientSpecialismSteps CSS;

	@When("^Click on Login button with Berwyn supervisor$")
	public void click_on_Login_button_with_Berwyn_supervisor() throws Throwable {
		loginstep.LoginToApp("berwyn");
	}
	
	@When("^Click on Login button with SuperUser$")
	public void click_on_Login_button_with_SuperUser() throws Throwable {
		loginstep.LoginToApp("SU");
	}

	@Then("^Navigate to Clients main top-tab$")
	public void navigate_to_Clients_main_top_tab() throws Throwable {
		act.NavigateToCLIENTSMainPage();

	}

	@Then("^under partner sub top tab filter with Name Surname and Prison and click on select button$")
	public void under_partner_sub_top_tab_filter_and_click_on_select_button() throws Throwable {
		act.SearchClient();
	}

	@Then("^View the client on record \"([^\"]*)\" after the search results$")
	public void view_the_client_on_record_after_the_search_results(String arg1) throws Throwable {
		act.viewClient();
	}

	@Given("^User is on Berwyn client profile page$")
	public void user_is_on_Berwyn_client_profile_page() throws Throwable {
		System.out.println("User is on Berwyn client profile page");
	}

	@When("^I Click on Qualification sub-tab$")
	public void i_Click_on_Qualification_sub_tab() throws Throwable {
		act.NavigateToQualificationsSubTopTab();

	}

	@When("^It navigates to Qualification page$")
	public void it_navigates_to_Qualification_page() throws Throwable {
		act.initialVerifiOfForm();
		CSS.initialVerifiOfForm();
	}

	@Then("^I click on Add Qualification button$")
	public void i_click_on_Add_Qualification_button() throws Throwable {

		act.clickADDQualificationSIDETAB();
	}

	@Then("^I fill the add Qualification form$")
	public void i_fill_the_add_Qualification_form() throws Throwable {

		act.FillAddQualificationForm();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Qualification table and fill it$")
	public void i_click_edit_button_on_row_of_Qualification_table(String arg1) throws Throwable {

		act.FillEditForm();
	}

	@Then("^verify the Qualification form$")
	public void verify_the_Qualification_form() throws Throwable {

		act.VerifyARecordAfterAddEdit("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Qualification table$")
	public void i_click_view_button_on_row_of_Qualification_table(String arg1) throws Throwable {

		System.out.println("next step");
	}

	@Then("^verify the entire Qualification table contents$")
	public void verify_the_entire_Qualification_table_contents() throws Throwable {

		act.verifyTable("Edit");
	}

	@Then("^I take a screenshot$")
	public void i_take_a_screenshot() throws Throwable {
		act.takeScreenshot();
	}

	@Then("^I click on Add Qualification button and return to home page of qualification$")
	public void i_click_on_Add_Qualification_button_and_return_to_home_page_of_qualification() throws Throwable {

		act.clickADDAndReturnHomePg();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Qualification table and return to home page of qualification$")
	public void i_click_edit_button_on_row_of_Qualification_table_and_return_to_home_page_of_qualification(String arg1)
			throws Throwable {
		act.clickEDITAndReturnHomePg();

	}

}
