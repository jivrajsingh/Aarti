package com.meganexus.vc2.stepDefinitions;

import com.meganexus.vc2.pom.JustMentoring;
import com.meganexus.vc2.pom.LandingPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Services {
	@When("^I Click on justmentoring link$")
	public void i_Click_on_justmentoring_link() throws Throwable {
	   
	   LandingPage.clickJustmentoring();
	}

	@Then("^click on row \"([^\"]*)\" to view it for View Mentoring Services$")
	public void click_on_row_to_view_it_for_View_Mentoring_Services(String arg1) throws Throwable {
	   
		JustMentoring.verifyPage();
		JustMentoring.clickSearchButton();
		JustMentoring.verifySearchPage();
		JustMentoring.clickRowtoView(arg1);
	}

	@Then("^verify the page of ViewMentoringServicesThroughTheGate$")
	public void verify_the_page_of_ViewMentoringServicesThroughTheGate() throws Throwable {
	   
	   
	}

	@When("^click on row \"([^\"]*)\" to view it for Send Message$")
	public void click_on_row_to_view_it_for_Send_Message(String arg1) throws Throwable {
	   
	   
	}

	@Then("^I Click on Send Message button$")
	public void i_Click_on_Send_Message_button() throws Throwable {
	   
	   
	}

	@Then("^fill the necessary fields$")
	public void fill_the_necessary_fields() throws Throwable {
	   
	   
	}

	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
	   
	   
	}

	@When("^I Click on Welsh Services link$")
	public void i_Click_on_Welsh_Services_link() throws Throwable {
	   
	   
	}

	@When("^Click on Career Wales CAP link$")
	public void click_on_Career_Wales_CAP_link() throws Throwable {
	   
	   
	}

	@When("^Click on Schools and College search link$")
	public void click_on_Schools_and_College_search_link() throws Throwable {
	   
	   
	}

	@When("^click Search button$")
	public void click_Search_button() throws Throwable {
	   
	   
	}

	@Then("^Click on row on the table to view course$")
	public void click_on_row_on_the_table_to_view_course() throws Throwable {
	   
	   
	}

	@Then("^click on Apply button$")
	public void click_on_Apply_button() throws Throwable {
	   
	   
	}

	@Then("^new message page opens to complete the application$")
	public void new_message_page_opens_to_complete_the_application() throws Throwable {
	   
	   
	}

	@Then("^fill the details and click send button$")
	public void fill_the_details_and_click_send_button() throws Throwable {
	   
	   
	}

	@When("^Click on Training search link and verify the page$")
	public void click_on_Training_search_link_and_verify_the_page() throws Throwable {
	   
	   
	}

	@Then("^Click on row  on the table to view training$")
	public void click_on_row_on_the_table_to_view_training() throws Throwable {
	   
	   
	}


}
