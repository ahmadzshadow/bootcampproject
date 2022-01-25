package AmazonPageObModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[9]/div[4]/div[1]/div[9]/div/div/div/div[2]/div/span[1]/span/span/input")WebElement Addtocart;

	public AddToCart(WebDriver Driver) {
		this.driver=Driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addto() {
		Addtocart.click();
	}
}
