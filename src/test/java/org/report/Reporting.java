package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile ) {
		
		File reportDirectory = new File("C:\\Users\\Ayesha\\eclipse-workspace\\SampleMaven\\target");
		
		Configuration configuration = new Configuration(reportDirectory, "INstagramLogin");
		
		configuration.addClassifications("platformName", "windows");
		configuration.addClassifications("platformVersion", "11");
		configuration.addClassifications("buildNo", "IN94340");

	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	
	ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
	builder.generateReports();
	
	}
}

