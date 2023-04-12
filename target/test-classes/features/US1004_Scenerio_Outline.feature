@Outline
Feature: Multiple data usage

  Scenario Outline: TC01 user search for multiple products in searchbox

    Given user goes to "amazon_url" homepage
    When user serach for "<products>" in search box
    And test that results include "<products>" word
    Then User close the browser





    Examples:
      | products |
      | Samsung  |
      | iPhone   |
      | Huawei   |