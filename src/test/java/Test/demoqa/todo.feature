Feature: Practice Automation Login Test


  Scenario: 1.Positive Login Test
    Given Login page
    When user enter valid username "student"
    And user enter valid password "Password123"
    And user click submit button
    Then user enters to profile page
    And user is displayed "Congratulations student. You successfully logged in!"
    And log out button is displayed

  Scenario: 2.Negative username Test
    Given Login page
    When user enter invalid username "noStudent"
    And user enter valid password "Password123"
    And user click submit button
    Then error message is displayed
    And error text is "Your username is invalid!"

  Scenario: 3.Negative password Test
    Given Login page
    When user enter valid username "student"
    And user enter invalid password "Pass123"
    And user click submit button
    Then error message is displayed
    And error text is "Your password is invalid!"
