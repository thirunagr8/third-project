package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features="src\\test\\java\\cucumber\\login.feature",
glue="steps,Hooks",
monochrome=true,
//  tags = "@Positive or  @Negative") 
tags = "~@Positive")
//   dryRun = true,
// snippets =SnippetType.CAMELCASE )
@RunWith(Cucumber.class)
public class RunTest {
}