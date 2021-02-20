Feature: Order a T-Shirt
  Background:
    Given the user invoke the application
    And sign in

  Scenario: Verify whether User able to order a T-shirt
    When the User Order a Tshirt as a existing user
    Then the user should be able to order an item successfully

