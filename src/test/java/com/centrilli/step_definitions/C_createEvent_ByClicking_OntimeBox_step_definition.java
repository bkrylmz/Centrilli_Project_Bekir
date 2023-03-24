package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class C_createEvent_ByClicking_OntimeBox_step_definition {

    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();

    @When("user clicks calendar button")
    public void user_clicks_calendar_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.calendarButton.click();
    }

    @When("user clicks on time box")
    public void user_clicks_on_time_box() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.onTimeBox.click();
    }

    @Then("user should see create window")
    public void user_should_see_create_window() {
        Assert.assertTrue(centrilliOpenPages.createWindow.isDisplayed());
    }


}
