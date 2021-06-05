package com.meganexus.vc2.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "@PersonalDetails" }, glue = {
		"com.meganexus.stepDefs" })
public class CukesRunnerTest {

}
