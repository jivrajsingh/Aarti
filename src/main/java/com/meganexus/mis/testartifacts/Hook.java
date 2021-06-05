package com.meganexus.mis.testartifacts;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.pages.PageObject;

public class Hook extends PageObject {
	@Before
	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}

	@After
	public void logout() {
		getDriver().quit();
	}
}
