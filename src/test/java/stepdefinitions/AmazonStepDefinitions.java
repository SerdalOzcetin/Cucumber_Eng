package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonHomePage;
import utilities.ConfigReader;
import utilities.Driver;

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
    }

    @Then("close the browser.")
    public void closeTheBrowser() {

        Driver.closeDriver();
    }
}
