package runnner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},glue= {"step"},plugin = {"html:testoutput/bhav.html","junit:testoutpt/bhav.xml","json:testotput/bhav.json"},tags= "@Login")

public class runner {

}
