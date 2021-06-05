package com.meganexus.mis.pageObjectLib;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClientsQuestionsPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet
	public int row = XlsReader.getCellRowNum("QUESTIONS", 47, "No");

	public String Firstname = XlsReader.getCellData("QUESTIONS", 0, row);
	public String Surname = XlsReader.getCellData("QUESTIONS", 1, row);

	// Education-
	public String HaveTakenBasicSkillTest = XlsReader.getCellData("QUESTIONS", 3, row);
	public String IfNoBasicSkillTest = XlsReader.getCellData("QUESTIONS", 4, row);
	public String IFYesNumeracyScore = XlsReader.getCellData("QUESTIONS", 5, row);
	public String IFYesLiteracyScoreScore = XlsReader.getCellData("QUESTIONS", 6, row);
	public String HighestLevelOFQuali = XlsReader.getCellData("QUESTIONS", 7, row);
	public String EducationIntestedIn = XlsReader.getCellData("QUESTIONS", 8, row);
	public String SubAreaInfoOn = XlsReader.getCellData("QUESTIONS", 9, row);

	// Housing and Employment-
	public String AddrOnRel = XlsReader.getCellData("QUESTIONS", 10, row);
	public String JobOnRel = XlsReader.getCellData("QUESTIONS", 11, row);
	public String JobsInterHelpYouFind = XlsReader.getCellData("QUESTIONS", 12, row);
	public String AnyOtherJobInterestedIn = XlsReader.getCellData("QUESTIONS", 13, row);

	// Extra Support -
	public String HealthAndDisaNeeds = XlsReader.getCellData("QUESTIONS", 14, row);
	public String LearningDisab = XlsReader.getCellData("QUESTIONS", 15, row);
	public String EthnicOriginTxt = XlsReader.getCellData("QUESTIONS", 16, row);
	public String NationalityTxt = XlsReader.getCellData("QUESTIONS", 17, row);
	public String IfOtherNationalityTxt = XlsReader.getCellData("QUESTIONS", 18, row);
	public String LanguageTxt = XlsReader.getCellData("QUESTIONS", 19, row);
	public String IfOtherLanguageTxt = XlsReader.getCellData("QUESTIONS", 20, row);
	public String ReligionTxt = XlsReader.getCellData("QUESTIONS", 21, row);

	// Extra Support -
	public String ReleaseDate = XlsReader.getCellData("QUESTIONS", 22, row);

	// My future address will be in the following area-
	public String RegionTxt = XlsReader.getCellData("QUESTIONS", 23, row);
	public String AreaTxt = XlsReader.getCellData("QUESTIONS", 24, row);
	public String ClaimingBenefitsOnRel = XlsReader.getCellData("QUESTIONS", 25, row);
	public String TouchWithORGonRel = XlsReader.getCellData("QUESTIONS", 26, row);
	public String AtWelshPrison = XlsReader.getCellData("QUESTIONS", 27, row);

	public String Peer = XlsReader.getCellData("QUESTIONS", 28, row);
	public String LDDIndi = XlsReader.getCellData("QUESTIONS", 29, row);
	public String PrioNeedGrps = XlsReader.getCellData("QUESTIONS", 30, row);
	public String LookedAfter = XlsReader.getCellData("QUESTIONS", 31, row);
	public String OffenseGrp = XlsReader.getCellData("QUESTIONS", 32, row);
	public String WelshLang = XlsReader.getCellData("QUESTIONS", 33, row);
	public String SentenceStat = XlsReader.getCellData("QUESTIONS", 34, row);
	public String VP = XlsReader.getCellData("QUESTIONS", 35, row);
	public String RiskRating = XlsReader.getCellData("QUESTIONS", 36, row);
	public String RiskRatingDate = XlsReader.getCellData("QUESTIONS", 37, row);
	public String SentenceLenght = XlsReader.getCellData("QUESTIONS", 38, row);
	public String MobileImpa = XlsReader.getCellData("QUESTIONS", 39, row);
	public String TimeToServe = XlsReader.getCellData("QUESTIONS", 40, row);

	// Certificate Delivery Address
	public String AddLine1 = XlsReader.getCellData("QUESTIONS", 41, row);
	public String AddLine2 = XlsReader.getCellData("QUESTIONS", 42, row);
	public String AddLine3 = XlsReader.getCellData("QUESTIONS", 43, row);
	public String CountyAddr = XlsReader.getCellData("QUESTIONS", 44, row);
	public String CountryAddr = XlsReader.getCellData("QUESTIONS", 45, row);
	public String PostCode = XlsReader.getCellData("QUESTIONS", 46, row);

	// Navigate to Questions sub-top tab page


	public void clickOnQuestionsSubTopTab() {
		nt.NavigateToQuestionsSubTab();
		waitABit(3000);
	}

	/**
	 * Verification of side tabs on Page.
	 */

	@FindBy(xpath = ".//*[@id='leftNavigation']/ul/li/a/span")
	public WebElementFacade ClientsSideTab;

	public void verifySidetabs() throws Exception {
		assertContaining("Clients", ClientsSideTab);
	}

	// -------------------Verify Questions page-------------------------//

	// 1. View Client -
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/h1")
	public WebElementFacade ViewClientPartitionHeader;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[1]/label")
	public WebElementFacade NameMainPage;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[2]/label")
	public WebElementFacade RefNoMainPage;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[3]/a[1]/span")
	public WebElementFacade ShowClientMIDDLEButton;
	@FindBy(xpath = ".//*[@id='m994_moduleElement']/div/div/div[3]/a[2]/span")
	public WebElementFacade EditClientMIDDLEButton;

	public void verifyVIEWCLIENTPartition() throws Exception {

		assertContaining("View Client", ViewClientPartitionHeader);// Table
																	// title

		assertContaining("Name", NameMainPage);
		assertContaining("Reference Number", RefNoMainPage);
		assertContaining("Show Client", ShowClientMIDDLEButton);
		assertContaining("Edit Client", EditClientMIDDLEButton);
	}

	// 2. Project Questions -
	// Virtual Campus Questions
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[1]/h3")
	public WebElementFacade VCQuestions;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[1]/div/a[1]/span")
	public WebElementFacade EditTheseDetailsBUT;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[1]/div/a[2]/span")
	public WebElementFacade ExportToPDFBUT;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[1]/div/a[3]/span")
	public WebElementFacade ExportToDocBUT;

	public void verifyVCQuestionsSECTION() throws Exception {

		assertContaining("Virtual Campus Questions", VCQuestions);// Table
																	// title

		assertContaining("Edit these details", EditTheseDetailsBUT);
		assertContaining("Export to PDF", ExportToPDFBUT);
		assertContaining("Export to DOC", ExportToDocBUT);
	}

	// Education
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[2]/h2")
	public WebElementFacade Education;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[3]/label")
	public WebElementFacade HaveYouTakenBasicSkillTest;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[4]/label")
	public WebElementFacade IndicateHighestLevelOfQuali;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[5]/label")
	public WebElementFacade AreaOfEducationInterestedIn;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[6]/label")
	public WebElementFacade SubAreaLikeTohaveMoreInfoOn;

	public void VerifyEducationSECTION() throws Exception {

		assertContaining("Education", Education);// Table title

		assertContaining("Have you taken a Basic Skills Test?", HaveYouTakenBasicSkillTest);
		assertContaining("Please indicate your highest level of qualification*", IndicateHighestLevelOfQuali);
		assertContaining("Which area of education are you interested in?", AreaOfEducationInterestedIn);
		assertContaining("Which sub-area would you like to have more information on?", SubAreaLikeTohaveMoreInfoOn);
	}

	// Housing and Employment
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[7]/h2")
	public WebElementFacade HousingAndEmploy;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[8]/label")
	public WebElementFacade HaveAddressOnRelease;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[9]/label")
	public WebElementFacade HaveJobOnReleased;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[10]/label")
	public WebElementFacade WhatJobsYouAreInterestedIn;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[11]/label")
	public WebElementFacade AnyOtherJobsYouAreInterestedIn;

	public void VerifyHousingAndEmploymentSECTION() throws Exception {

		assertContaining("Housing and Employment", HousingAndEmploy);// Table
																		// title

		assertContaining("Do you have an address on release?", HaveAddressOnRelease);
		assertContaining("Will you have a job when you are released?", HaveJobOnReleased);
		assertContaining("Please tell us what jobs you are interested in this will help you search for activities "
				+ "and possible jobs*", WhatJobsYouAreInterestedIn);
		assertContaining("If there is any other job you are interested in type it in the box.",
				AnyOtherJobsYouAreInterestedIn);
	}

	// Extra Support
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[12]/h2")
	public WebElementFacade ExtraSupport;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[13]/label")
	public WebElementFacade HealthAndDisabiltyNeeds;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[14]/label")
	public WebElementFacade HaveAnyLearningDisabilities;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[15]/label")
	public WebElementFacade EthnicOrigin;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[16]/label")
	public WebElementFacade WhatIsNationality;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[17]/label")
	public WebElementFacade NationalityOtherPlsSpecify;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[18]/label")
	public WebElementFacade WhatIsFirstLanguage;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[19]/label")
	public WebElementFacade LanguageOtherPlsSpecify;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[20]/label")
	public WebElementFacade Religion;

	public void VerifyExtraSupportSECTION() throws Exception {

		assertContaining("Extra Support", ExtraSupport);// Table
														// title

		assertContaining("Do you think you have any health or disability needs?", HealthAndDisabiltyNeeds);
		assertContaining("Do you have any of these learning disabilities?", HaveAnyLearningDisabilities);
		assertContaining("Ethnic Origin", EthnicOrigin);
		assertContaining("What is your nationality?", WhatIsNationality);
		assertContaining("Other, please specify", NationalityOtherPlsSpecify);
		assertContaining("What is your first language?", WhatIsFirstLanguage);
		assertContaining("Other, please specify", LanguageOtherPlsSpecify);
		assertContaining("Religion", Religion);
	}

	// Resettlement
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[21]/h2")
	public WebElementFacade Resettlement;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[22]/label")
	public WebElementFacade ExpReleaseDate;

	public void VerifyResettlementSECTION() throws Exception {

		assertContaining("Resettlement", Resettlement);// Table
														// title
		assertContaining("What is your expected release date?", ExpReleaseDate);// Table
																				// title
	}

	// My future address will be in the following area

	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[23]/h2")
	public WebElementFacade MyFutureWillBe;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[24]/label")
	public WebElementFacade Region;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[25]/label")
	public WebElementFacade Area;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[26]/label")
	public WebElementFacade ClaimingbenefitsWhenReleased;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[27]/label")
	public WebElementFacade PutInTouchithOrganization;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[28]/label")
	public WebElementFacade LearnerLocatedInWelshPrison;

	public void VerifyFutureAddressSECTION() throws Exception {

		assertContaining("My future address will be in the following area", MyFutureWillBe);// Table
																							// title

		assertContaining("Region", Region);// Table title
		assertContaining("Area", Area);// Table title
		assertContaining("Will you be claiming any of the following benefits " + "when you are released?",
				ClaimingbenefitsWhenReleased);// Table title
		assertContaining(
				"Would you like to be put in touch with an organisation who can "
						+ "continue to help you with training and job searches after you are released?",
				PutInTouchithOrganization);// Table title
		assertContaining("Learner is located in a Welsh Prison?", LearnerLocatedInWelshPrison);// Table
																								// title
	}

	public void verifyClientQuestionForm() throws Exception {
		verifyVIEWCLIENTPartition();
		verifyVCQuestionsSECTION();
		VerifyEducationSECTION();
		VerifyHousingAndEmploymentSECTION();
		VerifyExtraSupportSECTION();
		VerifyResettlementSECTION();
		VerifyFutureAddressSECTION();
	}

	// -------------------EDIT-------------------------//

	// click EDIT Qualification middle TAB
	public void clickEDITQuestions() throws Exception {
		EditTheseDetailsBUT.click();
	}

	// 1. Education-
	// Have you taken a Basic Skills Test?:
	// @FindBy(xpath = ".//*[@id='m6085_formElement_41315-113375']")
	// public WebElementFacade HaveTakenBasicSkillsNORadioBut;
	// @FindBy(xpath = ".//*[@id='m6085_formElement_41315-113395']")
	// public WebElementFacade HaveTakenBasicSkillsYESRadioBut;
	// @FindBy(xpath = ".//*[@id='m6085_formElement_41315-113385']")
	// public WebElementFacade HaveTakenBasicSkillsUNKNOWNRadioBut;

	public String id_HaveTakenBasicSkillsNORadioBut = "m6085_formElement_41315-113375";
	public String id_HaveTakenBasicSkillsYESRadioBut = "m6085_formElement_41315-113395";
	public String id_HaveTakenBasicSkillsUNKNOWNRadioBut = "m6085_formElement_41315-113385";

	// If no, would you like to take a Basic Skills Test?
	@FindBy(xpath = ".//*[@id='m6085_formElement_41355-113405']")
	public WebElementFacade BasicSkillTestNO;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41355-113415']")
	public WebElementFacade BasicSkillTestYES;

	// Have you taken a Basic Skills Test?: YES
	// If yes, what is your numeracy profile score?
	@FindBy(xpath = ".//*[@id='m6085_formElement_41335']")
	public WebElementFacade NumeracyProfileScoreDDL;
	// If yes, what is your literacy profile score?
	@FindBy(xpath = ".//*[@id='m6085_formElement_41445']")
	public WebElementFacade LiteracyProfileScoreDDL;

	// Please indicate your highest level of qualification*:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41455']")
	public WebElementFacade IndicateHighestLevelOfQualiDDL;

	// Which area of education are you interested in?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_66625']")
	public WebElementFacade AreaOfEducaInterestInDDL;

	// Which sub-area would you like to have more information on?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_66635']")
	public WebElementFacade SubAreaYouLikeInfoOnDDL;

	public void FillEducation() throws Exception {
		// JSRadioBtn();
		System.out.println("HaveTakenBasicSkillTest is : " + HaveTakenBasicSkillTest);
		if (HaveTakenBasicSkillTest.equalsIgnoreCase("no")) {
			System.out.println("HaveTakenBasicSkillTest is No");
			JSRadioBtn(id_HaveTakenBasicSkillsNORadioBut);

			BasicSkillTestYES.click();
		} else if (HaveTakenBasicSkillTest.equalsIgnoreCase("Yes")) {
			System.out.println("HaveTakenBasicSkillTest is Yes");
			JSRadioBtn(id_HaveTakenBasicSkillsYESRadioBut);

			if (IFYesNumeracyScore.length() > 0)
				selectFromDDL(NumeracyProfileScoreDDL, IFYesNumeracyScore,0);
			if (IFYesLiteracyScoreScore.length() > 0)
				selectFromDDL(LiteracyProfileScoreDDL, IFYesLiteracyScoreScore,0);
		} else if (HaveTakenBasicSkillTest.equalsIgnoreCase("Unknown")) {
			System.out.println("HaveTakenBasicSkillTest is Unknown");
			JSRadioBtn(id_HaveTakenBasicSkillsUNKNOWNRadioBut);

		}
		// if (HighestLevelOFQuali.length() > 0)
		// selectFromDDL(IndicateHighestLevelOfQualiDDL, HighestLevelOFQuali);
		// if (EducationIntestedIn.length() > 0)
		// selectFromDDL(AreaOfEducaInterestInDDL, EducationIntestedIn);
		// waitABit(700);
		// if (SubAreaInfoOn.length() > 0)
		// selectFromDDL(SubAreaYouLikeInfoOnDDL, SubAreaInfoOn);
	}

	// 2.Housing and Employment
	// Do you have an address on release?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41415-113055']")
	public WebElementFacade HaveAddressOnRelNORadioBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41415-113065']")
	public WebElementFacade HaveAddressOnRelYESRadioBut;

	// Will you have a job when you are released?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41425-434595']")
	public WebElementFacade HaveJOBOnRelEmployedRadioBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41425-434605']")
	public WebElementFacade HaveJOBOnRelNOTEmployedRadioBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41425-434615']")
	public WebElementFacade HaveJOBOnRelRETIREDRadioBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41425-434625']")
	public WebElementFacade HaveJOBOnRelSELFEmployedRadioBut;

	// Please tell us what jobs you are interested in this will help you search
	// for activities and possible jobs*:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41465']/div[1]/span[1]/span")
	public WebElementFacade HelpForJobsInterstSelectALLBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41465']/div[1]/span[2]/span")
	public WebElementFacade HelpForJobsInterstSelectNONEBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41465']/div[1]/span[3]/span")
	public WebElementFacade HelpForJobsInterstINVERTSelecBut;

	// If there is any other job you are interested in type it in the box.:
	@FindBy(xpath = ".//*[@id='m6085_formElement_86685']")
	public WebElementFacade AnyOtherJobsYouAreInterstdTxtBx;

	public void FillHousingAndEmploy() throws Exception {
		if (AddrOnRel == "No")
			HaveAddressOnRelNORadioBut.click();
		else if (AddrOnRel == "Yes")
			HaveAddressOnRelYESRadioBut.click();

		if (JobOnRel == "Employed")
			HaveJOBOnRelEmployedRadioBut.click();
		else if (JobOnRel == "Not Employed")
			HaveJOBOnRelNOTEmployedRadioBut.click();
		else if (JobOnRel == "Retired")
			HaveJOBOnRelRETIREDRadioBut.click();
		else if (JobOnRel == "Self Employed")
			HaveJOBOnRelSELFEmployedRadioBut.click();

		HelpForJobsInterstSelectALLBut.click();

		AnyOtherJobsYouAreInterstdTxtBx.sendKeys(AnyOtherJobInterestedIn);
	}

	// 3. Extra Support

	// Do you think you have any health or disability needs?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41925']/div[1]/span[1]/span")
	public WebElementFacade HaveHealthOrDisaNeedSelectALLBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41925']/div[1]/span[2]/span")
	public WebElementFacade HaveHealthOrDisaNeedSelectNONEBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41925']/div[1]/span[3]/span")
	public WebElementFacade HaveHealthOrDisaNeedINVERTSelecBut;

	// Do you have any of these learning disabilities?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41945']/div[1]/span[1]/span")
	public WebElementFacade LearningDisablitiesSelectALLBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41945']/div[1]/span[2]/span")
	public WebElementFacade LearningDisablitiesSelectNONEBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_41945']/div[1]/span[3]/span")
	public WebElementFacade LearningDisablitiesINVERTSelecBut;

	// Ethnic Origin:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41965']")
	public WebElementFacade EthnicOriginDDL;

	// What is your nationality?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41975']")
	public WebElementFacade NationalityDDL;

	// Other, please specify:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41985']")
	public WebElementFacade NationalityOtherPlsSpecifyTxtBx;

	// What is your first language?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_41995']")
	public WebElementFacade LanguageDDL;

	// Other, please specify:
	@FindBy(xpath = ".//*[@id='m6085_formElement_42005']")
	public WebElementFacade LanguageOtherPlsSpecifyTxtBx;

	// Religion :
	@FindBy(xpath = ".//*[@id='m6085_formElement_176625']")
	public WebElementFacade ReligionDDL;

	public void FillExtraSupport() throws Exception {
		HaveHealthOrDisaNeedSelectALLBut.click();

		LearningDisablitiesSelectALLBut.click();

		selectFromDDL(EthnicOriginDDL, EthnicOriginTxt,0);
		selectFromDDL(NationalityDDL, NationalityTxt,0);
		NationalityOtherPlsSpecifyTxtBx.sendKeys(IfOtherNationalityTxt);
		selectFromDDL(LanguageDDL, LanguageTxt,0);
		LanguageOtherPlsSpecifyTxtBx.sendKeys(IfOtherLanguageTxt);
		selectFromDDL(ReligionDDL, ReligionTxt,0);
	}

	// 4. Resettlement

	// What is your expected release date?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_42035']")
	public WebElementFacade ExpectedRelDateTxtBx;

	public void FillResettlement() throws Exception {
		ExpectedRelDateTxtBx.sendKeys(ReleaseDate);
	}

	// 5. My future address will be in the following area

	// Region:
	@FindBy(xpath = ".//*[@id='m6085_formElement_42065']")
	public WebElementFacade RegionDDL;

	// Area:
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade AreaDDL;

	// Will you be claiming any of the following benefits when you are
	// released?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_42045']/div[1]/span[1]/span")
	public WebElementFacade ClaimingBenefitsOnRelSelectALLBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_42045']/div[1]/span[2]/span")
	public WebElementFacade ClaimingBenefitsOnRelSelectNONEBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_42045']/div[1]/span[3]/span")
	public WebElementFacade ClaimingBenefitsOnRelINVERTSelecBut;

	// Would you like to be put in touch with an organisation who can continue
	// to help you with training and job searches after you are released?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_76865']")
	public WebElementFacade TouchToGetTrainingAndJobDDL;

	// Learner is located in a Welsh Prison?:
	@FindBy(xpath = ".//*[@id='m6085_formElement_173985-1004085']")
	public WebElementFacade LearnerLocInWelshPrisonNORadioBut;
	@FindBy(xpath = ".//*[@id='m6085_formElement_173985-1004095']")
	public WebElementFacade LearnerLocInWelshPrisonYESRadioBut;

	// if selected YES -

	// Peer-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade PeerDDL;

	// Other LDD Indicator-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade LDDIndiDDL;

	// Priority Need Group-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade PrioNeedGrpDDL;

	// Looked After-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade LookedAfterDDL;

	// Offence Group-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade OffenceGrpDDL;

	// Welsh Language-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade WelshLangDDL;

	// Sentenced Status-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade SentenceStatDDL;

	// VP-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade VPDDL;

	// Risk Rating-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade RiskRatingDDL;

	// Risk Rating Date-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade RiskRatingDateTxtBx;

	// Sentence Length-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade SentenceLenghtDDL;

	// Mobility Impaired-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade MobililityImpairedDDL;

	// Time to Serve-
	@FindBy(xpath = ".//*[@id='m6085_formElement_42075']")
	public WebElementFacade TimeToServeDDL;

	@FindBy(xpath = ".//*[@id='form_8725']/fieldset//div/button")
	public WebElementFacade SaveButton;
	@FindBy(xpath = ".//*[@id='form_8725']/fieldset//div/a/span")
	public WebElementFacade CancelButton;

	public void FillFutureAddress() throws Exception {
		selectFromDDL(RegionDDL, RegionTxt,0);

		selectFromDDL(AreaDDL, AreaTxt,0);
		waitABit(500);
		// ClaimingBenefitsOnRelSelectALLBut.click();

		selectFromDDL(TouchToGetTrainingAndJobDDL, TouchWithORGonRel,0);

		if (AtWelshPrison == "No") {
			LearnerLocInWelshPrisonNORadioBut.click();
		} else if (AtWelshPrison == "Yes") {
			LearnerLocInWelshPrisonYESRadioBut.click();
			waitABit(1000);
			selectFromDDL(PeerDDL, Peer,0);
			selectFromDDL(LDDIndiDDL, LDDIndi,0);
			selectFromDDL(PrioNeedGrpDDL, PrioNeedGrps,0);
			selectFromDDL(LookedAfterDDL, LookedAfter,0);
			selectFromDDL(OffenceGrpDDL, OffenseGrp,0);
			selectFromDDL(WelshLangDDL, WelshLang,0);
			selectFromDDL(SentenceStatDDL, SentenceStat,0);
			selectFromDDL(VPDDL, VP,0);
			selectFromDDL(RiskRatingDDL, RiskRating,0);
			RiskRatingDateTxtBx.sendKeys(RiskRatingDate);
			selectFromDDL(SentenceLenghtDDL, SentenceLenght,0);
			selectFromDDL(MobililityImpairedDDL, MobileImpa,0);
			selectFromDDL(TimeToServeDDL, TimeToServe,0);
		}
	}

	// 6. Certificate Delivery Address

	@FindBy(xpath = ".//*[@id='m6085_formElement_176815']")
	public WebElementFacade AddLine1TxtBx;
	@FindBy(xpath = ".//*[@id='m6085_formElement_176835']")
	public WebElementFacade AddLine2TxtBx;
	@FindBy(xpath = ".//*[@id='m6085_formElement_176845']")
	public WebElementFacade AddLine3TxtBx;
	@FindBy(xpath = ".//*[@id='m6085_formElement_176855']")
	public WebElementFacade CountyTxtBx;
	@FindBy(xpath = ".//*[@id='m6085_formElement_176865']")
	public WebElementFacade CountryTxtBx;
	@FindBy(xpath = ".//*[@id='m6085_formElement_176885']")
	public WebElementFacade PostCodeTxtBx;

	public void CertficateDelAddr() throws Exception {
		AddLine1TxtBx.sendKeys(AddLine1);
		AddLine2TxtBx.sendKeys(AddLine2);
		AddLine3TxtBx.sendKeys(AddLine3);
		CountyTxtBx.sendKeys(CountyAddr);
		CountryTxtBx.sendKeys(CountryAddr);
		PostCodeTxtBx.sendKeys(PostCode);
	}

	public void FillForm() throws Exception {
		FillEducation();
		// waitABit(1000);
		// FillHousingAndEmploy();
		// waitABit(1000);
		// FillExtraSupport();
		// waitABit(1000);
		// FillResettlement();
		// waitABit(1000);
		// FillFutureAddress();
		// waitABit(1000);
		// CertficateDelAddr();
		// waitABit(1000);
		// SaveButton.click();
		waitABit(100000);
		// XlsReader.setCellData("QUESTIONS","Successfully updated?",
		// ClientQualificationsPage.row, "Yes");
	}

	// -------------------VIEW-------------------------//

	// 1. Education
	// Have you taken a Basic Skills Test?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[3]/p")
	public WebElementFacade BasicSkillTestVerifyPg;

	// Please indicate your highest level of qualification*
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[4]/p")
	public WebElementFacade HighestlevelQualiVerifyPg;

	// Which area of education are you interested in?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[5]/p")
	public WebElementFacade EducationIntrstedInVerifyPg;

	// Which sub-area would you like to have more information on?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[6]/p")
	public WebElementFacade SubAreaLikeInfoOnVerifyPg;

	// 2. Housing and Employment
	// Do you have an address on release?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[8]/p")
	public WebElementFacade AddressOnRelVerifyPg;

	// Will you have a job when you are released?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[9]/p")
	public WebElementFacade JobsOnRelVerifyPg;

	// please tell us what jobs you are interested in this will help you search
	// for activities and possible jobs*
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[10]/p")
	public WebElementFacade JobsIntrsInHlpToSrchVerifyPg;

	// If there is any other job you are interested in type it in the box.
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[10]/p")
	public WebElementFacade AnyOtherJobsIntrstInVerifyPg;

	// 3. Extra Support
	// Do you think you have any health or disability needs?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[13]/p")
	public WebElementFacade HealthOrDisaNeedsVerifyPg;

	// Do you have any of these learning disabilities?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[14]/p")
	public WebElementFacade HaveLearningDisabVerifyPg;

	// Ethnic Origin
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[15]/p")
	public WebElementFacade EthnicOriginVerifyPg;

	// What is your nationality?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[16]/p")
	public WebElementFacade NationalityVerifyPg;

	// Other, please specify
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[17]/p")
	public WebElementFacade NationalityOtherPlsSpecifyVerifyPg;

	// What is your first language?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[18]/p")
	public WebElementFacade LanguageVerifyPg;

	// Other, please specify
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[19]/p")
	public WebElementFacade LanguageOtherPlsSpecifyVerifyPg;

	// Religion
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[20]/p")
	public WebElementFacade ReligionVerifyPg;

	// 4. Resettlement
	// What is your expected release date?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[21]/p")
	public WebElementFacade ExpecRelDateVerifyPg;

	// 5. My future address will be in the following area
	// Region
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[23]/p")
	public WebElementFacade RegionVerifyPg;

	// Area
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[24]/p")
	public WebElementFacade AreaVerifyPg;

	// Will you be claiming any of the following benefits when you are released?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[25]/p")
	public WebElementFacade ClaimingBenefitsOnRelVerifyPg;

	// Would you like to be put in touch with an organisation who can continue
	// to help you with training and job searches after you are released?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[26]/p")
	public WebElementFacade TouchInOrgaHlpTrainingAndJobVerifyPg;

	// Learner is located in a Welsh Prison?
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[27]/p")
	public WebElementFacade LearnerLocatedInWelshPrisonVerifyPg;

	// If Yes, Learner is located in a Welsh Prison!!!

	// Certificate Delivery Address
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[30]/p")
	public WebElementFacade AddrLine1VerifyPg;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[31]/p")
	public WebElementFacade AddrLine2VerifyPg;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[32]/p")
	public WebElementFacade AddrLine3VerifyPg;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[33]/p")
	public WebElementFacade CountyVerifyPg;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[34]/p")
	public WebElementFacade CountryVerifyPg;
	@FindBy(xpath = ".//*[@id='m6105_moduleElement']/div/div/div/div[35]/p")
	public WebElementFacade PostCodeVerifyPg;

	public void VerifyProjectQuesPageAfterFilling() throws Exception {

		assertContaining(HaveTakenBasicSkillTest, BasicSkillTestVerifyPg);
		assertContaining(HighestLevelOFQuali, HighestlevelQualiVerifyPg);
		assertContaining(EducationIntestedIn, EducationIntrstedInVerifyPg);
		assertContaining(SubAreaInfoOn, SubAreaLikeInfoOnVerifyPg);

		assertContaining(AddrOnRel, AddressOnRelVerifyPg);
		assertContaining(JobOnRel, JobsOnRelVerifyPg);
		assertContaining(
				"Administration/Reception, Agriculture and Gardening, Call centre, "
						+ "Catering and Hospitality, Childcare, Cleaning and Environmental Services, Construction, "
						+ "Finance, Healthcare Professional, IT/Telecommunications, Legal, Manufacturing and Warehouse, "
						+ "Media/Creative, Other, Other Management/Professional, Public Sector, Retail/Customer Services,"
						+ "Sales and Marketing, Science and Engineering, Security and Law enforcement, Social care, Sports "
						+ "and Leisure, Teaching and Education, Transport and Travel, Plumbing",
				JobsIntrsInHlpToSrchVerifyPg);
		assertContaining(AnyOtherJobInterestedIn, AnyOtherJobsIntrstInVerifyPg);

		assertContaining(
				"Accident, Disability Affecting Mobility, Emotional Behavioural Difficulties, Hearing Impairment, "
						+ "Mental Health, No Disability, Not Known / Not Provided, Other, Other Medical Cond. (Epilepsy, Diabetes), "
						+ "Other Physical Disability, Prefer Not to Say, Profound Complex Disabilities, Temporary Disability After Illness / Accident, "
						+ "Visual Impairment",
				HealthOrDisaNeedsVerifyPg);
		assertContaining(
				"Dyscalculia, Dyslexia, Moderate Learning Difficulty, No Learning Difficulties, Not Known / Not Provided, Other, "
						+ "Other Specific Learning Difficulties, Prefer Not to Say, Severe Learning Difficulty",
				HaveLearningDisabVerifyPg);
		assertContaining(EthnicOriginTxt, EthnicOriginVerifyPg);
		assertContaining(NationalityTxt, NationalityVerifyPg);
		assertContaining(IfOtherNationalityTxt, NationalityOtherPlsSpecifyVerifyPg);
		assertContaining(LanguageTxt, LanguageVerifyPg);
		assertContaining(IfOtherLanguageTxt, LanguageOtherPlsSpecifyVerifyPg);
		assertContaining(ReligionTxt, ReligionVerifyPg);

		assertContaining(ReleaseDate, ExpecRelDateVerifyPg);

		assertContaining(RegionTxt, RegionVerifyPg);
		assertContaining(AreaTxt, AreaVerifyPg);
		/*
		 * assertContaining(
		 * "Child Tax Credit, Council Tax Benefits, Disability Living Allowance, Housing Benefit, Incapacity Benefit, "
		 * +
		 * "Income Support, Job Seekers Allowance, Severe Disablement Allowance, Working Tax Credit"
		 * , ClaimingBenefitsOnRelVerifyPg);
		 */
		assertContaining(TouchWithORGonRel, TouchInOrgaHlpTrainingAndJobVerifyPg);
		assertContaining(AtWelshPrison, LearnerLocatedInWelshPrisonVerifyPg);

		assertContaining(AddLine1, AddrLine1VerifyPg);
		assertContaining(AddLine2, AddrLine2VerifyPg);
		assertContaining(AddLine3, AddrLine3VerifyPg);
		assertContaining(CountyAddr, CountyVerifyPg);
		assertContaining(CountryAddr, CountryVerifyPg);
		assertContaining(PostCode, PostCodeVerifyPg);

	}

	// -------------------VIEW-------------------------//
	public void returnToHomePage() throws Exception {
		getDriver().navigate().back();
		getDriver().getCurrentUrl()
				.contains("https://vcmis.mat.meganexus.com/neo_1_0/mis/index/14/24/104?managedClientId=409803");
	}

}