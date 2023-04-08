@MultySearch
  Feature: User will test in amazon by using multysearch


    Scenario: TC02 User should be able to search for more produscts and test them.

      Given user goes to "amazon_url" homepage
      When user serach for "Samsung" in search box
      And test that results include "Samsung" word
      Then close the browser.

      Given user goes to "amazon_url" homepage
      When user serach for "iPhone" in search box
      And test that results include "iPhone" word
      Then close the browser.

      Given user goes to "amazon_url" homepage
      When user serach for "Huawei" in search box
      And test that results include "Huawei" word
      Then close the browser.