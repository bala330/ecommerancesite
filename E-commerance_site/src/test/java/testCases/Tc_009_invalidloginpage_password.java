package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 9)

public class Tc_009_invalidloginpage_password extends BestBuy_base_class {
	
	
	public void Invalidloginpage_password() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.account()
		.clicksigin()
		.loginemailid("rajkumara23@gmail.com")
		.loginpassword("")
		.siginbutton()
		;	
	}

}
