package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CentrilliOpenPages {

    public CentrilliOpenPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[2]")
    public WebElement calendarButton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']//button[.='Day']")
    public WebElement dayButton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']//button[.='Week']")
    public WebElement weekButton;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm']//button[.='Month']")
    public WebElement monthButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[contains(.,',')]")
    public WebElement dayDisplayed;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[contains(.,'Week')]")
    public WebElement weeekDisplayed;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li[contains(.,'2023')]")
    public WebElement monthDisplayed;

    @FindBy(xpath = "(//table//tbody//tr//td[2])[1]")
    public WebElement onTimeBox;

    @FindBy(xpath = "(//table//tbody//tr//td[3])[1]")
    public WebElement onTimeBox2;

    @FindBy(xpath = "(//table//tbody//tr//td[4])[1]")
    public WebElement onTimeBox3;


    @FindBy(xpath = "//h4")
    public  WebElement createWindow;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public  WebElement createButton;

    @FindBy(xpath ="//input[@class='o_input']")
    public WebElement summaryInbox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[15]/td[2]")
    public WebElement createdEvent;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public  WebElement editButton;

    @FindBy(xpath = "(//a[@class='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6'])[2]") //(xpath = "(//div[contains(.,'aslan')])[16]")
    public WebElement aslanOnTimeSubject;


    @FindBy(xpath = "//span[.='Edit']")
    public WebElement aslanEditButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement aslanMeetingSubject;

    @FindBy(xpath = "(//span[@class='o_datepicker_button'])[5]")
    public WebElement aslanStartingAtTriangle;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']" )
    public WebElement aslanSaveButton;


    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@aria-label='calendar']")
    public WebElement calendarButton2;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public  WebElement searchBox;

    @FindBy(xpath = "(//div[@class='fc-bg'])[4]")
    public WebElement sportTimeMeetingSubject;

}


