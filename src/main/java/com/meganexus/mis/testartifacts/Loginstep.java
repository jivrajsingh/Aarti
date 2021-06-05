package com.meganexus.mis.testartifacts;

import com.meganexus.mis.stepLib.GenericStep;

import net.thucydides.core.annotations.Step;

public class Loginstep extends GenericStep {
	LoginPage lp;

	@Step
	public void OpenApp() {
		lp.open();
	}

	@Step
	public void LoginToApp(String UserType) {
		lp.loginCrendentials(UserType);
	}
}
