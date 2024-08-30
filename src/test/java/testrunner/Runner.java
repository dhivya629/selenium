package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
	    features="./src/test/resources/feauturefiles/datatable.feature",
		glue="stepDefinition",
		publish=true,
		monochrome=true,
		dryRun=true,
		plugin= {"pretty","html:target/output.html"}
		//tags=("not @sanity")
	//	tags= ("@smoke or @sanity")
		//tags=("@sanity and @smoke")
	    )
				
public class Runner {

}
