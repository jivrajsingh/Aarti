package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClientsPasswordPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet

	// Verify all sub-top tabs -
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[1]/a")
	public WebElementFacade ProfileSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[2]/a")
	public WebElementFacade QuestionsSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[3]/a")
	public WebElementFacade GrpAndBarriersSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[4]/a")
	public WebElementFacade AssessmentsSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[5]/a")
	public WebElementFacade QualificationsSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[6]/a")
	public WebElementFacade AllocationsSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[7]/a")
	public WebElementFacade IncentivesSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[8]/a")
	public WebElementFacade ReferralsSubTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[9]/a")
	public WebElementFacade PasswordSubTopTab;

	public void verifySubTopTabs() {
		assertContaining("Profile", nt.ProfileSubTab);
		assertContaining("Questions", nt.QuestionsSubTab);
		assertContaining("Groups & Barriers", nt.GroupsAndBarriersSubTab);
		assertContaining("Qualifications", nt.QualificationsSubTab);
		assertContaining("Allocations", nt.AllocationsSubTab);
		assertContaining("Incentives", nt.IncentivesSubTab);
		assertContaining("Referrals", nt.ReferralsSubTab);
		assertContaining("Password", PasswordSubTopTab);
	}

	// Navigate to Password sub-top tab page

	public void clickOnPasswordSubTopTab() {
		PasswordSubTopTab.click();
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

	/**
	 * Verification of all elements on Password page
	 */
	@FindBy(xpath = ".//*[@id='m7315_moduleElement']/h1")
	public WebElementFacade ResetPasswordPageHeader;
	@FindBy(xpath = ".//*[@id='m7315_moduleElement']/div/div/div/a/span")
	public WebElementFacade ResetPasswordBttn;

	public void verifyHomePage() throws Exception {
		assertContaining("Reset Password", ResetPasswordPageHeader);
		assertContaining("Reset Password", ResetPasswordBttn);
	}

	// -------------------Reset Password-------------------------//

	// click Reset Password button
	public void clickResetPasswordBUTTON() throws Exception {
		ResetPasswordBttn.click();
		waitABit(5000);
	}

	@FindBy(xpath = ".//*[@id='m7345_moduleElement']/h1")
	public WebElementFacade viewPasswordHeader;
	@FindBy(xpath = ".//*[@id='m7345_view-content']/p[1]")
	public WebElementFacade OTPLine1;
	@FindBy(xpath = ".//*[@id='m7345_view-content']/p[2]")
	public WebElementFacade OTPLine2;

	public void verifyOTPPage() throws Exception {
		assertContaining("View Password", viewPasswordHeader);
		assertContaining("The 'one-time' password for this account will be: ", OTPLine1);
		assertContaining("Please make a note and print this password as it will NOT be shown again: ", OTPLine2);
	}

	public String extractOTP(WebElementFacade OTPString) {
		// extract the number from name
		String numberOnly = OTPString.getText().replaceAll("[^0-9]", "");
		return numberOnly;
	}

	public void CompareOTP() throws Exception {
		Assert.assertEquals(extractOTP(OTPLine1), extractOTP(OTPLine2));
	}

}
