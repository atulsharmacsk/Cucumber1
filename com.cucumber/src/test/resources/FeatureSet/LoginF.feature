Feature: Login Functionality

Background:
Given Open the browser

  @smoke
  Scenario Outline: Multiple Logins-1
    When Navigate to the url
    And login using <username> and <password>

    Examples: 
      | username | password |
      | smoke    |    12345 |
    #  | Test     |     1234 |

  @regression
  Scenario Outline: Multiple Logins-2
    When Navigate to the url
    And login using <username> and <password>

    Examples: 
      | username   | password |
      | regression |    12345 |
     # | Test       |     1234 |
