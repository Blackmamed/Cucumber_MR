Feature: Country Multy Scenario

  Background: # Before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country page

  Scenario: Create Country
    When Create a Country
    Then Success message should be displeyed

  Scenario: Create a Country 2
    When Create a Country name as"MR_Country11" code as "1234567"
    Then Success message should be displeyed