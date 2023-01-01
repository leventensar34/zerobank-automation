Feature: Login Test- The user should be able to login with credentials and See Accounts elements


  Scenario Outline:
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And verify valid credential "Account Summary"
    And The user click the "Account Activity" button
    And The user go to the select button and click "Savings"
    Then The user verify the transaction table "<menu>"
    Examples:
      | menu        |
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |