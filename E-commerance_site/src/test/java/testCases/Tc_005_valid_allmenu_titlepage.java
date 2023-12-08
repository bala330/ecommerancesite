package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import bestbuy_base.BestBuy_base_class;
import bestbuy_pages.Bestbuy_main_page;
@Test(priority = 5)

public class Tc_005_valid_allmenu_titlepage extends BestBuy_base_class{
	
	

public void validationofmenu() throws IOException {
	new Bestbuy_main_page(driver)
	.clickbutton()
	.holidaydealsclick()
	.Assertofholidayspage()
	.topdealsclick()
	.Assertoftopdeals()
	.dealofdayclick()
	.Assertofdealofday()
	.membershipsofclick()
	.Assertofmembership()
	.creditcardsclick()
	.Assertofcerditcards()
	.moreclick()
	.giftcardsclick()
	.Assertofgiftcards()
	
	.gift_moreclick()
	.giftideasclick()
	.Assertofgiftideas()
	
	.gift_ideas_moreclick()
	.sellsclick()
	.Assertofsells()
	
	.sells_moreclick()
	.donateclick()
	.Assertofdonate()
	
	.donate_moreclick()
	.outletclick()
	.Assertofoutlet()
	
	.outlet_moreclick()
	.bussinessclick()
	.Assertofbusiness()
	
	;
}
}
