package com.andrew.automation.testcase.base;

import com.andrew.automation.driver.Browser;
import com.andrew.automation.driver.DriverBuilder;
import org.openqa.selenium.WebDriver;

public class TestRunner implements ChromeRunner, FirefoxRunner, SafariRunner {

    private Browser browser;
    @Override
    public void start() throws Exception {
    }

    @Override
    public void safariBrowserSetup() {
        this.browser = Browser.Safari;
    }

    @Override
    public void firefoxBrowserSetup() {
        this.browser = Browser.Firefox;
    }

    @Override
    public void chromeBrowserSetup() {
        this.browser = Browser.Chrome;
    }

    protected WebDriver craeteDriver() throws Exception {
        WebDriver driver = null;
        if(Browser.Chrome.equals(this.browser)){
            driver = new DriverBuilder().browser(this.browser)
                    .path("src/main/resources/chromedriver_m1_v92")
                    .option("--no-sandbox")
//                .option("--headless")
//                .option("--disable-gpu")
                    .build();
        }else if(Browser.Safari.equals(this.browser)){
            //TODO
        }else if(Browser.Firefox.equals(this.browser)) {
            //TODO
        }
        return driver;
    }

}
