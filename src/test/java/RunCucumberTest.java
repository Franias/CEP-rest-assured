import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/resources/features/"},
        plugin = {"json:target/cucumber-report/cucumber.json", "junit:target/junit.xml"},
        glue = {"steps"},
        tags = "@all"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

