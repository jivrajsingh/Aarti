package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;
import com.meganexus.mis.pageObjectLib.ActivityAreaRequiredSpecialismPage;
import com.meganexus.mis.stepLib.ActivityAreaRequiredSpecialismSteps;
import com.meganexus.mis.testartifacts.Loginstep;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ActivityAreaRequiredSpecialism {

	@Steps
	Loginstep loginstep;
	ActivityAreaRequiredSpecialismSteps act;
	XlsReader XlsReader;
	ActivityAreaRequiredSpecialismPage AAP;
	
	@Then("^I click on Activity Area view button and view a record for Required Specialism purpose only$")
	public void i_click_on_Activity_Area_view_button_and_view_a_record_for_Required_Specialism_purpose_only() throws Throwable {  
	    act.NavigateToViewActivityAREA();
	}

	@Then("^I click to add Required Specialism under the view page$")
	public void i_click_to_add_Required_Specialism_under_the_view_page() throws Throwable {
		act.clickADDReqSpecialismSIDETAB();
	}

	@Then("^I fill the Required Specialism page$")
	public void i_fill_the_Required_Specialism_page() throws Throwable {
	    act.FillAddForm();
	}

	@Then("^verify the newly added record under Required Specialism table$")
	public void verify_the_newly_added_record_under_Required_Specialism_table() throws Throwable {
	    act.verifyTable("Add");
	}

	@Then("^Sort and I click edit button on row \"([^\"]*)\" of Required Specialism table$")
	public void i_click_edit_button_on_row_of_Required_Specialism_table(String arg1) throws Throwable {
		act.clickSpecialismToSortLatestEntryonTOP();
	}

	
	@Then("^I edit Required Specialism form$")
	public void i_edit_Required_Specialism_form() throws Throwable {	    
	    act.FillEditForm();
	}

	@Then("^verify the edited record under Required Specialism table$")
	public void verify_the_edited_record_under_Required_Specialism_table() throws Throwable {	    
		 act.verifyTable("Edit");
	}

	@Then("^Sort and I click view button on row \"([^\"]*)\" of Required Specialism table$")
	public void i_click_view_button_on_row_of_Required_Specialism_table(String arg1) throws Throwable {	    
		act.clickSpecialismToSortLatestEntryonTOP(); 
	}

	@Then("^verify the Required Specialism form$")
	public void verify_the_Required_Specialism_form() throws Throwable {    
		act.VerifyARecordAfterAdd("Edit");
	}

	@Then("^verify the entire Team table Required Specialism contents$")
	public void verify_the_entire_Team_table_Required_Specialism_contents() throws Throwable {	    
		 act.verifyTable("Edit");
		 XlsReader.setCellData("ActivityArea", "Successfully updated?", AAP.row, "Yes");
	}

	@Then("^I select values to filter results for Required Specialism$")
	public void i_select_values_to_filter_results_for_Required_Specialism() throws Throwable {	    
	    System.out.println("As per the specifications, filters are not present");
	}

	@Then("^I click on JMESA to sort results for Required Specialism$")
	public void i_click_on_JMESA_to_sort_results_for_Required_Specialism() throws Throwable {    
	    act.clickJMESA();
	}
}
