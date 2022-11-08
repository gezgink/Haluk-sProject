Feature: Login Function

  Accounts are: truck driver,sales manager, store manager

  Background:
    Given The user is on the login page

  Scenario Outline: Login as a <userType>
    When The user logs in as a "<userType>"
    Then The user is on the "<pageSubTitle>" page

    Examples:
      | userType      | pageSubTitle    |
      | Driver        | Quick Launchpad |
      | Sales Manager | Dashboard       |
      | Store Manager | Dashboard       |


  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login




