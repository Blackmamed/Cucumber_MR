
#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Fees Functionality
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | <name>     |
      | codeInput | <code>     |
      | integCode | <intCode>  |
      | priority  | <priority> |

    And Click on the element in Dialog
      | toggleBar |
      | saveBtn   |

    Then Success message should be displeyed

    And User delete item from Dialoq Content

      | <name> |

    Then Success message should be displeyed
    Examples:
      | name | code | intCode    | priority |
      | MR1  | 1111 | million    | 1234     |
      | MR2  | 2222 | heasabaz   | 2345     |
      | MR3  | 3333 | emanat     | 3456     |
      | MR4  | 4444 | kapital    | 4567     |
      | MR5  | 5555 | beynelxalq | 5678     |



