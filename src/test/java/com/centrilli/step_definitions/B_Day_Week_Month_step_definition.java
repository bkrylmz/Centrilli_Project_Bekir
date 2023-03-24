package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B_Day_Week_Month_step_definition {

    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();

    @When("user can click Day button")
    public void user_can_click_day_button() {
        centrilliOpenPages.dayButton.click();
    }

    @When("user should see dayly display")
    public void user_should_see_dayly_display() {
        Assert.assertTrue(centrilliOpenPages.dayDisplayed.isDisplayed());
    }

    @When("user can click Week button")
    public void user_can_click_week_button() {
        BrowserUtils.sleep(3);
        centrilliOpenPages.weekButton.click();
    }

    @When("user can click Month button")
    public void user_can_click_month_button() {
        BrowserUtils.sleep(3);
        centrilliOpenPages.monthButton.click();
    }

    @Then("user should see monthly display")
    public void user_should_see_monthly_display() {
        Assert.assertTrue(centrilliOpenPages.monthDisplayed.isDisplayed());
    }


}
