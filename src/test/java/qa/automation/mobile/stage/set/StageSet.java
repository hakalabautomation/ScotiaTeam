package qa.automation.mobile.stage.set;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src/test/resources/features/", 
					glue = "qa/automation/mobile/definition/", 
					plugin = { "pretty:target/reportes/pretty/pretty.txt", 
								"html:target/reportes/html",
								"json:target/reportes/json/report.json", 
								"junit:target/reportes/junit/junit.xml", 
								"usage:target/reportes/usage/usage.json", 
								"rerun:target/reportes/rerun/rerun.txt",
								"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Guest_.html" })
public class StageSet {
}