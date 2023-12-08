package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 8)

public class Tc_008_valid_checkout_page extends BestBuy_base_class{
	
	
	public void valid_checkout_page() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.search("dell laptop")
		.searchbutton()
		.Assertoflaptop()
		.Laptop_scrolldown()
		.Laptop_Addcart()
		.continueaddcart()
		.menubutton()
		.scrolldown_toygames()
		.toysgame()
		.gamespuzzles()
		.games()
		.Assertofgames()
		.scrolldown_toysgames()
		.addcart_toysgames()
		.continue_toysgames()
		.menubrand()
		.brands()
		.playstations()
		.Assertplaystation()
		.ps5_access()
		.Assertofps5access()
		.scrolldown_samsung()
		.addcart_playstation()
		.goto_cart()
		.Assertofcart()
		.checkoutbutton()
		.guestbutton()
		.scrolldown_infromation()
		.Emailid("balaramesh26@gmail.com")
		.phonenumber("9655913337")
		.checkbox()

		.clickcontinue()
		;
	}

}
