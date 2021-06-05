package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityDirectoryCertificationPage;

import net.thucydides.core.annotations.Step;


public class ActivityDirectoryCertificationSteps extends GenericStep{

	
	ActivityDirectoryCertificationPage acti;
	
		@Step
		public void clickActivityDirectoryTopTab() throws Exception{
			acti.NavigateToActivityDIRECTORYMainPage();
		}
	
		@Step
		public void clickActivityDirectorySIDETab() throws Exception{
			acti.verifySidetabs();
			acti.clickActivityDirectorySIDETAB();
		}
	
		@Step
		public void intialVerificationForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDCertificationSIDETAB() throws Exception{
			acti.clickADDCertificationSIDETAB();
		}
		
		@Step
		public void FillAddForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditCertificateForm(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
					acti.ADDStatus, acti.ADDDate, acti.ADDCertiStat, acti.ADDIfOther);
		}
		
		@Step
		public void VerifyARecordAfterAdd(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit == "Add")
			{
				acti.VerifyVIEWActivityAreaPage(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
						acti.ADDStatus, acti.ADDDate, acti.ADDCertiStat, acti.ADDIfOther);
			}
			else if(AddOrEdit == "Edit")
			{
				acti.VerifyVIEWActivityAreaPage(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
						acti.ADDStatus, acti.EDITDate, acti.EDITCertiStat,  acti.EDITIfOther);
			}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditCertificateForm(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
					acti.ADDStatus, acti.EDITDate, acti.EDITCertiStat,  acti.EDITIfOther);
		}
		
		@Step
		public void verifyTable(String AddOrEdit) throws Exception{
			if(AddOrEdit == "Add")
			{
			acti.VerifyActivityDirectoryCertificationList("Add");
			}
			else if(AddOrEdit == "Edit")
			{
			acti.VerifyActivityDirectoryCertificationList("Edit");
			}
		}
		
		@Step
		public void clickJMESA() throws Exception{
			acti.clickOnJMESA();
		}
		
		@Step
		public void FilterResults(String AddEdit) throws Exception{
			if(AddEdit =="Add"){
				acti.sortWithFilters(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
						acti.ADDStatus, acti.ADDDate);
			}
			else if(AddEdit =="Edit"){
				acti.sortWithFilters(acti.ADDPathways, acti.ADDCourse, acti.ADDQualification, 
					acti.ADDStatus, acti.EDITDate);
			}
			else
				acti.sortWithFilters("","","","","");
		}
}
