Feature: login feature

  @Regression
  Scenario: Owner login
    Given open app
    And view splash screen
    And input phone number
    When choose verification method
    And input otp verification
    Then user logged in