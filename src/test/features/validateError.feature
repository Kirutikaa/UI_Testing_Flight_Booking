
Feature: AS a user,i want to validate the flight booking site
Scenario: 1. As a user i want to validate the flight submit error check

Given the user wants to call the flight booking site
When the flight booking site is displayed check the title of the page
Then click the submit button
And check for the error message
