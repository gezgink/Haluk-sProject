Feature: User should be able to add an event

  Background: As a store manager and sales manager, I should be able to add an event


  Scenario Outline:
    Given The manager login to the web application a valid "<username>" and "<password>"
    When users click on "Fleet" "Vehicles" module
    Then users click on any row
    And users can see the Add-Event Button
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


  Scenario Outline:
    Given The manager login to the web application a valid "<username>" and "<password>"
    When users click on "Fleet" "Vehicles" module
    Then users click on any row
    And users can see the Add-Event Button
    Then user click the add event button
    Then user on the pop up page
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


  Scenario Outline: User can mark the event with any colour
    Given The manager login to the web application a valid "<username>" and "<password>"
    When users click on "Fleet" "Vehicles" module
    Then users click on any row
    And users can see the Add-Event Button
    Then user click the add event button
    Then user on the pop up page
    When user click the add event button
    Then user mark any color
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


  @wip
  Scenario Outline: After click "All-day event" check box time boxes will disappear
    Given The manager login to the web application a valid "<username>" and "<password>"
    When users click on "Fleet" "Vehicles" module
    Then users click on any row
    And users can see the Add-Event Button
    Then user click the add event button
    Then user on the pop up page
    Then user can click All-day event check box
    And after click time boxes will disappear
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |
#
#
#
#  Scenario:Repeat options should include the options below
#  When
