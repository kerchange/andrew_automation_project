package com.andrew.automation.driver;

import com.andrew.automation.listener.WebEventListener;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Slf4j
@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class Chrome extends BaseDriver{

    public Chrome() {
        super();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
//        options.addArguments("--user-data-dir=./ChromeProfiles/"+);
//        options.addArguments("--profile-directory=Profile "+profile);
        setDriver(new ChromeDriver( options));
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(getDriver());
        eventFiringWebDriver.register(new WebEventListener());
        eventFiringWebDriver.manage().window().maximize();
        eventFiringWebDriver.manage().deleteAllCookies();
        eventFiringWebDriver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//        this.driver.manage().window().setSize(new Dimension(800,600));
    }

}
