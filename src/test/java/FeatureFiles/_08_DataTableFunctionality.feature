Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | country    |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | MemmedCountry17 |
      | codeInput | M1214           |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displeyed


  Scenario: Create Nationalities
    And Click on the element in LeftNav

      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | MemmedCountry19 |


    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displeyed