package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {
	public WebDriver driver;
	
	public PageElements(WebDriver d)
	{
		driver= d;
		PageFactory.initElements(d, this);
	}
	 public PageElements() {
		System.out.println("object created");
	}
	
	@FindBy(xpath="//a[contains(text(),'fragrance')]")
	WebElement fragrance;
	
	@FindBy(linkText="Nautica")
	WebElement brand;
	
	@FindBy(xpath="//img[@alt='Nautica Classic Men Eau De Toilette Spray']")
	WebElement perfume;
	
	@FindBy(xpath="//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  ']")
	WebElement bag;
	
	@FindBy(xpath="//div[@class='AddBagIcon']")
	WebElement bagValue;
	
	@FindBy(xpath="//button[@class='btn full fill no-radius proceed ']")
	WebElement proceed;
	
	@FindBy(xpath="//button[@class='btn full big']")
	WebElement guest;
	
	//Form Elements
	@FindBy(xpath="//input[@placeholder='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@placeholder='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	WebElement phone;
	
	@FindBy(xpath="//input[@placeholder='PinCode']")
	WebElement pinCode;
	
	@FindBy(xpath="//textarea[@class='textarea-control prl10']")
	WebElement address;
	
	@FindBy(xpath="//button[@class='btn full fill no-radius proceed big']")
	WebElement shipAddress;
	
	public void setName(String name1)
	{
		name.sendKeys(name1);
	}
	public void setEmail(String email1)
	{
		email.sendKeys(email1);
	}
	public void setPhoneNumber(String phone1)
	{
		phone.sendKeys(phone1);
	}
	public void setPinCode(String pin)
	{
		pinCode.sendKeys(pin);
	}
	public void setAddress(String address1)
	{
		address.sendKeys(address1);
	}
	public void hoverFragrance() {
		Actions acobj = new Actions(driver);
		acobj.moveToElement(fragrance).perform();
	}
	
	
	public void brandPerfume() {
		brand.click();
	}
	
	public void perfumeClick() {
		perfume.click();
	}
	
	public void addToBag() {
		bag.click();
	}
	
	public void InBag() {
		bagValue.click();
	}
	
	public void ProceedBtn() throws InterruptedException {
		
		Actions obj = new Actions(driver);
		obj.moveToElement(proceed).click().build().perform();
		Thread.sleep(2000);
		proceed.click();
		
		
	}
	public void ContinueGuest() {
		guest.click();
	}
	public void shippingAdd() {
		shipAddress.click();
	}
	

}
