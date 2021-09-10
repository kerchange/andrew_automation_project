package com.andrew.automation;

import com.andrew.automation.testcase.base.ChromeRunner;
import com.andrew.automation.testcase.base.FirefoxRunner;
import com.andrew.automation.testcase.runner.FullTestRunner;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
public class NNTAutomationTestApplicationTests {

    @Resource(type = FullTestRunner.class)
    ChromeRunner<FullTestRunner> chromeFullTestRunner;

    @Resource(type = FullTestRunner.class)
    FirefoxRunner<FullTestRunner> firefoxFullTestRunner;

    @Test
    void fullTest() throws Exception {
        try{
            chromeFullTestRunner.chromeSetup().start();
            firefoxFullTestRunner.firefoxSetup().start();
        }catch(Exception e){
            log.error("Full test error : ", e);
            throw e;
        }
    }

    @Test
    void loginRegressionTest() {

    }

}
