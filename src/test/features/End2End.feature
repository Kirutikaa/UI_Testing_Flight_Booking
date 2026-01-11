Feature: AS a user,i want to validate the flight booking site
  Scenario: 1. As a user i want to validate the the flight booking End2End case

    Given the user wants to call the flight booking site
    When the flight booking site is displayed check the title of the page
    And click the round trip radio button
    Then select any one city from Departure city
    And select any one city from arrival city
    Then select the date to travel & return
    Then select the currency type
    And click the search button




