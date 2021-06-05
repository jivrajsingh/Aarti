package com.meganexus.mis.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NavigateTabs extends GenericPage {

	// Navigate main tabs :
	@FindBy(xpath = ".//*[@id='packages']/ul/li[1]/a/span")
	public WebElementFacade HomeMainTab;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[2]/a/span")
	public WebElementFacade ClientsMainTab;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[3]/a/span")
	public WebElementFacade ReportsMainTab;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[4]/a/span")
	public WebElementFacade ActivityDirectoryMainTab;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[5]/a/span")
	public WebElementFacade ActivityArea;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[6]/a/span")
	public WebElementFacade AttendanceMainTab;
	@FindBy(xpath = ".//*[@id='packages']/ul/li[7]/a/span")
	public WebElementFacade UsersMainTab;
	@FindBy(xpath = ".//*[@id='specialPackages']/div/ul/li[1]/a/span[2]")
	public WebElementFacade AccountsMainTab;
	@FindBy(xpath = ".//*[@id='specialPackages']/div/ul/li[1]/a/span[2]")
	public WebElementFacade LogOutMainTab;

	public void NavigateToHomeMainTab() {
		HomeMainTab.click();
		waitABit(1000);
	}

	public void NavigateToClientsMainTab() {
		ClientsMainTab.click();
		waitABit(1000);
	}

	public void NavigateToReportsMainTab() {
		ReportsMainTab.click();
		waitABit(1000);
	}

	public void NavigateToActivityDirectoryMainTab() {
		ActivityDirectoryMainTab.click();
		waitABit(1000);
	}

	public void NavigateToActivityArea() {
		ActivityArea.click();
		waitABit(1000);
	}

	public void NavigateToAttendanceMainTab() {
		AttendanceMainTab.click();
		waitABit(1000);
	}

	public void NavigateToUsersMainTab() {
		UsersMainTab.click();
		waitABit(1000);
	}

	public void NavigateToAccountsMainTab() {
		AccountsMainTab.click();
		waitABit(1000);
	}

	public void NavigateToLogOutMainTab() {
		LogOutMainTab.click();
		waitABit(1000);
	}

	// Navigate to Client's sub tabs -

	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[1]/a")
	public WebElementFacade ProfileSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[2]/a")
	public WebElementFacade QuestionsSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[3]/a")
	public WebElementFacade GroupsAndBarriersSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[4]/a")
	public WebElementFacade QualificationsSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[5]/a")
	public WebElementFacade AllocationsSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[6]/a")
	public WebElementFacade IncentivesSubTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[7]/a")
	public WebElementFacade ReferralsSubTab;

	public void NavigateToProfileSubTab() {
		ProfileSubTab.click();
		waitABit(1000);
	}

	public void NavigateToQuestionsSubTab() {
		QuestionsSubTab.click();
		waitABit(1000);
	}

	public void NavigateToGroupsAndBarriersSubTab() {
		GroupsAndBarriersSubTab.click();
		waitABit(1000);
	}

	public void NavigateToQualificationsSubTab() {
		QualificationsSubTab.click();
		waitABit(1000);
	}

	public void NavigateToAllocationsSubTab() {
		AllocationsSubTab.click();
		waitABit(1000);
	}

	public void NavigateToIncentivesSubTab() {
		IncentivesSubTab.click();
		waitABit(1000);
	}

	public void NavigateToReferralsSubTab() {
		ReferralsSubTab.click();
		waitABit(1000);
	}

}
