package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ClientSpecialismPage;
import com.meganexus.mis.stepLib.ClientSpecialismSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ClientsSpecialism {

	@Steps
	Loginstep loginstep;
	ClientSpecialismSteps act;
	XlsReader XlsReader;
	ClientSpecialismPage csp;
	
	@Then("^I click on Add Specialism button$")
	public void i_click_on_Add_Specialism_button() throws Throwable {
		act.clickADDSpecialismSIDETAB();
	}

	@Then("^I fill the add Specialism form$")
	public void i_fill_the_add_Specialism_form() throws Throwable {
		act.FillAddSpecialismForm();
	}

	@Then("^I click edit button on row \"([^\"]*)\" of Specialism table and fill it$")
	public void i_click_edit_button_on_row_of_Specialism_table_and_fill_it(String arg1) throws Throwable {
		act.FillEditForm();
	}

	@Then("^verify the Client Specialism form$")
	public void verify_the_Specialism_form() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}

	@Then("^I click view button on row \"([^\"]*)\" of Specialism table$")
	public void i_click_view_button_on_row_of_Specialism_table(String arg1) throws Throwable {
		System.out.println("nxt step");
	}

	@Then("^verify the entire Specialism table contents$")
	public void verify_the_entire_Specialism_table_contents() throws Throwable {
		act.verifyTable("Edit");
		XlsReader.setCellData("ClientSpecialism", "Successfully updated?", csp.row, "Yes");
	}

	@Then("^click on JMESA and filters and test it for client Specialism$")
	public void click_on_JMESA_and_filters_and_test_it_for_client_Specialism() throws Throwable {
		act.clickJMESA();
	}

	@Then("^I click on Add Specialism button and return to home page of Specialism$")
	public void i_click_on_Add_Specialism_button_and_return_to_home_page_of_Specialism() throws Throwable {

	}

	@Then("^I click edit button on row \"([^\"]*)\" of Specialism table and return to home page of Specialism$")
	public void i_click_edit_button_on_row_of_Specialism_table_and_return_to_home_page_of_Specialism(String arg1)
			throws Throwable {

	}

	@Then("^verify the Client Specialism form after adding$")
	public void verify_the_Specialism_form_Add() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Add");
		XlsReader.setCellData("ClientSpecialism", "Record Added?", csp.row, "Yes");
	}

	@Then("^verify the Client Specialism form after editing$")
	public void verify_the_Specialism_form_Edit() throws Throwable {
		act.VerifyARecordAfterAddorEdit("Edit");
	}
}
