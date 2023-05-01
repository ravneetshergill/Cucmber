package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ravne\\Documents\\Eclipse Workbench\\CucumberParameters\\src\\test\\java\\featurefile", glue= {"stepdefinition"}, 
plugin= {"pretty","json:target/JSONReports.json"}, monochrome=true, dryRun=true)

public class TestRunner {


}
