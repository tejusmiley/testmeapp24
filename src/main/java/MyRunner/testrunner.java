package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\s.srinadhuni\\eclipse-workspace\\Cucumber_June\\Cucumber_June\\src\\main\\java\\Features\\webshopLogin.feature", 
glue={"demowebloginstepdef.java"},
plugin= {"pretty","html:target/cucumber-html-report"},
dryRun=true,
monochrome=true)

public class testrunner {
	
	

	
	

}
//tags= {"@part1"},
