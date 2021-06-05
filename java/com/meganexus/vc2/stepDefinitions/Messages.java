package com.meganexus.vc2.stepDefinitions;

import com.meganexus.vc2.pom.LandingPage;
import com.meganexus.vc2.pom.MyMessagesPage;
import com.meganexus.vc2.pom.SendNewMessage;
import com.meganexus.vc2.pom.SentItems;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Messages {
	@When("^I Click on Compose New Message link$")
	public void i_Click_on_Compose_New_Message_link() throws Throwable {
	    
		LandingPage.clickComposeMsg();
	}

	@Then("^Compose a new message$")
	public void Compose_a_new_message() throws Throwable {
	    
		MyMessagesPage.verifyTopTabs();
		SendNewMessage.verifyForm();
		SendNewMessage.fillNewMsgForm();
	}

	@Then("^click on Send button$")
	public void click_on_Send_button() throws Throwable {
	    
		SendNewMessage.clickSend();
	}

	@When("^I Click on You Have a New Messages link$")
	public void i_Click_on_You_Have_New_Messages_link() throws Throwable {
	    
	    LandingPage.clickUnreadMsg();
	}

	@When("^Click on Send Items tab$")
	public void click_on_Send_Items_tab() throws Throwable {
		MyMessagesPage.verifyTopTabs();
		MyMessagesPage.verifySideTabs();
		MyMessagesPage.clickSentItems();
		
	}

	@Then("^I click to view message to view msg from sent items$")
	public void i_click_to_view_message_to_view_msg_from_sent_items() throws Throwable {
	    
	    
	}

	@Then("^Verify view message page$")
	public void verify_view_message_page() throws Throwable {
	    
	    
	}

	@When("^click to view message$")
	public void click_to_view_message() throws Throwable {
	    
	    
	}

	@When("^Click sent new message button$")
	public void click_sent_new_message_button() throws Throwable {
	    
	    
	}

	@Then("^send a new message opens$")
	public void send_a_new_message_opens() throws Throwable {
	    
	    
	}

	@When("^Click forward to advisor button$")
	public void click_forward_to_advisor_button() throws Throwable {
	    
	    
	}
}
