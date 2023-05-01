
Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
  @Regression
  Scenario: Create Country
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | country    |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | MemmedCountry24 |
      | codeInput | M1214           |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displeyed

    And User delete item from Dialoq Content

      | MemmedCountry24 |

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

    And User delete item from Dialoq Content

      | MemmedCountry19 |

    Then Success message should be displeyed

  Scenario: Fees Functionality
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | MemmedCountry29 |
      | codeInput | M1214           |
      | integCode | Mr1214          |
      | priority  | 12              |

    And Click on the element in Dialog
      | toggleBar |
      | saveBtn |

    Then Success message should be displeyed

    And User delete item from Dialoq Content

      | MemmedCountry29 |

    Then Success message should be displeyed

