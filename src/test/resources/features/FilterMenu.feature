Feature: Store manager and sales manager should be able to filter menu

  Background:
    Given The user is on the login page

  @FLTAP-1052
  Scenario Outline: When a user clicks on the filter icon, the "Manage Filter" button should be visible
   When The user enters credentials as a "<usertype>" and click login button
   And The user clicks on the vehicles under the fleet
   And The user clicks on the filter icon
   Then The Manage Filter button should be visible

    Examples:
      | usertype       |
      | Store Manager  |
      | Sales Manager  |

  @FLTAP-1073
  Scenario Outline: User can apply filters by clicking on the filter name, from the 'Manage Filters' menu.
    When The user enters credentials as a "<usertype>" and click login button
    And The user clicks on the vehicles under the fleet
    And The user clicks on the filter icon
    And The user clicks on the Manage Filters menu
    And The user clicks on the Tags
    Then Tags should be selected

    Examples:
      | usertype       |
      | Store Manager  |
      | Sales Manager  |

  @FLTAP-1075
  Scenario Outline:  User can apply filters by typing the filter name, from the 'Manage Filters' menu.
    When The user enters credentials as a "<usertype>" and click login button
    And The user clicks on the vehicles under the fleet
    And The user clicks on the filter icon
    And The user clicks on the Manage Filters menu
    And The user types the filter name
    Then The user should be apply filters

    Examples:
      | usertype       |
      | Store Manager  |
      | Sales Manager  |







