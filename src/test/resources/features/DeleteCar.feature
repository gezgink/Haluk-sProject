@FLTAP-1015
Feature: Delete functionality on the Web Application with Automation Testing

  Background:Ofk As a 'Sales Manager' and 'Store Manager', I should be able to delete a car


    @FLTAP-1090
    Scenario:Ofk Driver user can see the delete button by hovering over the three dots at the end of each row
      Given Ofk Driver user log in to the web application with a valid "user1" and "UserUser123"
      When Ofk Driver user can see the fleet module and click vehicles
      When Ofk Driver user can see the three dots at the end of each row
      Then Ofk Driver user can see the delete button by hovering over the three dots at the end of each row

    @FLTAP-1091
  Scenario Outline:Ofk Manager users can see the delete button by hovering over the three dots at the end of each row
    Given Ofk Manager "<users>" log in to the web application with a valid "<username>" and "<password>"
    When Ofk Manager users can see the fleet module and click vehicles
    When Ofk Manager users can see the three dots at the end of each row
    Then Ofk Manager users can see the delete button by hovering over the three dots at the end of each row

    Examples:
      | users         | username        | password    |
      | Sales Manager | salesmanager101 | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |




      @FLTAP-1092
    Scenario: Ofk "Delete Confirmation" pop up should be displayed when the user clicks on the delete button
      Given Ofk Driver user log in to the web application with a valid "user1" and "UserUser123"
      When Ofk Driver user can see the fleet module and click vehicles
      When Ofk Driver user can see to click the three dots at the end of each row
      Then Ofk Driver user can see Delete Confirmation pop up should be displayed

      @FLTAP-1094
    Scenario Outline: Ofk "Delete Confirmation" pop up should be displayed when the user clicks on the delete button
      Given Ofk Manager "<users>" log in to the web application with a valid "<username>" and "<password>"
      When Ofk Manager users can see the fleet module and click vehicles
      When Ofk Manager users can see to click the three dots at the end of each row
      Then Ofk Manager users can see Delete Confirmation pop up should be displayed

     Examples:
       | users         | username        | password    |
       | Sales Manager | salesmanager101 | UserUser123 |
       | Store Manager | storemanager51  | UserUser123 |




      @FLTAP-1095
     Scenario: Ofk "You do not have permission to perform this action." message should be displayed
                if the driver clicks on the "Yes, Delete" button.
       Given Ofk Driver user log in to the web application with a valid "user1" and "UserUser123"
       When Ofk Driver user can see the fleet module and click vehicles
       When Ofk Driver user can see to click the three dots at the end of each row
       Then Ofk Driver user can see Delete Confirmation pop up should be displayed and click the Yes,Delete button
       And Ofk You do not have permission to perform this action message should be displayed




      @FLTAP-1096
     Scenario Outline: Ofk 'Sales Manager' and 'Store Manager' can delete any car by clicking on the delete button at the end of each row
                        and the "Item deleted" message should be displayed.
       Given Ofk Manager "<users>" log in to the web application with a valid "<username>" and "<password>"
       When Ofk Manager users can see the fleet module and click vehicles
       When Ofk Manager users can see to click the three dots at the end of each row
       Then Ofk Manager users can see Delete Confirmation pop up should be displayed and click Yes,Delete button
       And Ofk Item deleted message should be displayed.

       Examples:
         | users         | username        | password    |
         | Sales Manager | salesmanager101 | UserUser123 |
         | Store Manager | storemanager51  | UserUser123 |



      @FLTAP-1097
     Scenario Outline: Ofk When 'Sales Manager' and 'Store Manager' go to the 'General Information' page by clicking
                        on any vehicle/row, they can delete any vehicle by clicking on the 'Delete' button and
                        the "Car deleted" message should be displayed.
       Given Ofk Manager "<users>" log in to the web application with a valid "<username>" and "<password>"
       When Ofk Manager users can see the fleet module and click vehicles
       Then Ofk Manager users can click on any car
       Then Ofk General Information page opens and managers can click the delete button from here.
       And Ofk Car deleted message should be displayed.

       Examples:
         | users         | username        | password    |
         | Sales Manager | salesmanager101 | UserUser123 |
         | Store Manager | storemanager51  | UserUser123 |



     @FLTAP-1098
     Scenario Outline: Ofk When 'Sales Manager' and 'Store Manager' delete a car,
                            the corresponding car should also be removed from the Fleet-Vehicle page.
       Given Ofk Manager "<users>" log in to the web application with a valid "<username>" and "<password>"
       When Ofk Manager users can see the fleet module and click vehicles
       Then Ofk Manager users can click on any car
       Then Ofk General Information page opens and managers can click the delete button from here.
       And Ofk Car deleted message should be displayed.
       And Ofk The deleted car should not appear in the car list.

       Examples:
         | users         | username        | password    |
         | Sales Manager | salesmanager101 | UserUser123 |
         | Store Manager | storemanager51  | UserUser123 |
