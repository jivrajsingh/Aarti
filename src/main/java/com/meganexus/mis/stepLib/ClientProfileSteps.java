package com.meganexus.mis.stepLib;

import com.meganexus.mis.pageObjectLib.ClientsProfilePage;

import net.thucydides.core.annotations.Step;

public class ClientProfileSteps extends GenericStep {

	ClientsProfilePage acti;

	@Step
	public void NavigateToCLIENTSMainPage() throws Exception {
		acti.NavigateToCLIENTSMainPage();
	}

	@Step
	public void initialVerifiOfForm() throws Exception {
		acti.verifySidetabs();
		acti.verifyForm();
	}

	@Step
	public void clickADDClientSIDETAB() throws Exception {
		acti.clickADDClientSIDETAB();
	}

	@Step
	public void AddClient() throws Exception {
		acti.verifyAddPartnerForm();
		acti.SelectPartner();
		acti.verifyADDForm1();
		acti.FillAddClientForm1(acti.ADDFirstName, acti.ADDSurname, acti.ADDDOB);
		acti.verifyADDForm2();
		acti.FillAddClientForm2(acti.ADDUsername, acti.ADDTitle, acti.ADDMiddleName, acti.ADDEmail, acti.ADDPhnNo,
				acti.ADDGender, acti.ADDNiNo, acti.ADDAddLine1, acti.ADDAddLine2, acti.ADDAddLine3, acti.ADDTown,
				acti.ADDCounty, acti.ADDCountry, acti.ADDPostCode);
	}

	@Step
	public void VerifyARecordAfterAddEdit(String AddOrEdit) throws Exception {
		acti.clickVIEWButton();
		acti.verifySidetabsOnViewpage();
		if (AddOrEdit == "Add") {
			// acti.VerifyVIEWClientProfilePage(acti.ADDSurname,acti.ADDUsername,
			// acti.ADDGender, acti.ADDAddLine1
			// ,acti.ADDPostCode,acti.ADDDateOfRegistration, acti.ADDFirstName,
			// acti.ADDDOB, acti.ADDTown);
		} else if (AddOrEdit == "Edit") {
			acti.VerifyVIEWClientProfilePage(acti.EDITSurname, acti.EDITUsername, acti.EDITGender, acti.EDITAddLine1,
					acti.EDITPostCode, acti.EDITDateOfRegistration, acti.EDITFirstName, acti.EDITDOB, acti.EDITTown);
		}
	}

	@Step
	public void FillEditForm() throws Exception {
		waitABit(3000);
		acti.clickVIEWButton();
		waitABit(2000);
		acti.clickEDITCLIENTButton();
		acti.FillEditClientForm2(acti.EDITUsername, acti.EDITFirstName, acti.EDITSurname, acti.EDITDOB, acti.EDITGender,
				acti.EDITAddLine1, acti.EDITTown, acti.EDITPostCode);
		waitABit(3000);
		System.out.println("Editing completed");
	}

	@Step
	public void verifyTable(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.VerifyClientProfileList("Add");
		} else if (AddOrEdit == "Edit") {
			acti.VerifyClientProfileList("Edit");
		}
	}

	@Step
	public void filterByNameSurname(String AddOrEdit) throws Exception {
		if (AddOrEdit == "Add") {
			acti.filterByNameSurname("Add");
		} else if (AddOrEdit == "Edit") {
			acti.filterByNameSurname("Edit");
		}
	}
}
