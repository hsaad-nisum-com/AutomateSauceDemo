package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/java/Featueres/SauceDemo_ProductPurchasing.feature",
        glue = {"StepDefinition", "Hooks"},
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.html"
                , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}