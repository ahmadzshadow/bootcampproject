package AmazonPageObModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver;
	
	@FindBy(id = "nav-search-submit-button") WebElement Search;
	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")WebElement searchbox;
	@FindBy(id = "nav-search-submit-button") WebElement Search2;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public void searchclick() {
		Search.click();
	}
	public void searchbox() {
		searchbox.sendKeys("computer");
	}
	public void search2click() {
		Search2.click();
	}
	
}
