import cucumber.api.java8.En;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by kecso on 2018.05.01..
 */
public class StepDefinitions implements En {
    public StepDefinitions() {
        Given("I Run gherkin test from java", () -> {
            assertThat(true, is(false));
        });
        Then("Test is executed in application runtime", () -> {
            ;
        });
    }
}
