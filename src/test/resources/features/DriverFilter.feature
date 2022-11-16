@FLTAP-1018
Feature:
  As a user, I should be able to use the "Driver" filter under the Fleet-Vehicles page

  Background:
    Given The user is on the login page
    When the user enters the driver information
    And the user should be able to login
    And SAthe user  navigates to "Fleet" "Vehicles"
    And SAthe user click on the Filters icon
    And SAthe user go to Manage filter and clicks Driver

  @AC1
  Scenario: The user can select "Driver" filter under 'Fleet-Vehicles' module
    When SAthe user can select Driver filter

  @AC2
  Scenario: "Driver" filter should provide the methods
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    Then SAthe user should see following methods
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |

  @AC3
  Scenario Outline: When user selects "Contains" method with a keyword, the results should contain the specified keyword
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user selects "contains" method
    And SAthe user enter "<keyword>"
    And SAuser see that the results contain the specified "<keyword>"

    Examples:
      | keyword |
      | Brad    |
      | ane     |
      | Ros     |
      | riNa    |


  @AC4
  Scenario Outline: When user selects "Does Not Contain" method with a keyword, the results should not contain the specified keyword
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user selects "does not contain" method
    And SAthe user enter "<keyword>"
    And SAuser see that the results does not contain the specified "<keyword>"

    Examples:
      | keyword |
      | Ros     |
      | ?Er     |
      | riNA    |

  @AC5
  Scenario Outline: When user selects "Starts-with" method with a keyword, the results should start with the specified keyword
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user selects "starts with" method
    And SAthe user enter "<keyword>"
    And SAuser see that the results start with the specified "<keyword>"

    Examples:
      | keyword |
      | Dr.     |
      | v       |
      | Mr.     |
      | Miss    |

  @AC6
  Scenario Outline: When user selects "Starts-with" method with a keyword, the results should start with the specified keyword
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user selects "ends with" method
    And SAthe user enter "<keyword>"
    And SAuser see that the results end with the specified "<keyword>"

    Examples:
      | keyword |
      | berg    |
      | Hickle  |
      | ton     |

  @AC7
  Scenario Outline: When user selects "Starts-with" method with a keyword, the results should start with the specified keyword
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user selects "is equal to" method
    And SAthe user enter "<keyword>"
    And SAuser see that the results match the specified "<keyword>"

    Examples:
      | keyword               |
      | Dr. Michelina Bradtke |
      | Viola ScHAefer        |

  @AC8
  Scenario Outline: Methods  ("Contains", "Does Not Contains", "Starts With", "Ends With", "Is Equal to") shouldn't accept non-alphabetical characters
    When SAthe user clicks Driver filter
    And SAthe user clicks opened dropdown menu
    And SAthe user clicks "<methodname>" method
    And SAthe user enter alphanumeric "<keyword>"
    And SAuser cannot enter alphanumeric numbers
    Examples:
      | methodname       | keyword |
      | contains         | *0'     |
      | does not contain | #$1     |
      | starts with      | -*0!    |
      | ends with        | ()/     |
      | is equal to      | ^+      |


























