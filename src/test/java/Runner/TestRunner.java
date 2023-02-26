package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/recep/IdeaProjects/untitled10/src/test/resources",
        glue = {"StepDefinitions"},
        plugin ={"pretty","html:report.html","junit:junit_xml/cucumber.xml"}
)

public class TestRunner {
}
