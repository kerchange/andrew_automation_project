package com.andrew.automation.test;

import com.andrew.automation.driver.Chrome;
import com.andrew.automation.driver.Firefox;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseTestCase {

    @Autowired
    protected Chrome chrome;

    @Autowired
    protected Firefox firefox;

    public abstract void start();

    public void waitAndClick(WebElement element, ExpectedCondition<WebElement> condition) {
        WebDriverWait wait = new WebDriverWait(chrome.getDriver(), 600);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(condition);
        element.click();
    }

}
