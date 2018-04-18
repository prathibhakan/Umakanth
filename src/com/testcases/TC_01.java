package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Admin;
import com.screenfunctions.Login;

public class TC_01
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://server/bank/");
		Login lgn = PageFactory.initElements(driver, Login.class);
		Admin adn = PageFactory.initElements(driver, Admin.class);
		lgn.admin();
		
		
		
		
	}

}
