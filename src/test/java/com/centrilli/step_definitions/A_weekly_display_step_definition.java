package com.centrilli.step_definitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class A_weekly_display_step_definition {

    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();
    BasePage basePage= new BasePage();

    @Given("user is already logged in page")
    public void user_is_already_logged_in_page() {

        System.out.println("user is logged in successfully");
    }

    @When("user clicks the calendar button")
    public void user_clicks_the_calendar_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.calendarButton.click();

    }

    @Then("user should see weekly display")
    public void user_should_see_weekly_display() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(centrilliOpenPages.weeekDisplayed.isDisplayed());


    }


}
