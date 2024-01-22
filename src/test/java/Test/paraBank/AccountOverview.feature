Feature: Account Overview

  Scenario: Overview_1
    Given : user is logged into main page
    When : user clicks accounts overview
    Then : account number should display
    And : balance amount should display
    And : available amount should display

  Scenario: Overview_2
    Given : user is on account overview session
    When : user clicks account number
    Then : account details should display