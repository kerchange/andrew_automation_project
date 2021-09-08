package com.andrew.automation.testcase.base;

import com.andrew.automation.driver.Browser;
import com.andrew.automation.driver.DriverBuilder;
import org.openqa.selenium.WebDriver;

public abstract class TestRunner implements ChromeRunner, FirefoxRunner {

    protected WebDriver driver;

    @Override
    public void start() throws Exception {
        if(driver == null){ throw new Exception("driver is not setup");}
    }

    @Override
    public void fireFoxDriverSetup() throws Exception {

    }

    @Override
    public void chromeDriverSetup() throws Exception {
        driver = new DriverBuilder().browser(Browser.Chrome)
                .path("src/main/resources/chromedriver_m1_v92")
                .option("--no-sandbox")
//                .option("--headless")
//                .option("--disable-gpu")
                .build();
    }
}
