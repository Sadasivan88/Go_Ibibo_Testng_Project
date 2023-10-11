package com.runner;

import org.testng.annotations.Test;

import com.base_class.Base;
import com.page_object_manager.Page_Object_Manager_Signin;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;

public class Runner_Signin extends Base {
	@Test
	public void sign_Up() {
		launchBrowser("chrome");
		launchUrl(Page_Object_Manager_Signin.getPom().getCr().getUrl());
	}

	@Test(dependsOnMethods = "sign_Up")
	public void phno() {
		mouseHover(Page_Object_Manager_Signin.getPom().getSwe().getPhnumber());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		senText(Page_Object_Manager_Signin.getPom().getSwe().getPhnumber(), Page_Object_Manager_Signin.getPom().getCr().getMobile());
		senText(Page_Object_Manager_Signin.getPom().getSwe().getotp(), scannerMethod());

	}

}