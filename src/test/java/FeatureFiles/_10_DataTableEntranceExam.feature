
#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Entrance Exam Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Entrance Exam Create and Delete

    And Click on the element in LeftNav

      | entranceExam1 |
      | setupEntEx    |
      | entranceExam2 |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | MRExam1214 |

    And Click on the element in Dialog
      | academicPeriod1 |
      | academicPeriod2 |
      | gradeLevel1     |
      | gradeLevel2     |

    And Click on the element in Dialog

      | saveBtn |

    Then Success message should be displeyed

    And Click on the element in LeftNav

      | entranceExam1 |
      | setupEntEx    |
      | entranceExam2 |

    And User delete item from Dialoq Content
      | MRExam1214 |

    Then Success message should be displeyed