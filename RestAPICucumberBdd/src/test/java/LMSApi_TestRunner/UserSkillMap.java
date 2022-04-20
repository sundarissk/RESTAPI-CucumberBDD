package LMSApi_TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/UserSkillMap_Feature"},
		glue = {"UserSkillMap_StepDefinition"},
				strict = true,
				plugin= {"html:target/Htmlreports",
						"json:target/JsonReports/reports.json",
						"junit:target/JUnitReport/report.xml"},
	    monochrome = true
	    
		)
public class UserSkillMap {

}
