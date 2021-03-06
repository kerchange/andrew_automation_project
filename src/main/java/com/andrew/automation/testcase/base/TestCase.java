package com.andrew.automation.testcase.base;

import com.andrew.automation.page.base.Page;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

@Data
public abstract class TestCase {

    private WebDriver driver;

    private String url;

    private Map<Class, Object> pages = new HashMap<Class, Object>();

    private int defaultTimeout = 60; //Default Timeout 60 Seconds

    public <P extends Page> P page(Class<P> pageClass) throws Exception {
        if(!Page.class.isAssignableFrom(pageClass)){
            throw new Exception("Class no extends Page");
        }
        P page =  (P) pages.get(pageClass);
        if(page == null) {
            throw new Exception("Page not added in TestCaseBuilder...Please add .page({missingPage}) before run");
        }
        return page;
    }

    public void run() throws Exception {
    }

    public void waitElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementToBeSelected(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        wait.until(ExpectedConditions.elementToBeSelected(element));
    }


    public void waitElementsIsVisible(WebElement... elements) {
        waitElementsIsVisible(defaultTimeout, elements);
    }

    public void waitElementsIsVisible(int timeoutSecond, WebElement... elements) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutSecond);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

}
