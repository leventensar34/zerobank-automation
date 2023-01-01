Feature: Login Test- The user should be able to login with credentials and See Accounts elements

  Background: The user login to pays page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And verify valid credential "Account Summary"
    And The user click the "Pay Bills" button


  Scenario: Positive Test The user login to page and check pays
    And The user enters the credentials "Amount" "Date" and click pay button
    Then The user verify the dashboard "The payment was successfully submitted."

@wip
  Scenario Outline: Negative Test The user login to page and check pays message
    And The user enters invalid credentials "<Amount>" "<Date>" and click pay button
   # Then The user verify "<message>"

    Examples:
      | Amount | Date      | message |
      | gs     | 2022/10/7 | message |
      | gala   | ###       | message |
      |        |           | message |
      | saray  | 2023/12/3 | message |
      | $      | 2023/12/3 | message |
