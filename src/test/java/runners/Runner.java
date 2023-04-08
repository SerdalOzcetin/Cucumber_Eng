package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt",
               // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome = true,

        features = "./src/test/resources/features",            //features folder path
        glue = {"stepdefinitions",},                   // stepdefinition path
        tags = "@PositiveLoginTest",
        dryRun = false

)
public class Runner {

        // Thic class is used to run the Test cases
        // and configurations

}
