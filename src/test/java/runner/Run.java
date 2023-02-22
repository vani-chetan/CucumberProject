package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/cucumber.feature",glue =
        {"MlCalStepdefs"},monochrome = true,
        plugin = {"pretty","html:target/HtmlReports.html",
        "json:target/JSONReport.json"},
        tags="@smokeScenario"
)
public class Run extends AbstractTestNGCucumberTests {
}
