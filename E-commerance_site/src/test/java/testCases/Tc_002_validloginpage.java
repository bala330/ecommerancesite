package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;

import bestbuy_pages.Bestbuy_main_page;
@Test(priority=2)

public class Tc_002_validloginpage extends BestBuy_base_class {
	public void logintest() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.account()
		.clicksigin()
		.loginemailid("rajkumara23@gmail.com")
		.loginpassword("Rajhh123@")
		.siginbutton()
		;
		
         

	}

}
