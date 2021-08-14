package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/resolveTicket.feature",
glue="steps",monochrome=true,publish=true)
public class RunnerResolve extends AbstractTestNGCucumberTests {

}
