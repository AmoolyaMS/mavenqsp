package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id = "username")
private WebElement userNameTxb;
@FindBy(name = "pwd")
private WebElement passwordTxb;
@FindBy(partialLinkText = "Login") 
private WebElement loginBtn;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void login(String un,String pwd) {
	userNameTxb.sendKeys(un);
	passwordTxb.sendKeys(pwd);
	loginBtn.click();
	
}
	



}
