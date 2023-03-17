@Login
Feature: Login Feature

  Background: 
    Given I open CURA Healthcare website
    When I click on the Make Appointment button
    Then I should be navigated to Login Page

  #PositiveTestCase
  @LG001
  Scenario Outline: Input all field on the Login Page
    When I input <username> and <password> on the username and password field
    And I click on the Login button
    Then I should be navigated to Homepage

    Examples: 
      | username | password           |
      | John Doe | ThisIsNotAPassword |

  #NegativeTestCase
  @LG002
  Scenario Outline: Login without input username
    When I input <password> field on the password field
    And I click on the Login button
    Then I should be able to see alert message
    
    Examples: 
      | password           |
      | ThisIsNotAPassword |

  @LG003
  Scenario Outline: Login without input password
    When I input <username> field on the username field
    And I click on the Login button
    Then I should be able to see alert message
    
    Examples: 
      | username |
      | John Doe |

  @LG004
  Scenario: Login without input all field
    When I click on the Login button
    Then I should be able to see alert message
