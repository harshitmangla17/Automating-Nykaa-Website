package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class callingFunction {
	WebDriver driver;
	
	@Test
	public void run() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshit Mangla\\Documents\\Selenium Drivers\\chromedriver1.exe");
		driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 PageElements pg = new PageElements(driver);
		Thread.sleep(2000);
		//Hover over Fragrance
		pg.hoverFragrance();
		Thread.sleep(2000);
		pg.brandPerfume();
		  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	       driver.switchTo().window(tabs2.get(0));
	       
	       driver.switchTo().window(tabs2.get(1));
	       
	       //Now on new Tab 1
	       pg.perfumeClick();
	       ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
	       driver.switchTo().window(tabs3.get(2)); //Now on Tab2
	       pg.addToBag();
	       
	       pg.InBag();
	       Thread.sleep(3000);
	       
	       pg.ProceedBtn();
	       
	       Thread.sleep(2000);
	       pg.ContinueGuest();
	       /*
	       ReadExcel1 ex1 = new ReadExcel1();
	      ex1.runExcel();
	       */
	       
	       pg.setName("Harshit");
	       pg.setEmail("harshit123@gmail.com");
	       pg.setPhoneNumber((String)"9899586091");
	       pg.setPinCode((String)"110053");
	       pg.setAddress("Yamuna Vihar Delhi");
	       
	       Thread.sleep(2000);
	       pg.shippingAdd();
	       
	     
	}

}
