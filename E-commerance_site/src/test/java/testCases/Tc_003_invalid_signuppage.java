package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 3)

public class Tc_003_invalid_signuppage extends BestBuy_base_class{
		public void Invalid_signuppage() throws IOException {
		new Bestbuy_main_page(driver)
		.clickbutton()
		.account()
		.createaccount()
		.firstname("bala")
		.lastname("")
		.email("rajkumara23@gmail.com")
		.password("")
		.confirompassword("")
		.phonenumber("9655913337")
		.checkbox()
		.createaccountbutton()
		;
	}

}
