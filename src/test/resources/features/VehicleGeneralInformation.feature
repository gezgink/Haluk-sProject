@FLTAP-1014
Feature: Login xfleet application with different user type

  Background:
    Given HU_The user logs in page


  Scenario: User can see the General Information page by clicking on any vehicle
    When HU_The user logs in as a "Driver" application
    Then HU_The user clicks "Fleet" tab and "Vehicles" module
    Then HU_The user clicks vehicle
    And HU_The user sees the General Information page

  Scenario: User can see the General Information page when clicking on the "Eye" icon
    When HU_The user logs in as a "Driver" application
    Then HU_The user clicks "Fleet" tab and "Vehicles" module
    Then HU_The user clicks Eye button
    Then HU_The user sees the General Information page


  Scenario Outline: User can see Edit Delete and Add Event buttons as Sales Manager or Store Manager
    When HU_The user logs in as a "<user>" application
    Then HU_The user clicks "Fleet" tab and "Vehicles" module
    Then HU_The user clicks vehicle
    And  HU_The user sees Edit, Delete and Add Event buttons on General Information page
    Examples:
      | user          |
      | Sales Manager |
      | Store Manager |

    Scenario: User can not see Edit Delete and Add Event buttons as Driver
      When HU_The user logs in as a "Driver" application
      Then HU_The user clicks "Fleet" tab and "Vehicles" module
      Then HU_The user clicks vehicle
      And  The user doesn't see Edit, Delete and Add Event buttons on General Information page