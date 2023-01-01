
Feature: Login Test- The user should be able to login with credentials

  Background: Go to home page
    Given The user is on the login page


  Scenario Outline: Negative scenario, The user should NOT be able to login with invalid credentials
    When The user enters invalid "<invalidUsername>" and "<invalidPassword>" credentials
    Then verify invalid credential "<message>"

    Examples:
      | invalidUsername | invalidPassword | message                          |
      | username        | pass            | Login and/or password are wrong. |
      | user            | password        | Login and/or password are wrong. |
      | user            | pass            | Login and/or password are wrong. |
      |                 | password        | Login and/or password are wrong. |
      | username        |                 | Login and/or password are wrong. |
      |                 |                 | Login and/or password are wrong. |


  Scenario: Positive scenario, The user should be able to login with valid credentials
    When The user enters with "username" and "password" credentials
    Then verify valid credential "Account Summary"



