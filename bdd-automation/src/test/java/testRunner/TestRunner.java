package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features= {"Features/Tag.feature"},
glue="stepDefinition",
plugin= {"pretty","json:target/cucumber-reports/reports.json","html:target/cucumber-reports/reports2.html"},
monochrome=true,
dryRun=false,
tags= "@Tag1")//Sanity OR Regression runs

//tags="@Tag1",
//tags= {"@Sanity","@Regression"})//Sanity AND Regression runs
//tags= {"@Sanity,@Regression"})//Sanity OR Regression runs
public class TestRunner {

}
