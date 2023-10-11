package com.page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Base;

public class Page_Object_Model_Signin_Class extends Base {
	
	public Page_Object_Model_Signin_Class() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath=Page_Object_Model_Signin_Interface.ph_num_to_signin_xpath)
	private WebElement phnumber;

	public WebElement getPhnumber() {
		return phnumber;
	}
	
 
	@FindBy(xpath=Page_Object_Model_Signin_Interface.otp_xpath)
	private WebElement otp;

	public WebElement getotp() {
		return otp;
	}
	
//	@FindBy(xpath=Stored_Web_Element_Interface.emaill_xpath)
//	private WebElement email;
//
//	public WebElement getemail() {
//		return email;
//	}
	
	
	
	
	

}
