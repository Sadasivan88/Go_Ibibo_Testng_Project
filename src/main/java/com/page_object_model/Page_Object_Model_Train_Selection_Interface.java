package com.page_object_model;

public interface Page_Object_Model_Train_Selection_Interface {
	
	String available_trains_filter = "//label[text()='Show available only']";
	String general_quota = "//label[text()='General']";
	String sleeper_class = "//label[text()='SL - Sleeper Class']";
	String departure_time_filter = "(//strong[text()='Evening'])[2]";
	String MAS_TVC_SL = "(//p[text()='12623']//following::p[text()='SL'])[1]";
	String book_now = "//p[text()='Book @₹435']";
}
