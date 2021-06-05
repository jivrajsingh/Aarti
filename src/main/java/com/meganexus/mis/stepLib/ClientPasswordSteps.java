package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientsPasswordPage;
import com.meganexus.mis.testartifacts.XlsReader;

import net.thucydides.core.annotations.Step;

public class ClientPasswordSteps extends GenericStep {

	ClientsPasswordPage acti;
	
	@Step
	public void NavigateToPasswordSubTopTab() throws Exception {
		acti.clickOnPasswordSubTopTab();
		acti.verifySidetabs();
	}

	@Step
	public void initialVerifiOfForm() throws Exception {
		acti.verifyHomePage();
	}

	@Step
	public void clickResetPasswordBUTTON() throws Exception {
		acti.clickResetPasswordBUTTON();
	}

	@Step
	public void verifyOTPPage() throws Exception {
		acti.verifyOTPPage();

	}

	@Step
	public void CompareOTP() throws Exception {
		acti.CompareOTP();
	}

}
