package com.meganexus.mis.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "" }, glue = {
		"com.meganexus.stepDefs" })
public class CukesRunnerTest {

}
