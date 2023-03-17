@Homepage
Feature: Homepage Feature

  Background: 
    Given I open CURA Healthcare website
    When I click on the Make Appointment button
    Then I should be navigated to Login Page
    When I input John Doe and ThisIsNotAPassword on the username and password field
    And I click on the Login button
    Then I should be navigated to Homepage

  #PositiveTestCase
  Scenario: Create Appointment
  When I select Tokyo CURA Healthcare Center facility dropdown
  And I tick Hospital Readmission checkbox
  And I select MedicaId Hospital program radio button
  And I select date on the Datepicker
  And I input Appointment at 9 AM on the Comment textarea
  And I click Book Appointment button
  Then I should be navigated to Appointment Confirmation page
  