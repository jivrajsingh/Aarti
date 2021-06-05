package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchAndViewClient extends GenericPage {

	int Row = XlsReader.getCellRowNum("PROFILE", 18, "No");
	public int row = Row - 1;
	public String FrstName = XlsReader.getCellData("PROFILE", 2, row);
	public String LstName = XlsReader.getCellData("PROFILE", 4, row);

	// Navigate To CLIENTS Main Page
	@FindBy(xpath = ".//*[@id='packages']/ul[1]/li[2]/a/span[text() ='Clients']")
	public WebElementFacade ClientsMainTopTab;
	@FindBy(xpath = ".//*[@id='misGroups']/ul/li[1]/a[text()= 'Clients']")
	public WebElementFacade ClientsSubTopTab;

	public void NavigateToCLIENTSMainPage() {
		ClientsMainTopTab.click();
		waitABit(3000);
		ClientsSubTopTab.click();
		waitABit(1000);
		System.out.println("IN CLIENTS MAIN PAGE");
	}

	// Search client
	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[1]/h3")
	public WebElementFacade filters;

	@FindBy(xpath = ".//*[@id='firstName_misJmesa_4315']")
	public WebElementFacade FrstNameSrchTxtBx;
	@FindBy(xpath = ".//*[@id='lastName_misJmesa_4315']")
	public WebElementFacade SurnameSrchTxtBx;

	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[1]/div/fieldset/div[13]/div/button[1]")
	public WebElementFacade SearchBttn;

	@FindBy(xpath = ".//*[@id='misJmesa_4315']/div[2]/table[2]/tbody[3]/tr/td")
	public WebElementFacade TableSearchResult;

	public void Searchclient() {
		System.out.println("SEARCHING CLIENT.....");
		filters.click();
		waitABit(3000);

		System.out.println("subhajithmpclient");
		System.out.println("chor");

		FrstNameSrchTxtBx.clear();
		FrstNameSrchTxtBx.sendKeys("subhajithmpclient");

		SurnameSrchTxtBx.clear();
		SurnameSrchTxtBx.sendKeys("chor");
		waitABit(1000);

		SearchBttn.click();
		waitABit(5000);

		Assert.assertEquals("Results 1 - 1 of 1.", TableSearchResult.getText());
	}

	// view client
	@FindBy(xpath = ".//*[@id='misJmesa_4315_row1']/td[8]/a")
	public WebElementFacade viewClientBtn;

	public void viewclient() {

		viewClientBtn.click();
		waitABit(3000);
	}

}
