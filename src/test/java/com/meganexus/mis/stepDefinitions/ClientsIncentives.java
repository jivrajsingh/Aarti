package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ClientsIncentivesPage;
import com.meganexus.mis.stepLib.ClientIncentivesSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsIncentives {

	@Steps
	Loginstep loginstep;
	ClientIncentivesSteps act;
	XlsReader XlsReader;
	ClientsIncentivesPage cip;
	
	@When("^I Click on Incentives sub-tab$")
	public void i_Click_on_Incentives_sub_tab() throws Throwable {
		act.NavigateToIncentivesSubTopTab();
	}

	@When("^It navigates to Incentives page$")
	public void it_navigates_to_Incentives_page() throws Throwable {
		act.initialVerifiOfForm();
	}

	@Then("^I click on Add Incentives button to fill form$")
	public void i_click_on_Add_Incentives_button_to_fill_form() throws Throwable {
		act.clickADDIncentivesSIDETAB();
	}

	@Then("^I fill the add Incentives form$")
	public void i_fill_the_add_Incentives_form() throws Throwable {
		act.FillAddIncentivesForm();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Incentives table and edit a record$")
	public void i_click_edit_button_on_row_of_Incentives_table(String arg1) throws Throwable {
		cip.Sorting();
		act.FillEditForm();
	}

	@Then("^verify the Incentives form$")
	public void verify_the_Incentives_form() throws Throwable {
		cip.Sorting();
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Incentives table$")
	public void i_click_view_button_on_row_of_Incentives_table(String arg1) throws Throwable {
		System.out.println("nxt step");
	}

	@Then("^I click Archieve button on row \"([^\"]*)\" of Incentives table$")
	public void i_click_Archieve_button_on_row_of_Incentives_table(String arg1) throws Throwable {
		act.archieveARecord();
		XlsReader.setCellData("Incentives", "Successfully updated?", cip.row, "Yes");
	}

	@When("^I click on JMESA to sort results for MW Incentives$")
	public void i_click_on_JMESA_to_sort_results_for_MW_Incentives() throws Throwable {

	}

	@Then("^I click to add Incentive under the view page and return to home page of Incentive$")
	public void i_click_to_add_Incentive_under_the_view_page_and_return_to_home_page_of_Incentive() throws Throwable {
		act.clickADDRetunHomepage();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Incentive table and return to home page of Incentive$")
	public void i_click_edit_button_on_row_of_Incentive_table_and_return_to_home_page_of_Incentive(String arg1)
			throws Throwable {
		act.clickEDITRetunHomepage();
	}

	@Then("^verify the Incentives form after add$")
	public void verify_the_Incentives_form_after_add() throws Throwable {
		cip.Sorting();
		act.VerifyARecordAfterAddorEdit("Add");
		XlsReader.setCellData("Incentives", "Record Added?", cip.row, "Yes");
	}

	@Then("^verify the Incentives form after edit$")
	public void verify_the_Incentives_form_after_edit() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	
	@Then("^verify the entire Incentives table contents$")
	public void verify_the_entire_Incentives_table_contents() throws Throwable {
		act.verifyTable("");
	}
	
	@Then("^I sort Incentives table JMESA$")
	public void i_sort_Incentives_table_JMESA() throws Throwable {
		cip.Sorting();
	}
}
