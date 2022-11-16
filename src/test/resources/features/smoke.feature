@FLTAP-1123
Feature: Default

	Background:
		#@FLTAP-1106
		    Given The user is on the login page
		    When the user enters the driver information
		    And the user should be able to login
		    And SAthe user  navigates to "Fleet" "Vehicles"
		    And SAthe user click on the Filters icon
		    And SAthe user go to Manage filter and clicks Driver
		

	#{color:#ff8b00}_*User Story :*_ {color}
	#
	#{color:#de350b}As a user, I should be able to use the "Driver" filter under the Fleet-Vehicles page{color}
	#
	# 
	#
	#{color:#00875a}*_Acceptance Criteria:_*{color}
	#
	#_{color:#de350b}*1-* User can select "Driver" filter under 'Fleet-Vehicles' module{color}_
	#
	#*2-* "Driver" filter should provide the methods shown as below:
	#                _-> Contains_
	#                _-> Does Not Contain_
	#                _-> Is Equal To_
	#                _-> Starts With_
	#                _-> Ends With_
	#                _-> Is Any Of_
	#                _-> Is Not Any Of_
	#                _-> Is Empty_
	#                _-> Is Not Empty_
	#
	#*3-* When user selects "Contains" method with a keyword, the results should contain the specified keyword
	#
	#*4-* When user selects "Does Not Contain" method with a keyword, the results should not contain the specified keyword
	#
	#*5-* When user selects "Starts-with" method with a keyword, the results should start with the specified keyword
	#
	#*6-* When user selects "Ends With" method with a keyword, the results should end with the specified keyword
	#
	#*7-* When user selects "Is Equal to" method with a keyword, the results should match the specified keyword exactly
	#
	#*8-* Methods  ("Contains", "Does Not Contains", "Starts With", "Ends With", "Is Equal to") shouldn't accept non-alphabetical characters 
	@FLTAP-1107
	Scenario: US011 - TC01 The user can select "Driver" filter under 'Fleet-Vehicles' module
		When SAthe user can select Driver filter