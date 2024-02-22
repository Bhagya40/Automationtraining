package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"Hooks","src/test/java/StepDefinationFile"},
        plugin = {"pretty", "html:target/cucumber-reports"},
       // tags="",
        dryRun=false
)
public class Testrunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

