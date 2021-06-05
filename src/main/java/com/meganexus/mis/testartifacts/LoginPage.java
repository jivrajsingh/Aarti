package com.meganexus.mis.testartifacts;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	@FindBy(name = "username")
	private WebElementFacade username;
	@FindBy(name = "password")
	private WebElementFacade password;
	@FindBy(name = "submit")
	private WebElementFacade submit;
	@FindBy(name = "agree_to_terms")
	private WebElementFacade chkbx;
	@FindBy(id = "btnSubmit")
	private WebElementFacade btnSubmit;

	public void loginCrendentials(String UserType) {
		if (UserType == "berwyn") {
			username.sendKeys("subhajitprojectlevelberwyn");
			password.sendKeys("Pa$$w0rd2");
		} else if (UserType == "wales") {
			username.sendKeys("cardiffSubhajit");
			password.sendKeys("Pa$$w0rd2");
		} else if (UserType == "SU") {
			username.sendKeys("vcsuper");
			password.sendKeys("Pa$$w0rd,1!");
		}

		submit.click();
		waitABit(3000);
		chkbx.click();
		btnSubmit.click();
		waitABit(3000);
	}
}
