package com.meganexus.vc2.stepDefinitions;

import com.meganexus.vc2.pom.AdvancedCVPage;
import com.meganexus.vc2.pom.ComputerSkillsAdvancedCV;
import com.meganexus.vc2.pom.CreateCVPage;
import com.meganexus.vc2.pom.DrivingLicenceAdvancedCV;
import com.meganexus.vc2.pom.EducationAdvancedCV;
import com.meganexus.vc2.pom.HobbiesAndInterestsAdvancedCV;
import com.meganexus.vc2.pom.LandingPage;
import com.meganexus.vc2.pom.LanguagesAdvancedCV;
import com.meganexus.vc2.pom.PersonalDetailsAdvancedCV;
import com.meganexus.vc2.pom.PersonalStatementAdvancedCV;
import com.meganexus.vc2.pom.TrainingAdvancedCV;
import com.meganexus.vc2.pom.WorkExperienceAdvancedCV;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdvancedCV {
	@When("^I Click on Create a CV link$")
	public void i_Click_on_Create_a_CV_link() throws Throwable {
	  
		LandingPage.clickCreateCV();
	}

	@When("^Go to CV Summary page of Advanced CV$")
	public void go_to_CV_Summary_page_of_Advanced_CV() throws Throwable {
	  
		CreateCVPage.verifyCreateCVPage();
		CreateCVPage.clickAdvancedCV();
		AdvancedCVPage.verifyCVSummaryPage();
	}

	@Then("^click to edit Personal details for Advanced CV$")
	public void click_to_edit_Personal_details_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editPersonalDetailsButton(); 
	}

	@Then("^enter the details on Personal details for Advanced CV$")
	public void enter_the_details_on_Personal_details_for_Advanced_CV() throws Throwable {
	  
	   PersonalDetailsAdvancedCV.verifySidetabs();	
	   PersonalDetailsAdvancedCV.verifyForm();
	   PersonalDetailsAdvancedCV.FillForm();
	   PersonalDetailsAdvancedCV.clickMarkAsComplete();
	   PersonalDetailsAdvancedCV.clickNext();
	}

	@Then("^click to edit Personal Statement for Advanced CV$")
	public void click_to_edit_Personal_Statement_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editPersonalStatementButton();
	}

	@Then("^enter the details on Personal Statement for Advanced CV$")
	public void enter_the_details_on_Personal_Statement_for_Advanced_CV() throws Throwable {
	  
	   PersonalStatementAdvancedCV.verifySidetabs();
	   PersonalStatementAdvancedCV.verifyForm();
	   PersonalStatementAdvancedCV.FillForm();
	   PersonalStatementAdvancedCV.clickMarkAsComplete();
	   PersonalStatementAdvancedCV.clickNext();
	}

	@Then("^click to edit Work Experience for Advanced CV$")
	public void click_to_edit_Work_Experience_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editWorkExpButton();
	}

	@Then("^enter the details on Work Experience for Advanced CV$")
	public void enter_the_details_on_Work_Experience_for_Advanced_CV() throws Throwable {
	  
	   WorkExperienceAdvancedCV.verifySidetabs();
	   WorkExperienceAdvancedCV.verifyPage();
	   WorkExperienceAdvancedCV.clickAddWorkExperience();
	   WorkExperienceAdvancedCV.VerifyAddNewEmployementform();
	   WorkExperienceAdvancedCV.fillForm();
	   WorkExperienceAdvancedCV.verifyWorkExperienceTable();
	   WorkExperienceAdvancedCV.clickMarkAsComplete();
	   
	}

	@Then("^Re edit previously added Work Experience on Advanced CV$")
	public void re_edit_previously_added_Work_Experience_on_Advanced_CV() throws Throwable {
	  
		   WorkExperienceAdvancedCV.verifySidetabs();
		   WorkExperienceAdvancedCV.verifyPage();
		   WorkExperienceAdvancedCV.verifyWorkExperienceTable();
		   WorkExperienceAdvancedCV.clickEDIT();
		   WorkExperienceAdvancedCV.editForm();
	}

	@Then("^Delete previously added Work Experience on Advanced CV$")
	public void delete_previously_added_Work_Experience_on_Advanced_CV() throws Throwable {
	  
		   WorkExperienceAdvancedCV.verifySidetabs();
		   WorkExperienceAdvancedCV.verifyPage();
		   WorkExperienceAdvancedCV.verifyWorkExperienceTable();
		   WorkExperienceAdvancedCV.clickDELETE();
		   WorkExperienceAdvancedCV.verifyWorkExpTableDELETED();
	}

	@Then("^click to edit Education for Advanced CV$")
	public void click_to_edit_Education_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editEducationButton();
	}

	@Then("^enter the details on Education for Advanced CV$")
	public void enter_the_details_on_Education_for_Advanced_CV() throws Throwable {
	  
	   EducationAdvancedCV.verifySidetabs();
	   EducationAdvancedCV.verifyPage();
	   EducationAdvancedCV.clickAddNewEducation();
	   EducationAdvancedCV.VerifyAddNewEducationform();
	   EducationAdvancedCV.fillForm();
	   EducationAdvancedCV.verifyEDUCATIONTable();
	   EducationAdvancedCV.clickMarkAsComplete();
	}

	@Then("^Re edit previously added Education on Advanced CV$")
	public void re_edit_previously_added_Education_on_Advanced_CV() throws Throwable {
	  
		EducationAdvancedCV.verifySidetabs();
		EducationAdvancedCV.verifyPage();
		EducationAdvancedCV.verifyEDUCATIONTable();
		EducationAdvancedCV.clickEDIT();
		EducationAdvancedCV.editForm();
	}

	@Then("^delete previously added Education on Advanced CV$")
	public void delete_previously_added_Education_on_Advanced_CV() throws Throwable {
	  
		EducationAdvancedCV.verifySidetabs();
		EducationAdvancedCV.verifyPage();
		EducationAdvancedCV.verifyEDUCATIONTable();
		EducationAdvancedCV.clickDELETE();
		EducationAdvancedCV.verifyEDUCATIONTableDELETED();
	}

	@Then("^click to edit Training for Advanced CV$")
	public void click_to_edit_Training_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editTrainingButton();
	}

	@Then("^enter the details on Training for Advanced CV$")
	public void enter_the_details_on_Training_for_Advanced_CV() throws Throwable {
	  
	  TrainingAdvancedCV.verifySidetabs(); 
	  TrainingAdvancedCV.verifyPage();
	  TrainingAdvancedCV.clickAddNewTraining();
	  TrainingAdvancedCV.VerifyAddNewTrainingform();
	  TrainingAdvancedCV.fillForm();
	  TrainingAdvancedCV.verifyTrainingTable();
	  TrainingAdvancedCV.clickMarkAsComplete();
	}

	@Then("^Re edit previously added Training on Advanced CV$")
	public void re_edit_previously_added_Training_on_Advanced_CV() throws Throwable {
	  
		TrainingAdvancedCV.verifySidetabs(); 
		TrainingAdvancedCV.verifyPage();
		TrainingAdvancedCV.VerifyAddNewTrainingform();
		TrainingAdvancedCV.clickEDIT();
		TrainingAdvancedCV.editForm();
	}

	@Then("^Delete previously added Training on Advanced CV$")
	public void delete_previously_added_Training_on_Advanced_CV() throws Throwable {
	  
		TrainingAdvancedCV.verifySidetabs(); 
		TrainingAdvancedCV.verifyPage();
		TrainingAdvancedCV.VerifyAddNewTrainingform();
		TrainingAdvancedCV.clickDELETE();
		TrainingAdvancedCV.verifyTrainingDELETED();
	}

	@Then("^click to edit Computer Skills for Advanced CV$")
	public void click_to_edit_Computer_Skills_for_Advanced_CV() throws Throwable {
	  
	   AdvancedCVPage.editComputerSkillsButton();
	}

	@Then("^enter the details on Computer Skills for Advanced CV$")
	public void enter_the_details_on_Computer_Skills_for_Advanced_CV() throws Throwable {
	  
		ComputerSkillsAdvancedCV.verifySidetabs();
		ComputerSkillsAdvancedCV.verifyPage();
		ComputerSkillsAdvancedCV.fillForm("Have");
		ComputerSkillsAdvancedCV.clickMarkAsComplete();
		ComputerSkillsAdvancedCV.clickNext();
	}

	@Then("^click to edit Driving Licence for Advanced CV$")
	public void click_to_edit_Driving_Licence_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editDrivingLicenseButton();
	}

	@Then("^enter the details on Driving Licence for Advanced CV$")
	public void enter_the_details_on_Driving_Licence_for_Advanced_CV() throws Throwable {
	  
		DrivingLicenceAdvancedCV.verifySidetabs();
		DrivingLicenceAdvancedCV.verifyPage();
		DrivingLicenceAdvancedCV.selectDrivingLicenseAvailability("Yes");
		DrivingLicenceAdvancedCV.clickMarkAsComplete();
		DrivingLicenceAdvancedCV.clickNext();
	}

	@Then("^click to edit Languages for Advanced CV$")
	public void click_to_edit_Languages_for_Advanced_CV() throws Throwable {
	  
	   AdvancedCVPage.editLanguageButton();
	}

	@Then("^enter the details on Languages for Advanced CV$")
	public void enter_the_details_on_Languages_for_Advanced_CV() throws Throwable {
	  
		LanguagesAdvancedCV.verifySidetabs();
		LanguagesAdvancedCV.verifyPage();
		LanguagesAdvancedCV.clickAddNewLanguage();
		LanguagesAdvancedCV.VerifyAddNewLanguageform();
		LanguagesAdvancedCV.fillForm();
		LanguagesAdvancedCV.verifyLanguageTable();
	}

	@Then("^Re edit previously added Languages on Advanced CV$")
	public void re_edit_previously_added_Languages_on_Advanced_CV() throws Throwable {
		LanguagesAdvancedCV.verifySidetabs();
		LanguagesAdvancedCV.verifyPage();
		LanguagesAdvancedCV.verifyLanguageTable();
		LanguagesAdvancedCV.clickEDIT();
		LanguagesAdvancedCV.editForm();
		   
	}

	@Then("^delete previously added Languages on Advanced CV$")
	public void delete_previously_added_Languages_on_Advanced_CV() throws Throwable {
		
		LanguagesAdvancedCV.verifySidetabs();
		LanguagesAdvancedCV.verifyPage();
		LanguagesAdvancedCV.clickDELETE();
		LanguagesAdvancedCV.verifyLanguageDELETED();
	}

	@Then("^click to edit Hobbies and Interest for Advanced CV$")
	public void click_to_edit_Hobbies_and_Interest_for_Advanced_CV() throws Throwable {
	  
		AdvancedCVPage.editHobbiesAndInterestsButton();
	}

	@Then("^enter the details on Hobbies and Interest for Advanced CV$")
	public void enter_the_details_on_Hobbies_and_Interest_for_Advanced_CV() throws Throwable {
	  
	  HobbiesAndInterestsAdvancedCV.verifySidetabs();
	  HobbiesAndInterestsAdvancedCV.verifyPage();
	  HobbiesAndInterestsAdvancedCV.fillHobbiesAndInterests();
	  HobbiesAndInterestsAdvancedCV.clickMarkAsComplete();
	  HobbiesAndInterestsAdvancedCV.clickNext();
	}

	
}
