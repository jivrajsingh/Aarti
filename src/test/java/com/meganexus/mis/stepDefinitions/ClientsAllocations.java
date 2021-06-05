/*package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.NavigateTabs;
import com.meganexus.mis.stepLib.ClientAllocationsSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsAllocations {

	@Steps
	Loginstep loginstep;
	ClientAllocationsSteps act;
	NavigateTabs nt;

	@When("^I Click on Allocation sub-tab$")
	public void i_Click_on_Allocation_sub_tab() throws Throwable {
		nt.NavigateToAllocationsSubTab();
	}

	@When("^It navigates to Allocation page$")
	public void it_navigates_to_Allocation_page() throws Throwable {
		act.VerifySIDETab();
		act.intialVerificationForm();
	}

	@Then("^I click view button on row \"([^\"]*)\" of Allocation table$")
	public void i_click_view_button_on_row_of_Allocation_table(String arg1) throws Throwable {
		System.out.println("Next Step");
	}

	@Then("^verify the Allocation form$")
	public void verify_the_Allocation_form() throws Throwable {
		act.verifyTable();
	}

	@Then("^verify the entire Allocation table contents$")
	public void verify_the_entire_Allocation_table_contents() throws Throwable {
		act.verifyTable();
		act.TakeScreenshot("Table");
	}

	@Then("^I take a screenshot for Client Allocation JMESA$")
	public void screenshotForCAJMESA() throws Throwable {
		act.verifyTable();
		act.TakeScreenshot("JMESA");
	}
	
	@Then("^I take a screenshot for Client Allocation RBAC$")
	public void screenshotForCARBAC() throws Throwable {
		act.verifyTable();
		act.TakeScreenshot("RBAC");
	}
}
*/