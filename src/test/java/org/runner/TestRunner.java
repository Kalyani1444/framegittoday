package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Instagram.feature",glue="org.steps",dryRun=false,
monochrome=true,plugin= {"pretty","junit:target\\SampleMaven.xml","html:target","json:target\\SampleMaven.json"})

public class TestRunner {

@AfterClass
	
	public static void afterScenario() {
		
		
	Reporting.generateJVMReport("C:\\Users\\Ayesha\\eclipse-workspace\\SampleMaven\\target\\SampleMaven.json");

}

}