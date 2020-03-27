package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@TC01_Automation,@TC02_Automation,@TC03_Automation,@TC04_Automation,@TC05_Automation"},
		glue = {"com.StepDefinition"},
		monochrome = true)
public class Runner {
	
	@AfterClass
	  public static void extendReport() 
	{ 
		Reporter.loadXMLConfig("src\\test\\resources\\extent-config.xml");
	}

}
