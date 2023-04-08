@Wip
Feature: User will test the url of the web sites

  Background: Common first steps
    Given user goes to "amazon_url" homepage

    Scenario: TC01 Test that The url of website include its name

      And test that the the url of the website include its name "amazon"
      Then close the browser.
