package com.page_object_manager;

import com.configure_reader.Configure_Reader;
import com.page_object_model.Page_Object_Model_Search_Trains_Class;
import com.page_object_model.Page_Object_Model_Signin_Class;
import com.page_object_model.Page_Object_Model_Ticket_Booking_Class;
import com.page_object_model.Page_Object_Model_Train_Selection;

public class Page_Object_Manager {
	private Configure_Reader cr;
	private Page_Object_Model_Signin_Class swe;
	private Page_Object_Model_Search_Trains_Class search;
	private Page_Object_Model_Train_Selection select;
	private Page_Object_Model_Ticket_Booking_Class ticket;
	private static Page_Object_Manager pom;
	
	public Configure_Reader getCr() {
		if(cr == null) {
			cr=new Configure_Reader();	
		}
		return cr;
	}
	public Page_Object_Model_Signin_Class getSwe() {
		if(swe ==null) {
		swe=new Page_Object_Model_Signin_Class();
		}
		return swe;
	}
	public Page_Object_Model_Search_Trains_Class getSearchTrains() {
		if(search == null) {
			search = new Page_Object_Model_Search_Trains_Class();
		}
		return search;
	}
	
	public Page_Object_Model_Train_Selection getSelectTrain() {
		if(select == null) {
			select = new Page_Object_Model_Train_Selection();
		}
		return select;
	}
	
	public Page_Object_Model_Ticket_Booking_Class getBookTicket() {
		if(ticket==null) {
			ticket = new Page_Object_Model_Ticket_Booking_Class();
		}
		return ticket;
	}
		
	public static Page_Object_Manager getPom() {
		if(pom==null) {
			pom=new Page_Object_Manager();	
		}
		return pom;
	}
	

}
