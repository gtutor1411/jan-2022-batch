package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Features/Tag.feature", 
glue = "stepDefinition",
monochrome = true,
plugin = {"pretty","json:target/cucumber-reports/reports.json",		
"junit:target/cucumber-reports/Cucumber.xml",
"html:target/cucumber-reports/reports2.html"},
//tags= {"@Sanity"}
//tags={"@Sanity", "@BusinessCritical"} // AND 
//tags= {"@Sanity,@Regression"},//OR
tags= {"@Sanity"},
dryRun=false
)
public class TestRunner {

}
