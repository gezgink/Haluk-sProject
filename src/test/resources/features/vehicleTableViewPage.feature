@kiwi
Feature: MDAs a user, I should be able to see all vehicle information in a table under Fleet-Vehicle page

  Background:
    Given MDUser should be on the Dashboard or Quick Launchpad


    Scenario: MDAll user types can see all vehicle information under 'Fleet-Vehicles' module
      When MDUser click "Vehicles" under the "Fleet" module
      Then MDUser can see all vehicle information

      Scenario: MDUser can see the total page number
        When MDUser click "Vehicles" under the "Fleet" module
        Then MDUser can see the total page number

        Scenario: MDUser can go to next page clicking ">" button and can go to previous page clicking "<" button
          When MDUser click "Vehicles" under the "Fleet" module
          And MDUser can go to next page after clicking ">" button
          Then MDUser can go to previous page clicking "<" button

          Scenario: MDUser can see total recordings of vehicles
            When MDUser click "Vehicles" under the "Fleet" module
            And MDUser can see total recordings of vehicles

            Scenario: User can download table data in XLS format from "Export Grid"
              When MDUser click "Vehicles" under the "Fleet" module
              And MDUser click "Export Grid" module
              Then MDUser can download table data in XLS

              Scenario: MDUser can download table data in CSV format from "Export Grid"
                When MDUser click "Vehicles" under the "Fleet" module
                And MDUser click "Export Grid" module
                Then MDUser can download table data in CSV format


