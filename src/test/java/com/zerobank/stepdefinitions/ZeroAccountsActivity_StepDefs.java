package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class ZeroAccountsActivity_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @When("The user click the {string} button")
    public void the_user_click_the_button(String tab) {
        dashboardPage.accountDashboard(tab);
    }

    @When("The user go to the select button and click {string}")
    public void the_user_go_to_the_select_button_and_click(String modul) {

        Select select = new Select(dashboardPage.selectAccountDrap);
        select.selectByVisibleText(modul);
    }

    @Then("The user verify the transaction table {string}")
    public void the_user_verify_the_transaction_table(String product) {

        dashboardPage.verifyTransactionTable(product);

    }
}
