package com.zerobank.pages;

import com.github.javafaker.Faker;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class DashboardPage extends BasePage {

    Faker faker = new Faker();


    @FindBy(xpath = "//div/h2[text()='Cash Accounts']")
    public List<WebElement> accountsTab_loc;

    @FindBy(xpath = "(//table/thead/tr)[3]/th[text()='Account']")
    public List<WebElement> accountModule_loc;

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[.='Account Activity']")
    public List<WebElement> accountDashboardList;

    @FindBy(id = "aa_accountId")
    public WebElement selectAccountDrap;

    @FindBy(xpath = "//table/thead/tr/th[.='Date']")
    public WebElement transactiontable;

    @FindBy(id = "sp_amount")
    public WebElement inputAmount;

    @FindBy(id = "sp_date")
    public WebElement inputDate;

    @FindBy(xpath = "(//td/a[@class='ui-state-default'])[7]")
    public WebElement dateBtnSelect;

    @FindBy(id = "pay_saved_payees")
    public WebElement payBtn;

    @FindBy(xpath = "//div/span")
    public WebElement verifyPayMessage;




    public void verifyAccountsTab(String category) {
        BrowserUtils.waitFor(2);
        WebElement categoryTab = Driver.get().findElement(By.xpath("//div/h2[text()='" + category + "']"));
        BrowserUtils.waitFor(2);
        Assert.assertEquals("verify do category match", category, categoryTab.getText());
        BrowserUtils.waitFor(2);

    }

    public void verifyAccountModule(String product) {
        BrowserUtils.waitFor(2);
        WebElement productTab = Driver.get().findElement(By.xpath("(//table/thead/tr)[3]/th[text()='" + product + "']"));
        BrowserUtils.waitFor(2);
        Assert.assertEquals("verify do product match", product, productTab.getText());
        BrowserUtils.waitFor(2);

    }

    public void verifyTransactionTable(String product) {

        WebElement productModul = Driver.get().findElement(By.xpath("//table/thead/tr/th[.='" + product + "']"));
        BrowserUtils.waitFor(2);
        Assert.assertEquals("verify do table match", product, productModul.getText());
        BrowserUtils.waitFor(2);

    }

    public void accountDashboard(String tab) {

        WebElement tabList = Driver.get().findElement(By.xpath("//ul[@class='nav nav-tabs']/li[.='" + tab + "']"));
        tabList.click();
        BrowserUtils.waitFor(1);
    }

    public void payBillsAmountDate() {

        inputAmount.sendKeys(faker.number().digit());
        BrowserUtils.waitFor(1);
        inputDate.click();
        BrowserUtils.waitFor(2);
        dateBtnSelect.click();
        BrowserUtils.waitFor(2);
        payBtn.click();

    }

    public void verifyPaySuccesful(String expectedMessage){

        String actualMessage=verifyPayMessage.getText();
        Assert.assertEquals("verify do match",expectedMessage,actualMessage);

    }

    public void invalidCredentialsDate(String amount,String date){

        inputAmount.sendKeys(amount);
        BrowserUtils.waitFor(1);
        inputDate.sendKeys(date);
        BrowserUtils.waitFor(1);
        payBtn.click();

    }

}
