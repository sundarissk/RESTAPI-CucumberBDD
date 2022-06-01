package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/UserSkillFeature_bdd"},
		glue = {"UserSkill_StepDefinition_Bdd"},
				plugin= {"html:target/Htmlreports",
						"json:target/JsonReports/reports.json",
						"junit:target/JUnitReport/report.xml"},
		monochrome = false
		)

public class US_Test_Runner {

}
