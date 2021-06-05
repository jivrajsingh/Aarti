package com.meganexus.mis.stepLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;
import com.meganexus.mis.pageObjectLib.ActivityAreaTeamPage;

import net.thucydides.core.annotations.Step;

public class ActivityAreaTeamSteps extends GenericStep {

	ActivityAreaTeamPage acti;

	@Step
	public void NavigateToViewActivityAREArecord() throws Exception {
		acti.NavigateToViewActArea();
		acti.verifySidetabs();

	}

	@Step
	public void intialVerificationForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickADDTeamSIDETAB() throws Exception {
		acti.clickADDTeamSIDETAB();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm();
		acti.FillAddEditTeamForm(acti.ADDTeam, acti.ADDCapacity, acti.ADDPurpose, acti.ADDStartDate, acti.ADDEndDate);
	}

	@Step
	public void VerifyARecordAfterAdd(String AddorEdit) throws Exception {
		acti.FilterResults(acti.ADDTeam, "");
		acti.clickVIEWButton();
		if (AddorEdit == "Add") {
			acti.VerifyVIEWTeamPage(acti.ADDTeam, acti.ADDCapacity, acti.ADDPurpose, acti.ADDStartDate,
					acti.ADDEndDate);
			
		}
		if (AddorEdit == "Edit") {
			acti.VerifyVIEWTeamPage(acti.EDITTeam, acti.EDITCapacity, acti.EDITPurpose, acti.EDITStartDate,
					acti.EDITEndDate);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.FilterResults(acti.ADDTeam, "");
		acti.clickEDITButton();
		acti.FillAddEditTeamForm(acti.EDITTeam, acti.EDITCapacity, acti.EDITPurpose, acti.EDITStartDate,
				acti.EDITEndDate);
	}

	@Step
	public void verifyTable(String AddorEdit) throws Exception {
		acti.FilterResults(acti.ADDTeam, "");
		if (AddorEdit == "Add") {
			acti.VerifyActivityAreaTeamList("Add");
		}
		if (AddorEdit == "Edit") {
			acti.VerifyActivityAreaTeamList("Edit");
		}
	}

	@Step
	public void clickADDRetunHomepage() throws Exception {
		acti.clickADDTeamSIDETAB();
		acti.returnToHomePage();
	}

	@Step
	public void clickEDITRetunHomepage() throws Exception {
		acti.clickEDITButton();
		acti.returnToHomePage();
	}

	 @Step
	 public void clickJMESA() throws Exception{
	 acti.ClickOnJMESA();
	 }
	 
	 @Step // here i will pass the parameters from different excels sheets hence i have parameterized this
	 public void justDoFilteringOfTeam(String Team, String StartDate) throws Exception{
	 acti.FilterResults("","");
	 }
	 
	 @Step
	 public void ClickAddReturnHomepage() throws Exception{
		 acti.clickADDTeamSIDETAB();
		 waitABit(2000);
		 acti.returnToHomePage();
	 }
	 
	 @Step
	 public void ClickEditReturnHomepage() throws Exception{
		 acti.clickEDITButton();
		 waitABit(2000);
		 acti.returnToHomePage();
	 }
	 
	 @Step
	 public void ClickViewReturnHomepage() throws Exception{
		 acti.clickVIEWButton();
		 waitABit(2000);
		 acti.returnToHomePage();
	 }
}
