package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryCoursesPage;

import net.thucydides.core.annotations.Step;

public class ActivityDirectoryCourseSteps extends GenericStep {

	ActivityDirectoryCoursesPage acti;

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
	public void clickADDCourseSIDETAB() throws Exception {
		acti.clickADDCourseSIDETAB();
	}

	@Step
	public void FillAddForm() throws Exception {
		acti.verifyADDEDITForm();
		acti.FillAddEditCoursesForm(acti.ADDPathways, acti.ADDActArea, acti.ADDCourse, acti.ADDStatus,
				acti.ADDStartDate, acti.ADDEndDate, acti.ADDProvider,acti.ADDIfOtherPro, acti.ADDFundingSource, acti.ADDPriorityArea);
	}

	@Step
	public void VerifyARecordAfterAdd(String AddOrEdit) throws Exception {
		acti.clickVIEWButton();
		if (AddOrEdit == "Add") {
			acti.VerifyVIEWCoursesPage(acti.ADDPathways,acti.ADDActArea, acti.ADDCourse, acti.ADDStatus, acti.ADDStartDate,
					acti.ADDEndDate, acti.ADDProvider, acti.ADDFundingSource, acti.ADDPriorityArea);
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWCoursesPage(acti.EDITPathways,acti.EDITActArea, acti.EDITCourse, acti.EDITStatus, acti.EDITStartDate,
					acti.EDITEndDate, acti.EDITProvider, acti.EDITFundingSource, acti.EDITPriorityArea);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		acti.clickEDITButton();
		acti.FillAddEditCoursesForm(acti.EDITPathways, acti.EDITActArea, acti.EDITCourse, acti.EDITStatus,
				acti.EDITStartDate, acti.EDITEndDate, acti.EDITProvider, acti.ADDIfOtherPro,acti.EDITFundingSource, acti.EDITPriorityArea);
	}

	@Step
	public void verifyTable(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.sortWithFilters(acti.ADDCourse, acti.ADDPathways, acti.ADDStartDate, acti.ADDEndDate,
					acti.ADDStatus);
			acti.VerifyActivityAreaCoursesList("Add");
		} else if (AddOrEdit == "Edit") {
			acti.sortWithFilters(acti.EDITCourse, acti.EDITPathways, acti.EDITStartDate, acti.EDITEndDate,
					acti.EDITStatus);
			acti.VerifyActivityAreaCoursesList("Edit");
		}
	}

	@Step
	public void clickJMESA() throws Exception {
		acti.clickOnJMESA();
	}

	@Step
	public void sortByFilters(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.sortWithFilters(acti.ADDCourse, acti.ADDPathways, acti.ADDStartDate, acti.ADDEndDate,
					acti.ADDStatus);
		} else if (AddOrEdit == "Edit") {
			acti.sortWithFilters(acti.EDITCourse, acti.EDITPathways, acti.EDITStartDate, acti.EDITEndDate,
					acti.EDITStatus);
		}
		else
			acti.sortWithFilters("","","","","");// Dont verify any records, just chk everything is working 
	}
	
	@Step
	public void clickADDRetunHomepage() throws Exception{
		acti.clickADDCourseSIDETAB();
		acti.returnToHomePage();
		waitABit(4000);
	}
}
