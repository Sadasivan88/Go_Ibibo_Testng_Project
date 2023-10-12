package com.page_object_model;

public interface Page_Object_Model_Ticket_Booking_interface {

		String irctc_id = "//input[@id='IRCTC_Username']";
		String validate_irtc_id = "//p[text()='Validate & Save ']";
		String add_passenger = "//p[text()='ADD NEW TRAVELLER']";
		String passenger_name = "user_name";
		String passenger_age = "//input[@id='user_age']";
		String berth_preference = "(//div[@class='jsx-1554c352c232f9b4 FloatingInput_InpElWrap__FpV76  FloatingInput_InpElWrap__drpDwn__pB6OF '])[2]";
		String lower_berth = "//p[text()='Lower Berth']";
		String save_passenger_details = "//p[text()='Save']";
		String cancellation_policy = "//p[text()='No, I don’t want free cancellation.']";
		String contact_number = "//input[@id='contact_no']";
		String additional_preferences = "//p[text()='Additional preferences']";
		String auto_upgrade_choice = "//label[@for='auto_upgrade']";
		String proceed_to_payment = "//p[text()='Proceed to Payment']";
		
		}

