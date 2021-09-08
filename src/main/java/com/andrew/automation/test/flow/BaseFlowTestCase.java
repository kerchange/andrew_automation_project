package com.andrew.automation.test.flow;

import com.andrew.automation.test.BaseTestCase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

public abstract class BaseFlowTestCase extends BaseTestCase {

    public BaseFlowTestCase(){
        super();
    }

    public abstract void start();

    public void clearLocalStorageAndRefresh(){
        JavascriptExecutor js = (JavascriptExecutor) super.chrome.getDriver();
        js.executeScript("window.localStorage.clear()");
        super.chrome.getDriver().navigate().refresh();
    }
}
