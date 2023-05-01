
Feature: DataTable Sample

  @Regression

  Scenario: Usera List
    When Write username "Memmed"
    And Write username and password "Memmed" and "1214"
    And Write username as DataTable
      | Memmed |
      | Aynur  |
      | Nuru   |
      | Ayhan  |

    And Write username and password as DataTable

      | Memmed | 1214 |
      | Aynur  | 1229 |
      | Nuru   | 0106 |
      | Ayhan  | 1107 |

    And Write number, username and password as DataTable

      | 1 | Memmed | 1214 |
      | 2 | Aynur  | 1229 |
      | 3 | Nuru   | 0106 |
      | 4 | Ayhan  | 1107 |