package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:src/test/resources/reporter/reporter.html"},
        features = "src/test/resources/features/ValidarRetornoGet.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"steps"})
public class Runner {
}
