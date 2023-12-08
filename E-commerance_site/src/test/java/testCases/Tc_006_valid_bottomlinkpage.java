package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 6)

public class Tc_006_valid_bottomlinkpage extends BestBuy_base_class{
	
	@Test(priority = 6)
	public void verfifybottomlink() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.scrolldownwebpage()
		.clicklastelement()
		.Assertofbootomlink()
		;
	}

}
