@LandingPage
Feature: Landing Page Feature

  #PositiveTestCase
  @LP001
  Scenario: Continue to Login
    Given I open CURA Healthcare website
    When I click on the Make Appointment button
    Then I should be navigated to Login Page
