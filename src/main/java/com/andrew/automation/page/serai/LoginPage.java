package com.andrew.automation.page.serai;


import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
@Data
public class LoginPage {

    //Text Element
    @FindBy(css = ".MuiTypography-root.jss10.MuiTypography-h5")
    WebElement txt_title;

    @FindBy(css = ".MuiTypography-root.MuiTypography-body1")
    WebElement txt_keep_login;

    @FindBy(className = "MuiSnackbarContent-message")
    WebElement txt_snack_msg;

    //Button Element
    @FindBy(xpath = "//button[@id='cta-btn-header-signup']/span[1]")
    WebElement btn_join_now;

    @FindBy(id = "cta-btn-login-back")
    WebElement btn_back;

    @FindBy(id = "cta-btn-login-submit")
    WebElement btn_login;

    @FindBy(xpath = "//div[contains(@class, 'MuiGrid-root') and contains(@class, 'MuiGrid-item')]/a")
    WebElement btn_forgot_pwd;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-action']/button/span[@class='MuiButton-label']")
    WebElement btn_login_help;

    //Edit Text Element
    @FindBy(id = "email")
    WebElement et_email;

    @FindBy(id = "password")
    WebElement et_pwd;

    //Other Element
    @FindBy(xpath = "//img[@alt='logo']")
    WebElement img_serai;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement cb_keep_login;

//    @Override
//    public boolean isOn() {
//        return this.wait.until((webDriver) -> this.btn_login.isDisplayed());
//    }
}
