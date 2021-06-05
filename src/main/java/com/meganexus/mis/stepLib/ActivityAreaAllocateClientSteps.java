package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityAreaAllocateClientPage;

import net.thucydides.core.annotations.Step;

public class ActivityAreaAllocateClientSteps extends GenericStep {

	ActivityAreaAllocateClientPage acti;

	@Step
	public void NavigateToViewActivityAREA() throws Exception {
		acti.NavigateToViewActArea();
	}

	@Step
	public void NavigateToViewTEAM() throws Exception {
		acti.NavigateToViewTEAM();
		acti.verifySidetabs();
	}

	@Step
	public void intialVerificationForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickAllocateClientSIDETab() throws Exception {
		acti.clickAllocateClientSIDETab();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm();

		acti.FillAddEditAllocateClientForm(acti.ADDSpecialism, acti.ADDSkillLevel, acti.ADDClientName,
				acti.ADDStartDate, acti.ADDEndDate);
	}

	@Step
	public void VerifyARecordAfterAdd(String AddOrEdit) throws Exception {
		acti.sortWithFilters(acti.FirstName, acti.LstName, "", "");
		acti.clickVIEWButton();
		if (AddOrEdit == "Add") {
			acti.VerifyVIEWClientAllocationPage(acti.ADDSpecialism, acti.ADDSkillLevel, acti.ADDClientName,acti.ADDStartDate, acti.ADDEndDate);
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWClientAllocationPage(acti.ADDSpecialism, acti.ADDSkillLevel, acti.ADDClientName,acti.EDITStartDate, acti.EDITEndDate);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.FillAddEditAllocateClientForm("", "", "", acti.EDITStartDate, acti.EDITEndDate);
	}

	@Step
	public void verifyTable(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.VerifyAllocateClientList("Add");
		} else if (AddOrEdit == "Edit") {
			acti.VerifyAllocateClientList("Edit");
		}
	}

	@Step
	public void clickJMESA() throws Exception {
		acti.ClickOnJMESA();
	}

	@Step
	public void archieveARecord() throws Exception {
		acti.archieveARecord();
	}
}
