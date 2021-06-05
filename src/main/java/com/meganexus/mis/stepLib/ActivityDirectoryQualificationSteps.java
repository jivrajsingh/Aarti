package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryQualificationPage;
import com.meganexus.mis.pageObjectLib.ClientQualificationsPage;

import net.thucydides.core.annotations.Step;


public class ActivityDirectoryQualificationSteps extends GenericStep{

	
	ActivityDirectoryQualificationPage acti;
	
		@Step
		public void clickActivityDirectorySIDETAB() throws Exception{
			acti.clickActivityDirectorySIDETAB();
			acti.verifySidetabs();
		}
	
		@Step
		public void intialVerificationForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDQualificationSIDETAB() throws Exception{
			acti.clickADDQualificationSIDETAB();
		}
		
		@Step
		public void FillAddForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditQualificationForm(acti.ADDCourseQ, acti.ADDQualificationQ, acti.ADDLevelQ, acti.ADDUnitQ ,acti.ADDUnitStatusQ ,
					acti.ADDUnitStartDateQ ,acti.ADDUnitEndDateQ, acti.ADDAwardingBodyCodeQ ,acti.ADDAwardingBodyQ ,acti.ADDCreditQ ,acti.ADDGLHQ);
		}
		
		@Step
		public void VerifyARecordAfterAdd(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit =="Add"){
			acti.VerifyContentsOfRowInTable(acti.ADDCourseQ, acti.ADDQualificationQ, acti.ADDLevelQ, acti.ADDUnitStartDateQ,
					acti.ADDUnitEndDateQ, acti.ADDUnitStatusQ);}
			else if(AddOrEdit =="Edit"){
				acti.VerifyContentsOfRowInTable(acti.EDITCourse,acti.EDITQualification, acti.EDITLevel, acti.EDITUnitStartDate,
						acti.EDITUnitEndDate, acti.EDITUnitStatus);}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditQualificationForm(acti.ADDCourseQ, acti.ADDQualificationQ, acti.ADDLevelQ, acti.ADDUnitQ ,acti.ADDUnitStatusQ ,
					acti.ADDUnitStartDateQ ,acti.ADDUnitEndDateQ, acti.ADDAwardingBodyCodeQ ,acti.ADDAwardingBodyQ ,acti.ADDCreditQ ,acti.ADDGLHQ);
		}
		
		@Step
		public void verifyTable(String AddOrEdit) throws Exception{
			if(AddOrEdit =="Add"){
			acti.VerifyActivityDirectoryQualificationList("Add");
			}
			else if(AddOrEdit =="Edit"){
				acti.VerifyActivityDirectoryQualificationList("Edit");
				}
		}
		
		@Step
		public void sortByFilters(String AddOrEdit) throws Exception {
			if (AddOrEdit == "Add") {
				acti.sortWithFilters(acti.ADDCourseQ, acti.ADDQualificationQ, acti.ADDLevelQ, acti.ADDUnitStartDateQ,
						acti.ADDUnitEndDateQ, acti.ADDUnitStatusQ);
			} else if (AddOrEdit == "Edit") {
				acti.sortWithFilters(acti.EDITCourse,acti.EDITQualification, acti.EDITLevel, acti.EDITUnitStartDate,
						acti.EDITUnitEndDate, acti.EDITUnitStatus);
			}
		}
		
		@Step
		public void clickJMESA() throws Exception{
			acti.clickOnJMESA();
		}
		
		@Step
		public void clickADDRetunHomepage() throws Exception{
			acti.clickADDQualificationSIDETAB();
			acti.returnToHomePage();
			waitABit(4000);
		}
}
