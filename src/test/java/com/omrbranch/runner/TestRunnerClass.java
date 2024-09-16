package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Book", plugin = { "pretty",
		"json:target/HotelBookingAutomation.json" }, dryRun = false, glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources\\Features")
public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void reportGenerate() throws FileNotFoundException, IOException {
		Reporting.generateReports(getProjectPath() + getPropertyValue("jsonFilePath"));
	}

}

