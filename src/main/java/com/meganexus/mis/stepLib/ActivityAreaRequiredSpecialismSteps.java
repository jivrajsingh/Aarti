package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ActivityAreaPage;
import com.meganexus.mis.pageObjectLib.ActivityAreaRequiredSpecialismPage;

import net.thucydides.core.annotations.Step;


public class ActivityAreaRequiredSpecialismSteps extends GenericStep{

	
	ActivityAreaRequiredSpecialismPage acti;
		
		@Step
			public void NavigateToViewActivityAREA() throws Exception{
			acti.NavigateToViewActArea();
		}
	
		@Step
		public void NavigateToViewTEAM() throws Exception{
			acti.NavigateToViewTEAM();
			acti.verifySidetabs();
		}
	
		@Step
		public void intialVerificationForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDReqSpecialismSIDETAB() throws Exception{
			acti.clickADDReqSpecialismSIDETAB();
		}
		
		@Step
		public void FillAddForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditReqSpecialismForm(acti.ADDSpecialism,acti.ADDSkillLevel, acti.ADDReqQuantity, 
					acti.ADDStartDate, acti.ADDEndDate);
		}
		
		@Step
		public void VerifyARecordAfterAdd(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit == "Add")
			{
				acti.VerifyVIEWReqSpecialismPage(acti.ADDSpecialism,acti.ADDSkillLevel, acti.ADDReqQuantity, 
						acti.ADDStartDate, acti.ADDEndDate);
			}
			else if(AddOrEdit == "Edit")
			{
				acti.VerifyVIEWReqSpecialismPage(acti.EDITSpecialism,acti.EDITSkillLevel, acti.EDITReqQuantity, 
						acti.EDITStartDate, acti.EDITEndDate);
			}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditReqSpecialismForm(acti.EDITSpecialism,acti.EDITSkillLevel, acti.EDITReqQuantity, 
					acti.EDITStartDate, acti.EDITEndDate);
		}
		
		@Step
		public void verifyTable(String AddOrEdit) throws Exception{
			if(AddOrEdit == "Add")
			{
			acti.VerifyActivityAreaReqSpecialismList("Add");
			}
			else if(AddOrEdit == "Edit")
			{
			acti.VerifyActivityAreaReqSpecialismList("Edit");
			}
		}
		
		@Step
		public void clickJMESA() throws Exception{
			acti.clickOnJMESA();
		}
		
		@Step
		public void clickSpecialismToSortLatestEntryonTOP() throws Exception{
			// When you click twice you get the latest added entry on the list in descending order-
			acti.SpecialismTable.click();
			waitABit(500);
			acti.SpecialismTable.click();
			waitABit(2000);
		}
}
