package com.page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Base;

public class Page_Object_Model_Ticket_Booking_Class extends Base{
	
	public Page_Object_Model_Ticket_Booking_Class() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.irctc_id)
	private WebElement irctc_id;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.validate_irtc_id)
	private WebElement validate_irctc_id;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.add_passenger)
	private WebElement add_passenger;
	
	@FindBy(id = Page_Object_Model_Ticket_Booking_interface.passenger_name)
	private WebElement passenger_name;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.passenger_age)
	private WebElement passenger_age;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.berth_preference)
	private WebElement berth_preference_drop_down;
	
	@FindBy(xpath =Page_Object_Model_Ticket_Booking_interface.lower_berth)
	private WebElement select_lower_berth;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.save_passenger_details)
	private WebElement save_passenger_info;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.cancellation_policy)
	private WebElement cancellation_policy;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.contact_number)
	private WebElement contact_number;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.additional_preferences)
	private WebElement additional_preferencecs;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.auto_upgrade_choice)
	private WebElement aoto_upgrade_choice;
	
	@FindBy(xpath = Page_Object_Model_Ticket_Booking_interface.proceed_to_payment)
	private WebElement proceed_to_payment;

	public WebElement getIrctc_id() {
		return irctc_id;
	}

	public WebElement getValidate_irctc_id() {
		return validate_irctc_id;
	}

	public WebElement getAdd_passenger() {
		return add_passenger;
	}

	public WebElement getPassenger_name() {
		return passenger_name;
	}

	public WebElement getPassenger_age() {
		return passenger_age;
	}

	public WebElement getBerth_preference_drop_down() {
		return berth_preference_drop_down;
	}

	public WebElement getSelect_lower_berth() {
		return select_lower_berth;
	}

	public WebElement getSave_passenger_info() {
		return save_passenger_info;
	}

	public WebElement getCancellation_policy() {
		return cancellation_policy;
	}

	public WebElement getContact_number() {
		return contact_number;
	}
		
	public WebElement getAdditional_preferencecs() {
		return additional_preferencecs;
	}

	public WebElement getAoto_upgrade_choice() {
		return aoto_upgrade_choice;
	}

	public WebElement getProceed_to_payment() {
		return proceed_to_payment;
	}
	
	
	
	
}
	
