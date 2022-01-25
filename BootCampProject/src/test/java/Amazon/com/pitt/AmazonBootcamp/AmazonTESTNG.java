 package Amazon.com.pitt.AmazonBootcamp;

import org.testng.annotations.Test;

import AmazonPageObModel.AddToCart;
import AmazonPageObModel.ChooseProduct;
import AmazonPageObModel.Home;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class AmazonTESTNG {
	public WebDriver driver;
  @Test
  public void f() {
	  
	Home ob=new Home(driver);
	ob.searchclick();
	ob.searchbox();
	shots();
	ob.search2click();
	ChooseProduct ob2=new ChooseProduct(driver);
	ob2.chooseproduct();
	AddToCart ob3=new AddToCart(driver);
	ob3.addto();

	  
  }
 



  private void shots() {
	// TODO Auto-generated method stub
	
}




@AfterMethod
  public void afterMethod() {
  }

  

}
