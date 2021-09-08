package com.andrew.automation.test.flow;

import com.andrew.automation.page.serai.GuidancePage;
import com.andrew.automation.page.serai.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TC001_LoginFlowTestCase extends BaseFlowTestCase {

    @Autowired
    private GuidancePage guidancePage;

    @Autowired
    private LoginPage loginPage;

    private TC001_LoginFlowTestCase(){
        super();
    }

    @Override
    public void start() {
        super.chrome.getDriver().get("https://sandbox.network.seraitrade.com/login");
        //1. Fill Email
        loginPage.getEt_email().sendKeys("kenny.lam+flow@seraitrade.com");
        //2. Fill Password
        loginPage.getEt_pwd().sendKeys("Pp12345!");
        //3. Click login Button
        waitAndClick(loginPage.getBtn_login(), ExpectedConditions.elementToBeClickable(loginPage.getBtn_login()));

        //4. clearLocalStorageAndRefresh
//        clearLocalStorageAndRefresh();
    }

}
