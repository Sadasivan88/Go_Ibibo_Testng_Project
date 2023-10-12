package com.configure_reader;

import com.file_reader.File_Reader;

public class Configure_Reader {
	
	private String url=File_Reader.prop_File().getProperty("url");
	private String mobile=File_Reader.prop_File().getProperty("mobile");
	private String name=File_Reader.prop_File().getProperty("name");
	private String email_id=File_Reader.prop_File().getProperty("email_id");
	private String central_station = File_Reader.prop_File().getProperty("start_station");
	private String ernakulam_junction = File_Reader.prop_File().getProperty("destination_station");
	private String Irctc_id = File_Reader.prop_File().getProperty("Irctc_id");
	private String passenger_name = File_Reader.prop_File().getProperty("Passenger_name");
	private String passenger_age = File_Reader.prop_File().getProperty("Passenger_Age");
	
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
	public String getCentral_station() {
		return central_station;
	}
	public String getErnakulam_junction() {
		return ernakulam_junction;
	}
	public String getIrctc_id() {
		return Irctc_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public String getPassenger_age() {
		return passenger_age;
	}
	
	
	
	
	

}
