package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientSupportDocPage;

import net.thucydides.core.annotations.Step;

public class ClientSupportDocSteps extends GenericStep {

	ClientSupportDocPage acti;
	
	@Step
	public void initialVerifiOfForm() throws Exception {
		acti.verifyForm();
	}

	@Step
	public void clickADDSupportDocSIDETAB() throws Exception {
		acti.clickADDSupportDocSIDETAB();
	}

	@Step
	public void UploadDocumentToForm() throws Exception {
		acti.verifyADDEDITForm();
		acti.UploadDocumentToForm();

	}

	@Step
	public void VerifySupportDocumentList() throws Exception {
		acti.VerifySupportDocumentList();
	}

	@Step
	public void clickVIEWButton() throws Exception {
		acti.clickVIEWButton();
		waitABit(20000);
	}
	
	@Step
	public void clickARCHIEVEButton() throws Exception {
		acti.clickARCHIEVEButton();
	}
}
