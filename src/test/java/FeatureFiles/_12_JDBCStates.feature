Feature: Testing JDBC States

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: States testing with JDBC
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | states     |
    Then Send query the database "select * from States" and control match