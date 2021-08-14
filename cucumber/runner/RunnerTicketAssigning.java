package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/ticketAssigning.feature",
glue="steps",monochrome=true,publish=true)
public class RunnerTicketAssigning extends AbstractTestNGCucumberTests{

}
