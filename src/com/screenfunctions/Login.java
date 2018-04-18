package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login 
{
	@FindBy(how=How.XPATH,using="//*[text()='Admin ']")
	public static WebElement img_login_admin;
	
	@FindBy(how=How.XPATH,using="//*[@name='uname']")
	public static WebElement edi_login_username;
	
	@FindBy(how=How.XPATH,using="//*[@name='pwd']")
	public static WebElement edi_login_password;
	
	@FindBy(how=How.XPATH,using="//*[@name='submitBtn']")
	public static WebElement btn_login_submit;
	
	public static void admin()
	{
		img_login_admin.click();
		edi_login_username.sendKeys("admin");
		edi_login_password.sendKeys("admin");
		btn_login_submit.click();
	}
	
}
