package com.andrew.automation.andrew_automation_project;

import com.andrew.automation.test.flow.LoginFlowTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AndrewAutomationProjectApplicationTests {

    @Autowired
    private LoginFlowTestCase loginFlowTestCase;

    @Test
    void contextLoads() {
        loginFlowTestCase.start();

    }

}
