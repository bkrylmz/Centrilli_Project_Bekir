package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class F_can_change_page_display_to_Calendar_List {
    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();

    @When("user clicks List button")
    public void user_clicks_list_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.listButton.click();
    }

    @When("user should see list page")
    public void user_should_see_list_page() {
        Assert.assertTrue(centrilliOpenPages.listButton.isDisplayed());
    }

    @When("user clicks calendar2 button")
    public void user_clicks_calendar2_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.calendarButton2.click();
    }

    @Then("user should see calender page")
    public void user_should_see_calender_page() {
        Assert.assertTrue(centrilliOpenPages.calendarButton2.isDisplayed());
    }

}
