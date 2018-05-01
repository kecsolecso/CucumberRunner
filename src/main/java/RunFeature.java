import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by kecso on 2018.05.01..
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/sample.feature")
public class RunFeature {
}
