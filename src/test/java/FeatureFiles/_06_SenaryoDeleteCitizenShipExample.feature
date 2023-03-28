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


    Scenario Outline: Delete Citizenship
      When User a Citizenship name as "<name>" shortname as "<shortname>"
      Then Success message should be displeyed

      When User a Citizenship name as "<name>" shortname as "<shortname>"
      Then Already exist message should be displeyed

      When User delete name "<name>"
      Then Success message should be displeyed

      Examples:
        | name      | shortname |
        | Memmed012 | md012     |
        | Memmed014 | md014     |
       #| Memmed080 | md080     |
       #| Memmed085 | md085     |

      #TestNG deki Data Provide bura da  Scenario Outline:  Examples:  kimidir