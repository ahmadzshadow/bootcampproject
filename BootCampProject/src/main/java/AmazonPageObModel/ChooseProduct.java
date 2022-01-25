package AmazonPageObModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseProduct {
	public WebDriver driver;
	
	
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span") WebElement Product;

	public ChooseProduct (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void chooseproduct() {
		Product.click();
	}
	
}
