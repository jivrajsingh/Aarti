package com.meganexus.vc2.stepDefinitions;

import com.meganexus.vc2.pom.FindJob;
import com.meganexus.vc2.pom.LandingPage;
import com.meganexus.vc2.pom.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplyJobs {
	@Given("^As an user i will open VC(\\d+) portal login page$")
	public void as_an_user_i_will_open_VC_portal_login_page(int arg1) throws Throwable {
	   
	    
	}

	@When("^I provide correct credentials$")
	public void i_provide_correct_credentials() throws Throwable {
		LoginPage.verifyLoginPage();
		LoginPage.enterLoginData("", "");
		LoginPage.clickLoginButton();
			    
	}

	@Then("^I Provide the Guardian credentials$")
	public void i_Provide_the_Guardian_credentials() throws Throwable {
	   
		LoginPage.enterGuardian();
		LoginPage.clickVerifyLearnerButton();
	}

	@Given("^User is on landing page opens$")
	public void user_is_on_landing_page_opens() throws Throwable {
	   
		LandingPage.verifyLandingPageLinks();
	}

	@When("^I Click on My Documents link$")
	public void i_Click_on_My_Documents_link() throws Throwable {
	   
		LandingPage.clickMyDocument();
	}

	@When("^Click on Add New Document tab$")
	public void click_on_Add_New_Document_tab() throws Throwable {
	   
	    
	}

	@When("^Verify Add New Document page$")
	public void verify_Add_New_Document_page() throws Throwable {
	   
	    
	}

	@When("^upload a document$")
	public void upload_a_document() throws Throwable {
	   
	    
	}

	@Then("^fill the AddNewDocument form$")
	public void fill_the_AddNewDocument_form() throws Throwable {
	   
	    
	}

	@Then("^Click on Next button on AddNewDocument$")
	public void click_on_Next_button_on_AddNewDocument() throws Throwable {
	   
	    
	}

	@Then("^Navigate to My Documents page to verify the added document$")
	public void navigate_to_My_Documents_page_to_verify_the_added_document() throws Throwable {
	   
	    
	}

	@When("^Click on My Documents link$")
	public void click_on_My_Documents_link() throws Throwable {
	   
	    
	}

	@When("^Navigate to My Documents tab$")
	public void navigate_to_My_Documents_tab() throws Throwable {
	   
	    
	}

	@Then("^verify existing CV$")
	public void verify_existing_CV() throws Throwable {
	   
	    
	}

	@When("^I Click on Find a Job/Apprenticeship link$")
	public void i_Click_on_Find_a_Job_Apprenticeship_link() throws Throwable {
	   
		LandingPage.clickFindJobApprentice();
	}

	@When("^Click on Search Activities and Jobs tab$")
	public void click_on_Search_Activities_and_Jobs_tab() throws Throwable {
	   
		FindJob.clickSrchActiAndJobsLink();
		FindJob.verifyTopTabs();
		FindJob.verifySideTabs();
		FindJob.verifySearchActandJobs();
	}

	@When("^select opportunity type as Job$")
	public void select_opportunity_type_as_Job() throws Throwable {
		FindJob.JobTitle("job");
	    
	}

	@When("^Click on Search button on SearchActivitiesAndJobs$")
	public void click_on_Search_button_on_SearchActivitiesAndJobs() throws Throwable {
	   
		FindJob.clickSearch();
	}

	@Then("^click on the job$")
	public void click_on_the_job() throws Throwable {
	   
		FindJob.clickViewJob(); 
		FindJob.verifyViewJobPage();
	}

	@Then("^apply for the job$")
	public void apply_for_the_job() throws Throwable {
	   
		FindJob.clickApply();
	}

	@Then("^Save the job$")
	public void save_the_job() throws Throwable {
	   
		FindJob.clickSave();
	}

	@Then("^go to Saved Opportunities tab to verify the newly saved job$")
	public void go_to_Saved_Opportunities_tab_to_verify_the_newly_saved_job() throws Throwable {
	   
		FindJob.clickSavedOpporLink();
		FindJob.clickViewSavedOpportunity();
		FindJob.verifySavedOpportunities();
	}

}
