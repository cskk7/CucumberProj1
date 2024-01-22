Feature: Calculator

  Scenario: User add two numbers

    Given I open calculator
    When I add two numbers
    Then I should see output

  Scenario: Subtract two numbers

    Given I open calculator
    When I subtract two numbers: 5,3
    Then I should see output: 2

  Scenario Outline: Subtract two numbers

  Given I open calculator
  When I add two numbers: <A>, <B>
  Then I should see output: <C>

  Examples:
  | A  | B | C  |
  | 3  | 1 | 2	|
  | 44 | 4 | 39	|

  Scenario: Multiple two numbers

    Given I open calculator
    When I multiply two numbers:
      | 5 |
      | 2 |
    Then I should see output: 10

  Scenario : verifying the user details
    Given I am on contact details
    When I click the details button
    Then I should see contact details
      | Name  | Karthik |
      | Place | Chennai |

  Scenario Outline : verifying the user details
    Given I am on contact details
    When I click the details button
    Then I should see contact details
      | Name  | <Name> |
      | Place | <Place> |
    Examples:
      |  Name   |  Place |
      |Prasanna |  Salem |
      | Shaveen | Chennai|