package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;
	@FindBy(linkText = "USERS")
	private WebElement userBtn;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		logoutBtn.click();
		
	}
	public void userListPage()
	{
		userBtn.click();
	}
}
