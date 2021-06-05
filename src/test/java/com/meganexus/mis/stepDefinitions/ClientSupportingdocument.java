package com.meganexus.mis.stepDefinitions;

import com.meganexus.mis.pageObjectLib.GenericPage;
import com.meganexus.mis.stepLib.ClientSupportDocSteps;
import com.meganexus.mis.testartifacts.Loginstep;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ClientSupportingdocument {

	@Steps
	Loginstep loginstep;
	ClientSupportDocSteps act;
	GenericPage gp;
	
	@Then("^I click on Add Support document button to document$")
	public void i_click_on_Add_Support_document_button_to_document() throws Throwable {
		act.clickADDSupportDocSIDETAB();
	}

	@Then("^I fill the add Support document form$")
	public void i_fill_the_add_Support_document_form() throws Throwable {
		act.UploadDocumentToForm();
	}

	@Then("^I click view button on row \"([^\"]*)\" of Supporting Document table$")
	public void i_click_view_button_on_row_of_Supporting_Document_table(String arg1) throws Throwable {
		act.clickVIEWButton();	
		act.clickVIEWButton();	
		gp.TakeScreenshot("C:\\Users\\Subhajit.Ghosh\\workspace\\HMPBerwyn\\Screenshots\\Client Support Document", "ViewDocument");
	}

	@Then("^verify the Supporting Document form$")
	public void verify_the_Supporting_Document_form() throws Throwable {
		act.VerifySupportDocumentList();
	}

	@Then("^verify the entire Supporting Document table contents$")
	public void verify_the_entire_Supporting_Document_table_contents() throws Throwable {
		act.VerifySupportDocumentList();
	}

	@Then("^I click delete button on row \"([^\"]*)\" of Supporting Document table$")
	public void i_click_delete_button_on_row_of_Supporting_Document_table(String arg1) throws Throwable {
		act.clickARCHIEVEButton();
	}

	@Then("^I take a screenshot for Support Document$")
	public void i_take_a_screenshot_for_Support_Document() throws Throwable {
		
		gp.TakeScreenshot("C:\\Users\\Subhajit.Ghosh\\workspace\\HMPBerwyn\\Screenshots\\Client Support Document", "Screenshot of Page");
	}
}
