package com.actitime.testscript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;

public class UserModule extends BaseClass {
	@Test
	public void createAndDeleteUser() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		h.userListPage();
		int num=1;
		String firstname = f.readDataFromExcel("createAndDeleteUser", num, 1);

		String lastname = f.readDataFromExcel("createAndDeleteUser", num, 2);
		String email = f.readDataFromExcel("createAndDeleteUser", num, 3);
		String username = f.readDataFromExcel("createAndDeleteUser", num, 4);
		String password = f.readDataFromExcel("createAndDeleteUser", num, 5);
		String retrypassword = f.readDataFromExcel("createAndDeleteUser", num, 6);
		String expected = f.readDataFromExcel("createAndDeleteUser", num, 7);
		int i=500;
		UserListPage u=new UserListPage(driver);
		u.getAddUserBtn().click();
		Thread.sleep(i);
		u.getFirstNameTxb().sendKeys(firstname);
		Thread.sleep(i);
		u.getLastNameTxb().sendKeys(lastname);
		Thread.sleep(i);
		u.getEmaiLTxb().sendKeys(email);
		Thread.sleep(i);
		u.getUsernameTxb().sendKeys(username);
		Thread.sleep(i);
		u.getPasswordTxb().sendKeys(password);
		Thread.sleep(i);
		u.getRetypePasswordTxb().sendKeys(retrypassword);
		Thread.sleep(i);
		u.getCreateBtn().click();
		Thread.sleep(i);
		String atext = u.getCreatedUser().getText();
		Thread.sleep(i);
		String etext = expected;
		Thread.sleep(i);
		Assert.assertEquals(atext, etext);
		Thread.sleep(i);
		u.getCreatedUser().click();
		Thread.sleep(i);
		u.getDeleteBtn().click();
		Thread.sleep(i);
driver.switchTo().alert().accept();
	}
}
