@wip
Feature:
  As a user, I should be able to arrange vehicle table columns via "grid settings" functionality
  under the Fleet-Vehicles page

  Background:
    Given The user is on the login page
    When the user enters the driver information
    And the user should be able to login
    And HEthe user  navigates to "Fleet" "Vehicles"
    And HEthe user click on the grid settings icon

  Scenario: "Grid Settings" should be visible when user clicks on the gear icon
  And HEGrid Settings should be visible

  Scenario: User can find any column by typing the name on "Quick Search" input box
    When HEthe user type any name on Quick Search box
    And HEthe user find any column

  Scenario: User can select any column by clicking the column name
    When HEthe user can select any column by clicking
    Then HEthe user sees check box selected

  Scenario: User can arrange the order of the columns
    When HEthe user dragging and dropping the columns
   # Then HEthe user arrange the order of the columns

  Scenario: User can see all corresponding changes under 'Fleet-Vehicles' pages
    When HEthe user make a changes on Grid Settings table
    Then HEthe user sees changes on the Fleet-Vehicles page

  Scenario:  Column names in grid settings should be shown as below
    When HEthe user get column name text
    #Then HEthe user sees column name as given