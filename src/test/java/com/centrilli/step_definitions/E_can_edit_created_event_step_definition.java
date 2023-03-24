package com.centrilli.step_definitions;

import com.centrilli.pages.CentrilliOpenPages;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class E_can_edit_created_event_step_definition {

    CentrilliOpenPages centrilliOpenPages = new CentrilliOpenPages();


    @When("user clicks aslanOnTimeSubject")
    public void user_clicks_aslan_on_time_subject()  {
        BrowserUtils.sleep(2);
        centrilliOpenPages.aslanOnTimeSubject.click();
    }

    @When("user clicks aslanEditButton")
    public void user_clicks_aslan_edit_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.aslanEditButton.click();
    }

    @When("user write s aslanMeetingSubject and click save button")
    public void user_write_s_aslan_meeting_subject_and_click_save_button() {
        BrowserUtils.sleep(2);
        centrilliOpenPages.aslanMeetingSubject.sendKeys("s");
        centrilliOpenPages.aslanSaveButton.click();
    }


}
