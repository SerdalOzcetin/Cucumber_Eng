@PositiveLoginTest
Feature: US1006 user should be able to login with validinfo

  Scenario: TC01 Login test with valid user name and password

    Given user goes to "Test_automation_Url" homepage
    When User clicks on PRACTICE.
    And  User clicks on Test Login Page.
    And User clicks on UserNameBox.
    And User type into username "student".
    And User clicks on Password.
    And User type into password "Password123".
    When User clicks on SubmitButton.
    Then Assert that login is successful

