package com.andrew.automation.testcase.base;

import com.andrew.automation.page.base.Page;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

@Slf4j
public class TestCaseBuilder<T extends TestCase> {

    private T testCase;

    @SuppressWarnings("unchecked")
    public TestCaseBuilder testCase(Class<T> clazz) throws Exception  {
        testCase = clazz.getDeclaredConstructor().newInstance();
        return this;
    }

    public TestCaseBuilder page(Class page) throws Exception {
        Object aPage = page.getDeclaredConstructor().newInstance();
        log.info("Class: " + page);
        if(!(aPage instanceof Page)){
            throw new Exception("the Class not extends page Class....");
        }
        testCase.getPages().put(page, aPage);
        return this;
    }

    public TestCaseBuilder driver(WebDriver driver) throws Exception  {
        testCase.setDriver(driver);
        return this;
    }

    public TestCaseBuilder url(String url) throws Exception  {
        testCase.setUrl(url);
        testCase.getDriver().get(url);
        return this;
    }

    public void run() throws Exception {
        try {
            if (testCase == null) {
                throw new Exception("testCase() not setup");
            }
            if (testCase.getUrl() == null) {
                throw new Exception("url() not setup");
            }
            if (testCase.getPages().size() <= 0) {
                throw new Exception("no Page Object setup. please call page()...");
            }
            for (Map.Entry<Class, Object> key : testCase.getPages().entrySet()) {
                PageFactory.initElements(testCase.getDriver(), key.getValue());
            }
            testCase.run();
        }finally{
            testCase.getDriver().close();
        }
    }

}
