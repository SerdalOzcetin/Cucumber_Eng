package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class AmazonStepDefinitions {
    AmazonHomePage amazonHomePage = new AmazonHomePage();

    @Given("user goes to amazon homepage")
    public void userGoesToAmazonHomepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @When("user serach for iPhone in search box")
    public void userSerachForIPhoneInSearchBox() {

        amazonHomePage.amazonSearchBox.sendKeys("iPhone"+ Keys.ENTER);

    }

    @And("test that results include iPhone word")
    public void testThatResultsIncludeIPhoneWord() {

        String expectedWord = "iPhone";
        String actualData = amazonHomePage.amazonSearchResults.getText();

        assertTrue(actualData.contains(expectedWord));

    }

    @Then("close the browser.")
    public void closeTheBrowser() {

        Driver.closeDriver();
    }

    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty(arg0));

    }

    @When("user serach for {string} in search box")
    public void userSerachForInSearchBox(String arg0) {
        amazonHomePage = new AmazonHomePage();
        amazonHomePage.amazonSearchBox.sendKeys(arg0+Keys.ENTER);

    }

    @And("test that results include {string} word")
    public void testThatResultsIncludeWord(String arg0) {
        amazonHomePage = new AmazonHomePage();
        String actualData = amazonHomePage.amazonSearchResults.getText();

        assertTrue(actualData.contains(arg0));

    }
}
