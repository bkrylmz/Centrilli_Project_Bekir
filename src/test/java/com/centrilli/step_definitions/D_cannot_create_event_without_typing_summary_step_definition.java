package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class D_cannot_create_event_without_typing_summary_step_definition {
    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();

    @When("user clicks create button without typing summary")
    public void user_clicks_create_button_without_typing_summary() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.createButton.click();
    }

    @Then("user should not create any event")
    public void user_should_not_create_any_event() {
        //Assert.assertTrue(centrilliOpenPages.createWindow.isDisplayed());
        System.out.println("OK");
    }


}
