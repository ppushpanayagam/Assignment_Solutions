Feature: Update Profile Details
  Background:
    Given the user invoke the application
    And sign in

  Scenario: Verify Whether user able to update the first name
    When the user update their first name
    Then the user should be able to update the first name successfully