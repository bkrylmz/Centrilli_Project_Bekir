package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class G_canFindTheCreatedMeetingInListByUsingSearchBox_step_definition {
    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();

    @When("user clicks on time box3")
    public void user_clicks_on_time_box3() {
        centrilliOpenPages.onTimeBox3.click();
    }

    @When("user types {string} in the summary box")
    public void user_types_in_the_summary_box(String string) {
        BrowserUtils.sleep(4);
        centrilliOpenPages.summaryInbox.sendKeys(string);
    }

    @When("user click create button")
    public void user_click_create_button() {
        BrowserUtils.sleep(4);
        centrilliOpenPages.createButton.click();
    }

    @When("user types {string} in search box on calender display and hit the enter")
    public void user_types_in_search_box_on_calender_display_and_hit_the_enter(String string) {
        BrowserUtils.sleep(2);
        centrilliOpenPages.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user can find {string} in list")
    public void user_can_find_in_list(String string) {
        Assert.assertTrue(centrilliOpenPages.sportTimeMeetingSubject.isDisplayed());
    }


}
