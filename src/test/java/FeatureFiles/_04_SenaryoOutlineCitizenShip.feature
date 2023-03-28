#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.

Feature: Citizenship Functionality

  Background: # Before scenario
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page


  Scenario: Create Citizenship
    When User a Citizenship name as"MR_Country225" shortname as "MR_Co225"
    Then Success message should be displeyed

    When User a Citizenship name as"MR_Country226" shortname as "MR_Co226"
    Then Already exist message should be displeyed



