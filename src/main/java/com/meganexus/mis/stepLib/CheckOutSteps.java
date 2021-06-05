package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.CheckOutPage;

import net.thucydides.core.annotations.Step;

public class CheckOutSteps extends GenericStep {

	CheckOutPage acti;

	@Step
	public void NavigateToATTENDANCEPage() throws Exception {
		acti.NavigateToATTENDANCEPage();
	}

	@Step
	public void VerifySIDETab() throws Exception {
		acti.verifySidetabs();
	}

	@Step
	public void intialVerificationForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickCheckOutSIDETab() throws Exception {
		acti.clickCheckOutSIDETab();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm("Add");
		acti.FillAddEditCheckOutForm(acti.AddDate, acti.AddTime, acti.AddActiArea, acti.AddTeam, acti.AddAbsent,
				acti.AddReasonOfAbsence, acti.AddIncentiveType, acti.AddIncentiveDescription);
	}

	@Step
	public void verifyTable() throws Exception {

		acti.VerifyAllocateClientList();
	}

	@Step
	public void clickOnJMESA() throws Exception {
		acti.ClickOnJMESA();
	}

	@Step
	public void clickAddReturnToHomePage() throws Exception {
		acti.clickCheckOutSIDETab();
		waitABit(2000);
		acti.returnToHomePage();
		System.out.println("click Add Return To HomePage Successful !!");
	}

	public void ClickArchieveButton() throws Exception {
		acti.clickARCHIEVEButton();
	}

	@Step
	public void ArchiveARecord() throws Exception {
		acti.archieveARecord();

	}

	@Step
	public void filter() throws Exception {

		acti.sortWithFilters(acti.AddActiArea, acti.AddTeam, "", acti.FirstName, acti.LstName, acti.AddDate);

	}
}
