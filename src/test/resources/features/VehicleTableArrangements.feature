@VehicleTable
Feature:US-004 Vehicle Table Arrangements
#//this is created by @HT vehicle table arrangement user story BDD feature file

  Background:
    Given The user is on the login page
    When The user logs in as a "Driver"
    And User is navigated to the Fleet>Vehicles Page


  Scenario Outline: US-004-TC-1-User can arrange rows/vehicle numbers to be displayed by clicking on 'View Per Page' button
    When HTUser select the different numbers to be displayed "<number>"
    Then HTNumber of rows should be same witch the selected number "<expected>"
    Examples:
      | number | expected |
      | 10     | 10       |
      | 25     | 25       |
      | 50     | 50       |
      | 100    | 100      |


  Scenario:  US-004-TC-2-The value of 'View Per Page' should be '25' by default
    When HTView per page number is twenty five by default


  Scenario Outline: US-004-TC-3-'View Per Page' menu includes the values and the user can select each of them
    When HTUser is clicked the view per page button and select each "<number>"
    Then HTUser Should see the values as "<expected>"
    Examples:
      | number | expected |
      | 10     | 10       |
      | 25     | 25       |
      | 50     | 50       |
      | 100    | 100      |



  @wip
  Scenario Outline: US-004-TC-4-User can sort a column in ascending or descending order by clicking the column name
    When HTuser is clicked the top of the column "<column name>"
    #Then HTThe list is sorted ascending order
    #When HTuser is clicked the top of the column "<column name>"
    #Then HTThe list is sorted descending order
    Examples:
      | column name |
      | license plate |
      | driver|
      | location|
      | model year   |



  Scenario: US-004-TC-5- Verify User can remove all sortings and filterings on the page by using the reset button
    When HTuser clicked the reset button
    Then HTAll filters must be reseted


