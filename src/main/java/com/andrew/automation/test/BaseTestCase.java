package com.andrew.automation.test;

import com.andrew.automation.driver.Chrome;
import com.andrew.automation.driver.Firefox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseTestCase {

    @Autowired
    protected Chrome chrome;

    @Autowired
    protected Firefox firefox;

    public abstract void start();

}
