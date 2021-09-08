package com.andrew.automation.test.flow;

import com.andrew.automation.test.BaseTestCase;
import org.springframework.stereotype.Component;

public abstract class BaseFlowTestCase extends BaseTestCase {

    public BaseFlowTestCase(){
        super();
    }

    public abstract void start();
}
