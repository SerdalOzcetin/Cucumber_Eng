package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import utilities.Driver;

public class Websites {

    @And("test that the the url of the website include its name {string}")
    public void testThatTheTheUrlOfTheWebsiteIncludeItsName(String arg0) {

        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(arg0));

    }



}
