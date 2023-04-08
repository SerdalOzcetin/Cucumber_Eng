@Backround
Feature: User will test in amazon by using multysearch

  Background: for all steps, common first stpes is written here

    Given user goes to "amazon_url" homepage



  Scenario: TC01 User should be able to search for Samsung and test them.

    When user serach for "Samsung" in search box
    And test that results include "Samsung" word
    Then close the browser.

  Scenario: TC02 User should be able to search for iPhone and test them.

    When user serach for "iPhone" in search box
    And test that results include "iPhone" word
    Then close the browser.

  Scenario: TC03 User should be able to search for Huawei and test them.

    When user serach for "Huawei" in search box
    And test that results include "Huawei" word
    Then close the browser.