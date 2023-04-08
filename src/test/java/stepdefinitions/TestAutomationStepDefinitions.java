package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestAutomationHomePage;

public class TestAutomationStepDefinitions {

    TestAutomationHomePage testAutomationHomePage;
    @When("User clicks on PRACTICE.")
    public void user_clicks_on_practıce() {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.buttonPRACTICE.click();

    }
    @When("User clicks on Test Login Page.")
    public void user_clicks_on_test_login_page() {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.linkTestLoginPage.click();

    }
    @When("User clicks on UserNameBox.")
    public void user_clicks_on_user_name_box() {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.inputUsername.click();

    }
    @When("User type into username {string}.")
    public void user_type_into_username(String string) {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.inputUsername.sendKeys(string);
    }


    @When("User clicks on Password.")
    public void user_clicks_on_password() {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.inputPassword.click();
    }

    @When("User type into password {string}.")
    public void user_type_into_password(String string) {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.inputPassword.sendKeys(string);

    }
    @When("User clicks on SubmitButton.")
    public void user_clicks_on_submit_button() {
        testAutomationHomePage = new TestAutomationHomePage();
        testAutomationHomePage.buttonSubmit.click();

    }

    @Then("Assert that login is successful")
    public void assert_that_login_is_successful() {
        testAutomationHomePage = new TestAutomationHomePage();
        Assert.assertTrue(testAutomationHomePage.textLoggedInSuccessfully.isDisplayed());
    }





}
