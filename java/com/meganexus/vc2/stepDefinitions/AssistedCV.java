package com.meganexus.vc2.stepDefinitions;

import com.meganexus.vc2.pom.AssistedCVPage;
import com.meganexus.vc2.pom.ComputerSkillsAssistedCV;
import com.meganexus.vc2.pom.CreateCVPage;
import com.meganexus.vc2.pom.DrivingLicenseAssistedCV;
import com.meganexus.vc2.pom.EducationAssistedCV;
import com.meganexus.vc2.pom.HobbiesAndInterestsAssistedCV;
import com.meganexus.vc2.pom.LanguagesAssistedCV;
import com.meganexus.vc2.pom.PersonalDetailsAssistedCV;
import com.meganexus.vc2.pom.PersonalStatementAdvancedCV;
import com.meganexus.vc2.pom.TrainingAssistedCV;
import com.meganexus.vc2.pom.WorkExperienceAssistedCV;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx4j.tools.config.DefaultConfigurationBuilder.Create;

public class AssistedCV {
	@When("^Go to CV Summary page of assisted CV$")
	public void go_to_CV_Summary_page_of_assisted_CV() throws Throwable {
	    
	    CreateCVPage.verifyCreateCVPage();
	    CreateCVPage.clickAssistedCV();
	    AssistedCVPage.verifyPage();
	    AssistedCVPage.buildCVButton();
	    AssistedCVPage.verifyCVSummaryPage();
	    
	}

	@Then("^click to edit Personal details for Assisted CV$")
	public void click_to_edit_Personal_details_for_Assisted_CV() throws Throwable {
	    
	    AssistedCVPage.editPersonalDetailsButton();
	}

	@Then("^enter the details on Personal details for Assisted CV$")
	public void enter_the_details_on_Personal_details_for_Assisted_CV() throws Throwable {
		PersonalDetailsAssistedCV.clickPersonalDetails();
		PersonalDetailsAssistedCV.verifySidetabs();
		PersonalDetailsAssistedCV.verifyForm();
		PersonalDetailsAssistedCV.FillForm();
		PersonalDetailsAssistedCV.clickNext();
	}

	@Then("^click to edit Personal Statement for Assisted CV$")
	public void click_to_edit_Personal_Statement_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editPersonalStatementButton();
	}

	@Then("^enter the details on Personal Statement for Assisted CV$")
	public void enter_the_details_on_Personal_Statement_for_Assisted_CV() throws Throwable {
		PersonalStatementAdvancedCV.clickPersonalStatement();
		PersonalStatementAdvancedCV.verifySidetabs();
		PersonalStatementAdvancedCV.verifyForm();
		PersonalStatementAdvancedCV.FillForm();
		PersonalStatementAdvancedCV.clickNext();
	}

	@Then("^click to edit Work Experience for Assisted CV$")
	public void click_to_edit_Work_Experience_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editWorkExpButton();
	}

	@Then("^enter the details on Work Experience for Assisted CV$")
	public void enter_the_details_on_Work_Experience_for_Assisted_CV() throws Throwable {
		WorkExperienceAssistedCV.clickWorkExperience();
		WorkExperienceAssistedCV.verifySidetabs();
		WorkExperienceAssistedCV.verifyForm();
		WorkExperienceAssistedCV.clickOptionYes();
		WorkExperienceAssistedCV.clickNext();
		WorkExperienceAssistedCV.VerifyFormWhenYesSelected();
		WorkExperienceAssistedCV.HaveAnyPaidExp("No");
	}

	@Then("^click to edit Education for Assisted CV$")
	public void click_to_edit_Education_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editEducationButton();
	}

	@Then("^enter the details on Education for Assisted CV$")
	public void enter_the_details_on_Education_for_Assisted_CV() throws Throwable {
	    
	    EducationAssistedCV.clickEducation();
	    EducationAssistedCV.verifySidetabs();
	    EducationAssistedCV.verifyForm();
	    EducationAssistedCV.fillWhatSecondarySchoolGoTo();
	    EducationAssistedCV.fillWhichYrGraduateFrmSchool();
	    EducationAssistedCV.completeGCSEs("Yes");
	    EducationAssistedCV.VerifyFormWhenYesSelected();
	    EducationAssistedCV.FillFormWhenYesSelected();
	    EducationAssistedCV.HaveAnyPaidExp("Yes");
	}

	@Then("^click to edit Training for Assisted CV$")
	public void click_to_edit_Training_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editTrainingButton();
	}

	@Then("^enter the details on Training for Assisted CV$")
	public void enter_the_details_on_Training_for_Assisted_CV() throws Throwable {
		TrainingAssistedCV.clickTraining();
		TrainingAssistedCV.verifySidetabs();
		TrainingAssistedCV.verifyForm();
		TrainingAssistedCV.SelectWorkshopCompleted("Yes", "Yes", "Yes");
		TrainingAssistedCV.SelectNext();
	    
	}

	@Then("^click to edit Computer Skills for Assisted CV$")
	public void click_to_edit_Computer_Skills_for_Assisted_CV() throws Throwable {
	    AssistedCVPage.editComputerSkillsButton();
	    
	}

	@Then("^enter the details on Computer Skills for Assisted CV$")
	public void enter_the_details_on_Computer_Skills_for_Assisted_CV() throws Throwable {
	    ComputerSkillsAssistedCV.clickComputerSkills();
	    ComputerSkillsAssistedCV.verifySidetabs();
	    ComputerSkillsAssistedCV.verifyForm();
	    ComputerSkillsAssistedCV.SelectComputerSkills("Yes");
	    
	}

	@Then("^click to edit Driving license for Assisted CV$")
	public void click_to_edit_Driving_license_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editDrivingLicenseButton();
	}

	@Then("^enter the details on Driving license for Assisted CV$")
	public void enter_the_details_on_Driving_license_for_Assisted_CV() throws Throwable {
	    
	    DrivingLicenseAssistedCV.clickDrivingLicense();
	    DrivingLicenseAssistedCV.verifySidetabs();
	    DrivingLicenseAssistedCV.verifyForm();
	    DrivingLicenseAssistedCV.SelectDrivingLicense("Yes");
	}

	@Then("^click to edit Languages for Assisted CV$")
	public void click_to_edit_Languages_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editLanguageButton();
	}

	@Then("^enter the details on Languages for Assisted CV$")
	public void enter_the_details_on_Languages_for_Assisted_CV() throws Throwable {
	    
	    LanguagesAssistedCV.clickLanguages();
	    LanguagesAssistedCV.verifySidetabs();
	    LanguagesAssistedCV.verifyForm();
	    LanguagesAssistedCV.SelectSpeakForeignLanguage("Yes");
	    LanguagesAssistedCV.SelectNext();
	}

	@Then("^click to edit Hobbies and Interest for Assisted CV$")
	public void click_to_edit_Hobbies_and_Interest_for_Assisted_CV() throws Throwable {
	    
		AssistedCVPage.editHobbiesAndInterestsButton();
	}

	@Then("^enter the details on Hobbies and Interest for Assisted CV$")
	public void enter_the_details_on_Hobbies_and_Interest_for_Assisted_CV() throws Throwable {
	    
		HobbiesAndInterestsAssistedCV.clickHobbiesAndInterest();
		HobbiesAndInterestsAssistedCV.verifySidetabs();
		HobbiesAndInterestsAssistedCV.verifyForm();
		HobbiesAndInterestsAssistedCV.spareTimeLikes();
		HobbiesAndInterestsAssistedCV.howKeepFit();
		HobbiesAndInterestsAssistedCV.clickNext();
	}
}
