package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.AttendenceAbsencePage;

import net.thucydides.core.annotations.Step;

public class AttendanceAbsenceSteps extends GenericStep {

	AttendenceAbsencePage acti;

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
	public void clickABSENCESIDETab() throws Exception {
		acti.clickABSENCESIDETab();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm("Add");
		acti.FillAddEditAllocateClientForm(acti.AddActiArea, acti.AddTeam, acti.ADDStartDate, acti.ADDEndDate,
				acti.AddAbsencePeriod, acti.ADDAbsenceCode);
	}

	@Step
	public void ClickViewButton() throws Exception {
		acti.clickVIEWButton();
	}

	@Step
	public void VerifyARecordAfterAddorEdit(String AddOrEdit) throws Exception {
		acti.clickVIEWButton();
		if (AddOrEdit == "Add") {
			acti.VerifyVIEWClientAllocationPage(acti.AddActiArea, acti.AddTeam, acti.ADDStartDate, acti.ADDEndDate,
					acti.AddAbsencePeriod, acti.ADDAbsenceCode);
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWClientAllocationPage(acti.AddActiArea, acti.AddTeam, acti.EDITStartDate, acti.EDITEndDate,
					acti.EDITAbsencePeriod, acti.EDITAbsenceCode);
		}
	}

	@Step
	public void ClickEditButton() throws Exception {
		acti.clickEDITButton();
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.verifyADDEDITForm("Add");
		acti.FillAddEditAllocateClientForm(acti.AddActiArea, acti.AddTeam, acti.EDITStartDate, acti.EDITEndDate,
				acti.EDITAbsencePeriod, acti.EDITAbsenceCode);
	}

	@Step
	public void verifyTable(String AddorEdit) throws Exception {
		if (AddorEdit == "Add") {
			acti.VerifyAllocateClientList("Add");
		} else if (AddorEdit == "Edit") {
			acti.VerifyAllocateClientList("Edit");
		}
	}

	@Step
	public void clickOnJMESA() throws Exception {
		acti.ClickOnJMESA();
	}

	@Step
	public void clickAddReturnToHomePage() throws Exception {
		acti.clickABSENCESIDETab();
		waitABit(2000);
		acti.returnToHomePage();
		System.out.println("click Add Return To HomePage Successful !!");
	}

	@Step
	public void clickEditReturnToHomePage() throws Exception {
		acti.clickEDITButton();
		waitABit(2000);
		acti.returnToHomePage();
		System.out.println("click Edit Return To HomePage Successful !!");
	}

	@Step
	public void clickViewReturnToHomePage() throws Exception {
		acti.clickVIEWButton();
		waitABit(2000);
		acti.returnToHomePage();
		System.out.println("click View Return To HomePage Successful !!");
	}

	public void ClickArchieveButton() throws Exception {
		acti.clickARCHIEVEButton();
	}

	@Step
	public void ArchiveARecord() throws Exception {
		acti.archieveARecord();

	}

	@Step
	public void filter(String AddEdit) throws Exception {
		if (AddEdit == "Add") {
			acti.sortWithFilters(acti.FirstName, acti.LstName, acti.ADDStartDate, acti.ADDEndDate, acti.ADDAbsenceCode);
		} else if (AddEdit == "Edit") {
			acti.sortWithFilters(acti.FirstName, acti.LstName, acti.EDITStartDate, acti.EDITEndDate,
					acti.EDITAbsenceCode);
		}
	}
}
