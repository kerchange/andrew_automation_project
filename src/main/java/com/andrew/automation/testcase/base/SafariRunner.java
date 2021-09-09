package com.andrew.automation.testcase.base;

public interface SafariRunner <T extends TestRunner> {

    public void start() throws Exception;

    public <T extends TestRunner> T safariSetup();


}
