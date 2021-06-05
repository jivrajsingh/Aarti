package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientGroupsAndBarriers;

import net.thucydides.core.annotations.Step;

public class ClientGroupsAndBarriersSteps extends GenericStep {

	ClientGroupsAndBarriers acti;

	@Step
	public void clickOnGrpAndBarriersSubTopTab() throws Exception {
		acti.clickOnGrpAndBarriersSubTopTab();
		acti.verifySidetabs();
	}

	@Step
	public void clickEDITGroupsSIDETAB() throws Exception {
		acti.clickEDITGroupsSIDETAB();
	}

	@Step
	public void FillGroupsForm() throws Exception {
		acti.verifyEDITGroupForm();
		acti.FillEDITGroupForm();
	}

	@Step
	public void clickEDITBarriersSIDETAB() throws Exception {
		acti.clickEDITBarriersSIDETAB();
	}

	@Step
	public void FillBarriersForm() throws Exception {
		acti.verifyEDITBarriersForm();
		acti.FillEDITBarriersForm();
	}
	
	@Step
	public void VerifyPageAfterFillingForm(String GroupsBarriers) throws Exception {
		acti.VerifyPage(GroupsBarriers);
	}

	@Step
	public void clickEditGrpReturnHomepage() throws Exception{
		acti.clickEDITGroupsSIDETAB();
		acti.returnToHomePage();
	}
	
	@Step
	public void clickEditBarrierReturnHomepage() throws Exception{
		acti.clickEDITBarriersSIDETAB();
		acti.returnToHomePage();
	}

}
