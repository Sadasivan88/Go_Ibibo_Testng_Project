package com.runner;
import org.testng.annotations.Test;
import com.base_class.Base;
import com.page_object_manager.Page_Object_Manager;
public class Runner_Class extends Base {
	@Test
	public void launch_Go_Ibibo() {
		launchBrowser("chrome");
		launchUrl(Page_Object_Manager.getPom().getCr().getUrl());
	}

	@Test(dependsOnMethods = "launch_Go_Ibibo")
	public void enter_Otp() {
		mouseHover(Page_Object_Manager.getPom().getSwe().getPhnumber());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		senText(Page_Object_Manager.getPom().getSwe().getPhnumber(), Page_Object_Manager.getPom().getCr().getMobile());
		senText(Page_Object_Manager.getPom().getSwe().getotp(), scannerMethod());

	}
	
	@Test (dependsOnMethods = "launch_Go_Ibibo")
	public void search_Trains() throws Exception {
		Thread.sleep(3000);
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getClick_trains_module());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getClick_trains_module());
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getEnter_start_station());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getEnter_start_station());
		Thread.sleep(1000);
		enterkey("M");
		enterkey("A");
		enterkey("S");
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getCentral_station());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getCentral_station());
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getEnter_destination_station());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getEnter_destination_station());
		Thread.sleep(1000);
		enterkey("E");
		enterkey("R");
		enterkey("S");	
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getSelect_destination_station());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getSelect_destination_station());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getNext_month_arrow());
		explicitWait(Page_Object_Manager.getPom().getSearchTrains().getJourney_date());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getJourney_date());
		clickOnElement(Page_Object_Manager.getPom().getSearchTrains().getSearch_trains());
	}
	
	@Test(dependsOnMethods = "search_Trains")
	public void train_Selection() throws Exception {
		Thread.sleep(2000);
		explicitWait(Page_Object_Manager.getPom().getSelectTrain().getAvailable_filter());
		clickOnElement(Page_Object_Manager.getPom().getSelectTrain().getAvailable_filter());
		Thread.sleep(1000);
		explicitWait(Page_Object_Manager.getPom().getSelectTrain().getGeneral_quota());
		clickOnElement(Page_Object_Manager.getPom().getSelectTrain().getGeneral_quota());
		Thread.sleep(1000);
		explicitWait(Page_Object_Manager.getPom().getSelectTrain().getSleeper_class());
		clickOnElement(Page_Object_Manager.getPom().getSelectTrain().getSleeper_class());
		Thread.sleep(2000);
		explicitWait(Page_Object_Manager.getPom().getSelectTrain().getMas_tvs_sl());
		mouseHover(Page_Object_Manager.getPom().getSelectTrain().getMas_tvs_sl());
		clickOnElement(Page_Object_Manager.getPom().getSelectTrain().getMas_tvs_sl());
		Thread.sleep(1000);
		explicitWait(Page_Object_Manager.getPom().getSelectTrain().getBook_now());
		clickOnElement(Page_Object_Manager.getPom().getSelectTrain().getBook_now());
	}
	
	@Test (dependsOnMethods = "train_Selection")
	public void ticket_Booking() throws Exception {
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getIrctc_id());
		clickOnElement(Page_Object_Manager.getPom().getBookTicket().getIrctc_id());
		senText(Page_Object_Manager.getPom().getBookTicket().getIrctc_id(), Page_Object_Manager.getPom().getCr().getIrctc_id());
		clickOnElement(Page_Object_Manager.getPom().getBookTicket().getValidate_irctc_id());
		clickOnElement(Page_Object_Manager.getPom().getBookTicket().getAdd_passenger());
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getPassenger_name());
		Thread.sleep(1000);
		mouseHover(Page_Object_Manager.getPom().getBookTicket().getPassenger_name());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getPassenger_name());
		senText(Page_Object_Manager.getPom().getBookTicket().getPassenger_name(), Page_Object_Manager.getPom().getCr().getPassenger_name());
		mouseHover(Page_Object_Manager.getPom().getBookTicket().getPassenger_age());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getPassenger_age());
		senText(Page_Object_Manager.getPom().getBookTicket().getPassenger_age(), Page_Object_Manager.getPom().getCr().getPassenger_age());
		Thread.sleep(1000);
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getBerth_preference_drop_down());
		mouseHover(Page_Object_Manager.getPom().getBookTicket().getBerth_preference_drop_down());
		clickOnElement(Page_Object_Manager.getPom().getBookTicket().getBerth_preference_drop_down());
		Thread.sleep(1000);
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getSelect_lower_berth());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getSelect_lower_berth());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getSave_passenger_info());
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getCancellation_policy());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getCancellation_policy());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getContact_number());
		senText(Page_Object_Manager.getPom().getBookTicket().getContact_number(), Page_Object_Manager.getPom().getCr().getMobile());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getAdditional_preferencecs());
		explicitWait(Page_Object_Manager.getPom().getBookTicket().getAoto_upgrade_choice());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getAoto_upgrade_choice());
		clickUsingJSE(Page_Object_Manager.getPom().getBookTicket().getProceed_to_payment());		
		Thread.sleep(2000);
		driver.close();
	}

}