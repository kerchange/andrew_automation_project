package com.andrew.automation.testcase.base;

public interface FirefoxRunner<T extends TestRunner>{


    public void start() throws Exception;

    public <T extends TestRunner> T firefoxSetup();


}
