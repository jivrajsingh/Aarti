package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientQualificationsPage;
import com.meganexus.mis.pageObjectLib.ClientsAssessmentPage;
import com.meganexus.mis.pageObjectLib.SearchAndViewClient;

import net.thucydides.core.annotations.Step;


public class ClientsAssessmentSteps extends GenericStep{

	ClientsAssessmentPage acti;
	SearchAndViewClient svc;
	
		@Step
		public void NavigateToCLIENTSMainPage() throws Exception{
			svc.NavigateToCLIENTSMainPage();
		}
	
		@Step
		public void OpenClient() throws Exception{
			svc.Searchclient();
			svc.viewclient();
		}
	
		@Step
		public void NavigateToAssessmentsSubTopTab() throws Exception{
			acti.clickOnAssessmentsSubTopTab();
			acti.verifySidetabs();
		}
		
		@Step
		public void initialVerifiOfForm() throws Exception{
			acti.verifyForm();
		}
		
		@Step
		public void clickADDAssessmentSIDETAB() throws Exception{
			acti.clickADDAssessmentSIDETAB();
		}
		
		@Step
		public void FillAddAssessmentForm() throws Exception{
			acti.verifyADDEDITForm();
			acti.FillAddEditAssessmentForm(acti.ADDAssessType,acti.ADDAssessComplDate);
		}
		
		@Step
		public void VerifyARecordAfterAddOrEdit(String AddOrEdit) throws Exception{
			acti.clickVIEWButton();
			if(AddOrEdit == "Add")
			{
				acti.VerifyVIEWAssessmentPage(acti.ADDAssessType,acti.ADDAssessComplDate);
			}
			else if(AddOrEdit == "Edit")
			{
				acti.VerifyVIEWAssessmentPage(acti.EDITAssessType,acti.EDITAssessComplDate);
			}
		}
		
		@Step
		public void FillEditForm() throws Exception{
			acti.clickEDITButton();
			acti.FillAddEditAssessmentForm(acti.EDITAssessType,acti.EDITAssessComplDate);
		}
		
		@Step
		public void verifyTable(String AddOrEdit) throws Exception{
			if(AddOrEdit == "Add")
			{
			acti.VerifyClientAssessmentList("Add");
			}
			else if(AddOrEdit == "Edit")
			{
			acti.VerifyClientAssessmentList("Edit");
			}
		}
		
		@Step
		public void clickJMESA() throws Exception{
			acti.clickOnJMESA();
		}
		
		@Step
		public void sortByFilters(String AddOrEdit) throws Exception {
			if (AddOrEdit == "Add") {
				acti.sortWithFilters("Add", acti.ADDAssessType, acti.ADDAssessComplDate);
			} else if (AddOrEdit == "Edit") {
				acti.sortWithFilters("Edit", acti.EDITAssessType, acti.EDITAssessComplDate);
			}
		}
		
		@Step
		public void JustSearchAClient() throws Exception {
			svc.Searchclient();
		}
		
		@Step
		public void ViewAClient() throws Exception {
			svc.viewclient();
		}
		
}
