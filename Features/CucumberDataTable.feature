Feature: To run Cucumber with Data Table

  Scenario Outline: To verify the login functinality with Data Table
    Given I am in Login Page
    When I enter valid "<Username>" and "<Password>"
    And I click on Login
    Then I should be able to login

    Examples: 
      | Username | Password |
      | admin    | admin    |
      | Bharat   |   123456 |
