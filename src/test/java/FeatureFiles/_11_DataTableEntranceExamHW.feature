
#Senaryo :
#  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.

#| ExamName        | AcademicPeriodOption   | GradeLevelOption |
#| Math exam is1   | academicPeriod1        | gradeLevel2      |
#| IT exam is1     | academicPeriod1        | gradeLevel3      |
#| Oracle exam is1 | academicPeriod1        | gradeLevel4      |
#| Math exam is2   | academicPeriod1        | gradeLevel5      |

Feature: Entrance Exam Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Entrance Exam Create and Delete

    And Click on the element in LeftNav

      | entranceExam1 |
      | setupEntEx    |
      | entranceExam2 |

    And Click on the element in Dialog
      | addPlusBtn |

    And User sending the keys in Dialog Content
      | nameInput | <ExamName> |

    And Click on the element in Dialog
      | <AcademicPeriodOption> |
      | academicPeriod2        |

    And Click on the element in Dialog
      | gradeLevel1        |
      | <GradeLevelOption> |

    And Click on the element in Dialog

      | saveBtn |

    Then Success message should be displeyed

    And Click on the element in LeftNav

      | entranceExam1 |
      | setupEntEx    |
      | entranceExam2 |

    And User delete item from Dialoq Content
      | <ExamName> |

    Then Success message should be displeyed

    Examples:
      | ExamName        | AcademicPeriodOption | GradeLevelOption |
      | Math exam is1   | academicPeriod1      | gradeLevel2      |
      | IT exam is1     | academicPeriod1      | gradeLevel3      |
      | Oracle exam is1 | academicPeriod1      | gradeLevel4      |
      | Math exam is2   | academicPeriod1      | gradeLevel5      |