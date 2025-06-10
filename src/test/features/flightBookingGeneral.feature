Feature: AS a user,i want to validate the flight booking site
  Scenario: 1. As a user i want to validate the the flight general check

    Given the user wants to call the flight booking site
    When the flight booking site is displayed check the title of the page
    Then user check the given webElements are present in the page
      | Flights          |
      | Hotels           |
      | Holiday Packages |
      | Flight Status    |
      | Check-In         |
      | Manage Booking   |
    And check the radio buttons are present with options
      | One Way    |
      | Round Trip |
      | Multicity  |
    And check the submit button is present

  Scenario: 2. As a user i want to validate the flight submit error check

    Given the user wants to call the flight booking site
    When the flight booking site is displayed check the title of the page
    Then click the submit button
    And check for the error message


