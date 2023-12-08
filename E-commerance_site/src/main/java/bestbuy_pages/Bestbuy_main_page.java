package bestbuy_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy_base.BestBuy_base_class;

public class Bestbuy_main_page extends BestBuy_base_class{
	@FindBy(xpath = "(//h4[contains(text(),'United States')])[1]")
	WebElement button;
	public Bestbuy_main_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public Bestbuy_Home_page clickbutton() {
		click(button);
		return new Bestbuy_Home_page(driver);
	}
	public Bestbuy_main_page links() throws IOException {
		findelements();
		return this;
	}

}
