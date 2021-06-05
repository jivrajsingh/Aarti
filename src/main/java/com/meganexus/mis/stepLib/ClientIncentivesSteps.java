package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientsIncentivesPage;
import com.meganexus.mis.pageObjectLib.SearchAndViewClient;

import net.thucydides.core.annotations.Step;

public class ClientIncentivesSteps extends GenericStep {

	ClientsIncentivesPage acti;
	SearchAndViewClient svc;

	@Step
	public void NavigateToCLIENTSMainPage() throws Exception {
		svc.NavigateToCLIENTSMainPage();
	}

	@Step
	public void Openclient() throws Exception {
		svc.Searchclient();
		svc.viewclient();
	}

	@Step
	public void NavigateToIncentivesSubTopTab() throws Exception {
		acti.clickOnIncentivesSubTopTab();
		acti.verifySidetabs();
	}

	@Step
	public void initialVerifiOfForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickADDIncentivesSIDETAB() throws Exception {
		acti.clickADDIncentivesSIDETAB();
	}

	@Step
	public void FillAddIncentivesForm() throws Exception {
		acti.Sorting();
		acti.verifyADDEDITForm();
		acti.FillAddEditIncentivesForm(acti.ADDIncentiveType, acti.ADDDate, acti.ADDTime, "", "", "");
	}

	@Step
	public void VerifyARecordAfterAddorEdit(String AddOrEdit) throws Exception {
		acti.clickVIEWButton();
		if (AddOrEdit == "Add") {
			acti.VerifyVIEWIncentivesPage(acti.ADDIncentiveType, acti.ADDDate, acti.ADDTime, "", "", "");
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWIncentivesPage(acti.EDITIncentiveType, acti.EDITDate, acti.EDITTime, "", "", "");
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.FillAddEditIncentivesForm(acti.EDITIncentiveType, acti.EDITDate, acti.EDITTime, "", "", "");
	}

	@Step
	public void verifyTable(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.VerifyClientIncentivesList("Add");
		} else if (AddOrEdit == "Edit") {
			acti.VerifyClientIncentivesList("Edit");
		}
		else
			acti.VerifyClientIncentivesList("");
	}

	@Step
	public void archieveARecord() throws Exception {
		acti.archieveARecord();
	}

	@Step
	public void clickADDRetunHomepage() throws Exception {
		acti.clickADDIncentivesSIDETAB();
		acti.returnToHomePage();
	}

	@Step
	public void clickEDITRetunHomepage() throws Exception {
		acti.clickEDITButton();
		acti.returnToHomePage();
	}

}
