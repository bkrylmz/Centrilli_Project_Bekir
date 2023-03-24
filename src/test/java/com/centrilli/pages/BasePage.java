package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="login")
    public WebElement email;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath= "//button[.='Log in']")
    public WebElement logInButton;

}










