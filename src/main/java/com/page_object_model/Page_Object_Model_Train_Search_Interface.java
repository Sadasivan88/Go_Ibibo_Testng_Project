package com.page_object_model;

public interface Page_Object_Model_Train_Search_Interface {
	
	String click_trains_module = "//p[text()='Trains']";
	String enter_start_station = "//p[text()='Enter Source Name']";
	String central_Station = "//p[text()='MAS']";
	String enter_destination_station = "//p[text()='Enter Destination Name']";
	String kochi_junction = "//p[text()='ERS']";
	String date_selection = "//span[@class='styles_FswDownArrow__qvwu9 styles_fswDownArrow__GjiHD']";
	String journey_date = "(//div[@class='styles_dayCmp__calDateView__lKofu']//following::p[text()='14'])[2]";
	String search_trains = "//span[text()='SEARCH TRAINS']";
	

}
