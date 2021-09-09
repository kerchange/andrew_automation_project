package com.andrew.automation.testcase.base;

public interface ChromeRunner<T extends TestRunner> {

    public void start() throws Exception;

    public <T extends TestRunner> T chromeSetup();
}
