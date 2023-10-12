package com.page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Base;

public class Page_Object_Model_Search_Trains_Class extends Base{
	
	public Page_Object_Model_Search_Trains_Class() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.click_trains_module)
	private WebElement click_trains_module;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.enter_start_station)
	private WebElement enter_start_station;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.central_Station)
	private WebElement central_station;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.enter_destination_station)
	private WebElement enter_destination_station;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.kochi_junction)
	private WebElement select_destination_station;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.date_selection)
	private WebElement next_month_arrow;
		
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.journey_date)
	private WebElement journey_date;
	
	@FindBy(xpath = Page_Object_Model_Train_Search_Interface.search_trains)
	private WebElement search_trains;

	public WebElement getClick_trains_module() {
		return click_trains_module;
	}

	public WebElement getEnter_start_station() {
		return enter_start_station;
	}
	

	public WebElement getCentral_station() {
		return central_station;
	}

	public WebElement getEnter_destination_station() {
		return enter_destination_station;
	}
	

	public WebElement getSelect_destination_station() {
		return select_destination_station;
	}
	


	public WebElement getNext_month_arrow() {
		return next_month_arrow;
	}

	public WebElement getJourney_date() {
		return journey_date;
	}

	public WebElement getSearch_trains() {
		return search_trains;
	}
	
}
