package com.page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Base;

public class Page_Object_Model_Train_Selection extends Base {
	public Page_Object_Model_Train_Selection() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.available_trains_filter)
	private WebElement available_filter;
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.general_quota)
	private WebElement general_quota;
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.sleeper_class)
	private WebElement sleeper_class;
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.departure_time_filter)
	private WebElement departure_time_filter;
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.MAS_TVC_SL)
	private WebElement mas_tvs_sl;
	
	@FindBy(xpath = Page_Object_Model_Train_Selection_Interface.book_now)
	private WebElement book_now;

	public WebElement getAvailable_filter() {
		return available_filter;
	}

	public WebElement getGeneral_quota() {
		return general_quota;
	}

	public WebElement getSleeper_class() {
		return sleeper_class;
	}

	public WebElement getDeparture_time_filter() {
		return departure_time_filter;
	}

	public WebElement getMas_tvs_sl() {
		return mas_tvs_sl;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	
}
