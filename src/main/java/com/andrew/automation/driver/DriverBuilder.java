package com.andrew.automation.driver;

import com.andrew.automation.listener.WebEventListener;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

public class DriverBuilder {

    WebDriver driver;
    Browser browser;
    EventFiringWebDriver eventFiringWebDriver;
    Integer timeout = 600;
    //Chrome
    ChromeOptions chromeOptions;
    Boolean setChromeSystemProperties = false;

    //Firefox


    public DriverBuilder browser(Browser browserEnum){
        browser = browserEnum;
        if(Browser.Chrome.equals(browserEnum)){
            chromeOptions = new ChromeOptions();
        } else if (Browser.Firefox.equals(browserEnum)){
            //TODO
        }
        return this;
    }

    public DriverBuilder option(String option) throws Exception {
        if(browser == null) {
            throw new Exception("Browser not set");
        }
        if(Browser.Chrome.equals(browser)){
            chromeOptions.addArguments(option);
        } else if (Browser.Firefox.equals(browser)){
            //TODO
        }
        return this;
    }

    public DriverBuilder path(String path) throws Exception {
        if(browser == null) {
            throw new Exception("Browser not set");
        }
        if(Browser.Chrome.equals(browser)){
            System.setProperty("webdriver.chrome.driver", path);
            setChromeSystemProperties = true;
        } else if (Browser.Firefox.equals(browser)){
            //TODO
        }
        return this;
    }

    public WebDriver build() throws Exception {
        if(browser == null) {
            throw new Exception("Browser not set");
        }
        if(Browser.Chrome.equals(browser)){
            if(!setChromeSystemProperties){
                throw new Exception("Chrome driver system properties not set");
            }
            driver = new ChromeDriver(chromeOptions);
            eventFiringWebDriver = new EventFiringWebDriver(driver);
            eventFiringWebDriver.register(new WebEventListener());
            eventFiringWebDriver.manage().window().maximize();
            eventFiringWebDriver.manage().deleteAllCookies();
            eventFiringWebDriver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
        } else if (Browser.Firefox.equals(browser)){
            //TODO
        }
        return driver;
    }

    public DriverBuilder windowSize(int width, int height){
        eventFiringWebDriver.manage().window().setSize(new Dimension(width,height));
        return this;
    }

    public DriverBuilder timeout(int timeoutPerSecond){
        eventFiringWebDriver.manage().timeouts().implicitlyWait(timeoutPerSecond,TimeUnit.SECONDS);
        return this;
    }
}

