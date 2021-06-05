package com.meganexus.mis.pageObjectLib;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.meganexus.mis.testartifacts.XlsReader;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.Dropdown;

public class ClientSupportDocPage extends GenericPage {
	NavigateTabs nt;
	// read from excel sheet

	public String DocumentName = "My New Document";
	public String Description = "To attach a new document";

	@FindBy(xpath = ".//*[@id='actionsNavigation']/ul/li[4]/a/span")
	public WebElementFacade AddSupportDocSideTab;

	/**
	 * Verification of all elements on Support Document Table.
	 */
	@FindBy(xpath = ".//*[@id='m17425_moduleElement']/h1")
	public WebElementFacade SupportDocumentsTableHeader;
	@FindBy(xpath = ".//*[@id='misJmesa_17425_mr_']")
	public WebElementFacade showList;

	@FindBy(xpath = ".//*[@id='misJmesa_17425']/div/table[2]/thead/tr/td[1]")
	public WebElementFacade DocumentNameTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17425']/div/table[2]/thead/tr/td[2]")
	public WebElementFacade DescriptionTable;

	@FindBy(xpath = ".//*[@id='misJmesa_17425']/div/table[2]/thead/tr/td[3]")
	public WebElementFacade ViewTable;
	@FindBy(xpath = ".//*[@id='misJmesa_17425']/div/table[2]/thead/tr/td[4]")
	public WebElementFacade ArchieveTable;

	public void verifyForm() throws Exception {

		Assert.assertEquals("Support Documents", SupportDocumentsTableHeader.getText());// Activity
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

		Assert.assertEquals("Document Name", DocumentNameTable.getText());
		Assert.assertEquals("Description", DescriptionTable.getText());

		Assert.assertEquals("View", ViewTable.getText());
		Assert.assertEquals("Archive", ArchieveTable.getText());

	}

	// -------------------ADD/EDIT-------------------------//

	// click ADD EDIT Qualification SIDE TAB
	public void clickADDSupportDocSIDETAB() throws Exception {
		AddSupportDocSideTab.click();
	}

	/**
	 * Verification of all elements on Page.
	 */

	@FindBy(xpath = ".//*[@id='m17445_moduleElement']/h1")
	public WebElementFacade AddSupportDocument;
	
	@FindBy(xpath = ".//*[@id='form_17415']/fieldset/div[1]/label")
	public WebElementFacade DocNameAddForm;
	@FindBy(xpath = ".//*[@id='form_17415']/fieldset/div[2]/label")
	public WebElementFacade DescriptionAddForm;
	@FindBy(xpath = ".//*[@id='form_17415']/fieldset/div[3]/label")
	public WebElementFacade UploadFileAddForm;

	@FindBy(xpath = ".//*[@id='form_17415']/fieldset/div[5]/div/button")
	public WebElementFacade SaveAddForm;
	@FindBy(xpath = ".//*[@id='form_17415']/fieldset/div[5]/div/a/span")
	public WebElementFacade CancelAddForm;

	public void verifyADDEDITForm() throws Exception {

		Assert.assertEquals("Add Support Document", AddSupportDocument.getText());// Table
																								// title

		Assert.assertEquals("Document Name", DocNameAddForm.getText());
		Assert.assertEquals("Description", DescriptionAddForm.getText());
		Assert.assertEquals("Upload File", UploadFileAddForm.getText());
		
		Assert.assertEquals("Save", SaveAddForm.getText());
		Assert.assertEquals("Cancel", CancelAddForm.getText());
	}

	@FindBy(xpath = ".//*[@id='m17445_formElement_171105']")
	public WebElementFacade DocNameAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17445_formElement_171115']")
	public WebElementFacade DescriptionAddFormTxtBx;
	@FindBy(xpath = ".//*[@id='m17445_formElement_171125']")
	public WebElementFacade UpDocBROWSEAddFormBttn;

	public void UploadDocumentToForm() throws Exception {
		DocNameAddFormTxtBx.sendKeys(DocumentName);
		DescriptionAddFormTxtBx.sendKeys(Description);
		UploadDocument(UpDocBROWSEAddFormBttn, "C:\\Users\\Subhajit.Ghosh\\workspace\\HMPBerwyn\\TestData\\Document.docx");
		
		SaveAddForm.click();
	}

	// -------------------Verify List-------------------------//
	@FindBy(xpath = ".//*[@id='misJmesa_17425_row1']/td[1]")
	public WebElementFacade DocNameTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17425_row1']/td[2]")
	public WebElementFacade DesriptionTableEntry;
	@FindBy(xpath = ".//*[@id='misJmesa_17425_row1']/td[3]/a")
	public WebElementFacade ViewButton;
	@FindBy(xpath = ".//*[@id='misJmesa_17425_row1']/td[4]")
	public WebElementFacade ArchieveButton;

	public void clickVIEWButton() throws Exception {
		ViewButton.click();
	}

	public void clickARCHIEVEButton() throws Exception {
		ArchieveButton.click();
	}
	
	public void VerifySupportDocumentList() throws Exception {
		verifyForm();
		assertContaining(DocumentName, DocNameTableEntry);
		assertContaining(Description, DesriptionTableEntry);
	}

}
