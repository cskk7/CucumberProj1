Feature: Validate demo login functionality


  @DemoLogin01
  Scenario Outline: User logs into Demo application

    Given As a user I am on Demo Application
    And I enter valid credentials : "<Username>" and "<Password>"
    When I click on Login button
    Then I should see Demo Home page

    Examples:
      | Username | Password |
      | Username | Password |

#  @DemoLogin02
#    Scenario: User signout from demo application
#
#      Given I am on Demo Home page
#      And I logout from Demo application

