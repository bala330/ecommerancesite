package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;

@Test(priority = 4)


public class Tc_004_invalidloginpage_emailid extends BestBuy_base_class{
	
	public void Invalidloginpage() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.account()
		.clicksigin()
		.loginemailid("")
		.loginpassword("Rajhh123@")
		.siginbutton()
		;
		
	}

}
