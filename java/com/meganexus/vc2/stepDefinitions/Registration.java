package com.meganexus.vc2.stepDefinitions;

import java.util.List;

import com.meganexus.vc2.pom.LandingPage;
import com.meganexus.vc2.pom.LoginPage;
import com.meganexus.vc2.pom.RegistrationFirstPage;
import com.meganexus.vc2.pom.RegistrationInfoPage;
import com.meganexus.vc2.pom.RegistrationSecondPage;
import com.meganexus.vc2.pom.WelcomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	@Given("^I will open VC(\\d+) portal$")
	public void i_will_open_VC_portal(int arg1) throws Throwable {
	    
	    
	}

	@Given("^verify the Welcome page elements$")
	public void verify_the_Welcome_page_elements() throws Throwable {
		WelcomePage.verifyWelcomePage();
	    
	}

	@When("^I click on Sign Up button Registration page opens$")
	public void i_click_on_Sign_Up_button_Registration_page_opens() throws Throwable {
	    
		WelcomePage.clickSignUp();
	}

	@When("^Click on next button$")
	public void click_on_next_button_on_Registration_Info_Page() throws Throwable {
	    
		RegistrationInfoPage.verifyRegistrationInfoPage();
		RegistrationInfoPage.clickNextbutton();
	}

	@Then("^I verify the Client registration first page$")
	public void i_verify_the_Client_registration_first_page() throws Throwable {
		
		RegistrationFirstPage.verifyRegistrationform();
	    
	}

	@Then("^Fill the first name, surname and DOB details$")
	public void fill_the_first_name_surname_and_DOB_details() throws Throwable {
	    
		RegistrationFirstPage.fillRegistrationForm();
	}

	@Then("^I Click on next button then second page opens$")
	public void i_Click_on_next_button_then_second_page_opens() throws Throwable {
	    
		RegistrationFirstPage.clickNext();
	}

	@Then("^Fill the details$")
	public void fill_the_details() throws Throwable {
	    
		RegistrationSecondPage.verifyRegistrationform();
		RegistrationSecondPage.fillRegistrationForm();
	}

	@Then("^I click on next button$")
	public void i_click_on_next_button() throws Throwable {
	    
		RegistrationSecondPage.clickNext();
	}

	@Then("^Registration is successful$")
	public void registration_is_successful() throws Throwable {
	    
		RegistrationSecondPage.RegistrationSuccessfull();
	}

	@When("^I click on Secure Login button$")
	public void i_click_on_Secure_Login_button() throws Throwable {
	    
		RegistrationSecondPage.LoginSecurely();
	}

	@Then("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	    
		LoginPage.verifyLoginPage();
		LoginPage.enterLoginData("","");
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    
		LoginPage.clickLoginButton();
	}

	@Then("^Provide the Guardian credentials$")
	public void provide_the_Guardian_credentials() throws Throwable {
	    
		LoginPage.enterGuardian();
	}

	@Then("^Click on Verify Learner Details button$")
	public void click_on_Verify_Learner_Details_button() throws Throwable {
	    
		LoginPage.clickVerifyLearnerButton();
	}

	@Then("^VC(\\d+) home page/landing page opens$")
	public void vc_home_page_landing_page_opens(int arg1) throws Throwable {
	    
		LandingPage.verifyLandingPageLinks();
	}

	@When("^Fill the incorrect username and wrong password$")
	public void fill_the_incorrect_username_and_wrong_password(DataTable arg1) throws Throwable {
	    
	   List<List<String>> data = arg1.raw();
	   LoginPage.enterLoginData(data.get(1).get(1),data.get(2).get(2));
	    
	}

	@When("^Click on Login button for failure$")
	public void click_on_Login_button_for_failure() throws Throwable {
		
		LoginPage.clickLoginButton();
	    
	}

	@Then("^Error message appears and I verify it$")
	public void error_message_appears_and_I_verify_it() throws Throwable {
	    
		LoginPage.verifyFailureMsg();
	}


}
