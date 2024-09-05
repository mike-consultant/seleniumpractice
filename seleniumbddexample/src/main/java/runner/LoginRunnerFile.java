package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"features\\LoginPage.feature","features\\OrderHistory.feature"},
		glue= {"step.definitions"},
		plugin = {"html:htmlreport/cucumber-test-resport.html"}
		
	
)


public class LoginRunnerFile extends AbstractTestNGCucumberTests {


}
