package com.andrew.automation.testcase.flow.login;

import com.andrew.automation.page.login.LoginPage;
import com.andrew.automation.testcase.flow.base.FlowTestCase;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;

@Slf4j
public class TC002_LoginFlowFailTestCase extends FlowTestCase {

    @Override
    public void run() throws Exception {
        log.info("Start TestCase: " + this.getClass().getSimpleName());
        //1. Fill Email
        page(LoginPage.class).getEt_email().sendKeys("kenny.lam+flow@seraitrade.com");
        //2. Fill Password
        page(LoginPage.class).getEt_pwd().sendKeys("Pp12346!");
        //3. Click login Button
        //3.1 Wait login Button Clickable
        waitElementToBeClickable(page(LoginPage.class).getBtn_login());
        //3.2 Click Login Button
        page(LoginPage.class).getBtn_login().click();
        //3.3
        page(LoginPage.class).getTxt_snack_msg().isDisplayed();
        //3.3.1 Wait Snack Message Display
        waitElementsIsVisible(page(LoginPage.class).getTxt_snack_msg());
        //3.3.2 Password Incorrect Message Shown
        String expectedMessage = "Password or email is incorrect.";
        String actualMessage = page(LoginPage.class).getTxt_snack_msg().getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        log.info("End TestCase: " + this.getClass().getSimpleName());
    }

}
