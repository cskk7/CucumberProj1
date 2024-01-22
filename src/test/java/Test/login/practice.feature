#login
Feature: Practice Automation Test Login
  Scenario: Positive LogIn test
    Given user is on Practice Automation page
    When user enter username
    And user enter password
    Then user enters homepage