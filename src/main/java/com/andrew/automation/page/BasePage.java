//package com.andrew.automation.page;
//
//import com.andrew.automation.driver.Chrome;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.annotation.PostConstruct;
//
//public abstract class BasePage {
//
//    @Autowired
//    protected Chrome chrome;
//
//    @Autowired
//    protected WebDriverWait wait;
//
//    public abstract boolean isOn();
//
//    @PostConstruct
//    private void init(){
//        PageFactory.initElements(this.webDriver, this);
//    }
//
//}
