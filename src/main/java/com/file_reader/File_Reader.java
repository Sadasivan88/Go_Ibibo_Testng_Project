package com.file_reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;


public class File_Reader {
	
	static FileReader fr;
	
	public static Properties prop_File() {
		
		File file=new File("src\\main\\java\\com\\property_file\\go_ibibo.properties");
		
		try {
			fr=new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop=new Properties();
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
		
	}

}
