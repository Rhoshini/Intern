package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/deleteTicket.feature",
glue="steps",monochrome=true,publish=true)
public class RunnerDelete extends AbstractTestNGCucumberTests {
	
}
