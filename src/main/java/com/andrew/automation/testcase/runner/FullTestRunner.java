package com.andrew.automation.testcase.runner;

import com.andrew.automation.page.login.LoginPage;
import com.andrew.automation.page.onboarding.GuidancePage;
import com.andrew.automation.testcase.base.TestCaseBuilder;
import com.andrew.automation.testcase.base.TestRunner;
import com.andrew.automation.testcase.flow.login.TC001_LoginFlowTestCase;
import com.andrew.automation.testcase.flow.login.TC002_LoginFlowFailTestCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Scope("prototype")
@Component
public class FullTestRunner extends TestRunner {

    @Value("${serai.nnt.domain:https://sandbox.network.seraitrade.com}")
    private String domain;
    @Override
    public void start() throws Exception {

        super.start();
        //Build Test Case
        new TestCaseBuilder().testCase(TC001_LoginFlowTestCase.class)
                .driver(craeteDriver())
                .pages(LoginPage.class, GuidancePage.class)
                .url(domain + "/login")
                .run();

        //TC002_LoginFlowFailTestCase
        new TestCaseBuilder().testCase(TC002_LoginFlowFailTestCase.class)
                .driver(craeteDriver())
                .pages(LoginPage.class)
                .url(domain + "/login")
                .run();
    }

}
