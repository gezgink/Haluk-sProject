@FLTAP-1099
Feature: Store manager and sales manager should be able to filter menu

  Background:
    Given The user is on the login page

  @FLTAP-1052
  Scenario Outline: When a user clicks on the filter icon, the "Manage Filter" button should be visible
    When MFGthe user enters credentials as a "<usertype>" and click login button
    And MFGthe user clicks on the vehicles under the fleet
    And MFGthe user clicks on the filter icon
    Then MFGthe Manage Filter button should be visible

    Examples:
      | usertype      |
      | Store Manager |
      | Sales Manager |

  @FLTAP-1073
  Scenario Outline: User can apply filters by clicking on the filter name, from the 'Manage Filters' menu.
    When MFGthe user enters credentials as a "<usertype>" and click login button
    And MFGthe user clicks on the vehicles under the fleet
    And MFGthe user clicks on the filter icon
    And MFGthe user clicks on the Manage Filters menu
    And MFGthe user clicks on the Tags
    Then MFGtags should be selected

    Examples:
      | usertype      |
      | Store Manager |
      | Sales Manager |

  @FLTAP-1075
  Scenario Outline:  User can apply filters by typing the filter name, from the 'Manage Filters' menu.
    When MFGthe user enters credentials as a "<usertype>" and click login button
    And MFGthe user clicks on the vehicles under the fleet
    And MFGthe user clicks on the filter icon
    And MFGthe user clicks on the Manage Filters menu
    And MFGthe user types the filter name
    Then MFGthe user should be apply filters

    Examples:
      | usertype      |
      | Store Manager |
      | Sales Manager |

  @FLTAP-1104
  Scenario Outline: User can apply multiple filters at the same time
    When MFGthe user enters credentials as a "<usertype>" and click login button
    And MFGthe user clicks on the vehicles under the fleet
    And MFGthe user clicks on the filter icon
    And MFGthe user clicks on the Manage Filters menu
    And MFGthe user clicks on the Driver, Location and Chassis Number
    Then MFGDriver, Location and Chassis Number should be selected

    Examples:
      | usertype      |
      | Store Manager |
      | Sales Manager |

  @FLTAP-1105
  Scenario Outline: User can remove all filters by clicking on the reset icon
    When MFGthe user enters credentials as a "<usertype>" and click login button
    And MFGthe user clicks on the vehicles under the fleet
    And MFGthe user clicks on the filter icon
    And MFGthe user clicks on the Manage Filters menu
    And MFGthe user clicks on the Driver, Location and Chassis Number
    And MFGDriver, Location and Chassis Number should be selected
    And MFGthe user clicks on the reset icon, under the Fleet-Vehicles module
    Then MFGthe user can remove all filters (Driver, Location and Chassis Number should be non selected)

    Examples:
      | usertype      |
      | Store Manager |
      | Sales Manager |










