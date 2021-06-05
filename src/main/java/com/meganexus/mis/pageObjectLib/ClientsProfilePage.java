package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClientsProfilePage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	int row = XlsReader.getCellRowNum("PROFILE", 18, "No");

	public String ADDUsername = XlsReader.getCellData("PROFILE", 0, row);
	public String ADDTitle = XlsReader.getCellData("PROFILE", 1, row);
	public String ADDFirstName = XlsReader.getCellData("PROFILE", 2, row);
	public String ADDMiddleName = XlsReader.getCellData("PROFILE", 3, row);
	public String ADDSurname = XlsReader.getCellData("PROFILE", 4, row);
	public String ADDDOB = XlsReader.getCellData("PROFILE", 5, row);
	public String ADDEmail = XlsReader.getCellData("PROFILE", 6, row);
	public String ADDPhnNo = XlsReader.getCellData("PROFILE", 7, row);
	public String ADDGender = XlsReader.getCellData("PROFILE", 8, row);
	public String ADDNiNo = XlsReader.getCellData("PROFILE", 9, row);
	public String ADDAddLine1 = XlsReader.getCellData("PROFILE", 10, row);
	public String ADDAddLine2 = XlsReader.getCellData("PROFILE", 11, row);
	public String ADDAddLine3 = XlsReader.getCellData("PROFILE", 12, row);
	public String ADDTown = XlsReader.getCellData("PROFILE", 13, row);
	public String ADDCounty = XlsReader.getCellData("PROFILE", 14, row);
	public String ADDCountry = XlsReader.getCellData("PROFILE", 15, row);
	public String ADDPostCode = XlsReader.getCellData("PROFILE", 16, row);

	public String EDITFirstName = "";
	public String EDITSurname = "";
	public String EDITUsername = "";
	public String EDITGender = "";
	public String EDITDOB = "";
	public String EDITAddLine1 = ADDAddLine1 + "Edited";
	public String EDITTown = ADDTown + "Edited";
	public String EDITPostCode = "";
	public String EDITDateOfRegistration = "";

	// Navigate To CLIENTS Main Page
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[1]/a[text()= 'Clients']")
	public WebElementFacade ClientsSubTopTab;

	public void NavigateToCLIENTSMainPage() {
		nt.NavigateToClientsMainTab();
		waitABit(3000);
		ClientsSubTopTab.click();
		waitABit(1000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li/a/span")
	public WebElementFacade AddClientSideTab;

	public void verifySidetabs() throws Exception {
		System.out.println(AddClientSideTab.getText());
		assertContaining("Clients", ClientsSideTab);
		assertContaining("Add Client", AddClientSideTab);
	}

	/**
	 * Verification of all elements on Clients Table.
	 */
	@FindBy(xpath = ".//*[@id='m4315_moduleElement']/h1")
	public WebElementFacade ClientsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_0_referenceNumber']")
	public WebElementFacade ReferenceNumberTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_1_registrationDate']")
	public WebElementFacade DateOfRegistrationTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_2_username']")
	public WebElementFacade UsernameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_3_firstName']")
	public WebElementFacade FirstNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_4_lastName']")
	public WebElementFacade SurnameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[2]/table[2]/thead/tr/td[6]")
	public WebElementFacade AdvisorTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_6_createdBy']")
	public WebElementFacade CreatedByTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_s_7_dateCreated']")
	public WebElementFacade DateCreatedTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[2]/table[2]/thead/tr/td[9]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[2]/table[2]/thead/tr/td[10]")
	public WebElementFacade ArchieveTable;

	public void verifyForm() throws Exception {

		assertContaining("Clients", ClientsTableHeader);// Activity
														// Area
														// Sub
														// Top
														// Tab

		String[] show = { "5 results", "15 results", "50 results", "100 results" }; // load
																					// it
																					// once
																					// only
		checkDDLOptions(showList, show);

		// verify table titles-

		assertContaining("Reference Number", ReferenceNumberTable);
		assertContaining("Date of Registration", DateOfRegistrationTable);
		assertContaining("First Name", FirstNameTable);
		assertContaining("Surname", SurnameTable);
		assertContaining("Advisor", AdvisorTable);
		assertContaining("Created By", CreatedByTable);
		assertContaining("Date Created", DateCreatedTable);
		assertContaining("View", ViewTable);
		assertContaining("Archive", ArchieveTable);

	}

	// -------------------ADD-------------------------//

	// click ADD CLIENT SIDE TAB
	public void clickADDClientSIDETAB() throws Exception {
		AddClientSideTab.click();
	}

	/* FILL PARTNER */
	@FindBy(xpath = ".//*[@id='m7325_moduleElement']/h1")
	public WebElementFacade AddClient;

	@FindBy(xpath = ".//*[@id='m7325_moduleElement']/div/form/fieldset/div[1]/span")
	public WebElementFacade PartnerIsMandat;
	@FindBy(xpath = ".//*[@id='m7325_moduleElement']/div/form/fieldset/div[1]/label")
	public WebElementFacade SelectPartner;

	@FindBy(xpath = ".//*[@id='m7325_moduleElement']/div/form/fieldset/div[2]/div/button")
	public WebElementFacade SelectPartnerAddForm;
	@FindBy(xpath = ".//*[@id='m7325_moduleElement']/div/form/fieldset/div[2]/div/a/span")
	public WebElementFacade CancelPartnerAddForm;

	public void verifyAddPartnerForm() throws Exception {
		assertContaining("Add Client", AddClient);// Table title

		assertContaining("Partner is mandatory field", PartnerIsMandat);
		assertContaining("Please select a partner*", SelectPartner);

		assertContaining("Select", SelectPartnerAddForm);
		assertContaining("Cancel", CancelPartnerAddForm);
	}

	@FindBy(xpath = ".//*[@id='partnerId']")
	public WebElementFacade SelectingPartner;

	public void SelectPartner() throws Exception {
		selectFromDDL(SelectingPartner, "Berwyn", 0);
		SelectPartnerAddForm.click();
		waitABit(2000);
	}

	/* PROFILE PAGE 1 */

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='form_8655']/fieldset/div[1]/label")
	public WebElementFacade FirstNameAddForm1;
	@FindBy(xpath = ".//*[@id='form_8655']/fieldset/div[2]/label")
	public WebElementFacade SurnameAddForm1;
	@FindBy(xpath = ".//*[@id='form_8655']/fieldset/div[3]/label")
	public WebElementFacade DOBAddForm1;

	@FindBy(xpath = ".//*[@id='form_8655']/fieldset/div[4]/div/button")
	public WebElementFacade SubmitPage1AddForm;
	@FindBy(xpath = ".//*[@id='form_8655']/fieldset/div[4]/div/a/span")
	public WebElementFacade CancelPage1AddForm;

	public void verifyADDForm1() throws Exception {

		assertContaining("Add Client", AddClient);// Table title

		assertContaining("First Name*", FirstNameAddForm1);
		assertContaining("Surname*", SurnameAddForm1);
		assertContaining("Date of Birth (dd/mm/yyyy)*", DOBAddForm1);

		assertContaining("Submit", SubmitPage1AddForm);
		assertContaining("Cancel", CancelPage1AddForm);

	}

	@FindBy(xpath = ".//*[@id='m7325_formElement_40785']")
	public WebElementFacade FirstNameAddForm1TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40795']")
	public WebElementFacade SurnameAddForm1TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40805']")
	public WebElementFacade DOBAddForm1TxtBx;

	public void FillAddClientForm1(String FirstName, String Surname, String DOB) throws Exception {
		System.out.println(FirstName);
		FirstNameAddForm1TxtBx.clear();
		FirstNameAddForm1TxtBx.sendKeys(FirstName);

		SurnameAddForm1TxtBx.clear();
		SurnameAddForm1TxtBx.sendKeys(Surname);

		DOBAddForm1TxtBx.clear();
		DOBAddForm1TxtBx.sendKeys(DOB);

		SubmitPage1AddForm.click();
	}

	/* PROFILE PAGE 2 */

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[1]/label")
	public WebElementFacade UsernameAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[2]/label")
	public WebElementFacade TitleAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[3]/label")
	public WebElementFacade FirstnameAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[4]/label")
	public WebElementFacade MiddleNameAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[5]/label")
	public WebElementFacade SurnameAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[6]/label")
	public WebElementFacade DOBAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[7]/label")
	public WebElementFacade EmailAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[8]/label")
	public WebElementFacade PhnNoAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[9]/label")
	public WebElementFacade GenderAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[10]/label")
	public WebElementFacade NINoAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[11]/label")
	public WebElementFacade AddLine1AddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[12]/label")
	public WebElementFacade AddLine2AddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[13]/label")
	public WebElementFacade AddLine3AddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[14]/label")
	public WebElementFacade TownAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[15]/label")
	public WebElementFacade CountyAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[16]/label")
	public WebElementFacade CountryAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[17]/label")
	public WebElementFacade PostcodeAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[18]/label")
	public WebElementFacade AddRefNoAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[19]/label")
	public WebElementFacade InductionBookedDateAddForm2;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[20]/label")
	public WebElementFacade PartnerRefersToAddForm2;

	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[21]/div/button")
	public WebElementFacade SavePage2AddForm;
	@FindBy(xpath = ".//*[@id='form_8665']/fieldset/div[21]/div/a/span")
	public WebElementFacade CancelPage2AddForm;

	public void verifyADDForm2() throws Exception {

		assertContaining("Username*", UsernameAddForm2);
		assertContaining("Title", TitleAddForm2);
		assertContaining("First Name*", FirstnameAddForm2);
		assertContaining("Middle Name", MiddleNameAddForm2);
		assertContaining("Surname*", SurnameAddForm2);
		assertContaining("Date of Birth*", DOBAddForm2);
		assertContaining("Email", EmailAddForm2);
		assertContaining("Phone Number", PhnNoAddForm2);
		assertContaining("Gender*", GenderAddForm2);
		assertContaining("NI Number", NINoAddForm2);
		assertContaining("Address Line 1*", AddLine1AddForm2);
		assertContaining("Address Line 2", AddLine2AddForm2);
		assertContaining("Address Line 3", AddLine3AddForm2);
		assertContaining("Town*", TownAddForm2);
		assertContaining("County", CountyAddForm2);
		assertContaining("Country", CountryAddForm2);
		assertContaining("Postcode*", PostcodeAddForm2);
		assertContaining("Additional Reference Number", AddRefNoAddForm2);
		assertContaining("Induction Booked Date", InductionBookedDateAddForm2);
		assertContaining("Partner Refers To", PartnerRefersToAddForm2);

		assertContaining("Save", SavePage2AddForm);
		assertContaining("Cancel", CancelPage2AddForm);

		System.out.println("Verifcation page 2 complete!!!!");

	}

	@FindBy(xpath = ".//*[@id='m7325_formElement_40975']")
	public WebElementFacade UsernameAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40815']")
	public WebElementFacade TitleAddForm2DDL;
	@FindBy(xpath = ".//*[@id='m7325_formElement_173605']")
	public WebElementFacade MiddleNameAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40905']")
	public WebElementFacade EmailAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40895']")
	public WebElementFacade PhoneNumberAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40915']")
	public WebElementFacade GenderAddForm2DDL;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40925']")
	public WebElementFacade NINumberAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40825']")
	public WebElementFacade AddrLine1AddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40835']")
	public WebElementFacade AddrLine2AddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40845']")
	public WebElementFacade AddrLine3AddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40855']")
	public WebElementFacade TownAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40865']")
	public WebElementFacade CountyAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40875']")
	public WebElementFacade CountryAddForm2TxtBx;
	@FindBy(xpath = ".//*[@id='m7325_formElement_40885']")
	public WebElementFacade PostcodeAddForm2TxtBx;

	public void FillAddClientForm2(String Username, String Title, String MiddleName, String Email, String PhoneNumber,
			String Gender, String NINumber, String AddrLine1, String AddrLine2, String AddrLine3, String Town,
			String County, String Country, String Postcode) throws Exception {

		System.out.println("Filling page 2 ......");

		UsernameAddForm2TxtBx.clear();
		UsernameAddForm2TxtBx.sendKeys(Username);

		if (Title.length() > 0) {
			selectFromDDL(TitleAddForm2DDL, Title, 0);
		}

		if (MiddleName.length() > 0) {
			MiddleNameAddForm2TxtBx.clear();
			MiddleNameAddForm2TxtBx.sendKeys(MiddleName);
		}

		if (Email.length() > 0) {
			EmailAddForm2TxtBx.clear();
			EmailAddForm2TxtBx.sendKeys(Email);
		}

		if (PhoneNumber.length() > 0) {
			PhoneNumberAddForm2TxtBx.clear();
			PhoneNumberAddForm2TxtBx.sendKeys(PhoneNumber);
		}

		selectFromDDL(GenderAddForm2DDL, Gender, 0);

		if (NINumber.length() > 0) {
			NINumberAddForm2TxtBx.clear();
			NINumberAddForm2TxtBx.sendKeys(NINumber);
		}

		AddrLine1AddForm2TxtBx.clear();
		AddrLine1AddForm2TxtBx.sendKeys(AddrLine1);

		if (AddrLine2.length() > 0) {
			AddrLine2AddForm2TxtBx.clear();
			AddrLine2AddForm2TxtBx.sendKeys(AddrLine2);
		}

		if (AddrLine3.length() > 0) {
			AddrLine3AddForm2TxtBx.clear();
			AddrLine3AddForm2TxtBx.sendKeys(AddrLine3);
		}

		TownAddForm2TxtBx.clear();
		TownAddForm2TxtBx.sendKeys(Town);

		if (County.length() > 0) {
			CountyAddForm2TxtBx.clear();
			CountyAddForm2TxtBx.sendKeys(County);
		}

		if (Country.length() > 0) {
			CountryAddForm2TxtBx.clear();
			CountryAddForm2TxtBx.sendKeys(Country);
		}

		PostcodeAddForm2TxtBx.clear();
		PostcodeAddForm2TxtBx.sendKeys(Postcode);

		SavePage2AddForm.click();

		waitABit(5000);

		NavigateToCLIENTSMainPage();
		filterByNameSurname("Add");

		waitABit(2000);

		XlsReader.setCellData("PROFILE", "Successfully updated?", row, "Yes");
		System.out.println("Form is saved successfully!!!!!!");
	}

	// -------------------VIEW-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_4315_row1']/td[8]/a")
	public WebElementFacade viewRow;

	public void clickVIEWButton() throws Exception {
		waitABit(5000);
		viewRow.click();
	}

	// VERIFY SIDE TABS:
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade EditClientSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade ReassignAdvisorsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[3]/a/span")
	public WebElementFacade ChangePasswordSideTab;

	public void verifySidetabsOnViewpage() throws Exception {
		assertContaining("Clients", ClientsSideTab);
		assertContaining("Edit Client", EditClientSideTab);
		assertContaining("Reassign Advisors", ReassignAdvisorsSideTab);
		assertContaining("Change Password", ChangePasswordSideTab);
	}

	@FindBy(xpath = ".//*[@id='m24_moduleElement']/h1")
	public WebElementFacade ViewClientPageHeader;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[1]/label")
	public WebElementFacade TitleTypeVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[3]/label")
	public WebElementFacade SurnameVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[5]/label")
	public WebElementFacade UsernameVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[7]/label")
	public WebElementFacade EmailVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[9]/label")
	public WebElementFacade GenderVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[11]/label")
	public WebElementFacade AddrLine1VeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[13]/label")
	public WebElementFacade AddrLine3TypeVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[15]/label")
	public WebElementFacade CountyVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[17]/label")
	public WebElementFacade PostcodeVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[19]/label")
	public WebElementFacade DateOfRegsVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[21]/label")
	public WebElementFacade InductionBookeddateVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[2]/label")
	public WebElementFacade FirstNameVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[4]/label")
	public WebElementFacade DOBVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[6]/label")
	public WebElementFacade MiddleNameVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[8]/label")
	public WebElementFacade PhnNoVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[10]/label")
	public WebElementFacade NINoVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[12]/label")
	public WebElementFacade AddrLine2VeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[14]/label")
	public WebElementFacade TownVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[16]/label")
	public WebElementFacade CountryVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[18]/label")
	public WebElementFacade ULNNoVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[20]/label")
	public WebElementFacade AddRefNoVeriPg;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[22]/label")
	public WebElementFacade PartnersRefersToVeriPg;

	@FindBy(xpath = ".//*[@id='m24_view-content']/div[3]/p")
	public WebElementFacade SurnameAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[5]/p")
	public WebElementFacade UsernameAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[9]/p")
	public WebElementFacade GenderAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[11]/p")
	public WebElementFacade AddrLine1AddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[17]/p")
	public WebElementFacade PostCodeAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[19]/p")
	public WebElementFacade DateOfRegisAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[2]/p")
	public WebElementFacade FirstNameAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[4]/p")
	public WebElementFacade DOBAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[14]/p")
	public WebElementFacade TownAddEdit;
	@FindBy(xpath = ".//*[@id='m24_view-content']/div[22]/p")
	public WebElementFacade PartnersRefersToAddEdit;

	public void VerifyVIEWClientProfilePage(String Surname, String Username, String Gender, String AddrLine1,
			String PostCode, String DateOfRegist, String FirstName, String DOB, String Town) throws Exception {
		assertContaining("View Client", ViewClientPageHeader);
		assertContaining("Title", TitleTypeVeriPg);
		assertContaining("Surname", SurnameVeriPg);
		assertContaining("Username", UsernameVeriPg);
		assertContaining("Email", EmailVeriPg);
		assertContaining("Gender", GenderVeriPg);
		assertContaining("Address Line 1", AddrLine1VeriPg);
		assertContaining("Address Line 3", AddrLine3TypeVeriPg);
		assertContaining("County", CountyVeriPg);
		assertContaining("Postcode", PostcodeVeriPg);
		assertContaining("Date of Registration", DateOfRegsVeriPg);
		assertContaining("Induction Booked Date", InductionBookeddateVeriPg);
		assertContaining("First Name", FirstNameVeriPg);
		assertContaining("Date of Birth", DOBVeriPg);
		assertContaining("Middle Name", MiddleNameVeriPg);
		assertContaining("Phone Number", PhnNoVeriPg);
		assertContaining("NI Number", NINoVeriPg);
		assertContaining("Address Line 2", AddrLine2VeriPg);
		assertContaining("Town", TownVeriPg);
		assertContaining("Country", CountryVeriPg);
		assertContaining("ULN Number", ULNNoVeriPg);
		assertContaining("Additional Reference Number", AddRefNoVeriPg);
		assertContaining("Partners Refer To", PartnersRefersToVeriPg);

		// here in steps file, create object of this class and then in Add/Edit
		// method
		// paramenters will come from the field values initialized here in this
		// class.
		assertContaining(Surname, SurnameAddEdit);
		assertContaining(Username, UsernameAddEdit);
		assertContaining(Gender, GenderAddEdit);
		assertContaining(AddrLine1, AddrLine1AddEdit);
		assertContaining(PostCode, PostCodeAddEdit);
		assertContaining(DateOfRegist, DateOfRegisAddEdit);
		assertContaining(FirstName, FirstNameAddEdit);
		assertContaining(DOB, DOBAddEdit);
		assertContaining(Town, TownAddEdit);
		assertContaining("Cardiff - Wales", PartnersRefersToAddEdit);
	}

	// -------------------EDIT-------------------------//

	public void clickEDITCLIENTButton() throws Exception {
		EditClientSideTab.click();
	}

	@FindBy(xpath = ".//*[@id='m14_formElement_40975']")
	public WebElementFacade UsernameEditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40785']")
	public WebElementFacade frstNameEditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40795']")
	public WebElementFacade SurnameEditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40805']")
	public WebElementFacade DOBEditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40915']")
	public WebElementFacade GenderEditFormDDL;
	@FindBy(xpath = ".//*[@id='m14_formElement_40825']")
	public WebElementFacade AddrLine1EditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40855']")
	public WebElementFacade TownEditFormTxtBx;
	@FindBy(xpath = ".//*[@id='m14_formElement_40885']")
	public WebElementFacade PostCodeEditFormTxtBx;

	public void FillEditClientForm2(String Username, String frstname, String surname, String DOB, String gender,
			String AddrLine1, String town, String PostCode) throws Exception {

		if (Username.length() > 0) {
			UsernameEditFormTxtBx.clear();
			UsernameEditFormTxtBx.sendKeys(Username);
		}

		if (frstname.length() > 0) {
			frstNameEditFormTxtBx.clear();
			frstNameEditFormTxtBx.sendKeys(frstname);
		}

		if (surname.length() > 0) {
			SurnameEditFormTxtBx.clear();
			SurnameEditFormTxtBx.sendKeys(surname);
		}

		if (DOB.length() > 0) {
			DOBEditFormTxtBx.clear();
			DOBEditFormTxtBx.sendKeys(DOB);
		}

		if (gender.length() > 0) {
			selectFromDDL(GenderEditFormDDL, gender, 0);
		}
		if (AddrLine1.length() > 0) {
			AddrLine1EditFormTxtBx.clear();
			AddrLine1EditFormTxtBx.sendKeys(AddrLine1);
		}

		if (town.length() > 0) {
			TownEditFormTxtBx.clear();
			TownEditFormTxtBx.sendKeys(town);
		}

		if (PostCode.length() > 0) {
			PostCodeEditFormTxtBx.clear();
			PostCodeEditFormTxtBx.sendKeys(PostCode);
		}

		SavePage2AddForm.click();
	}

	// -------------------VerifyList-------------------------//

	@FindBy(xpath = ".//*[@id='misJmesa_4315_row1']/td[3]")
	public WebElementFacade FirstNameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_row1']/td[4]")
	public WebElementFacade SurnameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_4315_row1']/td[5]")
	public WebElementFacade AdvisorTableEntry;

	public void VerifyContentsOfRowInTable(String FrstName, String Surname, String Advisor) throws Exception {
		assertContaining(FrstName, FirstNameTableEntry);
		assertContaining(Surname, SurnameTableEntry);
		assertContaining(Advisor, AdvisorTableEntry);
	}

	public void VerifyClientProfileList(String AddorEdit) throws Exception {
		verifyForm();
		if (AddorEdit == "Add") {
			VerifyContentsOfRowInTable(ADDFirstName, ADDSurname, "");
		}

		else if (AddorEdit == "Edit") {
			VerifyContentsOfRowInTable(EDITFirstName, EDITSurname, "");
		}
	}

	// -------------------filter client name-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[1]/h3")
	public WebElementFacade FILTERTAB;
	@FindBy(xpath = ".//*[@id='firstName_misJmesa_4315']")
	public WebElementFacade FirstNameFILTER;
	@FindBy(xpath = ".//*[@id='lastName_misJmesa_4315']")
	public WebElementFacade SurnameFILTER;
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[1]/div/fieldset/div[13]/div/button[1]")
	public WebElementFacade searchFILTER;

	public void filterByNameSurname(String AddorEdit) throws Exception {
		FILTERTAB.click();
		if (AddorEdit == "Add") {
			FirstNameFILTER.sendKeys(ADDFirstName);
			SurnameFILTER.sendKeys(ADDSurname);
		}

		else if (AddorEdit == "Edit") {
			FirstNameFILTER.sendKeys(EDITFirstName);
			SurnameFILTER.sendKeys(EDITSurname);
		}

		searchFILTER.click();
	}
}
