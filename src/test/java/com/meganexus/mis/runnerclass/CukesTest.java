package com.meganexus.mis.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/Feature files/" }, tags = { "@Client_Profile" }, glue = {
		"com.meganexus.mis.stepDefinitions" }, plugin = { "html:target/cucumber-report",
				"json:target/json/output.json" })
public class CukesTest {
}
