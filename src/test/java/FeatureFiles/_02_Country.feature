
#Senaryo
#  siteye git  -> test case -> adım
#  login bilgilerini gir
#  siteye girdiğini doğrula

Feature: Country Functionality

  @Regression

  Scenario: Create Country

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country page
    When Create a Country
    Then Success message should be displeyed
