package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientsQuestionsPage;
import com.meganexus.mis.pageObjectLib.SearchAndViewClient;

import net.thucydides.core.annotations.Step;


public class ClientQuestionsSteps extends GenericStep{

	
	ClientsQuestionsPage acti;
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
		public void NavigateToQualificationsSubTopTab() throws Exception{
			acti.clickOnQuestionsSubTopTab();
			acti.verifySidetabs();
		}
	
		@Step
		public void initialVerifiOfForm() throws Exception{
			acti.verifyClientQuestionForm();
		}
		
		
		@Step
		public void clickEDITQuestions() throws Exception{
			acti.clickEDITQuestions();
		}
		
		@Step
		public void FillQuestionsForm() throws Exception{
			acti.FillForm();
		}
		
		@Step
		public void VerifyFormAfterEditing() throws Exception{
			acti.VerifyProjectQuesPageAfterFilling();
		}
		
		@Step
		public void clickEDITRetunHomepage() throws Exception{
			acti.clickEDITQuestions();
			acti.returnToHomePage();
		}
}
