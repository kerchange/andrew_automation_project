package com.andrew.automation.testcase.base;

import com.andrew.automation.driver.Browser;
import com.andrew.automation.driver.DriverBuilder;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

@Slf4j
public class TestRunner<T extends TestRunner> implements ChromeRunner, FirefoxRunner, SafariRunner {

    private Browser browser;
    @Override
    public void start() throws Exception {
    }


    @Override
    public T chromeSetup() {
        this.browser = Browser.Chrome;
        return (T)this;
    }

    @Override
    public T safariSetup() {
        this.browser = Browser.Safari;
        return (T)this;
    }

    @Override
    public T firefoxSetup() {
        this.browser = Browser.Firefox;
        return (T)this;
    }

    protected WebDriver createDriver() throws Exception {
        WebDriver driver = null;
        if(Browser.Chrome.equals(this.browser)){
            driver = new DriverBuilder().browser(this.browser)
                    .path("src/main/resources/chromedriver")
                    .option("--no-sandbox")
                    .option("--headless")
                    .option("--disable-gpu")
                    .build();
        }else if(Browser.Safari.equals(this.browser)){
            //TODO
        }else if(Browser.Firefox.equals(this.browser)) {
            //TODO
        }
        return driver;
    }

    protected WebDriver createResponsiveDriver() throws Exception {
        WebDriver driver = null;
        if(Browser.Chrome.equals(this.browser)){
            driver = new DriverBuilder().browser(this.browser)
                    .path("src/main/resources/chromedriver")
                    .option("--no-sandbox")
                    .option("--headless")
                    .option("--disable-gpu")
                    .isResponsive()
                    .build();
        }else if(Browser.Safari.equals(this.browser)){
            //TODO
        }else if(Browser.Firefox.equals(this.browser)) {
            //TODO
        }
        return driver;
    }

}
