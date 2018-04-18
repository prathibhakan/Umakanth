package com.screenfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Admin 
{
	//newStaff
	@FindBy(how=How.XPATH,using="//*[text()='Add staff member']")
	public static WebElement lnk_admin_addstaff;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_name']")
	public static WebElement edi_admin_staffname;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_gender'][@value='M']")
	public static WebElement rdo_admin_staffgender;

	@FindBy(how=How.XPATH,using="//*[@name='staff_dob']")
	public static WebElement edi_admin_dob;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_status']/option[1]")
	public static WebElement lst_admin_relation;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_dept']/option[2]")
	public static WebElement lst_admin_department;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_doj']")
	public static WebElement edi_admin_doj;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_address']")
	public static WebElement edi_admin_address;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_mobile']")
	public static WebElement edi_admin_mobile;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_email']")
	public static WebElement edi_admin_email;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_pwd']")
	public static WebElement edi_admin_password;
	
	@FindBy(how=How.XPATH,using="//*[@name='add_staff']")
	public static WebElement btn_admin_submitstaff;
	//////////////////////////////////////////////////////////
	
	//Newcustomer
	
	
	@FindBy(how=How.XPATH,using="//*[text()='Add Customer']")
	public static WebElement lnk_admin_Addcustomer;
	
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_name']")
	public static WebElement edi_admin_customername;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_gender'][@value='M']")
	public static WebElement rdo_admin_customergender;

	@FindBy(how=How.XPATH,using="//*[@name='customer_dob']")
	public static WebElement edi_admin_customerdob;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_nominee']")
	public static WebElement edi_admin_customernominee;
	
	@FindBy(how=How.XPATH,using="//*[@name='branch']/option[1]")
	public static WebElement lst_admin_customerbranch;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_account']/option[2]")
	public static WebElement lst_admin_customeraccounttype;
	
	@FindBy(how=How.XPATH,using="//*[@name='initial']")
	public static WebElement edi_admin_customerminamount;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_address']")
	public static WebElement edi_admin_customeraddress;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_mobile']")
	public static WebElement edi_admin_customermobile;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_email']")
	public static WebElement edi_admin_customeremail;
	
	@FindBy(how=How.XPATH,using="//*[@name='customer_pwd']")
	public static WebElement edi_admin_customerpassword;
	
	@FindBy(how=How.XPATH,using="//*[@name='add_customer']")
	public static WebElement btn_admin_submitcustomer;	
	
	
	public static void create_Newstaff()
	{
		lnk_admin_addstaff.click();
		
		edi_admin_staffname.sendKeys("umakanth");
		 rdo_admin_staffgender.click();
		 edi_admin_dob.sendKeys("20/jan/95");
		 lst_admin_relation.click();
		 lst_admin_department.click();
		 edi_admin_doj.sendKeys("03/aug/15");
		 edi_admin_address.sendKeys("Hyderabad");
		 edi_admin_mobile.sendKeys("999999999");
		 edi_admin_email.sendKeys("umakanth123@gmail.com");
		 edi_admin_password.sendKeys("umakanth123");
		 btn_admin_submitstaff.click();	 
		
	}
	

	public static void create_Newcustomer()
	{
		lnk_admin_Addcustomer.click();
		
		edi_admin_customername.sendKeys("umakanth");
		rdo_admin_customergender.click();
		edi_admin_customerdob.sendKeys("30/aug/92");
		edi_admin_customernominee.sendKeys("something");
		lst_admin_customerbranch.click();
		lst_admin_customeraccounttype.click();
		edi_admin_customerminamount.sendKeys("2000");
		edi_admin_customeraddress.sendKeys("Secendrabad");
		edi_admin_customermobile.sendKeys("8888888888");
		edi_admin_customeremail.sendKeys("umakanth1234@gmail.com");
		edi_admin_customerpassword.sendKeys("umakanth1234");
		btn_admin_submitcustomer.click();
		
	}
	

	
	
}
