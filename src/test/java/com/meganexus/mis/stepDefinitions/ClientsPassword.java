package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.SearchAndViewClient;
import com.meganexus.mis.stepLib.ClientPasswordSteps;
import com.meganexus.mis.testartifacts.XlsReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ClientsPassword {
	ClientPasswordSteps act;
	SearchAndViewClient svc;
	XlsReader XlsReader;
	
	@When("^I Click on Password sub-tab$")
	public void i_Click_on_Password_sub_tab() throws Throwable {
		act.NavigateToPasswordSubTopTab();
	}

	@When("^It navigates to Password view page$")
	public void it_navigates_to_Password_view_page() throws Throwable {
		act.initialVerifiOfForm();
	}

	@Then("^I verify the view Password page$")
	public void i_verify_the_view_Password_page() throws Throwable {
		act.clickResetPasswordBUTTON();
		act.verifyOTPPage();
		act.CompareOTP();
		XlsReader.setCellData("PROFILE", "Password Reset Scenario!", svc.row, "Yes");
	}

}
