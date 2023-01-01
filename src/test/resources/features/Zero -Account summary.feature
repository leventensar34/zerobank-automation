
Feature: Login Test- The user should be able to login with credentials and See Accounts elements

  Background:
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And verify valid credential "Account Summary"

  Scenario Outline: The user verify that category
    Then The user see the "<category>" and verify

    Examples:
      | category            |
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
  @wip2
  Scenario Outline: The user verify that product
    Then The user verify the "<product>"
    Examples:
      | product     |
      | Account     |
      | Credit Card |
      | Balance     |

