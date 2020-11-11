package runner;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/postedit.feature",
        glue = {"seleniumgluecode"},
        snippets = SnippetType.CAMELCASE,
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/reportes/editpost.html"}

)

public class Testrunner {

}
