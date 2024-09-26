Feature: verify login functionality

  Scenario: login successful with valid credentials
    Given user is on browser
    When user enters username and password
    And user click on login
    When user should be navigated to homepage
