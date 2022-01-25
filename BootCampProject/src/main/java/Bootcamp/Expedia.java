package Bootcamp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\BootCampProject\\src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement flight=driver.findElement(By.xpath("//span[text()='Flights']"));
		flight.click();
		Thread.sleep(5000);
		WebElement departuredate=driver.findElement(By.xpath("//button[@id=\"d1-btn\"]"));
		departuredate.click();
		Thread.sleep(5000);
		WebElement choosedate=driver.findElement(By.xpath("//button[@aria-label=\"Feb 25, 2022\"]"));
		choosedate.click();
		Thread.sleep(5000);
		WebElement done1=driver.findElement(By.xpath("//button[@data-stid=\"apply-date-picker\"]"));
		done1.click();
		WebElement chhosedate2=driver.findElement(By.xpath("//button[@id=\"d2-btn\"]"));
		chhosedate2.click();
		
		WebElement chhosedparture=driver.findElement(By.xpath("//button[@aria-label=\"Mar 15, 2022\"]"));
		chhosedparture.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement done=driver.findElement(By.xpath("//button[@data-stid=\"apply-date-picker\"]"));
		done.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement from=driver.findElement(By.xpath("//button[@aria-label=\"Leaving from Dhaka (DAC - Shahjalal Intl.)\"]"));
		from.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement where=driver.findElement(By.xpath("//button[@aria-label=\"Flying to Los Angeles, CA (LAX-Los Angeles Intl.)\"]"));
		where.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement choosefare=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/ul/li[2]/div/div/div/button"));
		choosefare.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String>iterators=windowhandles.iterator();
		String Parentwindowhandle=iterators.next();
		String Childwindowhandle=iterators.next();
		driver.switchTo().window(Childwindowhandle);
		WebElement select=driver.findElement(By.xpath("//button[@aria-label=\"Select Economy for $2,261\"]"));
		select.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement returnfare=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/ul/li[1]/div/div/div/button"));
		returnfare.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement select2=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/div[5]/section/div[2]/div/div[2]/div/div/div/ul/li/div/div/button"));
		select2.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement nothank=driver.findElement(By.linkText("No thanks"));
		nothank.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement checkout=driver.findElement(By.xpath("//*[@data-test-id=\"goto-checkout-button\"]"));
		checkout.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"firstname[0]\"]"));
		firstname.sendKeys("Selimul");
		WebElement middlename=driver.findElement(By.xpath("//*[@data-tealeaf-name=\"middleName\"]"));
		middlename.sendKeys("raihan");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastname[0]\"]"));
		lastname.sendKeys("ahmad");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"phone-number[0]\"]"));
		phone.sendKeys("6572549877");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement passport=driver.findElement(By.xpath("//*[@id=\"passport[0]\"]"));
		Select ob= new Select(passport);
		ob.selectByVisibleText("United States of America");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement gender=driver.findElement(By.xpath("//*[text()=\"Male\"]"));
		gender.click();
		WebElement dateofmonth=driver.findElement(By.xpath("//*[@data-tealeaf-name=\"date_of_birth_month[0]\"]"));
		Select ob2=new Select(dateofmonth);
		ob2.selectByValue("02");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dateofday=driver.findElement(By.xpath("//*[@data-tealeaf-name=\"date_of_birth_day[0]\"]"));
		Select ob3=new Select(dateofday);
		ob3.selectByValue("26");
		WebElement dateofyear=driver.findElement(By.xpath("//*[@data-tealeaf-name=\"date_of_birth_year[0]\"]"));
		Select ob4=new Select(dateofyear);
		ob4.selectByValue("1988");
		
		
		
		

		
	}

}
