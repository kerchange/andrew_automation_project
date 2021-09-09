package com.andrew.automation.testcase.flow.login;

import com.andrew.automation.page.login.LoginPage;
import com.andrew.automation.page.onboarding.GuidancePage;
import com.andrew.automation.testcase.flow.base.FlowTestCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC001_LoginFlowTestCase extends FlowTestCase {

    @Override
    public void run() throws Exception {
        log.info("Start TestCase: " + this.getClass().getSimpleName());
        //wait for Page Init
        waitElementsIsVisible(
                page(LoginPage.class).getBtn_login(),
                page(LoginPage.class).getEt_email(),
                page(LoginPage.class).getEt_pwd()
        );
        //1. Fill Email
        page(LoginPage.class).getEt_email().sendKeys("kenny.lam+flow@seraitrade.com");
        //2. Fill Password
        page(LoginPage.class).getEt_pwd().sendKeys("Pp12345!");
        //3. Click login Button
        //3.1 Wait login Button Clickable
        waitElementToBeClickable(page(LoginPage.class).getBtn_login());
        //3.2 Click Login Button
        page(LoginPage.class).getBtn_login().click();

        //3.3 Wait For Guidence Page and Set Login Timeout is 30 Seconds
        waitElementsIsVisible(
                30,
                page(GuidancePage.class).getRoot()
//                ,page(GuidancePage.class).getProgress_bar()
        );

        log.info("End TestCase: " + this.getClass().getSimpleName());
    }

}
