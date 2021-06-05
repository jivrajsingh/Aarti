package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.CheckOutPage;
import com.meganexus.mis.stepLib.CheckInSteps;
import com.meganexus.mis.stepLib.CheckOutSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckIn_CheckOut {

	CheckInSteps ci;
	CheckOutSteps co;
	CheckOutPage cop;
	
	@When("^I Click on Add CheckIn Side Tab$")
	public void i_Click_on_Add_CheckIn_Side_Tab() throws Throwable {
		ci.clickCheckInSIDETab();

	}

	@Then("^fill add CheckIn form$")
	public void fill_add_CheckIn_form() throws Throwable {
		ci.FillAddForm();
	}

	@Then("^verify the newly added CheckIn entry in table$")
	public void verify_the_newly_added_CheckIn_entry_in_table() throws Throwable {
		ci.filter();
		ci.verifyTable();
	}

	@When("^I filter record under CheckIn table$")
	public void i_filter_record_under_CheckIn_table() throws Throwable {
		ci.filter();
	}

	@Then("^I check Archieve functionality for CheckIn table$")
	public void i_check_Archieve_functionality_for_CheckIn_table() throws Throwable {
		ci.ArchiveARecord();
	}

	@Then("^I verify the entire CheckIn table contents$")
	public void i_verify_the_entire_CheckIn_table_contents() throws Throwable {
		ci.filter();
		ci.verifyTable();
	}

	@Then("^I click JMESA of CheckIn table$")
	public void i_click_JMESA_of_CheckIn_table() throws Throwable {
		ci.clickOnJMESA();
	}

	@When("^I Click on Add CheckOut Side Tab$")
	public void i_Click_on_Add_CheckOut_Side_Tab() throws Throwable {
		co.clickCheckOutSIDETab();
	}

	@Then("^fill add CheckOut form$")
	public void fill_add_CheckOut_form() throws Throwable {
		co.FillAddForm();
	}

	@Then("^verify the newly added CheckOut entry in table$")
	public void verify_the_newly_added_CheckOut_entry_in_table() throws Throwable {
		co.filter();
		co.verifyTable();
	}

	@When("^I filter record under CheckOut table$")
	public void i_filter_record_under_CheckOut_table() throws Throwable {
		co.filter();
	}

	@Then("^I check Archieve functionality for CheckOut table$")
	public void i_check_Archieve_functionality_for_CheckOut_table() throws Throwable {
		co.ArchiveARecord();
	}

	@Then("^I click JMESA of CheckOut table$")
	public void i_click_JMESA_of_CheckOut_table() throws Throwable {
		co.clickOnJMESA();
	}

	@Then("^It navigates to Add CheckIn page and return to home page of attendance$")
	public void it_navigates_to_Add_CheckIn_page_and_return_to_home_page_of_attendance() throws Throwable {
		ci.clickAddReturnToHomePage();
	}

	@Then("^It navigates to Add CheckOut page and return to home page of attendance$")
	public void it_navigates_to_Add_CheckOut_page_and_return_to_home_page_of_attendance() throws Throwable {
		co.clickAddReturnToHomePage();
	}

	@Then("^First Verify Incentives dropwdown$")
	public void first_Verify_Incentives_dropwdown() throws Throwable {
	   cop.verifyIncentivesDDL();
	}
	
}
