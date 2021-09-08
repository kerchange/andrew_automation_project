//package com.andrew.automation.page;
//
//import com.andrew.automation.driver.Chrome;
//import com.andrew.automation.test.flow.GundamFlow;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Data
//@EqualsAndHashCode(callSuper=false)
//@Component
//public class GundamPage {
//
//
//    private Chrome ChromeDriver;
//
//    private GundamPage(WebDriver chromeDriver){
//        PageFactory.initElements(chromeDriver, this);
//    }
//
//
//    @FindBy(className = "_icon-close__3U9R_")
//    private WebElement advertisement;
//
//    @FindBy(className = "o-modal__wrap")
//    private WebElement cookiesHover;
//
//    @FindBy(className ="m-btn__next")
//    private WebElement cookiesNextButton;
//
//    @FindBy(id = "sc_p07_01_purchaseNumber")
//    private WebElement purchaseNumberButton;
//
//    @FindBy(id = "addToCartButton")
//    private WebElement addToCartButton;
//
//    @FindBy(id = "close")
//    private WebElement closeButtonAfterAddToCart;
//
//    @FindBy(className = "o-header__cart")
//    private WebElement goToCartButton;
//
//    @FindBy(className = "m-cart--foot__fee__btn")
//    private WebElement checkOutButton;
//
//    @FindBy(id = "j_username")
//    private WebElement userNameField;
//
//    @FindBy(id = "j_password")
//    private WebElement passwordField;
//
//    @FindBy(id ="login")
//    private WebElement loginButton;
//
//    @FindBy( className = "a-input-radio__label")
//    private WebElement creditCardRadioButton;
//
//    @FindBy( id = "confirmOrderInfo")
//    private WebElement confirmButton;
//
//    @FindBy( className = "a-input-checkbox")
//    private WebElement orderConfirmAgreeCheckBox;
//
//    @FindBy( id = "orderInfoConfirmBtn")
//    private WebElement paymentButton;
//
//    @FindBy( id = "credit-card-number")
//    private WebElement creditCard;
//
//    @FindBy( id = "cvv")
//    private WebElement cvv;
//
//    @FindBy( xpath = "//div[contains(text(), 'MM')]")
//    private WebElement expirationMonth;
//
//    @FindBy( xpath = "//div[contains(text(), 'YY')]")
//    private WebElement expirationYear;
//
//    @FindBy( id ="name")
//    private WebElement name;
//
//    @FindBy( id = "mobile-number")
//    private WebElement phone;
//
//    @FindBy( id = "email")
//    private WebElement email;
//
//    @FindBy( id ="pay-btn")
//    private WebElement payButton;
//
//
//    private WebElement getExpiryMonth() {
//        return expirationMonth.findElement(By.xpath("./.."))
//                .findElement(By.xpath("./.."))
//                .findElement(By.xpath("//div[contains(text(), '12')]"));
//    }
//}
