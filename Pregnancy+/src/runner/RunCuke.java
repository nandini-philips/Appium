package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/features"}, glue= {"stepDefinitions"}, monochrome=true, tags= {"@PregLogin,@ChooseBaby,@TrackerOptions,@TrackerShop,@Logout"})
public class RunCuke {

}