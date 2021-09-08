package com.andrew.automation;

import com.andrew.automation.test.flow.TC001_LoginFlowTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NNTAutomationTestApplicationTests {

    @Autowired
    private TC001_LoginFlowTestCase tc001_loginFlowTestCase;

    @Test
    void fullTest() {
        tc001_loginFlowTestCase.start();
    }

    @Test
    void loginRegressionTest() {
        tc001_loginFlowTestCase.start();
    }

}
