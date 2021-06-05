package com.meganexus.mis.stepLib;

import org.junit.Test;

import com.meganexus.mis.pageObjectLib.ClientQualificationsPage;
import com.meganexus.mis.pageObjectLib.SearchAndViewClient;

import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class ClientQualificationsSteps extends GenericStep {

	ClientQualificationsPage acti;
	SearchAndViewClient svc;

	@Step
	public void NavigateToCLIENTSMainPage() throws Exception {
		svc.NavigateToCLIENTSMainPage();
	}

	@Step
	public void SearchClient() throws Exception {
		svc.Searchclient();
	}

	@Step
	public void viewClient() throws Exception {
		svc.viewclient();
	}

	@Step
	public void NavigateToQualificationsSubTopTab() throws Exception {
		acti.clickOnQualificationsSubTopTab();
		acti.verifySidetabs();
	}

	@Step
	public void initialVerifiOfForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickADDQualificationSIDETAB() throws Exception {
		acti.clickADDQualificationSIDETAB();
	}

	@Step
	public void FillAddQualificationForm() throws Exception {
		acti.verifyADDEDITForm();
		acti.FillAddEditQualificationForm(acti.ADDPathway, acti.ADDCourse, acti.ADDQualification, acti.ADDLevel,
				acti.ADDStartDate, acti.ADDExpectedEndDate, acti.ADDQualifiStat, acti.ADDReasonFrWithDrwl,
				acti.ADDQualiStatDate);
	}

	@Step
	public void VerifyARecordAfterAddEdit(String AddOrEdit) throws Exception {
		acti.clickVIEWButton();
		if (AddOrEdit == "Add") {
			acti.VerifyVIEWQualificationPage(acti.ADDPathway, acti.ADDCourse, acti.ADDQualification, acti.ADDLevel,
					acti.ADDStartDate, acti.ADDExpectedEndDate, acti.ADDQualifiStat, acti.ADDReasonFrWithDrwl,
					acti.ADDQualiStatDate);
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWQualificationPage(acti.EDITPathway, acti.EDITCourse, acti.EDITQualification, acti.EDITLevel,
					acti.EDITStartDate, acti.EDITExpectedEndDate, acti.EDITQualifiStat, acti.EDITReasonFrWithDrwl,
					acti.EDITQualiStatDate);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.FillAddEditQualificationForm(acti.EDITPathway, acti.EDITCourse, acti.EDITQualification, acti.EDITLevel,
				acti.EDITStartDate, acti.EDITExpectedEndDate, acti.EDITQualifiStat, acti.EDITReasonFrWithDrwl,
				acti.EDITQualiStatDate);
	}

	@Step
	public void verifyTable(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.VerifyActivityDirectoryQualificationList("Add");
		} else if (AddOrEdit == "Edit") {
			acti.VerifyActivityDirectoryQualificationList("Edit");
		}
	}

	@Step
	public void clickADDAndReturnHomePg() throws Exception {
		acti.clickADDQualificationSIDETAB();
		acti.returnToHomePage();
	}

	@Step
	public void clickEDITAndReturnHomePg() throws Exception {
		acti.clickEDITButton();
		acti.returnToHomePage();
	}

	@Step
	public void clickJMESA() throws Exception {
		acti.clickOnJMESA();
	}

	@Test
	@Screenshots(afterEachStep = true)
	public void takeScreenshot() throws Exception {
		getDriver().getTitle();
	}
}
