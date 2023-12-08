package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;

@Test(priority=1)

public class Tc_001_Valid_signuppage extends BestBuy_base_class {

	public void signuptest() throws IOException {
		
		new Bestbuy_main_page(driver)
		.clickbutton()
		.account()
		.createaccount()
		.firstname("bala")
		.lastname("kumaran")
		.email("rajkumara23@gmail.com")
		.password("")
		.confirompassword("Rajhh123@#")
		.phonenumber("9655913337")
		.checkbox()
		.createaccountbutton()
		;
		;
		
	}

}
