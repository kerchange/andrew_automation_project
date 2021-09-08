package com.andrew.automation.page.onboarding;

import com.andrew.automation.page.base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuidancePage extends Page {

    //Text elements
    @FindBy(css = ".MuiTypography-root.jss44.MuiTypography-subtitle1")
    WebElement txt_title;

    @FindBy(css = ".MuiTypography-root.jss45.MuiTypography-body1")
    WebElement txt_content;

    //Button elements
    @FindBy(id = "skipAllButton")
    WebElement btn_skip;

    @FindBy(id = "nextButton")
    WebElement btn_next;

    @FindBy(id = "doneButton")
    WebElement btn_done;

    //Other elements
    @FindBy(id = "stepProgressBar")
    WebElement progress_bar;

}
