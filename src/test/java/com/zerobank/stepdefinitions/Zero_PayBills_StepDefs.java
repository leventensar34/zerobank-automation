package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Zero_PayBills_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @When("The user enters the credentials {string} {string} and click pay button")
    public void the_user_enters_the_credentials_and_click_pay_button(String string, String string2) {

        dashboardPage.payBillsAmountDate();

    }

    @Then("The user verify the dashboard {string}")
    public void theUserVerifyTheDashboard(String expected) {

        dashboardPage.verifyPaySuccesful(expected);

    }

    @And("The user enters invalid credentials {string} {string} and click pay button")
    public void theUserEntersInvalidCredentialsAndClickPayButton(String amount, String date) {

        dashboardPage.invalidCredentialsDate(amount, date);
    }

    @Then("The user verify {string}")
    public void theUserVerify(String arg0) {
    }
}
