package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 7)

public class Tc_007_Valid_brokenlinks extends BestBuy_base_class{
	
	
	public void validbrokenlinks() throws IOException {
		new Bestbuy_main_page(driver)
		.links()
		.closebrowser();

	}

}
