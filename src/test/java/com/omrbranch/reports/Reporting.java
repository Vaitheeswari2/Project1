package com.omrbranch.reports;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	public static void generateReports(String json) throws FileNotFoundException, IOException {
		File file = new File(getProjectPath()+getPropertyValue("reportPath"));
		Configuration configuration = new Configuration(file, "HotelBookingAutomation");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("OS", "WIN 10");
		configuration.addClassifications("Name", "Vaitheeswari");
		configuration.addClassifications("Trainer", "Nithish");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(json);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
	}



}


