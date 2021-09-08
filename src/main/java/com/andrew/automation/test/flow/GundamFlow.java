//package com.andrew.automation.test.flow;
//
//import com.andrew.automation.driver.Chrome;
//import com.andrew.automation.page.GundamPage;
//import lombok.extern.slf4j.Slf4j;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PreDestroy;
//import java.util.concurrent.TimeUnit;
//
//@Slf4j
//@Component
//public class GundamFlow {
//
//    GundamPage gundamPage;
//    WebDriver driver;
////    String url = "https://p-bandai.com/hk/item/N2586602001001";
//    String url = "https://p-bandai.com/hk/item/N2586599001001";
//    String username="andrew_yun@icloud.com";
//    String password="";
//    String cvv="";
//    String creditCard;
//    String name;
//    String expiryMonth;
//    String expiryYear;
//    String phone;
//    String email;
//
//    @PreDestroy
//    private void preDestroy() {
//        this.driver.close();
//        log.info("Destroy Close Driver");
//    }
//
//    private GundamFlow () throws InterruptedException {
//        try{
//            start();
//        }catch(Exception e){
//            e.printStackTrace();
//            driver.close();
//            restart();
//        }
//
//    }
//
//    private void restart() throws InterruptedException {
//        try{
//            start();
//        }catch(Exception e){
//            e.printStackTrace();
//            driver.close();
//            restart();
//        }
//    }
//
//    private void start () throws Exception {
//        log.info("Start...");
//        gundamPage = new GundamPage();
//        driver = new Chrome().getDriver();
//        PageFactory.initElements(driver, gundamPage);
//        driver.get(url);
//
//        log.info("We are currently on the following URL: " +driver.getCurrentUrl());
//
//        //Page 1
//
//        waitUntilElementClickable(driver, gundamPage.getCookiesNextButton());
//        click(gundamPage.getCookiesNextButton());
//        while (!gundamPage.getAddToCartButton().isEnabled()){
//            log.info("Wait 5 Sec Start");
//            try { Thread.sleep(5000); }
//            catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            log.info("Wait 5 Sec End");
//            log.info("Refresh");
//            driver.navigate().refresh();
//            log.info("Start Wait");
//            waitUntilElementClickable(driver, gundamPage.getGoToCartButton());
//            log.info("End Wait");
//        }
//        click(gundamPage.getAddToCartButton());
//        click(gundamPage.getCloseButtonAfterAddToCart());
//        click(gundamPage.getGoToCartButton());
//
//        //Page 2 Cart Page
//        waitUntilElementClickable(driver, gundamPage.getCheckOutButton());
//        click(gundamPage.getCheckOutButton());
//        //Page 3
//        waitUntilElementClickable(driver, gundamPage.getLoginButton());
//        gundamPage.getUserNameField().sendKeys(username);
//        gundamPage.getPasswordField().sendKeys(password);
//        click(gundamPage.getLoginButton());
//        waitUntilElementClickable(driver, gundamPage.getCreditCardRadioButton());
//        click(gundamPage.getCreditCardRadioButton());
//        waitUntilElementClickable(driver, gundamPage.getConfirmButton());
//        click(gundamPage.getConfirmButton());
//        //Page 4
//        waitUntilElementClickable(driver, gundamPage.getOrderConfirmAgreeCheckBox());
//        click(gundamPage.getOrderConfirmAgreeCheckBox());
//        click(gundamPage.getPaymentButton());
//        //Page 5
//        waitUntilElementClickable(driver, gundamPage.getExpirationMonth());
//        gundamPage.getCreditCard().sendKeys("4509360650448034");
//        gundamPage.getCvv().sendKeys("958");
//        click(gundamPage.getExpirationMonth());
//        gundamPage.getExpirationMonth()
//                .findElement(By.xpath("./.."))
//                .findElement(By.xpath("./.."))
//                .findElement(By.xpath("//div[contains(text(), '12')]")).click();
//        click(gundamPage.getExpirationYear());
//        gundamPage.getExpirationYear()
//                .findElement(By.xpath("./.."))
//                .findElement(By.xpath("./.."))
//                .findElement(By.xpath("//div[contains(text(), '23')]")).click();
//        gundamPage.getName().sendKeys("Yun Tim Chak");
//        gundamPage.getPhone().sendKeys("53262143");
//        gundamPage.getEmail().sendKeys("andrew_yun@icloud.com");
//        //Pay
//        click(gundamPage.getPayButton());
//    }
//
//    public void click(WebElement element) throws InterruptedException {
//        try{
//            log.info("Button click before display" + element.toString());
//            do{
//                log.info("Button : " + element.toString() + " is Displayed : " + element.isDisplayed()+ " is Enabled : " + element.isEnabled()+ " is Selected : " + element.isSelected());
//                Thread.sleep(100);
//            }while(!element.isDisplayed());
//            log.info("Button click");
//            element.click();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    private void waitUntilElementClickable(WebDriver driver, WebElement element){
//        WebDriverWait waitPage1 = new WebDriverWait(driver, 600);
//        waitPage1.until(ExpectedConditions.elementToBeClickable(element));
//    }
//
//}
