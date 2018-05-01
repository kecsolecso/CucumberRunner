/**
 * Created by kecso on 2018.04.30..
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class CucumberTestRunner {
    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(RunFeature.class);
        System.out.println(result.getRunCount());
        System.out.println(result.getFailureCount());
    }
}
