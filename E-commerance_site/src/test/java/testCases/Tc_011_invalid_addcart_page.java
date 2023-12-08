package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 11)

public class Tc_011_invalid_addcart_page extends BestBuy_base_class{
	
	
	public void invalid_addcart() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.search("dell laptop")
		.searchbutton()
		.Assertoflaptop()
		.Laptop_scrolldown();
		
	}

}
