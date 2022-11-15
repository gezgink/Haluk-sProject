Feature: User should be able to add an event

  Background: As a store manager and sales manager, I should be able to add an event

  @FLTAP-1076
  Scenario Outline:User can access the "Add Event" page
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    Then ULuser can see the Add-Event Button
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLTAP-1077
  Scenario Outline:After clicking on "Add event" button, "Add Event" page should pop up
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    And ULuser can see the Add-Event Button
    And ULuser click the add event button
    Then ULuser on the pop up page
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLTAP-1078
  Scenario Outline: User can mark the event with any colour
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    And ULuser can see the Add-Event Button
    And ULuser click the add event button
    And ULuser on the pop up page
    And ULuser click the add event button
    Then ULuser mark any color
    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |

  @FLTAP-1079
  Scenario Outline: After click "All-day event" check box time boxes will disappear
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    And  ULuser can see the Add-Event Button
    And ULuser click the add event button
    And ULuser on the pop up page
    And ULuser can click All-day event check box
    Then ULafter click time boxes will disappear
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |

  @FLTAP-1100
  Scenario Outline:User can repeat the action by specifying occurrence periods and ending time
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    And  ULuser can see the Add-Event Button
    And ULuser click the add event button
    And ULuser on the pop up page
    And ULrepeat options should include the options below
    Then ULending options should be as below and clickable
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |

  @FLTAP-1101
  Scenario Outline:User can repeat the action by specifying occurrence periods and ending time
    Given ULuser login to the web application a valid "<username>" and "<password>"
    When ULuser click on "Fleet" "Vehicles" module
    And ULuser click on any row
    And  ULuser can see the Add-Event Button
    And ULuser click the add event button
    And ULuser on the pop up page
    And ULuser click the save button
    Then ULuser can see all events on the General information page
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |


