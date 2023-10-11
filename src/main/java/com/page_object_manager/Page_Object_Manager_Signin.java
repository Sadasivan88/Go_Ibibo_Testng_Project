package com.page_object_manager;

import com.configure_reader.Configure_Reader_Sign_In;
import com.page_object_model.Page_Object_Model_Signin_Class;

public class Page_Object_Manager_Signin {
	private Configure_Reader_Sign_In cr;
	private Page_Object_Model_Signin_Class swe;
	private static Page_Object_Manager_Signin pom;
	
	
	public Configure_Reader_Sign_In getCr() {
		cr=new Configure_Reader_Sign_In();
		return cr;
	}
	public Page_Object_Model_Signin_Class getSwe() {
		swe=new Page_Object_Model_Signin_Class();
		return swe;
	}
	public static Page_Object_Manager_Signin getPom() {
		pom=new Page_Object_Manager_Signin();
		return pom;
	}
	

}
