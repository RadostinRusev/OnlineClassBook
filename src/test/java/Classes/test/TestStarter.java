package Classes.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/test-feature"})
//@CucumberOptions(monochrome = true, plugin = {"pretty","json:target/login-feature.json"})
public class TestStarter {

}
