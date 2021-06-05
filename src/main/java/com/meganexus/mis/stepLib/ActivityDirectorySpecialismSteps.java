package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityDirectorySpecialismPage;

import net.thucydides.core.annotations.Step;

public class ActivityDirectorySpecialismSteps extends GenericStep {

	ActivityDirectorySpecialismPage acti;

	@Step
	public void clickActivityDirectorySIDETAB() throws Exception {
		acti.clickActivityDirectorySIDETAB();
		acti.verifySidetabs();
	}

	@Step
	public void intialVerificationForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickADDSpecialismSIDETAB() throws Exception {
		acti.clickADDSpecialismSIDETAB();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm();
		acti.FillAddEditSpecialismForm(acti.ADDSpecialismNameSpcl, acti.ADDStartDateSpcl, acti.ADDSkillLevelSpcl,
				acti.ADDEndDateSpcl);
	}

	@Step
	public void VerifyARecordAfterAdd(String AddorEdit) throws Exception {
		acti.clickVIEWButton();
		if (AddorEdit == "Add") {
			acti.VerifyVIEWSpecialismPage(acti.ADDSpecialismNameSpcl, acti.ADDStartDateSpcl, acti.ADDSkillLevelSpcl,
					acti.ADDEndDateSpcl);
		} else if (AddorEdit == "Edit") {
			acti.VerifyVIEWSpecialismPage("", acti.EDITStartDate, "",
					acti.EDITEndDate);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.FillAddEditSpecialismForm("", acti.EDITStartDate, "",
				acti.EDITEndDate);
	}

	@Step
	public void verifyTable(String AddorEdit) throws Exception {
		if (AddorEdit == "Add") {
			acti.FilterResults(acti.ADDSpecialismNameSpcl, acti.ADDSkillLevelSpcl, acti.ADDStartDateSpcl,
					acti.ADDEndDateSpcl);
			acti.VerifyActivityDirectorySpecialismList("Add");
		} else if (AddorEdit == "Edit") {
			acti.FilterResults("", "", acti.EDITStartDate, acti.EDITEndDate);
			acti.VerifyActivityDirectorySpecialismList("Edit");
		}
	}

	@Step
	public void clickJMESA() throws Exception {
		acti.clickOnJMESA();
	}

	@Step
	public void sortByFilters(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.FilterResults(acti.ADDSpecialismNameSpcl, acti.ADDSkillLevelSpcl, acti.ADDStartDateSpcl,
					acti.ADDEndDateSpcl);
		} else if (AddOrEdit == "Edit") {
			acti.FilterResults(acti.ADDSpecialismNameSpcl, acti.ADDSkillLevelSpcl, acti.EDITStartDate, acti.EDITEndDate);
		} else
			acti.FilterResults("", "", "", "");// When you just want to verify table and not the entries
	}

	@Step
	public void clickADDRetunHomepage() throws Exception {
		acti.clickADDSpecialismSIDETAB();
		acti.returnToHomePage();
	}
}
