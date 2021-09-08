package com.andrew.automation.driver;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
public abstract class BaseDriver {

    private WebDriver driver;

    public BaseDriver(){}

}
