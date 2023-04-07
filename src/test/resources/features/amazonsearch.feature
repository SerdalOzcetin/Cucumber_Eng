@amazon
Feature: User will test in amazon

  Scenario: TC01 User search for iPhone in amazon

    Given user goes to amazon homepage
    When user serach for iPhone in search box
    And test that results include iPhone word
    Then close the browser.