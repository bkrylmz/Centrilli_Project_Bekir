package com.centrilli.step_definitions;

import com.centrilli.pages.BasePage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    BasePage basePage = new BasePage();

    @Before(order = 1)//! import from io.cucumber.java not from junit
    public void setUpScenario() {

        Driver.getDriver().get(ConfigurationReader.getProperty("CentrilliUrl"));

    }

    @Before(order = 2)
    public void loginScenario() {

        basePage.email.sendKeys(ConfigurationReader.getProperty("email"));
        basePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        basePage.logInButton.click();

    }


    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }



        Driver.closeDriver();
        // System.out.println("===Closing browser using cucumber @After");
        // System.out.println("===Scenario ended/ Take screenshot if failed");
    }



}
