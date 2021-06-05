package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.stepLib.ClientGroupsAndBarriersSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClientsGroupsAndBarriers {

	@Steps
	Loginstep loginstep;
	ClientGroupsAndBarriersSteps act;

	@When("^I Click on Groups and Barriers sub-tab$")
	public void i_Click_on_Groups_and_Barriers_sub_tab() throws Throwable {
		act.clickOnGrpAndBarriersSubTopTab();
	}

	@When("^It navigates to Groups and Barriers page$")
	public void it_navigates_to_Groups_and_Barriers_page() throws Throwable {
		System.out.println("Next step");
	}

	@Then("^I click on Edit Groups button and fill it$")
	public void i_click_on_Edit_Groups_button_and_fill_it() throws Throwable {
		act.clickEDITGroupsSIDETAB();
		act.FillGroupsForm();
	}

	@Then("^I click on Edit Barriers button and fill it$")
	public void i_click_on_Edit_Barriers_button_and_fill_it() throws Throwable {
		act.clickEDITBarriersSIDETAB();
		act.FillBarriersForm();
	}

	@Then("^I verify the Groups section$")
	public void i_verify_the_Groups_section() throws Throwable {
		act.VerifyPageAfterFillingForm("Groups");
	}

	@Then("^I verify the Barriers section$")
	public void i_verify_the_Barriers_section() throws Throwable {
		act.VerifyPageAfterFillingForm("Barriers");
	}

	@Then("^I click on Edit Groups button and return to home page of Groups and Barriers$")
	public void i_click_on_Edit_Groups_button_and_return_to_home_page_of_Groups_and_Barriers() throws Throwable {
		act.clickEditGrpReturnHomepage();
	}

	@Then("^I click on Edit Barriers button and return to home page of Groups and Barriers$")
	public void i_click_on_Edit_Barriers_button_and_return_to_home_page_of_Groups_and_Barriers() throws Throwable {
		act.clickEditBarrierReturnHomepage();
	}

}
