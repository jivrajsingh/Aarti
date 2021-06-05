package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientSpecialismPage;

import net.thucydides.core.annotations.Step;


public class ClientSpecialismSteps extends GenericStep{

	
	ClientSpecialismPage acti;
	
		@Step
		public void NavigateToCLIENTSMainPage() throws Exception{
			acti.NavigateToCLIENTSMainPage();
		}
	
		@Step
		public void NavigateToQualificationsSubTopTab() throws Exception{
			acti.clickOnQualificationsSubTopTab();
			acti.verifySidetabs();
		}
		
		@Step
		public void initialVerifiOfForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDSpecialismSIDETAB() throws Exception{
			acti.clickADDSpecialismSIDETAB();
		}
		
		@Step
		public void FillAddSpecialismForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditSpecialismForm(acti.ADDSpecialism,acti.ADDSkillLevel);
		}
		
		@Step
		public void VerifyARecordAfterAddorEdit(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit == "Add")
			{
				acti.VerifyVIEWSpecialismPage(acti.ADDSpecialism,acti.ADDSkillLevel);
			}
			else if(AddOrEdit == "Edit")
			{
				acti.VerifyVIEWSpecialismPage(acti.EDITSpecialism,acti.EDITSkillLevel);
			}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditSpecialismForm(acti.EDITSpecialism,acti.EDITSkillLevel);
		}
		
		@Step
		public void verifyTable(String AddOrEdit) throws Exception{
			if(AddOrEdit == "Add")
			{
			acti.VerifyClientSpecialismList("Add");
			}
			else if(AddOrEdit == "Edit")
			{
			acti.VerifyClientSpecialismList("Edit");
			}
		}
		
		@Step
		public void clickJMESA() throws Exception{
			acti.clickOnJMESA();
		}
}
