package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;
import com.meganexus.mis.pageObjectLib.ActivityAreaTeamPage;
import com.meganexus.mis.stepLib.ActivityAreaSteps;
import com.meganexus.mis.stepLib.ActivityAreaTeamSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ActivityAreaTeamList {
	@Steps
	Loginstep loginstep;
	ActivityAreaSteps act;
	ActivityAreaTeamSteps team;
	XlsReader XlsReader;
	ActivityAreaPage AAP;
	ActivityAreaTeamPage AATP;

	@Then("^I click on Add Activity Area button to add Activity Area for Team scenario purpose only$")
	public void i_click_on_Add_Activity_Area_button_to_add_Activity_Area_for_Team_scenario_purpose_only()
			throws Throwable {
		act.clickADDActivityAreaSIDETAB();
	}

	@Then("^I fill the add Activity Area form for Team scenario purpose only$")
	public void i_fill_the_add_Activity_Area_form_for_Team_scenario_purpose_only() throws Throwable {
		act.FillAddForm();
	}

	@Given("^User is on Activity area page$")
	public void user_is_on_Activity_area_page() throws Throwable {
		System.out.println("next step");
	}

	@When("^It navigates to Activity Area view page$")
	public void it_navigates_to_Activity_Area_view_page() throws Throwable {
		team.NavigateToViewActivityAREArecord();
		team.intialVerificationForm();
	}

	@Then("^I click to add Team under the view page$")
	public void i_click_to_add_Team_under_the_view_page() throws Throwable {
		team.clickADDTeamSIDETAB();
	}

	@Then("^I fill the Team page$")
	public void i_fill_the_Team_page() throws Throwable {
		team.FillAddForm();
	}

	@Then("^verify the newly added record under Team table$")
	public void verify_the_newly_added_record_under_Team_table() throws Throwable {
		team.VerifyARecordAfterAdd("Add");
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Team table$")
	public void i_click_edit_button_on_row_of_Team_table(String arg1) throws Throwable {
		System.out.println("next step");
	}

	
	@Then("^I click view button on row \"([^\"]*)\" of Team table$")
	public void i_click_view_button_on_row_of_Team_table(String arg1) throws Throwable {
		System.out.println("next step");
	}
	
	@Then("^I edit Team form$")
	public void i_edit_Team_form() throws Throwable {
		team.FillEditForm();
	}

	@Then("^verify the edited record under Team table$")
	public void verify_the_edited_record_under_Team_table() throws Throwable {
		team.VerifyARecordAfterAdd("Edit");
	}

	@Then("^Filter and click view of team table to add auxilaries$")
	public void i_click_view_button_on_row_of_Team_table() throws Throwable {
		team.justDoFilteringOfTeam("", ""); // here i will pass the parameters
												// from different excels sheets
		AATP.clickVIEWButton();

	}

	@Then("^verify the team form$")
	public void verify_the_team_form() throws Throwable {
		team.VerifyARecordAfterAdd("Edit");
	}

	@Then("^verify the entire Team table contents$")
	public void verify_the_entire_Team_table_contents() throws Throwable {
		team.verifyTable("Edit");
		XlsReader.setCellData("ActivityArea", "Successfully updated?", AAP.row, "Yes");
	}

	@Then("^I click on JMESA to sort results for Team$")
	public void i_click_on_JMESA_to_sort_results_for_Team() throws Throwable {
		team.clickJMESA();
		team.justDoFilteringOfTeam("", "");// here i will pass the parameters
												// from different excels sheets
	}

	@Then("^I click to add Team under the view page and return to home page of Team$")
	public void i_click_to_add_Team_under_the_view_page_and_return_to_home_page_of_Team() throws Throwable {
		team.ClickAddReturnHomepage();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Team table and return to home page of Team$")
	public void i_click_edit_button_on_row_of_Team_table_and_return_to_home_page_of_Team(String arg1) throws Throwable {
		team.ClickEditReturnHomepage();
	}

	@Then("^I click view button on row \"([^\"]*)\" of Team table and return to home page of Team$")
	public void i_click_view_button_on_row_of_Team_table_and_return_to_home_page_of_Team(String arg1) throws Throwable {
		team.ClickViewReturnHomepage();
	}

}
