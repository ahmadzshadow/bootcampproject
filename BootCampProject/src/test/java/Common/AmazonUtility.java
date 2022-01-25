package Common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonUtility {
	
	public WebDriver driver;
	@BeforeMethod
	public void beforeMethod(String browser,String website) {
		  
		  String local=System.getProperty("user.dir");   
		  System.out.println(local);                    
		  
		  if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",local+"\\src\\Drivers\\chromedriver.exe" );
			driver=new ChromeDriver();
			driver.navigate().to(website);
			driver.manage().window().maximize();
		  }else if(browser.equalsIgnoreCase("Edge")) {

				System.setProperty("webdriver.edge.driver", local+"\\src\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.navigate().to(website);  //this will go on URL
				driver.manage().window().maximize();
			  
		  }
		  else {
			  System.out.println("correct browser name");
		  }
		  
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();

}
	  public void shot() throws IOException {          //SCREEN SHOT
		  Date dt=new Date();
		  System.out.println(dt);
		  String it=dt.toString().replace(" ", "_").replace(":", "_");//convert dt format to string format and first put string it is variable
		  System.out.println(it); 
		  File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //1st start here
		  FileHandler.copy(stored, new File("C:\\Users\\User\\eclipse-workspace\\BootCampProject\\Pictures\\Images.jpg")); //2nd 
	  } }
