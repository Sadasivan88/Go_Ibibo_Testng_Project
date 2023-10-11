package com.configure_reader;

import com.file_reader.File_Reader_Signin;

public class Configure_Reader_Sign_In {
	
	private String url=File_Reader_Signin.prop_File().getProperty("url");
	private String mobile=File_Reader_Signin.prop_File().getProperty("mobile");
	private String name=File_Reader_Signin.prop_File().getProperty("name");
	private String email_id=File_Reader_Signin.prop_File().getProperty("email_id");
	public String getUrl() {
		return url;
	}
	public String getMobile() {
		return mobile;
	}
	public String getName() {
		return name;
	}
	public String getEmail_id() {
		return email_id;
	}
	
	
	

}
