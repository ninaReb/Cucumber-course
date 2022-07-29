Feature: Login
  Login test

  Scenario: Logging in with valid credentials
    Given I am at the Login page
    When I fill the account Username textbox with value "standard_user"
    And I fill the password textbox with value "secret_sauce"
    And I click the login button
    Then I should be at the home page