package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ClientGroupsAndBarriers extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet

	public String IntervSkills = "";
	public String LiterNume = "";
	public String LowVocSkillQua = "";
	public String ITSkls = "";
	public String LowCommIn = "";
	// public String OthIssues = "";

	// Navigate to Grps and Barriers sub-top tab page

	public void clickOnGrpAndBarriersSubTopTab() {
		nt.NavigateToGroupsAndBarriersSubTab();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[1]/a/span")
	public WebElementFacade EditGrpsSideTab;
	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[2]/a/span")
	public WebElementFacade EditBarriersSideTab;

	public void verifySidetabs() throws Exception {
		assertContaining("Clients", ClientsSideTab);
		assertContaining("Edit Groups", EditGrpsSideTab);
		assertContaining("Edit Barriers", EditBarriersSideTab);
	}

	// -------------------EDIT Groups-------------------------//

	// click ADD EDIT Groups SIDE TAB
	public void clickEDITGroupsSIDETAB() throws Exception {
		EditGrpsSideTab.click();
	}

	/**
	 * Verification of all elements on Edit Groups Page.
	 */

	@FindBy(xpath = ".//*[@id='m174_moduleElement']/h1")
	public WebElementFacade EditGrpHeader;

	@FindBy(xpath = ".//*[@id='form_10295']/fieldset/div[1]/label")
	public WebElementFacade TargetGrpStatusEditForm;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[1]/span[1]/span")
	public WebElementFacade TGSelectAllEditForm;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[1]/span[2]/span")
	public WebElementFacade TGSelectNoneEditForm;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[1]/span[3]/span")
	public WebElementFacade TGInvertSelectionEditForm;

	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[2]/label")
	public WebElementFacade PplLearningDisa;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[4]/label")
	public WebElementFacade Refugee;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[6]/label")
	public WebElementFacade PplWithDisaIllHealth;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[8]/label")
	public WebElementFacade NEET;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[10]/label")
	public WebElementFacade AsylumSeeker;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[12]/label")
	public WebElementFacade HistoryOfSubsAbuse;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[14]/label")
	public WebElementFacade AccomodationIssues;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[3]/label")
	public WebElementFacade EthnicMino;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[5]/label")
	public WebElementFacade CareLeaver;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[7]/label")
	public WebElementFacade PreviousCustodialSent;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[9]/label")
	public WebElementFacade PplWithMentalProb;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[11]/label")
	public WebElementFacade LoneParent;
	@FindBy(xpath = ".//*[@id='m174_formElement_62285']/div[13]/label")
	public WebElementFacade Pregnancy;

	@FindBy(xpath = ".//*[@id='form_10295']/fieldset/div[3]/div/button")
	public WebElementFacade SaveEditGrp;
	@FindBy(xpath = ".//*[@id='form_10295']/fieldset/div[3]/div/a/span")
	public WebElementFacade CancelEditGrp;

	public void verifyEDITGroupForm() throws Exception {

		assertContaining("Edit Support", EditGrpHeader);// Table
														// title

		assertContaining("Target Group / Status*", TargetGrpStatusEditForm);
		assertContaining("Select All", TGSelectAllEditForm);
		assertContaining("Select None", TGSelectNoneEditForm);
		assertContaining("Invert Selection", TGInvertSelectionEditForm);

		assertContaining("People with learning disabilities", PplLearningDisa);
		assertContaining("Refugee", Refugee);
		assertContaining("People with disabilities/ill health", PplWithDisaIllHealth);
		assertContaining("NEET", NEET);
		assertContaining("Asylum seeker", AsylumSeeker);
		assertContaining("History of substance abuse", HistoryOfSubsAbuse);
		assertContaining("Accommodation issues", AccomodationIssues);
		assertContaining("Ethnic Minority", EthnicMino);
		assertContaining("Care Leaver", CareLeaver);
		assertContaining("Previous custodial sentence", PreviousCustodialSent);
		assertContaining("People with mental health problems", PplWithMentalProb);
		assertContaining("Lone Parent", LoneParent);
		assertContaining("Pregnancy", Pregnancy);

		assertContaining("Save", SaveEditGrp);
		assertContaining("Cancel", CancelEditGrp);
	}

	public void FillEDITGroupForm() throws Exception {
		TGSelectAllEditForm.click();
		SaveEditGrp.click();
	}

	// -------------------EDIT BARRIERS-------------------------//
	// click ADD EDIT Groups SIDE TAB
	public void clickEDITBarriersSIDETAB() throws Exception {
		EditBarriersSideTab.click();
	}

	/**
	 * Verification of all elements on Edit Barriers Page.
	 */

	@FindBy(xpath = ".//*[@id='m194_moduleElement']/h1")
	public WebElementFacade EditBarriersHeader;

	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[1]/label")
	public WebElementFacade CircumFacedEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[1]/span[1]/span")
	public WebElementFacade CFSelectAllEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[1]/span[2]/span")
	public WebElementFacade CFSelectNoneEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[1]/span[3]/span")
	public WebElementFacade CFInvertSelectionEditForm;

	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[2]/label")
	public WebElementFacade InterpreterCommu;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[4]/label")
	public WebElementFacade ChildCareFaci;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[6]/label")
	public WebElementFacade DebtProb;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[8]/label")
	public WebElementFacade ExOffen;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[10]/label")
	public WebElementFacade LabourMarkRet;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[12]/label")
	public WebElementFacade LiteracyNume;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[3]/label")
	public WebElementFacade CaringResp;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[5]/label")
	public WebElementFacade CommPayback;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[7]/label")
	public WebElementFacade DisabRRQ;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[9]/label")
	public WebElementFacade FlexHrs;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[11]/label")
	public WebElementFacade LangESOL;
	@FindBy(xpath = ".//*[@id='m194_formElement_62295']/div[13]/label")
	public WebElementFacade Prisoners;

	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[2]/label")
	public WebElementFacade Skills;

	@FindBy(xpath = ".//*[@id='m194_formElement_62305']/div[1]/label")
	public WebElementFacade InterviewSkills;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305']/div[3]/label")
	public WebElementFacade LiterNum;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305']/div[5]/label")
	public WebElementFacade LowVocSkills;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305']/div[2]/label")
	public WebElementFacade ITSkills;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305']/div[4]/label")
	public WebElementFacade LowCommInterSkills;

	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[3]/label")
	public WebElementFacade AttiPersBehavIssuesEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[1]/span[1]/span")
	public WebElementFacade APBSelectAllEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[1]/span[2]/span")
	public WebElementFacade APBSelectNoneEditForm;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[1]/span[3]/span")
	public WebElementFacade APBInvertSelectionEditForm;

	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[2]/label")
	public WebElementFacade AlchoMisuse;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[4]/label")
	public WebElementFacade LackOfConfi;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[6]/label")
	public WebElementFacade OtherAttiBarriers;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[3]/label")
	public WebElementFacade DrugMisuse;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[5]/label")
	public WebElementFacade Motivation;
	@FindBy(xpath = ".//*[@id='m194_formElement_62315']/div[7]/label")
	public WebElementFacade ReliabTimeKeep;

	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[4]/label")
	public WebElementFacade OtherIssues;

	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[6]/div/button")
	public WebElementFacade SaveEditBarr;
	@FindBy(xpath = ".//*[@id='form_10305']/fieldset/div[6]/div/a/span")
	public WebElementFacade CancelEditBarr;

	public void verifyEDITBarriersForm() throws Exception {

		assertContaining("Edit Requirements", EditBarriersHeader);// Table

		assertContaining("Circumstances faced in finding employment", CircumFacedEditForm);
		assertContaining("Select All", CFSelectAllEditForm);
		assertContaining("Select None", CFSelectNoneEditForm);
		assertContaining("Invert Selection", CFInvertSelectionEditForm);

		assertContaining("Interpreter/Communication", InterpreterCommu);
		assertContaining("Childcare Facilities", ChildCareFaci);
		assertContaining("Debt problems", DebtProb);
		assertContaining("Ex offender", ExOffen);
		assertContaining("Labour Market Returners", LabourMarkRet);
		assertContaining("Literacy/Numeracy", LiteracyNume);
		assertContaining("Caring Responsibilities", CaringResp);
		assertContaining("Community Payback", CommPayback);
		assertContaining("Disability Requirements", DisabRRQ);
		assertContaining("Flexible Hours", FlexHrs);
		assertContaining("Language/ESOL", LangESOL);
		assertContaining("Prisoners", Prisoners);

		assertContaining("Skills", Skills);

		assertContaining("Interview skills CV presentation", InterviewSkills);
		assertContaining("Literacy/Numeracy", LiterNum);
		assertContaining("Low vocational skills/qualifications", LowVocSkills);
		assertContaining("IT Skills", ITSkills);
		assertContaining("Low communication/interpersonal skills", LowCommInterSkills);

		assertContaining("Attitude / Personality / Behaviour Issues", AttiPersBehavIssuesEditForm);
		assertContaining("Select All", APBSelectAllEditForm);
		assertContaining("Select None", APBSelectNoneEditForm);
		assertContaining("Invert Selection", APBInvertSelectionEditForm);

		assertContaining("Alcohol misuse", AlchoMisuse);
		assertContaining("Lack of confidence", LackOfConfi);
		assertContaining("Other attitudinal barriers", OtherAttiBarriers);
		assertContaining("Drug misuse", DrugMisuse);
		assertContaining("Motivation", Motivation);
		assertContaining("Reliability, time-keeping", ReliabTimeKeep);

		assertContaining("Other Issues", OtherIssues);

		assertContaining("Save", SaveEditBarr);
		assertContaining("Cancel", CancelEditBarr);
	}

	@FindBy(xpath = ".//*[@id='m194_formElement_62305-236485']")
	public WebElementFacade InterviewSkillsChkBx;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305-236505']")
	public WebElementFacade LiterNumChkBx;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305-236525']")
	public WebElementFacade LowVocSkillsChkBx;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305-236495']")
	public WebElementFacade ITSkillsChkBx;
	@FindBy(xpath = ".//*[@id='m194_formElement_62305-236515']")
	public WebElementFacade LowCommInterSkillsChkBx;

	public void FillEDITBarriersForm() throws Exception {
		CFSelectAllEditForm.click();

		if (IntervSkills == "Yes") {
			InterviewSkills.click();
		}

		if (LiterNume == "Yes") {
			LiterNum.click();
		}

		if (LowVocSkillQua == "Yes") {
			LowVocSkills.click();
		}

		if (ITSkls == "Yes") {
			ITSkills.click();
		}

		if (LowCommIn == "Yes") {
			LowCommInterSkills.click();
		}

		APBSelectAllEditForm.click();

		SaveEditBarr.click();
	}

	// -------------------VerifyPage-------------------------//

	@FindBy(xpath = ".//*[@id='m994_moduleElement']/h1")
	public WebElementFacade ViewClient;

	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[1]/label")
	public WebElementFacade Name;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[2]/label")
	public WebElementFacade RefNo;

	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[3]/a[1]/span")
	public WebElementFacade ShowClient;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[3]/a[2]/span")
	public WebElementFacade EditClient;

	@FindBy(xpath = ".//*[@id='m184_moduleElement']/h1")
	public WebElementFacade Groups;

	@FindBy(xpath = ".//*[@id='m184_view-content']/div/label")
	public WebElementFacade TargetGrpStatus;
	@FindBy(xpath = ".//*[@id='m184_view-content']/div/p")
	public WebElementFacade TargetGrpStatVerifi;

	@FindBy(xpath = ".//*[@id='m204_moduleElement']/h1")
	public WebElementFacade Barriers;

	@FindBy(xpath = ".//*[@id='m204_view-content']/div[1]/label")
	public WebElementFacade CircumFacedInFindEmply;
	@FindBy(xpath = ".//*[@id='m204_view-content']/div[1]/p")
	public WebElementFacade CircumFacedInFindEmplyVerifi;

	@FindBy(xpath = ".//*[@id='m204_view-content']/div[3]/label")
	public WebElementFacade AttiPerBehevIssues;
	@FindBy(xpath = ".//*[@id='m204_view-content']/div[3]/p")
	public WebElementFacade AttiPerBehevIssuesVerifi;

	@FindBy(xpath = ".//*[@id='m204_view-content']/div[2]/label")
	public WebElementFacade SkillsSection;
	@FindBy(xpath = ".//*[@id='m204_view-content']/div[2]/p")
	public WebElementFacade SkillsSectionVerifi;

	@FindBy(xpath = ".//*[@id='m204_view-content']/div[4]/label")
	public WebElementFacade OtherIssuesSec;
	@FindBy(xpath = ".//*[@id='m204_view-content']/div[4]/p")
	public WebElementFacade OtherIssuesSecVerifi;

	public void VerifyPage(String GroupsBarriers) throws Exception {
		// View Client -
		assertContaining("View Client", ViewClient);
		assertContaining("Name", Name);
		assertContaining("Reference Number", RefNo);
		assertContaining("Show Client", ShowClient);
		assertContaining("Edit Client", EditClient);

		if (GroupsBarriers == "Groups") {
			// Groups -
			assertContaining("Groups", Groups);

			assertContaining("Target Group / Status", TargetGrpStatus);
			assertContaining("Accommodation issues, Asylum seeker, Care Leaver, Ethnic Minority, "
					+ "History of substance abuse , Lone Parent, NEET, People with disabilities/ill "
					+ "health, People with learning disabilities, People with mental health problems, "
					+ "Pregnancy, Previous custodial sentence, Refugee", TargetGrpStatVerifi);
		} else if (GroupsBarriers == "Barriers") {
			// Barriers -
			assertContaining("Barriers", Barriers);

			assertContaining("Circumstances faced in finding employment", CircumFacedInFindEmply);
			assertContaining(
					"Interpreter/Communication, Caring Responsibilities, Childcare Facilities, "
							+ "Community Payback, Debt problems, Disability Requirements, Ex offender, Flexible Hours, "
							+ "Labour Market Returners, Language/ESOL, Literacy/Numeracy, Prisoners",
					CircumFacedInFindEmplyVerifi);

			assertContaining("Attitude / Personality / Behaviour Issues", AttiPerBehevIssues);
			assertContaining("Alcohol misuse, Drug misuse, Lack of confidence, Motivation, Other attitudinal "
					+ "barriers, Reliability, time-keeping", AttiPerBehevIssuesVerifi);

			assertContaining("Skills", SkillsSection);
			// assertContaining(Skills, SkillsSectionVerifi); // Please work
			// upon the radio button thing

			assertContaining("Other Issues", OtherIssuesSec);
			// assertContaining(Free text, OtherIssuesSecVerifi);
		}
	}

	// -------------------Return HomePage-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl().contains(
				"https://vcmis.qc.meganexus.internal:8443/neo_1_0/mis/index/14/24/114?managedClientId=389605");
	}
}
