
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


  Scenario Outline: Create Citizenship
    When User a Citizenship name as "<name>" shortname as "<shortname>"
    Then Success message should be displeyed

  #  When User a Citizenship name as "<name>" shortname as "<shortname>"
   # Then Already exist message should be displeyed
    Examples:
      | name         | shortname |
      | MR_Country122 | MR_Co122   |
      | MR_Country131 | MR_Co131   |
      | MR_Country141 | MR_Co141   |
      | MR_Country151 | MR_Co151   |

